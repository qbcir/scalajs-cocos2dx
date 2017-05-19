package org.cocos2dxjs.cocos2d.transitions

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.scenes.ccScene
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.actions.ccReverseTime

@js.native
@JSGlobal("cc.TransitionPageTurn")
class ccTransitionPageTurn extends ccTransitionScene {
  def initWithDuration(t:Float, scene:ccScene, backwards:Boolean):Boolean = js.native
  def actionWithSize(vector:ccSize):ccReverseTime = js.native
  override def onEnter():Unit = js.native
}

