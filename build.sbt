name := "DockerPlayAppTesting"

version := "1.0"

scalaVersion := "2.11.8"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .configs(IntegrationTest)
  .settings(Defaults.itSettings : _*)
  .settings(
    libraryDependencies ++= Seq(
      "org.specs2" %% "specs2" % "3.7",
      "com.typesafe.play" %% "play-test" % "2.5.4",
      "com.typesafe.play" %% "play-specs2" % "2.5.4"
    ),
    scalaSource in IntegrationTest := baseDirectory.value / "it"
  )
