package org.cocos2dxjs.extensions.cocostudio.armature.utils

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsBaseData, t_ccsBaseData}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccAffineTransform, t_ccAffineTransform}

@js.native
trait t_ccsTransformHelp extends js.Object {
}

@js.native
trait ts_ccsTransformHelp extends js.Object {
  def transformFromParent(bone:t_ccsBaseData):Unit = js.native
  def nodeToMatrix(node:t_ccsBaseData, matrix:t_ccAffineTransform):Unit = js.native
  def matrixToNode(matrix:t_ccAffineTransform, node:t_ccsBaseData):Unit = js.native
  def nodeConcat(target:t_ccsBaseData, source:t_ccsBaseData):Unit = js.native
  def nodeSub(target:t_ccsBaseData, source:t_ccsBaseData):Unit = js.native
}

@js.native
@JSGlobal("ccs.TransformHelp")
class ccsTransformHelp extends t_ccsTransformHelp {
}

@js.native
@JSGlobal("ccs.TransformHelp")
object ccsTransformHelp extends ts_ccsTransformHelp {
}


