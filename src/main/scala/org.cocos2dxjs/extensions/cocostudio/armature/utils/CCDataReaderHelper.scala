package org.cocos2dxjs.extensions.cocostudio.armature.utils

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsArmatureData, t_ccsArmatureData}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsBoneData, t_ccsBoneData}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsDisplayData, t_ccsDisplayData}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsAnimationData, t_ccsAnimationData}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsMovementData, t_ccsMovementData}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsMovementBoneData, t_ccsMovementBoneData}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsFrameData, t_ccsFrameData}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsTextureData, t_ccsTextureData}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsContourData, t_ccsContourData}

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
  def addDataFromCache(skeleton:types.DynObject, dataInfo:t_ccsDataInfo):Unit = js.native
  def decodeArmature(armatureXML:js.Dynamic, dataInfo:t_ccsDataInfo):ccsArmatureData = js.native
  def decodeArmatureFromJSON(json:types.DynObject, dataInfo:t_ccsDataInfo):ccsArmatureData = js.native
  def decodeBone(boneXML:js.Dynamic, parentXML:js.Dynamic, dataInfo:t_ccsDataInfo):ccsBoneData = js.native
  def decodeBoneFromJson(json:types.DynObject, dataInfo:t_ccsDataInfo):ccsBoneData = js.native
  def decodeBoneDisplay(displayXML:js.Dynamic, dataInfo:t_ccsDataInfo):ccsDisplayData = js.native
  def decodeBoneDisplayFromJson(json:types.DynObject, dataInfo:t_ccsDataInfo):ccsDisplayData = js.native
  def decodeAnimation(animationXML:js.Dynamic, dataInfo:t_ccsDataInfo):ccsAnimationData = js.native
  def decodeAnimationFromJson(json:types.DynObject, dataInfo:t_ccsDataInfo):ccsAnimationData = js.native
  def decodeMovement(movementXML:js.Dynamic, armatureData:t_ccsArmatureData, dataInfo:t_ccsDataInfo):ccsMovementData = js.native
  def decodeMovementFromJson(json:types.DynObject, dataInfo:t_ccsDataInfo):ccsMovementData = js.native
  def decodeMovementBone(movBoneXml:js.Dynamic, parentXml:js.Dynamic, boneData:t_ccsBoneData, dataInfo:t_ccsDataInfo):ccsMovementBoneData = js.native
  def decodeMovementBoneFromJson(json:types.DynObject, dataInfo:t_ccsDataInfo):ccsMovementBoneData = js.native
  def decodeFrame(frameXML:js.Dynamic, parentFrameXml:js.Dynamic, boneData:t_ccsBoneData, dataInfo:t_ccsDataInfo):ccsFrameData = js.native
  def decodeFrameFromJson(json:types.DynObject, dataInfo:t_ccsDataInfo):ccsFrameData = js.native
  def decodeTexture(textureXML:js.Dynamic, dataInfo:t_ccsDataInfo):ccsTextureData = js.native
  def decodeTextureFromJson(json:js.Dynamic):ccsTextureData = js.native
  def decodeContour(contourXML:js.Dynamic, dataInfo:t_ccsDataInfo):ccsContourData = js.native
  def decodeContourFromJson(json:types.DynObject):ccsContourData = js.native
  def addDataFromJsonCache(dic:types.DynObject, dataInfo:t_ccsDataInfo):Unit = js.native
  def decodeNodeFromJson(node:js.Dynamic, json:js.Dynamic, dataInfo:js.Dynamic):Unit = js.native
  def _initBaseFilePath(filePath:js.Dynamic):String = js.native
  def addDataFromXML(xml:js.Dynamic, dataInfo:t_ccsDataInfo):Unit = js.native
  def addDataFromJson(filePath:String, dataInfo:t_ccsDataInfo):Unit = js.native
}

@js.native
@JSGlobal("ccs.dataReaderHelper")
class ccsdataReaderHelper extends t_ccsdataReaderHelper {
}

@js.native
@JSGlobal("ccs.dataReaderHelper")
object ccsdataReaderHelper extends ts_ccsdataReaderHelper {
}


