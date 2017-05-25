package org.cocos2dxjs.cocos2d.tilemap

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.sprites.{ccSprite, t_ccSprite}
import org.cocos2dxjs.cocos2d.core.sprites.t_ccSpriteBatchNode
import org.cocos2dxjs.cocos2d.core.sprites.ts_ccSpriteBatchNode

@js.native
trait t_ccTMXLayer extends t_ccSpriteBatchNode {
  var tiles: js.Array[js.Any] = js.native
  var tileset: ccTMXTilesetInfo = js.native
  var layerOrientation: Float = js.native
  var properties: js.Array[js.Any] = js.native
  var layerName: String = js.native
  var layerWidth: Float = js.native
  var layerHeight: Float = js.native
  var tileWidth: Float = js.native
  var tileHeight: Float = js.native
  def initWithTilesetInfo(tilesetInfo:t_ccTMXTilesetInfo, layerInfo:t_ccTMXLayerInfo, mapInfo:t_ccTMXMapInfo):Boolean = js.native
  def getLayerSize():ccSize = js.native
  def setLayerSize(Var:t_ccSize):Unit = js.native
  def getMapTileSize():ccSize = js.native
  def setMapTileSize(Var:t_ccSize):Unit = js.native
  def getTiles():js.Array[js.Any] = js.native
  def setTiles(Var:js.Array[js.Any]):Unit = js.native
  def getTileset():ccTMXTilesetInfo = js.native
  def setTileset(Var:t_ccTMXTilesetInfo):Unit = js.native
  def getLayerOrientation():Float = js.native
  def setLayerOrientation(Var:Float):Unit = js.native
  def getProperties():js.Array[js.Any] = js.native
  def setProperties(Var:js.Array[js.Any]):Unit = js.native
  def getProperty(propertyName:String):js.Dynamic = js.native
  def getLayerName():String = js.native
  def setLayerName(layerName:String):Unit = js.native
  def releaseMap():Unit = js.native
  def getTileAt(pos:Float|t_ccPoint, y:Float):ccSprite = js.native
  def getTileGIDAt(pos:Float|t_ccPoint, y:Float):Float = js.native
  def setTileGID(gid:Float, posOrX:Float|t_ccPoint, flagsOrY:Float, flags:Float):Unit = js.native
  def getTileFlagsAt(pos:Float|t_ccPoint, y:Float):Float = js.native
  def removeTileAt(pos:Float|t_ccPoint, y:Float):Unit = js.native
  def getPositionAt(pos:Float|t_ccPoint, y:Float):ccPoint = js.native
}

@js.native
trait ts_ccTMXLayer extends ts_ccSpriteBatchNode {
}

@js.native
@JSGlobal("cc.TMXLayer")
class ccTMXLayer(tilesetInfo:t_ccTMXTilesetInfo, layerInfo:t_ccTMXLayerInfo, mapInfo:t_ccTMXMapInfo) extends t_ccTMXLayer {
}

@js.native
@JSGlobal("cc.TMXLayer")
object ccTMXLayer extends ts_ccTMXLayer {
}


