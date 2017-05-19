package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("cc.screen")
class ccscreen extends js.Object {
  def init():Unit = js.native
  def fullScreen:Boolean = js.native
  def requestFullScreen(element:js.Any, onFullScreenChange:js.Function):Unit = js.native
  def exitFullScreen:Boolean = js.native
  def autoFullScreen(element:js.Any, onFullScreenChange:js.Function):Unit = js.native
}

