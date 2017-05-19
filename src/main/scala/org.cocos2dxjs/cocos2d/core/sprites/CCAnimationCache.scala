package org.cocos2dxjs.cocos2d.core.sprites

import scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("cc.animationCache")
class ccanimationCache extends js.Object {
  def addAnimation(animation:ccAnimation, name:String):Unit = js.native
  def removeAnimation(name:String):Unit = js.native
  def getAnimation(name:String):ccAnimation = js.native
  def addAnimations(plist:String):Unit = js.native
}

