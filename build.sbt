name := "HelloWorld"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
 "postgresql" % "postgresql" %"9.1-901.jdbc4",
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings
