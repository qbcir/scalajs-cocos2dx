package org.cocos2dxjs.extensions.cocostudio.armature.utils

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsBaseData
import org.cocos2dxjs.cocos2d.core.cocoa.ccAffineTransform

@js.native
@JSGlobal("ccs.TransformHelp")
class ccsTransformHelp extends js.Object {
  def transformFromParent(bone:ccsBaseData):Unit = js.native
  def nodeToMatrix(node:ccsBaseData, matrix:ccAffineTransform):Unit = js.native
  def matrixToNode(matrix:ccAffineTransform, node:ccsBaseData):Unit = js.native
  def nodeConcat(target:ccsBaseData, source:ccsBaseData):Unit = js.native
  def nodeSub(target:ccsBaseData, source:ccsBaseData):Unit = js.native
}

