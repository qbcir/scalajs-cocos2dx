package org.cocos2dxjs.extensions.spine

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.ccBlendFunc

@js.native
@JSGlobal("sp.Skeleton")
class spSkeleton extends ccNode {
  override def init:Boolean = js.native
  def setDebugSolots(enable:Boolean):Unit = js.native
  def setDebugBones(enable:Boolean):Unit = js.native
  def setDebugSlotsEnabled(enabled:Boolean):Unit = js.native
  def getDebugSlotsEnabled:Boolean = js.native
  def setDebugBonesEnabled(enabled:Boolean):Unit = js.native
  def getDebugBonesEnabled:Boolean = js.native
  def setTimeScale(scale:Float):Unit = js.native
  def initWithArgs(skeletonDataFile:js.Any, atlasFile:String, scale:Float):Unit = js.native
  override def getBoundingBox:ccRect = js.native
  def updateWorldTransform():Unit = js.native
  def setToSetupPose():Unit = js.native
  def setBonesToSetupPose():Unit = js.native
  def setSlotsToSetupPose():Unit = js.native
  def findBone(boneName:String):js.Any = js.native
  def findSlot(slotName:String):js.Any = js.native
  def setSkin(skinName:String):js.Any = js.native
  def getAttachment(slotName:String, attachmentName:String):js.Any = js.native
  def setAttachment(slotName:String, attachmentName:String):Unit = js.native
  def setPremultipliedAlpha(alpha:Float):Unit = js.native
  def isPremultipliedAlpha:Boolean = js.native
  def setSkeletonData(skeletonData:js.Any, ownsSkeletonData:js.Any):Unit = js.native
  def getTextureAtlas(regionAttachment:js.Any):ccNode = js.native
  def getBlendFunc:ccBlendFunc = js.native
  def setBlendFunc(src:ccBlendFunc, dst:Float):Unit = js.native
  override def update(dt:Float):Unit = js.native
}
