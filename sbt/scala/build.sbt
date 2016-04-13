name := ""

lazy val settings = Seq(
  version := "0.0.0",

  scalaVersion := "2.11.8",

  resolvers ++= Seq(
    "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/",
    "Typesafe Releases" at "http://repo.typesafe.com/typesafe/maven-releases/",
    Resolver.jcenterRepo
  ),

  libraryDependencies ++= Seq(
    "org.scala-lang" % "scala-compiler" % "2.11.8",
    "org.scala-lang" % "scala-reflect" % "2.11.8",
    "com.typesafe.akka" %% "akka-actor" % "2.4.3",
    "com.typesafe.akka" %% "akka-remote" % "2.4.3",
    "com.chuusai" %% "shapeless" % "2.3.0"
  ),

  mainClass in Compile := Some(""),

  scalacOptions ++= Seq("-Xmax-classfile-name", "254")
)

lazy val root = Project("template", file("."))
  .enablePlugins(
    JavaAppPackaging,
    UniversalPlugin)
  .settings(settings: _*)