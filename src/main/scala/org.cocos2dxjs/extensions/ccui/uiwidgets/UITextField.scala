package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget

@js.native
@JSGlobal("ccui.TextField")
class ccuiTextField extends ccuiWidget {
  override def onEnter():Unit = js.native
  def setTouchSize(size:ccSize):Unit = js.native
  def setTouchAreaEnabled(enable:js.Any):Unit = js.native
  override def hitTest(pt:ccPoint):Boolean = js.native
  def getTouchSize:ccSize = js.native
  def setString(text:String):Unit = js.native
  def setPlaceHolder(value:String):Unit = js.native
  def getPlaceHolder:String = js.native
  def getPlaceHolderColor:ccColor = js.native
  def setPlaceHolderColor(color:js.Any):Unit = js.native
  def setTextColor(textColor:js.Any):Unit = js.native
  def setFontSize(size:Float):Unit = js.native
  def getFontSize:Float = js.native
  def setFontName(name:String):Unit = js.native
  def getFontName:String = js.native
  override def didNotSelectSelf():Unit = js.native
  def getString:String = js.native
  def getStringLength:Float = js.native
  def onTouchBegan(touchPoint:ccPoint):Unit = js.native
  def setMaxLengthEnabled(enable:Boolean):Unit = js.native
  def isMaxLengthEnabled:Boolean = js.native
  def setMaxLength(length:Float):Unit = js.native
  def getMaxLength:Float = js.native
  def setPasswordEnabled(enable:Boolean):Unit = js.native
  def isPasswordEnabled:Boolean = js.native
  def setPasswordStyleText(styleText:js.Any):Unit = js.native
  def getPasswordStyleText:String = js.native
  def getAttachWithIME:Boolean = js.native
  def setAttachWithIME(attach:Boolean):Unit = js.native
  def getDetachWithIME:Boolean = js.native
  def setDetachWithIME(detach:Boolean):Unit = js.native
  def getInsertText:String = js.native
  def setInsertText(insertText:String):Unit = js.native
  def getDeleteBackward:Boolean = js.native
  def setDeleteBackward(deleteBackward:Boolean):Unit = js.native
  def addEventListener(target:js.Object, selector:js.Function):Unit = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  override def getDescription:String = js.native
  def attachWithIME:Boolean = js.native
  def setTextAreaSize(size:ccSize):Unit = js.native
  def setTextHorizontalAlignment(alignment:js.Any):Unit = js.native
  def setTextVerticalAlignment(alignment:js.Any):Unit = js.native
}

