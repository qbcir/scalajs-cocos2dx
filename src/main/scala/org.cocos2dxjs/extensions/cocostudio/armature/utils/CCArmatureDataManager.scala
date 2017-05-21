package org.cocos2dxjs.extensions.cocostudio.armature.utils

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsArmatureData
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsAnimationData
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsTextureData

@js.native
trait t_ccsRelativeData extends js.Object {
}

@js.native
@JSGlobal("ccs.RelativeData")
class ccsRelativeData extends t_ccsRelativeData {
}

@js.native
@JSGlobal("ccs.RelativeData")
object ccsRelativeData extends js.Object {
}

@js.native
trait t_ccsarmatureDataManager extends js.Object {
}

@js.native
@JSGlobal("ccs.armatureDataManager")
class ccsarmatureDataManager extends t_ccsarmatureDataManager {
}

@js.native
@JSGlobal("ccs.armatureDataManager")
object ccsarmatureDataManager extends js.Object {
  def removeArmatureFileInfo(configFilePath:String):Unit = js.native
  def addArmatureData(id:String, armatureData:ccsArmatureData):Unit = js.native
  def getArmatureData(id:String):ccsArmatureData = js.native
  def removeArmatureData(id:String):Unit = js.native
  def addAnimationData(id:String, animationData:ccsAnimationData):Unit = js.native
  def getAnimationData(id:String):ccsAnimationData = js.native
  def removeAnimationData(id:String):Unit = js.native
  def addTextureData(id:String, textureData:ccsTextureData):Unit = js.native
  def getTextureData(id:String):ccsTextureData = js.native
  def removeTextureData(id:String):Unit = js.native
  def addArmatureFileInfo(imagePath:String, plistPath:String, configFilePath:String):Unit = js.native
  def addArmatureFileInfoAsync(imagePath:String, plistPath:String, configFilePath:String, selector:js.Function, target:js.Object):Unit = js.native
  def addSpriteFrameFromFile(plistPath:String, imagePath:String, configFilePath:String):Unit = js.native
  def isAutoLoadSpriteFile:Boolean = js.native
  def getArmatureDatas:js.Object = js.native
  def getAnimationDatas:js.Object = js.native
  def getTextureDatas:js.Object = js.native
  def addRelativeData(configFilePath:String):Unit = js.native
  def getRelativeData(configFilePath:String):ccsRelativeData = js.native
  def clear():Unit = js.native
}

