package org.cocos2dxjs.extensions.ccui.layouts

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
trait t_ccuiVBox extends t_ccuiLayout {
  def initWithSize(size:ccSize):Boolean = js.native
}

@js.native
trait ts_ccuiVBox extends ts_ccuiLayout {
  def create(size:ccSize):ccuiVBox = js.native
}

@js.native
@JSGlobal("ccui.VBox")
class ccuiVBox(size:ccSize) extends t_ccuiVBox {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.VBox")
object ccuiVBox extends ts_ccuiVBox {
}


