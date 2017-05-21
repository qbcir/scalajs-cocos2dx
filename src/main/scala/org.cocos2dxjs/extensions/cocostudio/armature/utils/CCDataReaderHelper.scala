package org.cocos2dxjs.extensions.cocostudio.armature.utils

import scalajs.js
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
@JSGlobal("ccs.DataInfo")
class ccsDataInfo extends t_ccsDataInfo {
}

@js.native
@JSGlobal("ccs.DataInfo")
object ccsDataInfo extends js.Object {
}

@js.native
trait t_ccsdataReaderHelper extends js.Object {
}

@js.native
@JSGlobal("ccs.dataReaderHelper")
class ccsdataReaderHelper extends t_ccsdataReaderHelper {
}

@js.native
@JSGlobal("ccs.dataReaderHelper")
object ccsdataReaderHelper extends js.Object {
  def addDataFromFile(filePath:String):Unit = js.native
  def addDataFromFileAsync(imagePath:String, plistPath:String, filePath:String, selector:js.Function, target:js.Object):Unit = js.native
  def removeConfigFile(configFile:String):Unit = js.native
  def addDataFromCache(skeleton:js.Object, dataInfo:ccsDataInfo):Unit = js.native
  def decodeArmature(armatureXML:js.Any, dataInfo:ccsDataInfo):ccsArmatureData = js.native
  def decodeArmatureFromJSON(json:js.Object, dataInfo:ccsDataInfo):ccsArmatureData = js.native
  def decodeBone(boneXML:js.Any, parentXML:js.Any, dataInfo:ccsDataInfo):ccsBoneData = js.native
  def decodeBoneFromJson(json:js.Object, dataInfo:ccsDataInfo):ccsBoneData = js.native
  def decodeBoneDisplay(displayXML:js.Any, dataInfo:ccsDataInfo):ccsDisplayData = js.native
  def decodeBoneDisplayFromJson(json:js.Object, dataInfo:ccsDataInfo):ccsDisplayData = js.native
  def decodeAnimation(animationXML:js.Any, dataInfo:ccsDataInfo):ccsAnimationData = js.native
  def decodeAnimationFromJson(json:js.Object, dataInfo:ccsDataInfo):ccsAnimationData = js.native
  def decodeMovement(movementXML:js.Any, armatureData:ccsArmatureData, dataInfo:ccsDataInfo):ccsMovementData = js.native
  def decodeMovementFromJson(json:js.Object, dataInfo:ccsDataInfo):ccsMovementData = js.native
  def decodeMovementBone(movBoneXml:js.Any, parentXml:js.Any, boneData:ccsBoneData, dataInfo:ccsDataInfo):ccsMovementBoneData = js.native
  def decodeMovementBoneFromJson(json:js.Object, dataInfo:ccsDataInfo):ccsMovementBoneData = js.native
  def decodeFrame(frameXML:js.Any, parentFrameXml:js.Any, boneData:ccsBoneData, dataInfo:ccsDataInfo):ccsFrameData = js.native
  def decodeFrameFromJson(json:js.Object, dataInfo:ccsDataInfo):ccsFrameData = js.native
  def decodeTexture(textureXML:js.Any, dataInfo:ccsDataInfo):ccsTextureData = js.native
  def decodeTextureFromJson(json:js.Any):ccsTextureData = js.native
  def decodeContour(contourXML:js.Any, dataInfo:ccsDataInfo):ccsContourData = js.native
  def decodeContourFromJson(json:js.Object):ccsContourData = js.native
  def addDataFromJsonCache(dic:js.Object, dataInfo:ccsDataInfo):Unit = js.native
  def decodeNodeFromJson(node:js.Any, json:js.Any, dataInfo:js.Any):Unit = js.native
  def _initBaseFilePath(filePath:js.Any):String = js.native
  def addDataFromXML(xml:js.Any, dataInfo:ccsDataInfo):Unit = js.native
  def addDataFromJson(filePath:String, dataInfo:ccsDataInfo):Unit = js.native
}



