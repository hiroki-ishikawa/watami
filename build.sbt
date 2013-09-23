organization := "net.stonerivers"

name := "watami"

version := "0.1"

scalaVersion := "2.9.2"

scalacOptions := Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "com.github.scala-incubator.io" %% "scala-io-core" % "latest.integration",
  "com.github.scala-incubator.io" %% "scala-io-file" % "latest.integration"
)

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
