package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import scala.scalajs.js.annotation._


@js.native
trait t_ccscreen extends js.Object {
}

@js.native
@JSGlobal("cc.screen")
class ccscreen extends t_ccscreen {
}

@js.native
@JSGlobal("cc.screen")
object ccscreen extends js.Object {
  def init():Unit = js.native
  def fullScreen:Boolean = js.native
  def requestFullScreen(element:js.Any, onFullScreenChange:js.Function):Unit = js.native
  def exitFullScreen:Boolean = js.native
  def autoFullScreen(element:js.Any, onFullScreenChange:js.Function):Unit = js.native
}


