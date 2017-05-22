package org.cocos2dxjs.cocos2d.transitions

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.scenes.ccScene

@js.native
trait t_ccTransitionProgress extends t_ccTransitionScene {
  override def onEnter():Unit = js.native
  override def onExit():Unit = js.native
}

@js.native
trait ts_ccTransitionProgress extends ts_ccTransitionScene {
}

@js.native
@JSGlobal("cc.TransitionProgress")
class ccTransitionProgress(t:Float, scene:ccScene) extends t_ccTransitionProgress {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionProgress")
object ccTransitionProgress extends ts_ccTransitionProgress {
}

@js.native
trait t_ccTransitionProgressRadialCCW extends t_ccTransitionProgress {
}

@js.native
trait ts_ccTransitionProgressRadialCCW extends ts_ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressRadialCCW")
class ccTransitionProgressRadialCCW(t:Float, scene:ccScene) extends t_ccTransitionProgressRadialCCW {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionProgressRadialCCW")
object ccTransitionProgressRadialCCW extends ts_ccTransitionProgressRadialCCW {
}

@js.native
trait t_ccTransitionProgressRadialCW extends t_ccTransitionProgress {
}

@js.native
trait ts_ccTransitionProgressRadialCW extends ts_ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressRadialCW")
class ccTransitionProgressRadialCW(t:Float, scene:ccScene) extends t_ccTransitionProgressRadialCW {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionProgressRadialCW")
object ccTransitionProgressRadialCW extends ts_ccTransitionProgressRadialCW {
}

@js.native
trait t_ccTransitionProgressHorizontal extends t_ccTransitionProgress {
}

@js.native
trait ts_ccTransitionProgressHorizontal extends ts_ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressHorizontal")
class ccTransitionProgressHorizontal(t:Float, scene:ccScene) extends t_ccTransitionProgressHorizontal {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionProgressHorizontal")
object ccTransitionProgressHorizontal extends ts_ccTransitionProgressHorizontal {
}

@js.native
trait t_ccTransitionProgressVertical extends t_ccTransitionProgress {
}

@js.native
trait ts_ccTransitionProgressVertical extends ts_ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressVertical")
class ccTransitionProgressVertical(t:Float, scene:ccScene) extends t_ccTransitionProgressVertical {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionProgressVertical")
object ccTransitionProgressVertical extends ts_ccTransitionProgressVertical {
}

@js.native
trait t_ccTransitionProgressInOut extends t_ccTransitionProgress {
}

@js.native
trait ts_ccTransitionProgressInOut extends ts_ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressInOut")
class ccTransitionProgressInOut(t:Float, scene:ccScene) extends t_ccTransitionProgressInOut {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionProgressInOut")
object ccTransitionProgressInOut extends ts_ccTransitionProgressInOut {
}

@js.native
trait t_ccTransitionProgressOutIn extends t_ccTransitionProgress {
}

@js.native
trait ts_ccTransitionProgressOutIn extends ts_ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressOutIn")
class ccTransitionProgressOutIn(t:Float, scene:ccScene) extends t_ccTransitionProgressOutIn {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.TransitionProgressOutIn")
object ccTransitionProgressOutIn extends ts_ccTransitionProgressOutIn {
}


