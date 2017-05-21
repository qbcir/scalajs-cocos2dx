package org.cocos2dxjs.extensions.cocostudio.armature

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsBoneData
import org.cocos2dxjs.extensions.cocostudio.armature.animation.ccsTween
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsFrameData
import org.cocos2dxjs.extensions.cocostudio.armature.physics.ccsColliderFilter
import org.cocos2dxjs.extensions.cocostudio.armature.display.ccsDisplayManager
import org.cocos2dxjs.cocos2d.core.platform.ccBlendFunc
import org.cocos2dxjs.cocos2d.core.cocoa.ccAffineTransform
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsDisplayData
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsBaseData
import org.cocos2dxjs.extensions.cocostudio.t_ccsNode

@js.native
trait t_ccsBone extends t_ccsNode {
  var boneData: ccsBoneData = js.native
  var armature: ccsArmature = js.native
  var parentBone: ccsBone = js.native
  var childArmature: ccsArmature = js.native
  val childrenBone: js.Array[js.Any] = js.native
  val tween: ccsTween = js.native
  val tweenData: ccsFrameData = js.native
  var colliderFilter: ccsColliderFilter = js.native
  var displayManager: ccsDisplayManager = js.native
  var ignoreMovementBoneData: Boolean = js.native
  var name: String = js.native
  var blendDirty: Boolean = js.native
  def init(name:String):Boolean = js.native
  def setBoneData(boneData:ccsBoneData):Unit = js.native
  def getBoneData:ccsBoneData = js.native
  def setArmature(armature:ccsArmature):Unit = js.native
  def getArmature:ccsArmature = js.native
  def update(delta:Float):Unit = js.native
  def setBlendFunc(blendFunc:ccBlendFunc, dst:Float):Unit = js.native
  def updateColor():Unit = js.native
  def updateZOrder():Unit = js.native
  def addChildBone(child:ccsBone):Unit = js.native
  def removeChildBone(bone:ccsBone, recursion:Boolean):Unit = js.native
  def removeFromParent(recursion:Boolean):Unit = js.native
  def setParentBone(parent:ccsBone):Unit = js.native
  def getParentBone:ccsBone = js.native
  def setChildArmature(armature:ccsArmature):Unit = js.native
  def getChildArmature:ccsArmature = js.native
  def getTween:ccsTween = js.native
  def setLocalZOrder(zOrder:Float):Unit = js.native
  def getNodeToArmatureTransform:ccAffineTransform = js.native
  def getNodeToWorldTransform:ccAffineTransform = js.native
  def getDisplayRenderNode:ccNode = js.native
  def getDisplayRenderNodeType:Float = js.native
  def addDisplay(displayData:ccsDisplayData, index:Float):Unit = js.native
  def removeDisplay(index:Float):Unit = js.native
  def changeDisplayWithIndex(index:Float, force:Boolean):Unit = js.native
  def changeDisplayWithName(name:String, force:Boolean):Unit = js.native
  def getColliderDetector:js.Any = js.native
  def setColliderFilter(filter:ccsColliderFilter):Unit = js.native
  def getColliderFilter:ccsColliderFilter = js.native
  def setTransformDirty(dirty:Boolean):Unit = js.native
  def isTransformDirty:Boolean = js.native
  def getDisplayManager:ccsDisplayManager = js.native
  def setIgnoreMovementBoneData(bool:Boolean):Unit = js.native
  def isIgnoreMovementBoneData:Boolean = js.native
  def getBlendFunc:ccBlendFunc = js.native
  def setBlendDirty(dirty:Boolean):Unit = js.native
  def isBlendDirty:Boolean = js.native
  def getTweenData:ccsFrameData = js.native
  def getWorldInfo:ccsBaseData = js.native
}

@js.native
@JSGlobal("ccs.Bone")
class ccsBone(name:String) extends t_ccsBone {
}

@js.native
@JSGlobal("ccs.Bone")
object ccsBone extends js.Object {
}


