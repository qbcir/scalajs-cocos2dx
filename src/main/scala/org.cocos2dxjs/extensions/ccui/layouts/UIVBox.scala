package org.cocos2dxjs.extensions.ccui.layouts

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}

@js.native
trait t_ccuiVBox extends t_ccuiLayout {
  def initWithSize(size:t_ccSize):Boolean = js.native
}

@js.native
trait ts_ccuiVBox extends ts_ccuiLayout {
  def create(size:t_ccSize):ccuiVBox = js.native
}

@js.native
@JSGlobal("ccui.VBox")
class ccuiVBox(size:t_ccSize) extends t_ccuiVBox {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.VBox")
object ccuiVBox extends ts_ccuiVBox {
}


