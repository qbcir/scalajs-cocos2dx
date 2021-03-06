package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}

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
trait ts_ccvisibleRect extends js.Object {
  def init(visibleRect:t_ccRect):Unit = js.native
}

@js.native
@JSGlobal("cc.visibleRect")
class ccvisibleRect() extends t_ccvisibleRect {
}

@js.native
@JSGlobal("cc.visibleRect")
object ccvisibleRect extends ts_ccvisibleRect {
}


