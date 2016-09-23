name := "sfiler"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.8"

lazy val versions = new {
  val finatra = "2.4.0"
  val guice = "4.1"
  val mockito = "1.10.19"
  val scalatest = "2.2.6"
}

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  "Twitter Maven" at "http://maven.twttr.com/",
  "bintray" at "http://dl.bintray.com/shinsuke-abe/maven"
)

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra-http" % versions.finatra,
  "com.twitter" %% "finatra-slf4j" % versions.finatra,
  "com.twitter" %% "finagle-redis" % "6.33.0",
  "org.slf4j" % "slf4j-simple" % "1.7.21",
  "com.github.Shinsuke-Abe" %% "dropbox4s" % "0.2.0",
  "com.typesafe" % "config" % "1.3.0",
  "com.twitter" %% "finatra-http" % versions.finatra % "test",
  "com.twitter" %% "inject-server" % versions.finatra % "test",
  "com.twitter" %% "inject-app" % versions.finatra % "test",
  "com.twitter" %% "inject-core" % versions.finatra % "test",
  "com.twitter" %% "inject-modules" % versions.finatra % "test",
  "com.google.inject.extensions" % "guice-testlib" % "4.1.0" % "test",
  "com.twitter" %% "finatra-http" % versions.finatra % "test" classifier "tests",
  "com.twitter" %% "inject-server" % versions.finatra % "test" classifier "tests",
  "com.twitter" %% "inject-app" % versions.finatra % "test" classifier "tests",
  "com.twitter" %% "inject-core" % versions.finatra % "test" classifier "tests",
  "com.twitter" %% "inject-modules" % versions.finatra % "test" classifier "tests",
  "org.mockito" % "mockito-core" % versions.mockito % "test",
  "org.scalatest" %% "scalatest" % versions.scalatest % "test",
  "junit" % "junit" % "4.12" % "test"
)
