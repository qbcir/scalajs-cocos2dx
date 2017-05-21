package org.cocos2dxjs.cocos2d.core.labelttf

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.platform.ccFontDefinition
import org.cocos2dxjs.cocos2d.core.sprites.t_ccSprite

@js.native
trait t_ccLabelTTF extends t_ccSprite {
  def initWithString(label:String, fontName:String, fontSize:Float, dimensions:ccSize, hAlignment:Float, vAlignment:Float):Boolean = js.native
  def getString:String = js.native
  def getHorizontalAlignment:Float = js.native
  def getVerticalAlignment:Float = js.native
  def getDimensions:ccSize = js.native
  def getFontSize:Float = js.native
  def getFontName:String = js.native
  def initWithStringAndTextDefinition(text:String, textDefinition:ccFontDefinition):Boolean = js.native
  def setTextDefinition(theDefinition:ccFontDefinition):Unit = js.native
  def getTextDefinition:ccFontDefinition = js.native
  def enableShadow(a:ccColor, b:ccSize, c:Float, d:js.Any):Unit = js.native
  def disableShadow():Unit = js.native
  def enableStroke(strokeColor:ccColor, strokeSize:Float):Unit = js.native
  def disableStroke():Unit = js.native
  def setFontFillColor(fillColor:ccColor):Unit = js.native
  override def getScale:Float = js.native
  override def setScale(scale:Float, scaleY:Float):Unit = js.native
  override def getScaleX:Float = js.native
  override def setScaleX(newScaleX:Float):Unit = js.native
  override def getScaleY:Float = js.native
  override def setScaleY(newScaleY:Float):Unit = js.native
  def setString(text:String):Unit = js.native
  def setHorizontalAlignment(alignment:Float):Unit = js.native
  def setVerticalAlignment(verticalAlignment:Float):Unit = js.native
  def setDimensions(dim:ccSize, height:Float):Unit = js.native
  def setFontSize(fontSize:Float):Unit = js.native
  def setFontName(fontName:String):Unit = js.native
  override def getContentSize:ccSize = js.native
  def setDrawMode(boolean:js.Any):Unit = js.native
}

@js.native
@JSGlobal("cc.LabelTTF")
class ccLabelTTF extends t_ccLabelTTF {
}

@js.native
@JSGlobal("cc.LabelTTF")
object ccLabelTTF extends js.Object {
  def __getFontHeightByDiv(fontName:String, fontSize:Float):Float = js.native
}



