ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.11.8"


libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0" % "provided"

//libraryDependencies += "org.drools" % "drools-core" % "7.17.0.Final"
//libraryDependencies += "org.drools" % "drools-compiler" % "7.17.0.Final"

libraryDependencies += "org.drools" % "drools-core" % "8.22.1.Beta"
libraryDependencies += "org.drools" % "drools-compiler" % "8.22.1.Beta"

libraryDependencies += "junit" % "junit" % "4.13.2" //% Test


resolvers += "Maven1 Repository" at "https://repo1.maven.org/maven2/"
resolvers += "Maven2 Repository" at "https://mvnrepository.com/artifact/org.drools/"

lazy val root = (project in file("."))
  .settings(
    name := "SimpleSparkProject"
  )

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}