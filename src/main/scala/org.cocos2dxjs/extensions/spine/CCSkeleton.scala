package org.cocos2dxjs.extensions.spine

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.ccBlendFunc
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode

@js.native
trait t_spSkeleton extends t_ccNode {
  override def init:Boolean = js.native
  def setDebugSolots(enable:Boolean):Unit = js.native
  def setDebugBones(enable:Boolean):Unit = js.native
  def setDebugSlotsEnabled(enabled:Boolean):Unit = js.native
  def getDebugSlotsEnabled:Boolean = js.native
  def setDebugBonesEnabled(enabled:Boolean):Unit = js.native
  def getDebugBonesEnabled:Boolean = js.native
  def setTimeScale(scale:Float):Unit = js.native
  def initWithArgs(skeletonDataFile:js.Dynamic | String, atlasFile:String | js.Dynamic | js.Dynamic, scale:Float):Unit = js.native
  override def getBoundingBox:ccRect = js.native
  def updateWorldTransform():Unit = js.native
  def setToSetupPose():Unit = js.native
  def setBonesToSetupPose():Unit = js.native
  def setSlotsToSetupPose():Unit = js.native
  def findBone(boneName:String):js.Dynamic = js.native
  def findSlot(slotName:String):js.Dynamic = js.native
  def setSkin(skinName:String):js.Dynamic = js.native
  def getAttachment(slotName:String, attachmentName:String):js.Dynamic | js.Dynamic = js.native
  def setAttachment(slotName:String, attachmentName:String):Unit = js.native
  def setPremultipliedAlpha(alpha:Float):Unit = js.native
  def isPremultipliedAlpha:Boolean = js.native
  def setSkeletonData(skeletonData:js.Dynamic, ownsSkeletonData:js.Dynamic):Unit = js.native
  def getTextureAtlas(regionAttachment:js.Dynamic | js.Dynamic):ccNode = js.native
  def getBlendFunc:ccBlendFunc = js.native
  def setBlendFunc(src:ccBlendFunc | Float, dst:Float):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
trait ts_spSkeleton extends ts_ccNode {
}

@js.native
@JSGlobal("sp.Skeleton")
class spSkeleton extends t_spSkeleton {
}

@js.native
@JSGlobal("sp.Skeleton")
object spSkeleton extends ts_spSkeleton {
}


@js.native
@JSGlobal("sp")
object sp extends js.Object {

  val VERTEX_INDEX: types.DynObject = js.native
  val ATTACHMENT_TYPE: types.DynObject = js.native
  val ANIMATION_EVENT_TYPE: types.DynObject = js.native
}

