import sbt._
import Keys._

object Plugins extends Build {
  lazy val root = project.in( file(".") ).dependsOn( mavenPlugin )
  lazy val mavenPlugin = uri("git://github.com/shivawu/sbt-maven-plugin.git")
}

// vim: set ts=4 sw=4 et:
