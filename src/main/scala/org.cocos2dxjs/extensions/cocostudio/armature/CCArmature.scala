package org.cocos2dxjs.extensions.cocostudio.armature

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.armature.animation.{ccsArmatureAnimation, t_ccsArmatureAnimation}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsArmatureData, t_ccsArmatureData}
import org.cocos2dxjs.cocos2d.core.sprites.{ccSpriteBatchNode, t_ccSpriteBatchNode}
import org.cocos2dxjs.extensions.cocostudio.armature.physics.{ccsColliderFilter, t_ccsColliderFilter}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}
import org.cocos2dxjs.cocos2d.core.platform.{ccBlendFunc, t_ccBlendFunc}
import org.cocos2dxjs.extensions.cocostudio.t_ccsNode
import org.cocos2dxjs.extensions.cocostudio.ts_ccsNode

@js.native
trait t_ccsArmature extends t_ccsNode {
  var parentBone: ccsBone = js.native
  var animation: ccsArmatureAnimation = js.native
  var armatureData: ccsArmatureData = js.native
  var name: String = js.native
  var batchNode: ccSpriteBatchNode = js.native
  var version: Float = js.native
  var body: types.DynObject = js.native
  var colliderFilter: ccsColliderFilter = js.native
  def init(name:String, parentBone:t_ccsBone):Boolean = js.native
  def createBone(boneName:String):ccsBone = js.native
  def addBone(bone:t_ccsBone, parentName:String):Unit = js.native
  def removeBone(bone:t_ccsBone, recursion:Boolean):Unit = js.native
  def getBone(name:String):ccsBone = js.native
  def changeBoneParent(bone:t_ccsBone, parentName:String):Unit = js.native
  def getBoneDic:types.DynObject = js.native
  def updateOffsetPoint():Unit = js.native
  def setAnimation(animation:t_ccsArmatureAnimation):Unit = js.native
  def getAnimation:ccsArmatureAnimation = js.native
  def getArmatureTransformDirty:Boolean = js.native
  def update(dt:Float):Unit = js.native
  def onEnter():Unit = js.native
  def onExit():Unit = js.native
  def getBoundingBox:ccRect = js.native
  def getBoneAtPoint(x:Float, y:Float):ccsBone = js.native
  def setParentBone(parentBone:t_ccsBone):Unit = js.native
  def getParentBone:ccsBone = js.native
  def drawContour():Unit = js.native
  def setBlendFunc(blendFunc:t_ccBlendFunc | Float, dst:Float):Unit = js.native
  def getBlendFunc:ccBlendFunc = js.native
  def setColliderFilter(filter:t_ccsColliderFilter):Unit = js.native
  def getArmatureData:ccsArmatureData = js.native
  def setArmatureData(armatureData:t_ccsArmatureData):Unit = js.native
  def getVersion:Float = js.native
  def setVersion(version:Float):Unit = js.native
}

@js.native
trait ts_ccsArmature extends ts_ccsNode {
}

@js.native
@JSGlobal("ccs.Armature")
class ccsArmature(name:String, parentBone:t_ccsBone) extends t_ccsArmature {
}

@js.native
@JSGlobal("ccs.Armature")
object ccsArmature extends ts_ccsArmature {
}


