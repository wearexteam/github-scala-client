name := "github-scala-client"

version := "0.1"

scalaVersion := "2.13.3"


addCompilerPlugin (
  "org.typelevel" %% "kind-projector" % "0.11.3" cross CrossVersion.full
)

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.3.3",
  "org.typelevel" %% "cats-core" % "2.2.0",
  "org.scalatest" %% "scalatest" % "3.1.0" % Test,
  "eu.timepit" %% "refined" % "0.9.20",
  "eu.timepit" %% "refined-cats" % "0.9.20", // optional
  "eu.timepit" %% "refined-eval" % "0.9.20", // optional, JVM-only
  "eu.timepit" %% "refined-jsonpath" % "0.9.20", // optional, JVM-only
  "eu.timepit" %% "refined-pureconfig" % "0.9.20", // optional, JVM-only
  "eu.timepit" %% "refined-scalacheck" % "0.9.20", // optional
  "eu.timepit" %% "refined-scalaz" % "0.9.20", // optional
  "eu.timepit" %% "refined-scodec" % "0.9.20", // optional
  "eu.timepit" %% "refined-scopt" % "0.9.20", // optional
  "eu.timepit" %% "refined-shapeless" % "0.9.20" // optional
)