name := "web-bundle"

version := "2018.10.25-RC"

enablePlugins(ScalaJSPlugin)


val scala212 = "2.12.7"

scalaVersion := scala212

crossScalaVersions := Seq(scala212)

//Dependencies
libraryDependencies ++= Seq("scalajs-react-interface" %%% "universal" % "2018.10.25-RC",
  "scalajs-react-interface" %%% "web" % "2018.10.25-RC",
  "scalajs-react-interface" %%% "vdom" % "2018.10.25-RC",
  "scalajs-react-interface" %%% "web-router" % "2018.10.25-RC",
  "scalajs-react-interface" %%% "web-components" % "2018.10.25-RC",
  "scalajs-css" %%% "core" % "2018.10.25",
  "scalajs-react-interface" %%% "core" % "2018.10.25-RC")

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)


//bintray
resolvers += Resolver.jcenterRepo

organization := "scalajs-react-interface"

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization := Some("scalajs-react-interface")

bintrayRepository := "maven"


publishArtifact in Test := false

//Test
resolvers ++= Seq(Resolver.bintrayRepo("scalajs-react-interface", "maven"),
  Resolver.bintrayRepo("scalajs-plus", "maven"),
  Resolver.bintrayRepo("scalajs-css", "maven"))

scalaJSStage in Global := FastOptStage
