import sbt.Keys._

lazy val root: Project = (project in file("."))
  .settings(
    name := Settings.name,
    version := Settings.version,
    publishTo := Some(
      if (isSnapshot.value)
        Opts.resolver.sonatypeSnapshots
      else
        Opts.resolver.sonatypeStaging
    ),
    organization := "com.github.qbcir",
    publishMavenStyle := true,
    homepage := Some(url("https://github.com/qbcir/scalajs-cocos2dx")),
    scmInfo := Some(ScmInfo(url("https://github.com/qbcir/scalajs-cocos2dx"), "https://github.com/qbcir/scalajs-cocos2dx.git")),
    pomIncludeRepository := (_ => false),
    scalaVersion := Settings.versions.scala,
    libraryDependencies ++= Settings.scalaJsDependencies.value,
    skip in packageJSDependencies := false,
    jsDependencies ++= Settings.jsDependencies.value
  ).enablePlugins(ScalaJSPlugin)
