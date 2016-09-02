import sbt._
import sbt.Keys._

name := "play-googleopenconnect"

version := "1.2-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
	ws,
    "com.google.api-client" % "google-api-client" % "1.19.0",
    "com.google.apis" % "google-api-services-oauth2" % "v2-rev87-1.19.0",
    "com.google.http-client" % "google-http-client-jackson2" % "1.19.0"
  )

// Enable Play and sbt-web plugins
lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)



// Publishing
//publishTo := {
//  val artifactory = "http://artifactory.lunatech.com/artifactory/"
//  if (version.value.trim.endsWith("SNAPSHOT"))
//    Some("snapshots/" at artifactory + "snapshots")
//  else
//    Some("releases/" at artifactory + "releases")
//}