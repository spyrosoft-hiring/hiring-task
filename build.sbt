ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "2.13.10"

lazy val cats = "org.typelevel" %% "cats-core" % "2.9.0"
lazy val catsEffect = "org.typelevel" %% "cats-effect" % "3.4.1"

lazy val root = (project in file("."))
  .settings(
    name := "user-registration-service",
    libraryDependencies ++= Seq(cats, catsEffect)
  )
