package org.cocos2dxjs.extensions.ccui.layouts

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
trait t_ccuiRelativeBox extends t_ccuiLayout {
}

@js.native
@JSGlobal("ccui.RelativeBox")
class ccuiRelativeBox(size:ccSize) extends t_ccuiRelativeBox {
  var onFocusChanged: js.Any = js.native
  var onNextFocusedWidget: js.Any = js.native
}

@js.native
@JSGlobal("ccui.RelativeBox")
object ccuiRelativeBox extends js.Object {
}


