package org.cocos2dxjs.extensions.ccui.layouts

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
trait t_ccuiRelativeBox extends t_ccuiLayout {
}

@js.native
trait ts_ccuiRelativeBox extends ts_ccuiLayout {
}

@js.native
@JSGlobal("ccui.RelativeBox")
class ccuiRelativeBox(size:ccSize) extends t_ccuiRelativeBox {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.RelativeBox")
object ccuiRelativeBox extends ts_ccuiRelativeBox {
}


