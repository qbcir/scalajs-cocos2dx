package org.cocos2dxjs.cocos2d.core.cocoa

import scalajs.js
import scala.scalajs.js.annotation._


@js.native
trait t_ccPoint extends js.Object {
  var x: Float = js.native
  var y: Float = js.native
}

@js.native
@JSGlobal("cc.Point")
class ccPoint(x:Float, y:Float) extends t_ccPoint {
}

@js.native
@JSGlobal("cc.Point")
object ccPoint extends js.Object {
}

@js.native
trait t_ccSize extends js.Object {
  var width: Float = js.native
  var height: Float = js.native
}

@js.native
@JSGlobal("cc.Size")
class ccSize(width:Float, height:Float) extends t_ccSize {
}

@js.native
@JSGlobal("cc.Size")
object ccSize extends js.Object {
}

@js.native
trait t_ccRect extends js.Object {
  var x: Float = js.native
  var y: Float = js.native
  var width: Float = js.native
  var height: Float = js.native
}

@js.native
@JSGlobal("cc.Rect")
class ccRect(x:Float, y:Float, width:Float, height:Float) extends t_ccRect {
}

@js.native
@JSGlobal("cc.Rect")
object ccRect extends js.Object {
}


