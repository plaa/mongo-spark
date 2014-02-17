name := "mongo-spark"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies += "org.apache.spark" %% "spark-core" % "0.9.0-incubating"

// Select which Hadoop version to use
libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.2.0"

libraryDependencies += "org.mongodb" % "mongo-java-driver" % "2.11.4"

retrieveManaged := true

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"


EclipseKeys.withSource := true
