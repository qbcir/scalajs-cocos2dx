package org.cocos2dxjs.extensions.cocostudio.armature.utils

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsArmatureData
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsBoneData
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsDisplayData
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsAnimationData
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsMovementData
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsMovementBoneData
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsFrameData
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsTextureData
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsContourData

@js.native
trait t_ccsDataInfo extends js.Object {
}

@js.native
trait ts_ccsDataInfo extends js.Object {
}

@js.native
@JSGlobal("ccs.DataInfo")
class ccsDataInfo extends t_ccsDataInfo {
}

@js.native
@JSGlobal("ccs.DataInfo")
object ccsDataInfo extends ts_ccsDataInfo {
}

@js.native
trait t_ccsdataReaderHelper extends js.Object {
}

@js.native
trait ts_ccsdataReaderHelper extends js.Object {
  def addDataFromFile(filePath:String):Unit = js.native
  def addDataFromFileAsync(imagePath:String, plistPath:String, filePath:String, selector:js.Function, target:types.DynObject):Unit = js.native
  def removeConfigFile(configFile:String):Unit = js.native
  def addDataFromCache(skeleton:types.DynObject, dataInfo:ccsDataInfo):Unit = js.native
  def decodeArmature(armatureXML:js.Dynamic, dataInfo:ccsDataInfo):ccsArmatureData = js.native
  def decodeArmatureFromJSON(json:types.DynObject, dataInfo:ccsDataInfo):ccsArmatureData = js.native
  def decodeBone(boneXML:js.Dynamic, parentXML:js.Dynamic, dataInfo:ccsDataInfo):ccsBoneData = js.native
  def decodeBoneFromJson(json:types.DynObject, dataInfo:ccsDataInfo):ccsBoneData = js.native
  def decodeBoneDisplay(displayXML:js.Dynamic, dataInfo:ccsDataInfo):ccsDisplayData = js.native
  def decodeBoneDisplayFromJson(json:types.DynObject, dataInfo:ccsDataInfo):ccsDisplayData = js.native
  def decodeAnimation(animationXML:js.Dynamic, dataInfo:ccsDataInfo):ccsAnimationData = js.native
  def decodeAnimationFromJson(json:types.DynObject, dataInfo:ccsDataInfo):ccsAnimationData = js.native
  def decodeMovement(movementXML:js.Dynamic, armatureData:ccsArmatureData, dataInfo:ccsDataInfo):ccsMovementData = js.native
  def decodeMovementFromJson(json:types.DynObject, dataInfo:ccsDataInfo):ccsMovementData = js.native
  def decodeMovementBone(movBoneXml:js.Dynamic, parentXml:js.Dynamic, boneData:ccsBoneData, dataInfo:ccsDataInfo):ccsMovementBoneData = js.native
  def decodeMovementBoneFromJson(json:types.DynObject, dataInfo:ccsDataInfo):ccsMovementBoneData = js.native
  def decodeFrame(frameXML:js.Dynamic, parentFrameXml:js.Dynamic, boneData:ccsBoneData, dataInfo:ccsDataInfo):ccsFrameData = js.native
  def decodeFrameFromJson(json:types.DynObject, dataInfo:ccsDataInfo):ccsFrameData = js.native
  def decodeTexture(textureXML:js.Dynamic, dataInfo:ccsDataInfo):ccsTextureData = js.native
  def decodeTextureFromJson(json:js.Dynamic):ccsTextureData = js.native
  def decodeContour(contourXML:js.Dynamic, dataInfo:ccsDataInfo):ccsContourData = js.native
  def decodeContourFromJson(json:types.DynObject):ccsContourData = js.native
  def addDataFromJsonCache(dic:types.DynObject, dataInfo:ccsDataInfo):Unit = js.native
  def decodeNodeFromJson(node:js.Dynamic, json:js.Dynamic, dataInfo:js.Dynamic):Unit = js.native
  def _initBaseFilePath(filePath:js.Dynamic):String = js.native
  def addDataFromXML(xml:js.Dynamic, dataInfo:ccsDataInfo):Unit = js.native
  def addDataFromJson(filePath:String, dataInfo:ccsDataInfo):Unit = js.native
}

@js.native
@JSGlobal("ccs.dataReaderHelper")
class ccsdataReaderHelper extends t_ccsdataReaderHelper {
}

@js.native
@JSGlobal("ccs.dataReaderHelper")
object ccsdataReaderHelper extends ts_ccsdataReaderHelper {
}


