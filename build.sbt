name := "infrastructure-as-types"

version := "0.1"

organization := "com.virtuslab"

scalaVersion := "2.12.10"

scalacOptions += "-Ypartial-unification"

libraryDependencies ++= Seq(
  "com.beachape" %% "enumeratum" % "1.5.15",
  "org.typelevel" %% "cats-core" % "2.0.0",
  "io.skuber" %% "skuber" % "2.4.0",
  "com.fasterxml.jackson.dataformat" % "jackson-dataformat-yaml" % "2.10.1",
  "org.scalatest" %% "scalatest" % "3.1.0" % Test,
  "com.stephenn" %% "scalatest-play-json" % "0.0.3" % Test
)

scalafmtOnCompile := true

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full)
