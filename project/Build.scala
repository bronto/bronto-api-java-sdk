import sbt._
import Keys._
import com.github.shivawu.sbt.maven.MavenBuild

object Build extends MavenBuild {
    project("*")()

    project("bronto-api-app") (Seq(
      libraryDependencies += "com.sun.xml.ws" % "jaxws-rt" % "2.1.4"
    ):_*)
}
