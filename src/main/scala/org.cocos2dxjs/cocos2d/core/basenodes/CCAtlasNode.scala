package org.cocos2dxjs.cocos2d.core.basenodes

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.textures.{ccTexture2D, t_ccTexture2D}
import org.cocos2dxjs.cocos2d.core.textures.{ccTextureAtlas, t_ccTextureAtlas}
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.platform.{ccBlendFunc, t_ccBlendFunc}

@js.native
trait t_ccAtlasNode extends t_ccNode {
  var texture: ccTexture2D = js.native
  var textureAtlas: ccTextureAtlas = js.native
  var quadsToDraw: Float = js.native
  def updateAtlasValues():Unit = js.native
  override def getColor():ccColor = js.native
  override def setOpacityModifyRGB(value:Boolean):Unit = js.native
  override def isOpacityModifyRGB():Boolean = js.native
  def getBlendFunc():ccBlendFunc = js.native
  def setBlendFunc(src:Float|t_ccBlendFunc, dst:Float):Unit = js.native
  def setTextureAtlas(value:t_ccTextureAtlas):Unit = js.native
  def getTextureAtlas():ccTextureAtlas = js.native
  def getQuadsToDraw():Float = js.native
  def setQuadsToDraw(quadsToDraw:Float):Unit = js.native
  def initWithTileFile(tile:String, tileWidth:Float, tileHeight:Float, itemsToRender:Float):Boolean = js.native
  def initWithTexture(texture:t_ccTexture2D, tileWidth:Float, tileHeight:Float, itemsToRender:Float):Boolean = js.native
  override def setColor(color:t_ccColor):Unit = js.native
  override def setOpacity(opacity:Float):Unit = js.native
  def getTexture():ccTexture2D = js.native
  def setTexture(texture:t_ccTexture2D):Unit = js.native
}

@js.native
trait ts_ccAtlasNode extends ts_ccNode {
}

@js.native
@JSGlobal("cc.AtlasNode")
class ccAtlasNode(tile:String, tileWidth:Float, tileHeight:Float, itemsToRender:Float) extends t_ccAtlasNode {
}

@js.native
@JSGlobal("cc.AtlasNode")
object ccAtlasNode extends ts_ccAtlasNode {
}


