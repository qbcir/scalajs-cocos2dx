package org.cocos2dxjs.cocos2d.core.labelttf

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.platform.{ccFontDefinition, t_ccFontDefinition}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.core.sprites.t_ccSprite
import org.cocos2dxjs.cocos2d.core.sprites.ts_ccSprite

@js.native
trait t_ccLabelTTF extends t_ccSprite {
  var string: String = js.native
  var textAlign: Float = js.native
  var verticalAlign: Float = js.native
  var fontSize: Float = js.native
  var fontName: String = js.native
  var font: String = js.native
  var boundingWidth: Float = js.native
  var boundingHeight: Float = js.native
  var fillStyle: ccColor = js.native
  var strokeStyle: ccColor = js.native
  var lineWidth: Float = js.native
  var shadowOffsetX: Float = js.native
  var shadowOffsetY: Float = js.native
  var shadowOpacity: Float = js.native
  var shadowBlur: Float = js.native
  def initWithString(label:String, fontName:String, fontSize:Float, dimensions:t_ccSize, hAlignment:Float, vAlignment:Float):Boolean = js.native
  def getString:String = js.native
  def getHorizontalAlignment:Float = js.native
  def getVerticalAlignment:Float = js.native
  def getDimensions:ccSize = js.native
  def getFontSize:Float = js.native
  def getFontName:String = js.native
  def initWithStringAndTextDefinition(text:String, textDefinition:t_ccFontDefinition):Boolean = js.native
  def setTextDefinition(theDefinition:t_ccFontDefinition):Unit = js.native
  def getTextDefinition:ccFontDefinition = js.native
  def enableShadow(a:Float|t_ccColor, b:Float|t_ccSize, c:Float, d:Float|Null):Unit = js.native
  def disableShadow():Unit = js.native
  def enableStroke(strokeColor:t_ccColor, strokeSize:Float):Unit = js.native
  def disableStroke():Unit = js.native
  def setFontFillColor(fillColor:t_ccColor):Unit = js.native
  override def getScale:Float = js.native
  override def setScale(scale:Float, scaleY:Float):Unit = js.native
  override def getScaleX:Float = js.native
  override def setScaleX(newScaleX:Float):Unit = js.native
  override def getScaleY:Float = js.native
  override def setScaleY(newScaleY:Float):Unit = js.native
  def setString(text:String):Unit = js.native
  def setHorizontalAlignment(alignment:Float):Unit = js.native
  def setVerticalAlignment(verticalAlignment:Float):Unit = js.native
  def setDimensions(dim:Float|t_ccSize, height:Float):Unit = js.native
  def setFontSize(fontSize:Float):Unit = js.native
  def setFontName(fontName:String):Unit = js.native
  override def getContentSize:ccSize = js.native
  def setDrawMode(boolean:js.Dynamic):Unit = js.native
}

@js.native
trait ts_ccLabelTTF extends ts_ccSprite {
  def __getFontHeightByDiv(fontName:String|t_ccFontDefinition, fontSize:Float):Float = js.native
}

@js.native
@JSGlobal("cc.LabelTTF")
class ccLabelTTF(text:String, fontName:String|t_ccFontDefinition, fontSize:Float, dimensions:t_ccSize, hAlignment:Float, vAlignment:Float) extends t_ccLabelTTF {
}

@js.native
@JSGlobal("cc.LabelTTF")
object ccLabelTTF extends ts_ccLabelTTF {
}


