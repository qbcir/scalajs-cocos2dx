package org.cocos2dxjs.cocos2d.core.sprites

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccanimationCache extends js.Object {
}

@js.native
trait ts_ccanimationCache extends js.Object {
  def addAnimation(animation:ccAnimation, name:String):Unit = js.native
  def removeAnimation(name:String):Unit = js.native
  def getAnimation(name:String):ccAnimation = js.native
  def addAnimations(plist:String):Unit = js.native
}

@js.native
@JSGlobal("cc.animationCache")
class ccanimationCache extends t_ccanimationCache {
}

@js.native
@JSGlobal("cc.animationCache")
object ccanimationCache extends ts_ccanimationCache {
}


