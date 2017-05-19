package org.cocos2dxjs.cocos2d.transitions

import scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("cc.TransitionProgress")
class ccTransitionProgress extends ccTransitionScene {
  override def onEnter():Unit = js.native
  override def onExit():Unit = js.native
}

@js.native
@JSGlobal("cc.TransitionProgressRadialCCW")
class ccTransitionProgressRadialCCW extends ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressRadialCW")
class ccTransitionProgressRadialCW extends ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressHorizontal")
class ccTransitionProgressHorizontal extends ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressVertical")
class ccTransitionProgressVertical extends ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressInOut")
class ccTransitionProgressInOut extends ccTransitionProgress {
}

@js.native
@JSGlobal("cc.TransitionProgressOutIn")
class ccTransitionProgressOutIn extends ccTransitionProgress {
}

