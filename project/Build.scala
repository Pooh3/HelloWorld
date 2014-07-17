import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "My first application"
    val appVersion      = "1.0"

    val appDependencies = Seq(
        
      "org.scala-tools" %% "scala-stm" % "0.3",
      "org.apache.derby" % "derby" % "10.4.1.3" % "test",
      "postgresql" % "postgresql" % "8.4-702.jdbc4"
      
    )

    val main = PlayProject(appName, appVersion, appDependencies).settings(defaultScalaSettings:_*).settings(
      
      resolvers += "JBoss repository" at "https://repository.jboss.org/nexus/content/repositories/",
      resolvers += "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"
            
    )

}