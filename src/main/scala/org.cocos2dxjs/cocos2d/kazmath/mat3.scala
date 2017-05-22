package org.cocos2dxjs.cocos2d.kazmath

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccmathMatrix3 extends js.Object {
}

@js.native
trait ts_ccmathMatrix3 extends js.Object {
  def fill(mat3:t_ccmathMatrix3):ccmathMatrix3 = js.native
  def identity(pOut:t_ccmathMatrix3):ccmathMatrix3 = js.native
}

@js.native
@JSGlobal("cc.math.Matrix3")
class ccmathMatrix3(mat3:t_ccmathMatrix3) extends t_ccmathMatrix3 {
}

@js.native
@JSGlobal("cc.math.Matrix3")
object ccmathMatrix3 extends ts_ccmathMatrix3 {
}


