package org.cocos2dxjs.cocos2d.transitions

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.scenes.ccScene
import org.cocos2dxjs.cocos2d.actions.ccActionInterval
import org.cocos2dxjs.cocos2d.actions.ccEaseOut
import org.cocos2dxjs.cocos2d.actions.ccMoveBy
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.actions.ccEaseInOut
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
@JSGlobal("cc.TransitionScene")
class ccTransitionScene extends ccScene {
  def visit():Unit = js.native
  override def onEnter():Unit = js.native
  override def onExit():Unit = js.native
  override def cleanup():Unit = js.native
  def initWithDuration(t:Float, scene:ccScene):Boolean = js.native
  def finish():Unit = js.native
  def hideOutShowIn():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionSceneOriented")
class ccTransitionSceneOriented extends ccTransitionScene {
  def initWithDuration(t:Float, scene:ccScene, orientation:Float):Boolean = js.native
}

@js.native
@JSGlobal("cc.TransitionRotoZoom")
class ccTransitionRotoZoom extends ccTransitionScene {
  override def onEnter():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionJumpZoom")
class ccTransitionJumpZoom extends ccTransitionScene {
  override def onEnter():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInL")
class ccTransitionMoveInL extends ccTransitionScene {
  override def onEnter():Unit = js.native
  def initScenes():Unit = js.native
  def action():Unit = js.native
  def easeActionWithAction(action:ccActionInterval):ccEaseOut = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInR")
class ccTransitionMoveInR extends ccTransitionMoveInL {
  override def initScenes():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInT")
class ccTransitionMoveInT extends ccTransitionMoveInL {
  override def initScenes():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInB")
class ccTransitionMoveInB extends ccTransitionMoveInL {
  override def initScenes():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInL")
class ccTransitionSlideInL extends ccTransitionScene {
  override def onEnter():Unit = js.native
  def initScenes():Unit = js.native
  def action:ccMoveBy = js.native
  def easeActionWithAction(action:ccActionInterval):js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInR")
class ccTransitionSlideInR extends ccTransitionSlideInL {
  override def initScenes():Unit = js.native
  override def action:ccMoveBy = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInB")
class ccTransitionSlideInB extends ccTransitionSlideInL {
  override def initScenes():Unit = js.native
  override def action:ccMoveBy = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInT")
class ccTransitionSlideInT extends ccTransitionSlideInL {
  override def initScenes():Unit = js.native
  override def action:ccMoveBy = js.native
}

@js.native
@JSGlobal("cc.TransitionShrinkGrow")
class ccTransitionShrinkGrow extends ccTransitionScene {
  override def onEnter():Unit = js.native
  def easeActionWithAction(action:js.Any):ccEaseOut = js.native
}

@js.native
@JSGlobal("cc.TransitionFade")
class ccTransitionFade extends ccTransitionScene {
  override def onEnter():Unit = js.native
  override def onExit():Unit = js.native
  def initWithDuration(t:Float, scene:ccScene, color:ccColor):Boolean = js.native
}

@js.native
@JSGlobal("cc.TransitionCrossFade")
class ccTransitionCrossFade extends ccTransitionScene {
  override def onEnter():Unit = js.native
  override def onExit():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionTurnOffTiles")
class ccTransitionTurnOffTiles extends ccTransitionScene {
  override def onEnter():Unit = js.native
  def easeActionWithAction(action:ccActionInterval):ccActionInterval = js.native
}

@js.native
@JSGlobal("cc.TransitionSplitCols")
class ccTransitionSplitCols extends ccTransitionScene {
  override def onEnter():Unit = js.native
  def easeActionWithAction(action:ccActionInterval):ccEaseInOut = js.native
  def action:js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionSplitRows")
class ccTransitionSplitRows extends ccTransitionSplitCols {
  override def action:js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeTR")
class ccTransitionFadeTR extends ccTransitionScene {
  override def onEnter():Unit = js.native
  def easeActionWithAction(action:ccActionInterval):ccActionInterval = js.native
  def actionWithSize(size:ccSize):js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeBL")
class ccTransitionFadeBL extends ccTransitionFadeTR {
  override def actionWithSize(size:ccSize):js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeUp")
class ccTransitionFadeUp extends ccTransitionFadeTR {
  override def actionWithSize(size:ccSize):js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeDown")
class ccTransitionFadeDown extends ccTransitionFadeTR {
  override def actionWithSize(size:ccSize):js.Any = js.native
}

