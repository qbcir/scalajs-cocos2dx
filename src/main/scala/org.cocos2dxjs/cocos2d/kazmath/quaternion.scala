package org.cocos2dxjs.cocos2d.kazmath

import scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("cc.math.Quaternion")
class ccmathQuaternion extends js.Object {
  def rotationMatrix(mat3:js.Any):js.Any = js.native
  def rotationYawPitchRoll(yaw:js.Any, pitch:js.Any, roll:js.Any):ccmathQuaternion = js.native
  def rotationBetweenVec3(vec1:ccmathVec3, vec2:ccmathVec3, fallback:ccmathVec3):ccmathQuaternion = js.native
}
