import sbt._
import Keys._
import com.github.shivawu.sbt.maven.MavenBuild
import sbtassembly.Plugin._
import AssemblyKeys._

object Build extends MavenBuild {
    project("*")(Seq(
      crossVersion := CrossVersion.Disabled
    ):_*)

    project("bronto-api-app") (assemblySettings ++ Seq(
      libraryDependencies += "com.sun.xml.ws" % "jaxws-rt" % "2.1.4"
    ):_*)
}
