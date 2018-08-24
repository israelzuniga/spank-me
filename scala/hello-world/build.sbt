name := "hello-world"

version := "0.1"

scalaVersion := "2.11.8"

organization := "com.israelzuniga"


// Manually specify Spark version for our safety
val sparkVersion = "2.2.0"


// Spark packages
resolvers += "bintray-spark-packages" at
  "https://dl.bintray.com/spark-packages/maven/"

resolvers += "Typesafe Simple Repository" at
  "http://repo.typesafe.com/typesafe/simple/maven-releases/"

resolvers += "MavenRepository" at
  "https://mvnrepository.com/"

libraryDependencies ++= Seq(
  // spark core
  "org.apache.spark" %% "spark-core" % sparkVersion,

)
