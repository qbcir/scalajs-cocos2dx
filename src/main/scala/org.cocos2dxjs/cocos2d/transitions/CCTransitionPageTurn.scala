package org.cocos2dxjs.cocos2d.transitions

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.scenes.ccScene
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.actions.ccReverseTime

@js.native
trait t_ccTransitionPageTurn extends t_ccTransitionScene {
  def initWithDuration(t:Float, scene:ccScene, backwards:Boolean):Boolean = js.native
  def actionWithSize(vector:ccSize):ccReverseTime | ccTransitionScene = js.native
  override def onEnter():Unit = js.native
}

@js.native
trait ts_ccTransitionPageTurn extends ts_ccTransitionScene {
}

@js.native
@JSGlobal("cc.TransitionPageTurn")
class ccTransitionPageTurn(t:Float, scene:ccScene, backwards:Boolean) extends t_ccTransitionPageTurn {
  var _back: Boolean = js.native
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionPageTurn")
object ccTransitionPageTurn extends ts_ccTransitionPageTurn {
}


