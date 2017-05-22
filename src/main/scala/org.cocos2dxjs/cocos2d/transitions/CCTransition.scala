package org.cocos2dxjs.cocos2d.transitions

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.scenes.{ccScene, t_ccScene}
import org.cocos2dxjs.cocos2d.core.scenes.t_ccScene
import org.cocos2dxjs.cocos2d.core.scenes.ts_ccScene
import org.cocos2dxjs.cocos2d.actions.{ccActionInterval, t_ccActionInterval}
import org.cocos2dxjs.cocos2d.actions.{ccEaseOut, t_ccEaseOut}
import org.cocos2dxjs.cocos2d.actions.{ccMoveBy, t_ccMoveBy}
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.actions.{ccEaseInOut, t_ccEaseInOut}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}

@js.native
trait t_ccTransitionScene extends t_ccScene {
  def visit():Unit = js.native
  override def onEnter():Unit = js.native
  override def onExit():Unit = js.native
  override def cleanup():Unit = js.native
  def initWithDuration(t:Float, scene:t_ccScene):Boolean = js.native
  def finish():Unit = js.native
  def hideOutShowIn():Unit = js.native
}

@js.native
trait ts_ccTransitionScene extends ts_ccScene {
}

@js.native
@JSGlobal("cc.TransitionScene")
class ccTransitionScene(t:Float, scene:t_ccScene) extends t_ccTransitionScene {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionScene")
object ccTransitionScene extends ts_ccTransitionScene {
}

@js.native
trait t_ccTransitionSceneOriented extends t_ccTransitionScene {
  def initWithDuration(t:Float, scene:t_ccScene, orientation:Float | Float | Float | Float):Boolean = js.native
}

@js.native
trait ts_ccTransitionSceneOriented extends ts_ccTransitionScene {
}

@js.native
@JSGlobal("cc.TransitionSceneOriented")
class ccTransitionSceneOriented(t:Float, scene:t_ccScene, orientation:Float | Float | Float | Float) extends t_ccTransitionSceneOriented {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionSceneOriented")
object ccTransitionSceneOriented extends ts_ccTransitionSceneOriented {
}

@js.native
trait t_ccTransitionRotoZoom extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
}

@js.native
trait ts_ccTransitionRotoZoom extends ts_ccTransitionScene {
}

@js.native
@JSGlobal("cc.TransitionRotoZoom")
class ccTransitionRotoZoom(t:Float, scene:t_ccScene) extends t_ccTransitionRotoZoom {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionRotoZoom")
object ccTransitionRotoZoom extends ts_ccTransitionRotoZoom {
}

@js.native
trait t_ccTransitionJumpZoom extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
}

@js.native
trait ts_ccTransitionJumpZoom extends ts_ccTransitionScene {
}

@js.native
@JSGlobal("cc.TransitionJumpZoom")
class ccTransitionJumpZoom(t:Float, scene:t_ccScene) extends t_ccTransitionJumpZoom {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionJumpZoom")
object ccTransitionJumpZoom extends ts_ccTransitionJumpZoom {
}

@js.native
trait t_ccTransitionMoveInL extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  def initScenes():Unit = js.native
  def action():Unit = js.native
  def easeActionWithAction(action:t_ccActionInterval):ccEaseOut = js.native
}

@js.native
trait ts_ccTransitionMoveInL extends ts_ccTransitionScene {
}

@js.native
@JSGlobal("cc.TransitionMoveInL")
class ccTransitionMoveInL(t:Float, scene:t_ccScene) extends t_ccTransitionMoveInL {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInL")
object ccTransitionMoveInL extends ts_ccTransitionMoveInL {
}

@js.native
trait t_ccTransitionMoveInR extends t_ccTransitionMoveInL {
  override def initScenes():Unit = js.native
}

@js.native
trait ts_ccTransitionMoveInR extends ts_ccTransitionMoveInL {
}

@js.native
@JSGlobal("cc.TransitionMoveInR")
class ccTransitionMoveInR(t:Float, scene:t_ccScene) extends t_ccTransitionMoveInR {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInR")
object ccTransitionMoveInR extends ts_ccTransitionMoveInR {
}

@js.native
trait t_ccTransitionMoveInT extends t_ccTransitionMoveInL {
  override def initScenes():Unit = js.native
}

@js.native
trait ts_ccTransitionMoveInT extends ts_ccTransitionMoveInL {
}

@js.native
@JSGlobal("cc.TransitionMoveInT")
class ccTransitionMoveInT(t:Float, scene:t_ccScene) extends t_ccTransitionMoveInT {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInT")
object ccTransitionMoveInT extends ts_ccTransitionMoveInT {
}

@js.native
trait t_ccTransitionMoveInB extends t_ccTransitionMoveInL {
  override def initScenes():Unit = js.native
}

@js.native
trait ts_ccTransitionMoveInB extends ts_ccTransitionMoveInL {
}

@js.native
@JSGlobal("cc.TransitionMoveInB")
class ccTransitionMoveInB(t:Float, scene:t_ccScene) extends t_ccTransitionMoveInB {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionMoveInB")
object ccTransitionMoveInB extends ts_ccTransitionMoveInB {
}

@js.native
trait t_ccTransitionSlideInL extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  def initScenes():Unit = js.native
  def action:ccMoveBy = js.native
  def easeActionWithAction(action:t_ccActionInterval):js.Dynamic = js.native
}

@js.native
trait ts_ccTransitionSlideInL extends ts_ccTransitionScene {
}

@js.native
@JSGlobal("cc.TransitionSlideInL")
class ccTransitionSlideInL(t:Float, scene:t_ccScene) extends t_ccTransitionSlideInL {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInL")
object ccTransitionSlideInL extends ts_ccTransitionSlideInL {
}

@js.native
trait t_ccTransitionSlideInR extends t_ccTransitionSlideInL {
  override def initScenes():Unit = js.native
  override def action:ccMoveBy = js.native
}

@js.native
trait ts_ccTransitionSlideInR extends ts_ccTransitionSlideInL {
}

@js.native
@JSGlobal("cc.TransitionSlideInR")
class ccTransitionSlideInR(t:Float, scene:t_ccScene) extends t_ccTransitionSlideInR {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInR")
object ccTransitionSlideInR extends ts_ccTransitionSlideInR {
}

@js.native
trait t_ccTransitionSlideInB extends t_ccTransitionSlideInL {
  override def initScenes():Unit = js.native
  override def action:ccMoveBy = js.native
}

@js.native
trait ts_ccTransitionSlideInB extends ts_ccTransitionSlideInL {
}

@js.native
@JSGlobal("cc.TransitionSlideInB")
class ccTransitionSlideInB(t:Float, scene:t_ccScene) extends t_ccTransitionSlideInB {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInB")
object ccTransitionSlideInB extends ts_ccTransitionSlideInB {
}

@js.native
trait t_ccTransitionSlideInT extends t_ccTransitionSlideInL {
  override def initScenes():Unit = js.native
  override def action:ccMoveBy = js.native
}

@js.native
trait ts_ccTransitionSlideInT extends ts_ccTransitionSlideInL {
}

@js.native
@JSGlobal("cc.TransitionSlideInT")
class ccTransitionSlideInT(t:Float, scene:t_ccScene) extends t_ccTransitionSlideInT {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionSlideInT")
object ccTransitionSlideInT extends ts_ccTransitionSlideInT {
}

@js.native
trait t_ccTransitionShrinkGrow extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  def easeActionWithAction(action:js.Dynamic):ccEaseOut = js.native
}

@js.native
trait ts_ccTransitionShrinkGrow extends ts_ccTransitionScene {
}

@js.native
@JSGlobal("cc.TransitionShrinkGrow")
class ccTransitionShrinkGrow(t:Float, scene:t_ccScene) extends t_ccTransitionShrinkGrow {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionShrinkGrow")
object ccTransitionShrinkGrow extends ts_ccTransitionShrinkGrow {
}

@js.native
trait t_ccTransitionFade extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  override def onExit():Unit = js.native
  def initWithDuration(t:Float, scene:t_ccScene, color:t_ccColor):Boolean = js.native
}

@js.native
trait ts_ccTransitionFade extends ts_ccTransitionScene {
}

@js.native
@JSGlobal("cc.TransitionFade")
class ccTransitionFade(t:Float, scene:t_ccScene, o:Float | Float | Float | Float) extends t_ccTransitionFade {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionFade")
object ccTransitionFade extends ts_ccTransitionFade {
}

@js.native
trait t_ccTransitionCrossFade extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  override def onExit():Unit = js.native
}

@js.native
trait ts_ccTransitionCrossFade extends ts_ccTransitionScene {
}

@js.native
@JSGlobal("cc.TransitionCrossFade")
class ccTransitionCrossFade(t:Float, scene:t_ccScene) extends t_ccTransitionCrossFade {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionCrossFade")
object ccTransitionCrossFade extends ts_ccTransitionCrossFade {
}

@js.native
trait t_ccTransitionTurnOffTiles extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  def easeActionWithAction(action:t_ccActionInterval):ccActionInterval = js.native
}

@js.native
trait ts_ccTransitionTurnOffTiles extends ts_ccTransitionScene {
}

@js.native
@JSGlobal("cc.TransitionTurnOffTiles")
class ccTransitionTurnOffTiles(t:Float, scene:t_ccScene) extends t_ccTransitionTurnOffTiles {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionTurnOffTiles")
object ccTransitionTurnOffTiles extends ts_ccTransitionTurnOffTiles {
}

@js.native
trait t_ccTransitionSplitCols extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  def easeActionWithAction(action:t_ccActionInterval):ccEaseInOut = js.native
  def action:js.Dynamic = js.native
}

@js.native
trait ts_ccTransitionSplitCols extends ts_ccTransitionScene {
}

@js.native
@JSGlobal("cc.TransitionSplitCols")
class ccTransitionSplitCols(t:Float, scene:t_ccScene) extends t_ccTransitionSplitCols {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionSplitCols")
object ccTransitionSplitCols extends ts_ccTransitionSplitCols {
}

@js.native
trait t_ccTransitionSplitRows extends t_ccTransitionSplitCols {
  override def action:js.Dynamic = js.native
}

@js.native
trait ts_ccTransitionSplitRows extends ts_ccTransitionSplitCols {
}

@js.native
@JSGlobal("cc.TransitionSplitRows")
class ccTransitionSplitRows(t:Float, scene:t_ccScene) extends t_ccTransitionSplitRows {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionSplitRows")
object ccTransitionSplitRows extends ts_ccTransitionSplitRows {
}

@js.native
trait t_ccTransitionFadeTR extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  def easeActionWithAction(action:t_ccActionInterval):ccActionInterval = js.native
  def actionWithSize(size:t_ccSize):js.Dynamic = js.native
}

@js.native
trait ts_ccTransitionFadeTR extends ts_ccTransitionScene {
}

@js.native
@JSGlobal("cc.TransitionFadeTR")
class ccTransitionFadeTR(t:Float, scene:t_ccScene) extends t_ccTransitionFadeTR {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeTR")
object ccTransitionFadeTR extends ts_ccTransitionFadeTR {
}

@js.native
trait t_ccTransitionFadeBL extends t_ccTransitionFadeTR {
  override def actionWithSize(size:t_ccSize):js.Dynamic = js.native
}

@js.native
trait ts_ccTransitionFadeBL extends ts_ccTransitionFadeTR {
}

@js.native
@JSGlobal("cc.TransitionFadeBL")
class ccTransitionFadeBL(t:Float, scene:t_ccScene) extends t_ccTransitionFadeBL {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeBL")
object ccTransitionFadeBL extends ts_ccTransitionFadeBL {
}

@js.native
trait t_ccTransitionFadeUp extends t_ccTransitionFadeTR {
  override def actionWithSize(size:t_ccSize):js.Dynamic = js.native
}

@js.native
trait ts_ccTransitionFadeUp extends ts_ccTransitionFadeTR {
}

@js.native
@JSGlobal("cc.TransitionFadeUp")
class ccTransitionFadeUp(t:Float, scene:t_ccScene) extends t_ccTransitionFadeUp {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeUp")
object ccTransitionFadeUp extends ts_ccTransitionFadeUp {
}

@js.native
trait t_ccTransitionFadeDown extends t_ccTransitionFadeTR {
  override def actionWithSize(size:t_ccSize):js.Dynamic = js.native
}

@js.native
trait ts_ccTransitionFadeDown extends ts_ccTransitionFadeTR {
}

@js.native
@JSGlobal("cc.TransitionFadeDown")
class ccTransitionFadeDown(t:Float, scene:t_ccScene) extends t_ccTransitionFadeDown {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionFadeDown")
object ccTransitionFadeDown extends ts_ccTransitionFadeDown {
}


