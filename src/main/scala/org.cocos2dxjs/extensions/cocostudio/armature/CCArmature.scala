package org.cocos2dxjs.extensions.cocostudio.armature

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.extensions.cocostudio.armature.animation.ccsArmatureAnimation
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsArmatureData
import org.cocos2dxjs.cocos2d.core.sprites.ccSpriteBatchNode
import org.cocos2dxjs.extensions.cocostudio.armature.physics.ccsColliderFilter
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.platform.ccBlendFunc
import org.cocos2dxjs.extensions.cocostudio.t_ccsNode

@js.native
trait t_ccsArmature extends t_ccsNode {
  var parentBone: ccsBone = js.native
  var animation: ccsArmatureAnimation = js.native
  var armatureData: ccsArmatureData = js.native
  var name: String = js.native
  var batchNode: ccSpriteBatchNode = js.native
  var version: Float = js.native
  var body: js.Object = js.native
  var colliderFilter: ccsColliderFilter = js.native
  def init(name:String, parentBone:ccsBone):Boolean = js.native
  def createBone(boneName:String):ccsBone = js.native
  def addBone(bone:ccsBone, parentName:String):Unit = js.native
  def removeBone(bone:ccsBone, recursion:Boolean):Unit = js.native
  def getBone(name:String):ccsBone = js.native
  def changeBoneParent(bone:ccsBone, parentName:String):Unit = js.native
  def getBoneDic:js.Object = js.native
  def updateOffsetPoint():Unit = js.native
  def setAnimation(animation:ccsArmatureAnimation):Unit = js.native
  def getAnimation:ccsArmatureAnimation = js.native
  def getArmatureTransformDirty:Boolean = js.native
  def update(dt:Float):Unit = js.native
  def onEnter():Unit = js.native
  def onExit():Unit = js.native
  def getBoundingBox:ccRect = js.native
  def getBoneAtPoint(x:Float, y:Float):ccsBone = js.native
  def setParentBone(parentBone:ccsBone):Unit = js.native
  def getParentBone:ccsBone = js.native
  def drawContour():Unit = js.native
  def setBlendFunc(blendFunc:ccBlendFunc, dst:Float):Unit = js.native
  def getBlendFunc:ccBlendFunc = js.native
  def setColliderFilter(filter:ccsColliderFilter):Unit = js.native
  def getArmatureData:ccsArmatureData = js.native
  def setArmatureData(armatureData:ccsArmatureData):Unit = js.native
  def getVersion:Float = js.native
  def setVersion(version:Float):Unit = js.native
}

@js.native
@JSGlobal("ccs.Armature")
class ccsArmature(name:String, parentBone:ccsBone) extends t_ccsArmature {
}

@js.native
@JSGlobal("ccs.Armature")
object ccsArmature extends js.Object {
}


