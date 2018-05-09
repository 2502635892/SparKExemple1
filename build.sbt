lazy val commonSettings=Seq(
  version := "1.0",
  scalaVersion := "2.10.6"
)


lazy val root = (project in file("."))
  .settings(
    commonSettings,
    name:="SpartExample1",
    libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.6.1"
  )