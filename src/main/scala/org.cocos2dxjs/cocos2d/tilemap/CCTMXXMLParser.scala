package org.cocos2dxjs.cocos2d.tilemap

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.platform.t_ccSAXParser

@js.native
trait t_ccTMXLayerInfo extends t_ccClass {
  var properties: js.Array[js.Any] = js.native
  def getProperties:js.Array[js.Any] = js.native
  def setProperties(value:js.Object):Unit = js.native
}

@js.native
@JSGlobal("cc.TMXLayerInfo")
class ccTMXLayerInfo extends t_ccTMXLayerInfo {
}

@js.native
@JSGlobal("cc.TMXLayerInfo")
object ccTMXLayerInfo extends js.Object {
  val ATTRIB_NONE: Float = js.native
  val ATTRIB_BASE64: Float = js.native
  val ATTRIB_GZIP: Float = js.native
  val ATTRIB_ZLIB: Float = js.native
}

@js.native
trait t_ccTMXTilesetInfo extends t_ccClass {
  var name: String = js.native
  var firstGid: Float = js.native
  var spacing: Float = js.native
  var margin: Float = js.native
  var sourceImage: String = js.native
  var imageSize: ccSize = js.native
  def rectForGID(gid:Float):ccRect = js.native
}

@js.native
@JSGlobal("cc.TMXTilesetInfo")
class ccTMXTilesetInfo extends t_ccTMXTilesetInfo {
}

@js.native
@JSGlobal("cc.TMXTilesetInfo")
object ccTMXTilesetInfo extends js.Object {
}

@js.native
trait t_ccTMXMapInfo extends t_ccSAXParser {
  var properties: js.Array[js.Any] = js.native
  var orientation: Float = js.native
  var parentElement: js.Object = js.native
  var parentGID: Float = js.native
  var layerAttrs: js.Object = js.native
  var storingCharacters: Boolean = js.native
  var tmxFileName: String = js.native
  var currentString: String = js.native
  var mapWidth: Float = js.native
  var mapHeight: Float = js.native
  var tileWidth: Float = js.native
  var tileHeight: Float = js.native
  def getOrientation:Float = js.native
  def setOrientation(value:Float):Unit = js.native
  def getMapSize:ccSize = js.native
  def setMapSize(value:ccSize):Unit = js.native
  def getTileSize:ccSize = js.native
  def setTileSize(value:ccSize):Unit = js.native
  def getLayers:js.Array[js.Any] = js.native
  def setLayers(value:ccTMXLayerInfo):Unit = js.native
  def getTilesets:js.Array[js.Any] = js.native
  def setTilesets(value:ccTMXTilesetInfo):Unit = js.native
  def getObjectGroups:js.Array[js.Any] = js.native
  def setObjectGroups(value:ccTMXObjectGroup):Unit = js.native
  def getParentElement:js.Object = js.native
  def setParentElement(value:js.Object):Unit = js.native
  def getParentGID:Float = js.native
  def setParentGID(value:Float):Unit = js.native
  def getLayerAttribs:js.Object = js.native
  def setLayerAttribs(value:js.Object):Unit = js.native
  def getStoringCharacters:Boolean = js.native
  def setStoringCharacters(value:Boolean):Unit = js.native
  def getProperties:js.Array[js.Any] = js.native
  def setProperties(value:js.Object):Unit = js.native
  def initWithTMXFile(tmxFile:String):js.Any = js.native
  def initWithXML(tmxString:String, resourcePath:String):Boolean = js.native
  def parseXMLFile(tmxFile:String, isXmlString:Boolean):js.Any = js.native
  def parseXMLString(xmlString:String):Boolean = js.native
  def getTileProperties:js.Object = js.native
  def setTileProperties(tileProperties:js.Object):Unit = js.native
  def getCurrentString:String = js.native
  def setCurrentString(currentString:String):Unit = js.native
  def getTMXFileName:String = js.native
  def setTMXFileName(fileName:String):Unit = js.native
}

@js.native
@JSGlobal("cc.TMXMapInfo")
class ccTMXMapInfo(tmxFile:String, resourcePath:String) extends t_ccTMXMapInfo {
}

@js.native
@JSGlobal("cc.TMXMapInfo")
object ccTMXMapInfo extends js.Object {
}


