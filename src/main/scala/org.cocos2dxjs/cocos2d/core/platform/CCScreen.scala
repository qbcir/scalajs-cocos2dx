package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccscreen extends js.Object {
}

@js.native
trait ts_ccscreen extends js.Object {
  def init():Unit = js.native
  def fullScreen:Boolean = js.native
  def requestFullScreen(element:js.Dynamic, onFullScreenChange:js.Function):Unit = js.native
  def exitFullScreen:Boolean = js.native
  def autoFullScreen(element:js.Dynamic, onFullScreenChange:js.Function):Unit = js.native
}

@js.native
@JSGlobal("cc.screen")
class ccscreen extends t_ccscreen {
}

@js.native
@JSGlobal("cc.screen")
object ccscreen extends ts_ccscreen {
}


