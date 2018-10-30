import sbt._

object Dependencies {
  val Http4sVersion = "0.18.16"
  val Specs2Version = "4.3.4"
  val LogbackVersion = "1.2.3"
  val CirceVersion = "0.9.3"
  val SangriaVersion = "1.4.2"
  val SangriaCirceVersion = "1.2.1"
  val PgMigrationsScalaVersion = "0.1.0-SNAPSHOT"

  lazy val http4sBlazeServer = "org.http4s" %% "http4s-blaze-server" % Http4sVersion
  lazy val http4sCirce = "org.http4s" %% "http4s-circe" % Http4sVersion
  lazy val http4sDsl = "org.http4s" %% "http4s-dsl" % Http4sVersion
  lazy val circeParser = "io.circe" %% "circe-parser" % CirceVersion
  lazy val circeOptics = "io.circe" %% "circe-optics" % CirceVersion
  lazy val logbackClassic = "ch.qos.logback" % "logback-classic" % LogbackVersion
  lazy val sangria = "org.sangria-graphql" %% "sangria" % SangriaVersion
  lazy val sangriaCirce = "org.sangria-graphql" %% "sangria-circe" % SangriaCirceVersion
  lazy val pgMigrationsScala = "su.wps" %% "pg-migrations-scala" % PgMigrationsScalaVersion
  lazy val specs2 = "org.specs2" %% "specs2-core" % Specs2Version
}