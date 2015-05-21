name := "FSAUtils"

version := "1.1-beta"

// eclipse for Eclipse project, doc for scaladoc at target/scala%%/api

scalaVersion := "2.10.4"
// scalaVersion := "2.11.1"

// scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test" withSources() withJavadoc()

// scalacheck 
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.12.2" % "test" withSources() withJavadoc()

// scala-xml: only needed for scala 2.11
// libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.2"

