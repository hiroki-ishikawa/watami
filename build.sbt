organization := "com.github.kmizu"

name := "sbt-idea-template"

version := "0.1"

scalaVersion := "2.9.2"

scalacOptions := Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.scalaj" %% "scalaj-http" % "0.3.6",
  "org.specs2" %% "specs2" % "1.12.2" % "test"
)
