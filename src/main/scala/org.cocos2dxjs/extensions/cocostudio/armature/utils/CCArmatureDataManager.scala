package org.cocos2dxjs.extensions.cocostudio.armature.utils

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsArmatureData, t_ccsArmatureData}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsAnimationData, t_ccsAnimationData}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsTextureData, t_ccsTextureData}

@js.native
trait t_ccsRelativeData extends js.Object {
}

@js.native
trait ts_ccsRelativeData extends js.Object {
}

@js.native
@JSGlobal("ccs.RelativeData")
class ccsRelativeData() extends t_ccsRelativeData {
}

@js.native
@JSGlobal("ccs.RelativeData")
object ccsRelativeData extends ts_ccsRelativeData {
}

@js.native
trait t_ccsarmatureDataManager extends js.Object {
}

@js.native
trait ts_ccsarmatureDataManager extends js.Object {
  def removeArmatureFileInfo(configFilePath:String):Unit = js.native
  def addArmatureData(id:String, armatureData:t_ccsArmatureData):Unit = js.native
  def getArmatureData(id:String):ccsArmatureData = js.native
  def removeArmatureData(id:String):Unit = js.native
  def addAnimationData(id:String, animationData:t_ccsAnimationData):Unit = js.native
  def getAnimationData(id:String):ccsAnimationData = js.native
  def removeAnimationData(id:String):Unit = js.native
  def addTextureData(id:String, textureData:t_ccsTextureData):Unit = js.native
  def getTextureData(id:String):ccsTextureData = js.native
  def removeTextureData(id:String):Unit = js.native
  def addArmatureFileInfo(imagePath:String, plistPath:String, configFilePath:String):Unit = js.native
  def addArmatureFileInfoAsync(imagePath:String, plistPath:String, configFilePath:String, selector:js.Function, target:types.DynObject):Unit = js.native
  def addSpriteFrameFromFile(plistPath:String, imagePath:String, configFilePath:String):Unit = js.native
  def isAutoLoadSpriteFile():Boolean = js.native
  def getArmatureDatas():types.DynObject = js.native
  def getAnimationDatas():types.DynObject = js.native
  def getTextureDatas():types.DynObject = js.native
  def addRelativeData(configFilePath:String):Unit = js.native
  def getRelativeData(configFilePath:String):ccsRelativeData = js.native
  def clear():Unit = js.native
}

@js.native
@JSGlobal("ccs.armatureDataManager")
class ccsarmatureDataManager() extends t_ccsarmatureDataManager {
}

@js.native
@JSGlobal("ccs.armatureDataManager")
object ccsarmatureDataManager extends ts_ccsarmatureDataManager {
}


