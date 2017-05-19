package org.cocos2dxjs.cocos2d.tilemap

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccClass
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.platform.ccSAXParser

@js.native
@JSGlobal("cc.TMXLayerInfo")
class ccTMXLayerInfo extends ccClass {
  def getProperties:js.Array[js.Any] = js.native
  def setProperties(value:js.Object):Unit = js.native
}

@js.native
@JSGlobal("cc.TMXTilesetInfo")
class ccTMXTilesetInfo extends ccClass {
  def rectForGID(gid:Float):ccRect = js.native
}

@js.native
@JSGlobal("cc.TMXMapInfo")
class ccTMXMapInfo extends ccSAXParser {
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

