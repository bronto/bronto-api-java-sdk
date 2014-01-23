import sbt._
import Keys._

object Build extends sbt.Build {
  object Common {
    lazy val settings = Project.defaultSettings ++ Seq(
      javacOptions in (Compile, run) ++= Seq("-Xlint:deprecation", "-Xlint:unchecked"),
      version := "1.0.0-SNAPSHOT",
      organization := "com.bronto",
      crossVersion := CrossVersion.Disabled
    )
  }

  lazy val root = Project(
    "bronto-api",
    file("."),
    settings = Common.settings
  ) aggregate (sdk, client)

  lazy val app = Project(
    "bronto-api-app",
    file("app"),
    settings = Common.settings
  ) dependsOn sdk

  lazy val client = Project(
    "bronto-api-client",
    file("client"),
    settings = Common.settings
  )

  lazy val sdk = Project(
    "bronto-api-sdk",
    file("sdk"),
    settings = Common.settings
  ) dependsOn client
}
