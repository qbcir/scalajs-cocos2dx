package org.cocos2dxjs.cocos2d.tilemap

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite
import org.cocos2dxjs.cocos2d.core.sprites.ccSpriteBatchNode

@js.native
@JSGlobal("cc.TMXLayer")
class ccTMXLayer extends ccSpriteBatchNode {
  def initWithTilesetInfo(tilesetInfo:ccTMXTilesetInfo, layerInfo:ccTMXLayerInfo, mapInfo:ccTMXMapInfo):Boolean = js.native
  def getLayerSize:ccSize = js.native
  def setLayerSize(Var:ccSize):Unit = js.native
  def getMapTileSize:ccSize = js.native
  def setMapTileSize(Var:ccSize):Unit = js.native
  def getTiles:js.Array[js.Any] = js.native
  def setTiles(Var:js.Array[js.Any]):Unit = js.native
  def getTileset:ccTMXTilesetInfo = js.native
  def setTileset(Var:ccTMXTilesetInfo):Unit = js.native
  def getLayerOrientation:Float = js.native
  def setLayerOrientation(Var:Float):Unit = js.native
  def getProperties:js.Array[js.Any] = js.native
  def setProperties(Var:js.Array[js.Any]):Unit = js.native
  def getProperty(propertyName:String):js.Any = js.native
  def getLayerName:String = js.native
  def setLayerName(layerName:String):Unit = js.native
  def releaseMap():Unit = js.native
  def getTileAt(pos:ccPoint, y:Float):ccSprite = js.native
  def getTileGIDAt(pos:ccPoint, y:Float):Float = js.native
  def setTileGID(gid:Float, posOrX:ccPoint, flagsOrY:Float, flags:Float):Unit = js.native
  def getTileFlagsAt(pos:ccPoint, y:Float):Float = js.native
  def removeTileAt(pos:ccPoint, y:Float):Unit = js.native
  def getPositionAt(pos:ccPoint, y:Float):ccPoint = js.native
}

