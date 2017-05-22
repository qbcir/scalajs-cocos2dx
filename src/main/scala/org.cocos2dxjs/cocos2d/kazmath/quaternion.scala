package org.cocos2dxjs.cocos2d.kazmath

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccmathQuaternion extends js.Object {
}

@js.native
trait ts_ccmathQuaternion extends js.Object {
  def rotationMatrix(mat3:js.Dynamic):js.Dynamic = js.native
  def rotationYawPitchRoll(yaw:js.Dynamic, pitch:js.Dynamic, roll:js.Dynamic):ccmathQuaternion = js.native
  def rotationBetweenVec3(vec1:t_ccmathVec3, vec2:t_ccmathVec3, fallback:t_ccmathVec3):ccmathQuaternion = js.native
}

@js.native
@JSGlobal("cc.math.Quaternion")
class ccmathQuaternion(x:Float | t_ccmathQuaternion, y:Float, z:Float, w:Float) extends t_ccmathQuaternion {
}

@js.native
@JSGlobal("cc.math.Quaternion")
object ccmathQuaternion extends ts_ccmathQuaternion {
}


