package org.cocos2dxjs.extensions.ccui.layouts

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
@JSGlobal("ccui.VBox")
class ccuiVBox extends ccuiLayout {
  def initWithSize(size:ccSize):Boolean = js.native
  def create(size:ccSize):ccuiVBox = js.native
}

