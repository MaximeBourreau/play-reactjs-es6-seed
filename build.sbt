name := """play-reactjs-es6-seed"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

val browserifyTask = taskKey[Seq[File]]("Run browserify")

browserifyTask := {
  println("Running browserify");
  "mkdir -p target/web/browserify" !;
  "./node_modules/.bin/browserify -t [ babelify --presets [ es2015 react ] ] app/assets/javascripts/main.jsx -o target/web/browserify/main.js" !;
  Nil
}

sourceGenerators in Assets <+= browserifyTask

unmanagedResources in Assets += baseDirectory.value / "target/web/browserify/main.js"
