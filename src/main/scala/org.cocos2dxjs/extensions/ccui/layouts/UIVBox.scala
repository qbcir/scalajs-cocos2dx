package org.cocos2dxjs.extensions.ccui.layouts

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
trait t_ccuiVBox extends t_ccuiLayout {
  def initWithSize(size:ccSize):Boolean = js.native
}

@js.native
@JSGlobal("ccui.VBox")
class ccuiVBox(size:ccSize) extends t_ccuiVBox {
  var onFocusChanged: js.Any = js.native
  var onNextFocusedWidget: js.Any = js.native
}

@js.native
@JSGlobal("ccui.VBox")
object ccuiVBox extends js.Object {
  def create(size:ccSize):ccuiVBox = js.native
}


