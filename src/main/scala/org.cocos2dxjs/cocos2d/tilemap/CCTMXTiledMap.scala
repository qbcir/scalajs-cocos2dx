package org.cocos2dxjs.cocos2d.tilemap

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode

@js.native
trait t_ccTMXTiledMap extends t_ccNode {
  def getMapSize:ccSize = js.native
  def setMapSize(Var:ccSize):Unit = js.native
  def getTileSize:ccSize = js.native
  def setTileSize(Var:ccSize):Unit = js.native
  def getMapOrientation:Float = js.native
  def setMapOrientation(Var:Float):Unit = js.native
  def getObjectGroups:js.Array[js.Any] = js.native
  def setObjectGroups(Var:js.Array[js.Any]):Unit = js.native
  def getProperties:js.Object = js.native
  def setProperties(Var:js.Object):Unit = js.native
  def initWithTMXFile(tmxFile:String):Boolean = js.native
  def initWithXML(tmxString:String, resourcePath:String):Boolean = js.native
  def allLayers:js.Array[js.Any] = js.native
  def getLayer(layerName:String):ccTMXLayer = js.native
  def getObjectGroup(groupName:String):ccTMXObjectGroup = js.native
  def getProperty(propertyName:String):String = js.native
  def getPropertiesForGID(GID:Float):js.Object = js.native
}

@js.native
@JSGlobal("cc.TMXTiledMap")
class ccTMXTiledMap(tmxFile:String, resourcePath:String) extends t_ccTMXTiledMap {
}

@js.native
@JSGlobal("cc.TMXTiledMap")
object ccTMXTiledMap extends js.Object {
}

