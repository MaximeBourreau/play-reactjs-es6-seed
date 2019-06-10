name := """play-reactjs-es6-seed"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.2" % Test,
  "org.seleniumhq.selenium" % "selenium-firefox-driver" % "3.141.59"
)

val webpackTask = taskKey[Unit]("Run webpack in production mode")

webpackTask := {
  import sys.process._
  "./node_modules/.bin/webpack --mode=production".!
}

test in Test := (test in Test dependsOn webpackTask).value
dist         := (dist         dependsOn webpackTask).value
stage        := (stage        dependsOn webpackTask).value
