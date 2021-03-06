package org.cocos2dxjs.cocos2d.labels

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.textures.{ccTexture2D, t_ccTexture2D}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.sprites.t_ccSpriteBatchNode
import org.cocos2dxjs.cocos2d.core.sprites.ts_ccSpriteBatchNode

@js.native
trait t_ccLabelBMFont extends t_ccSpriteBatchNode {
  var string: String = js.native
  var textAlign: Float = js.native
  var boundingWidth: Float = js.native
  def initWithString(strText:String, charMapFile:String|t_ccTexture2D, itemWidth:Float, itemHeight:Float, startCharMap:Float):Boolean = js.native
  def textureLoaded():Boolean = js.native
  override def isOpacityModifyRGB():Boolean = js.native
  override def setOpacityModifyRGB(opacityModifyRGB:Boolean):Unit = js.native
  override def init():Boolean = js.native
  def initWithString(str:String, fntFile:String, width:Float, alignment:Float, imageOffset:t_ccPoint):Boolean = js.native
  def createFontChars():Unit = js.native
  def updateString(fromUpdate:Boolean):Unit = js.native
  def getString():String = js.native
  def setString(newString:String, needUpdateLabel:Boolean|Null):Unit = js.native
  def updateLabel():Unit = js.native
  def setAlignment(alignment:Float):Unit = js.native
  def setBoundingWidth(width:Float):Unit = js.native
  def setLineBreakWithoutSpace(breakWithoutSpace:Boolean):Unit = js.native
  override def setScale(scale:Float, scaleY:Float):Unit = js.native
  override def setScaleX(scaleX:Float):Unit = js.native
  override def setScaleY(scaleY:Float):Unit = js.native
  def setFntFile(fntFile:String):Unit = js.native
  def getFntFile():String = js.native
}

@js.native
trait ts_ccLabelBMFont extends ts_ccSpriteBatchNode {
}

@js.native
@JSGlobal("cc.LabelBMFont")
class ccLabelBMFont(strText:String, charMapFile:String, itemWidth:Float, itemHeight:Float, startCharMap:Float) extends t_ccLabelBMFont {
}

@js.native
@JSGlobal("cc.LabelBMFont")
object ccLabelBMFont extends ts_ccLabelBMFont {
}


