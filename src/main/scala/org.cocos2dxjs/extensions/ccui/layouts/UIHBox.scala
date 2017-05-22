package org.cocos2dxjs.extensions.ccui.layouts

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}

@js.native
trait t_ccuiHBox extends t_ccuiLayout {
}

@js.native
trait ts_ccuiHBox extends ts_ccuiLayout {
}

@js.native
@JSGlobal("ccui.HBox")
class ccuiHBox(size:t_ccSize) extends t_ccuiHBox {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.HBox")
object ccuiHBox extends ts_ccuiHBox {
}


