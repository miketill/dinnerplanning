import play.Project._

name := """Dinner Planning"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.0"
  , "org.webjars" % "bootstrap" % "3.1.1"
  , jdbc
  , anorm
)

playScalaSettings
