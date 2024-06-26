name := "SolarTineMS"

version := "1.0"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "2.0.13",
  "org.apache.logging.log4j" % "log4j-core" % "2.23.1",
  "org.apache.logging.log4j" % "log4j-api" % "2.23.1",
  "org.apache.logging.log4j" % "log4j-slf4j2-impl" % "2.23.1",
  "com.esotericsoftware.yamlbeans" % "yamlbeans" % "1.17",
  "net.jcip" % "jcip-annotations" % "1.0",
  "com.zaxxer" % "HikariCP" % "5.1.0",
  "mysql" % "mysql-connector-java" % "8.4.0",
  "org.jdbi" % "jdbi3-core" % "3.45.1",
  "io.netty" % "netty-transport" % "4.1.109.Final",
  "io.netty" % "netty-codec" % "4.1.109.Final",
  "io.netty" % "netty-buffer" % "4.1.109.Final",
  "io.netty" % "netty-handler" % "4.1.109.Final",
  "org.graalvm.js" % "js" % "23.0.4",
  "org.graalvm.js" % "js-scriptengine" % "24.0.1",
  "org.junit.jupiter" % "junit-jupiter-api" % "5.10.2" % Test,
  "org.junit.jupiter" % "junit-jupiter-engine" % "5.10.2" % Test,
  "org.junit.jupiter" % "junit-jupiter-params" % "5.10.2" % Test,
  "org.mockito" % "mockito-core" % "5.11.0" % Test,
  "org.mockito" % "mockito-junit-jupiter" % "5.11.0" % Test
)

fork in run := true

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-encoding", "utf8")

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-q", "-v")
