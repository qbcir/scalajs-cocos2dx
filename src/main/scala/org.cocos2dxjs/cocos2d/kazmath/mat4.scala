package org.cocos2dxjs.cocos2d.kazmath

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccmathMatrix4 extends js.Object {
}

@js.native
trait ts_ccmathMatrix4 extends js.Object {
  def createByRotationX(radians:Float, matrix:t_ccmathMatrix4):ccmathMatrix4 = js.native
  def createByRotationY(radians:Float, matrix:t_ccmathMatrix4):js.Dynamic = js.native
  def createByRotationZ(radians:Float, matrix:t_ccmathMatrix4):ccmathMatrix4 = js.native
  def createByPitchYawRoll(pitch:Float, yaw:Float, roll:Float, matrix:t_ccmathMatrix4):ccmathMatrix4 = js.native
  def createByQuaternion(quaternion:t_ccmathQuaternion, matrix:t_ccmathMatrix4):ccmathMatrix4 = js.native
  def createByRotationTranslation(rotation:t_ccmathMatrix3, translation:t_ccmathVec3, matrix:t_ccmathMatrix4):ccmathMatrix4 = js.native
  def createByScale(x:Float, y:Float, z:Float, matrix:t_ccmathMatrix4):ccmathMatrix4 = js.native
  def createByTranslation(x:Float, y:Float, z:Float, matrix:t_ccmathMatrix4):ccmathMatrix4 = js.native
  def createPerspectiveProjection(fovY:Float, aspect:Float, zNear:Float, zFar:Float):ccmathMatrix4|js.Dynamic = js.native
  def createOrthographicProjection(left:Float, right:Float, bottom:Float, top:Float, nearVal:Float, farVal:Float):ccmathMatrix4 = js.native
  def createByAxisAndAngle(axis:t_ccmathVec3, radians:Float, matrix:t_ccmathMatrix4):ccmathMatrix4 = js.native
}

@js.native
@JSGlobal("cc.math.Matrix4")
class ccmathMatrix4(mat4:t_ccmathMatrix4) extends t_ccmathMatrix4 {
}

@js.native
@JSGlobal("cc.math.Matrix4")
object ccmathMatrix4 extends ts_ccmathMatrix4 {
}


