import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object Settings {
  val name = """scalajs-cocos2dx"""
  val version = "0.0.1"

  object versions {
    val scala = "2.12.2"
    val cocos2dhtml5 = "Cocos2d-html5-v3.12"
  }

  val jsDependencies = Def.setting(Seq(
    "org.webjars.bower" % "github-com-cocos2d-cocos2d-html5" % versions.cocos2dhtml5 / "CCBoot.js"
  ))

  val scalaJsDependencies = Def.setting(Seq())
}
