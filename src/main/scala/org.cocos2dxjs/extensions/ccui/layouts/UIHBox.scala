package org.cocos2dxjs.extensions.ccui.layouts

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
trait t_ccuiHBox extends t_ccuiLayout {
}

@js.native
@JSGlobal("ccui.HBox")
class ccuiHBox(size:ccSize) extends t_ccuiHBox {
  var onFocusChanged: js.Any = js.native
  var onNextFocusedWidget: js.Any = js.native
}

@js.native
@JSGlobal("ccui.HBox")
object ccuiHBox extends js.Object {
}



