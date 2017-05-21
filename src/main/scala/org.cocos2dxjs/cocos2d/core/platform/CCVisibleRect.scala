package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect

@js.native
trait t_ccvisibleRect extends js.Object {
  var topLeft: ccPoint = js.native
  var topRight: ccPoint = js.native
  var top: ccPoint = js.native
  var bottomLeft: ccPoint = js.native
  var bottomRight: ccPoint = js.native
  var bottom: ccPoint = js.native
  var center: ccPoint = js.native
  var left: ccPoint = js.native
  var right: ccPoint = js.native
  var width: Float = js.native
  var height: Float = js.native
}

@js.native
@JSGlobal("cc.visibleRect")
class ccvisibleRect extends t_ccvisibleRect {
}

@js.native
@JSGlobal("cc.visibleRect")
object ccvisibleRect extends js.Object {
  def init(visibleRect:ccRect):Unit = js.native
}


