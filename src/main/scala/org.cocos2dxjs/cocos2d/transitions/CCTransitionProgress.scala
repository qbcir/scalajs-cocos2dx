package org.cocos2dxjs.cocos2d.transitions

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.scenes.ccScene

@js.native
trait t_ccTransitionProgress extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  override def onExit():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionProgress")
class ccTransitionProgress(t:Float, scene:ccScene) extends t_ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgress")
object ccTransitionProgress extends js.Object {
}

@js.native
trait t_ccTransitionProgressRadialCCW extends t_ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressRadialCCW")
class ccTransitionProgressRadialCCW(t:Float, scene:ccScene) extends t_ccTransitionProgressRadialCCW {
}

@js.native
@JSGlobal("cc.TransitionProgressRadialCCW")
object ccTransitionProgressRadialCCW extends js.Object {
}

@js.native
trait t_ccTransitionProgressRadialCW extends t_ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressRadialCW")
class ccTransitionProgressRadialCW(t:Float, scene:ccScene) extends t_ccTransitionProgressRadialCW {
}

@js.native
@JSGlobal("cc.TransitionProgressRadialCW")
object ccTransitionProgressRadialCW extends js.Object {
}

@js.native
trait t_ccTransitionProgressHorizontal extends t_ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressHorizontal")
class ccTransitionProgressHorizontal(t:Float, scene:ccScene) extends t_ccTransitionProgressHorizontal {
}

@js.native
@JSGlobal("cc.TransitionProgressHorizontal")
object ccTransitionProgressHorizontal extends js.Object {
}

@js.native
trait t_ccTransitionProgressVertical extends t_ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressVertical")
class ccTransitionProgressVertical(t:Float, scene:ccScene) extends t_ccTransitionProgressVertical {
}

@js.native
@JSGlobal("cc.TransitionProgressVertical")
object ccTransitionProgressVertical extends js.Object {
}

@js.native
trait t_ccTransitionProgressInOut extends t_ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressInOut")
class ccTransitionProgressInOut(t:Float, scene:ccScene) extends t_ccTransitionProgressInOut {
}

@js.native
@JSGlobal("cc.TransitionProgressInOut")
object ccTransitionProgressInOut extends js.Object {
}

@js.native
trait t_ccTransitionProgressOutIn extends t_ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressOutIn")
class ccTransitionProgressOutIn(t:Float, scene:ccScene) extends t_ccTransitionProgressOutIn {
}

@js.native
@JSGlobal("cc.TransitionProgressOutIn")
object ccTransitionProgressOutIn extends js.Object {
}

