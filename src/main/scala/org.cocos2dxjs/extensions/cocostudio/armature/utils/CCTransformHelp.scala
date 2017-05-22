package org.cocos2dxjs.extensions.cocostudio.armature.utils

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsBaseData
import org.cocos2dxjs.cocos2d.core.cocoa.ccAffineTransform

@js.native
trait t_ccsTransformHelp extends js.Object {
}

@js.native
trait ts_ccsTransformHelp extends js.Object {
  def transformFromParent(bone:ccsBaseData):Unit = js.native
  def nodeToMatrix(node:ccsBaseData, matrix:ccAffineTransform):Unit = js.native
  def matrixToNode(matrix:ccAffineTransform, node:ccsBaseData):Unit = js.native
  def nodeConcat(target:ccsBaseData, source:ccsBaseData):Unit = js.native
  def nodeSub(target:ccsBaseData, source:ccsBaseData):Unit = js.native
}

@js.native
@JSGlobal("ccs.TransformHelp")
class ccsTransformHelp extends t_ccsTransformHelp {
}

@js.native
@JSGlobal("ccs.TransformHelp")
object ccsTransformHelp extends ts_ccsTransformHelp {
}


