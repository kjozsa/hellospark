name := "hellospark"

version := "1.0"

scalaVersion := "2.11.5"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "1.2.0" ,
  "javax.servlet" % "javax.servlet-api" % "3.0.1"
)
