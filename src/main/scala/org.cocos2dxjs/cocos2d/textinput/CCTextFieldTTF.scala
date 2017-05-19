package org.cocos2dxjs.cocos2d.textinput

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccClass
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.labelttf.ccLabelTTF

@js.native
@JSGlobal("cc.TextFieldDelegate")
class ccTextFieldDelegate extends ccClass {
  def onTextFieldAttachWithIME(sender:ccTextFieldTTF):Boolean = js.native
  def onTextFieldDetachWithIME(sender:ccTextFieldTTF):Boolean = js.native
  def onTextFieldInsertText(sender:ccTextFieldTTF, text:String, len:Float):Boolean = js.native
  def onTextFieldDeleteBackward(sender:ccTextFieldTTF, delText:String, len:Float):Boolean = js.native
  def onDraw(sender:ccTextFieldTTF):Boolean = js.native
}

@js.native
@JSGlobal("cc.TextFieldTTF")
class ccTextFieldTTF extends ccLabelTTF {
  def getDelegate:ccNode = js.native
  def setDelegate(value:ccNode):Unit = js.native
  def getCharCount:Float = js.native
  def getColorSpaceHolder:ccColor = js.native
  def setColorSpaceHolder(value:ccColor):Unit = js.native
  def setTextColor(textColor:ccColor):Unit = js.native
  def initWithPlaceHolder(placeholder:String, dimensions:ccSize, alignment:Float, fontName:String, fontSize:Float):Boolean = js.native
  override def setString(text:String):Unit = js.native
  override def getString:String = js.native
  def setPlaceHolder(text:String):Unit = js.native
  def getPlaceHolder:String = js.native
  override def draw(ctx:js.Any):Unit = js.native
  def attachWithIME:Boolean = js.native
  def detachWithIME:Boolean = js.native
  def canAttachWithIME:Boolean = js.native
  def didAttachWithIME():Unit = js.native
  def canDetachWithIME:Boolean = js.native
  def didDetachWithIME():Unit = js.native
  def deleteBackward():Unit = js.native
  def removeDelegate():Unit = js.native
  def setTipMessage(tipMessage:String):Unit = js.native
  def getTipMessage:String = js.native
  def insertText(text:String, len:Float):Unit = js.native
  def getContentText:String = js.native
}

