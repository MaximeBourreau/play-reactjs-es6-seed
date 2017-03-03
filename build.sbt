name := """play-reactjs-es6-seed"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  cache,
  ws,
  "org.seleniumhq.selenium" % "selenium-java" % "2.45.0" % "test"
)

val browserifyTask = taskKey[Seq[File]]("Run browserify")

val browserifyOutputDir = settingKey[File]("Browserify output directory")

browserifyOutputDir := target.value / "web" / "browserify"

browserifyTask := {
  println("Running browserify");
  val outputFile = browserifyOutputDir.value / "main.js"
  browserifyOutputDir.value.mkdirs
  val cmd = "./node_modules/.bin/browserify -t [ babelify --presets [ es2015 react ] ] app/assets/javascripts/main.jsx -o " + outputFile.getPath
  val stderrBuffer = new scala.collection.mutable.ListBuffer[String]
  val status = cmd ! new ProcessLogger {
    def info(s: => String) {}
    def error(s: => String) { stderrBuffer.append(s) }
    def buffer[T](f: => T): T = f
  }
  if (status != 0) error(stderrBuffer.mkString("\n", "\n", "\n"))
  List(outputFile)
}

sourceGenerators in Assets <+= browserifyTask

resourceDirectories in Assets += browserifyOutputDir.value
