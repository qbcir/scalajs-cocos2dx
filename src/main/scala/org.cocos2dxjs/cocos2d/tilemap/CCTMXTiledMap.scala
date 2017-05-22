package org.cocos2dxjs.cocos2d.tilemap

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode

@js.native
trait t_ccTMXTiledMap extends t_ccNode {
  var properties: js.Array[js.Any] = js.native
  var mapOrientation: Float = js.native
  var objectGroups: js.Array[js.Any] = js.native
  var mapWidth: Float = js.native
  var mapHeight: Float = js.native
  var tileWidth: Float = js.native
  var tileHeight: Float = js.native
  def getMapSize:ccSize = js.native
  def setMapSize(Var:t_ccSize):Unit = js.native
  def getTileSize:ccSize = js.native
  def setTileSize(Var:t_ccSize):Unit = js.native
  def getMapOrientation:Float = js.native
  def setMapOrientation(Var:Float):Unit = js.native
  def getObjectGroups:js.Array[js.Any] = js.native
  def setObjectGroups(Var:js.Array[js.Any]):Unit = js.native
  def getProperties:types.DynObject = js.native
  def setProperties(Var:types.DynObject):Unit = js.native
  def initWithTMXFile(tmxFile:String):Boolean = js.native
  def initWithXML(tmxString:String, resourcePath:String):Boolean = js.native
  def allLayers:js.Array[js.Any] = js.native
  def getLayer(layerName:String):ccTMXLayer = js.native
  def getObjectGroup(groupName:String):ccTMXObjectGroup = js.native
  def getProperty(propertyName:String):String = js.native
  def getPropertiesForGID(GID:Float):types.DynObject = js.native
}

@js.native
trait ts_ccTMXTiledMap extends ts_ccNode {
}

@js.native
@JSGlobal("cc.TMXTiledMap")
class ccTMXTiledMap(tmxFile:String, resourcePath:String) extends t_ccTMXTiledMap {
}

@js.native
@JSGlobal("cc.TMXTiledMap")
object ccTMXTiledMap extends ts_ccTMXTiledMap {
}


