package org.cocos2dxjs.cocos2d.transitions

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.scenes.ccScene
import org.cocos2dxjs.cocos2d.core.scenes.t_ccScene
import org.cocos2dxjs.cocos2d.actions.ccActionInterval
import org.cocos2dxjs.cocos2d.actions.ccEaseOut
import org.cocos2dxjs.cocos2d.actions.ccMoveBy
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.actions.ccEaseInOut
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
trait t_ccTransitionScene extends t_ccScene {
  def visit():Unit = js.native
  override def onEnter():Unit = js.native
  override def onExit():Unit = js.native
  override def cleanup():Unit = js.native
  def initWithDuration(t:Float, scene:ccScene):Boolean = js.native
  def finish():Unit = js.native
  def hideOutShowIn():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionScene")
class ccTransitionScene(t:Float, scene:ccScene) extends t_ccTransitionScene {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionScene")
object ccTransitionScene extends js.Object {
}

@js.native
trait t_ccTransitionSceneOriented extends t_ccTransitionScene {
  def initWithDuration(t:Float, scene:ccScene, orientation:Float):Boolean = js.native
}

@js.native
@JSGlobal("cc.TransitionSceneOriented")
class ccTransitionSceneOriented(t:Float, scene:ccScene, orientation:Float) extends t_ccTransitionSceneOriented {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionSceneOriented")
object ccTransitionSceneOriented extends js.Object {
}

@js.native
trait t_ccTransitionRotoZoom extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionRotoZoom")
class ccTransitionRotoZoom(t:Float, scene:ccScene) extends t_ccTransitionRotoZoom {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionRotoZoom")
object ccTransitionRotoZoom extends js.Object {
}

@js.native
trait t_ccTransitionJumpZoom extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionJumpZoom")
class ccTransitionJumpZoom(t:Float, scene:ccScene) extends t_ccTransitionJumpZoom {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionJumpZoom")
object ccTransitionJumpZoom extends js.Object {
}

@js.native
trait t_ccTransitionMoveInL extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  def initScenes():Unit = js.native
  def action():Unit = js.native
  def easeActionWithAction(action:ccActionInterval):ccEaseOut = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInL")
class ccTransitionMoveInL(t:Float, scene:ccScene) extends t_ccTransitionMoveInL {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInL")
object ccTransitionMoveInL extends js.Object {
}

@js.native
trait t_ccTransitionMoveInR extends t_ccTransitionMoveInL {
  override def initScenes():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInR")
class ccTransitionMoveInR(t:Float, scene:ccScene) extends t_ccTransitionMoveInR {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInR")
object ccTransitionMoveInR extends js.Object {
}

@js.native
trait t_ccTransitionMoveInT extends t_ccTransitionMoveInL {
  override def initScenes():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInT")
class ccTransitionMoveInT(t:Float, scene:ccScene) extends t_ccTransitionMoveInT {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInT")
object ccTransitionMoveInT extends js.Object {
}

@js.native
trait t_ccTransitionMoveInB extends t_ccTransitionMoveInL {
  override def initScenes():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInB")
class ccTransitionMoveInB(t:Float, scene:ccScene) extends t_ccTransitionMoveInB {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInB")
object ccTransitionMoveInB extends js.Object {
}

@js.native
trait t_ccTransitionSlideInL extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  def initScenes():Unit = js.native
  def action:ccMoveBy = js.native
  def easeActionWithAction(action:ccActionInterval):js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInL")
class ccTransitionSlideInL(t:Float, scene:ccScene) extends t_ccTransitionSlideInL {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInL")
object ccTransitionSlideInL extends js.Object {
}

@js.native
trait t_ccTransitionSlideInR extends t_ccTransitionSlideInL {
  override def initScenes():Unit = js.native
  override def action:ccMoveBy = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInR")
class ccTransitionSlideInR(t:Float, scene:ccScene) extends t_ccTransitionSlideInR {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInR")
object ccTransitionSlideInR extends js.Object {
}

@js.native
trait t_ccTransitionSlideInB extends t_ccTransitionSlideInL {
  override def initScenes():Unit = js.native
  override def action:ccMoveBy = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInB")
class ccTransitionSlideInB(t:Float, scene:ccScene) extends t_ccTransitionSlideInB {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInB")
object ccTransitionSlideInB extends js.Object {
}

@js.native
trait t_ccTransitionSlideInT extends t_ccTransitionSlideInL {
  override def initScenes():Unit = js.native
  override def action:ccMoveBy = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInT")
class ccTransitionSlideInT(t:Float, scene:ccScene) extends t_ccTransitionSlideInT {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInT")
object ccTransitionSlideInT extends js.Object {
}

@js.native
trait t_ccTransitionShrinkGrow extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  def easeActionWithAction(action:js.Any):ccEaseOut = js.native
}

@js.native
@JSGlobal("cc.TransitionShrinkGrow")
class ccTransitionShrinkGrow(t:Float, scene:ccScene) extends t_ccTransitionShrinkGrow {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionShrinkGrow")
object ccTransitionShrinkGrow extends js.Object {
}

@js.native
trait t_ccTransitionFade extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  override def onExit():Unit = js.native
  def initWithDuration(t:Float, scene:ccScene, color:ccColor):Boolean = js.native
}

@js.native
@JSGlobal("cc.TransitionFade")
class ccTransitionFade(t:Float, scene:ccScene, o:Float) extends t_ccTransitionFade {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionFade")
object ccTransitionFade extends js.Object {
}

@js.native
trait t_ccTransitionCrossFade extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  override def onExit():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionCrossFade")
class ccTransitionCrossFade(t:Float, scene:ccScene) extends t_ccTransitionCrossFade {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionCrossFade")
object ccTransitionCrossFade extends js.Object {
}

@js.native
trait t_ccTransitionTurnOffTiles extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  def easeActionWithAction(action:ccActionInterval):ccActionInterval = js.native
}

@js.native
@JSGlobal("cc.TransitionTurnOffTiles")
class ccTransitionTurnOffTiles(t:Float, scene:ccScene) extends t_ccTransitionTurnOffTiles {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionTurnOffTiles")
object ccTransitionTurnOffTiles extends js.Object {
}

@js.native
trait t_ccTransitionSplitCols extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  def easeActionWithAction(action:ccActionInterval):ccEaseInOut = js.native
  def action:js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionSplitCols")
class ccTransitionSplitCols(t:Float, scene:ccScene) extends t_ccTransitionSplitCols {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionSplitCols")
object ccTransitionSplitCols extends js.Object {
}

@js.native
trait t_ccTransitionSplitRows extends t_ccTransitionSplitCols {
  override def action:js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionSplitRows")
class ccTransitionSplitRows(t:Float, scene:ccScene) extends t_ccTransitionSplitRows {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionSplitRows")
object ccTransitionSplitRows extends js.Object {
}

@js.native
trait t_ccTransitionFadeTR extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  def easeActionWithAction(action:ccActionInterval):ccActionInterval = js.native
  def actionWithSize(size:ccSize):js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeTR")
class ccTransitionFadeTR(t:Float, scene:ccScene) extends t_ccTransitionFadeTR {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeTR")
object ccTransitionFadeTR extends js.Object {
}

@js.native
trait t_ccTransitionFadeBL extends t_ccTransitionFadeTR {
  override def actionWithSize(size:ccSize):js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeBL")
class ccTransitionFadeBL(t:Float, scene:ccScene) extends t_ccTransitionFadeBL {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeBL")
object ccTransitionFadeBL extends js.Object {
}

@js.native
trait t_ccTransitionFadeUp extends t_ccTransitionFadeTR {
  override def actionWithSize(size:ccSize):js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeUp")
class ccTransitionFadeUp(t:Float, scene:ccScene) extends t_ccTransitionFadeUp {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeUp")
object ccTransitionFadeUp extends js.Object {
}

@js.native
trait t_ccTransitionFadeDown extends t_ccTransitionFadeTR {
  override def actionWithSize(size:ccSize):js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeDown")
class ccTransitionFadeDown(t:Float, scene:ccScene) extends t_ccTransitionFadeDown {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeDown")
object ccTransitionFadeDown extends js.Object {
}



