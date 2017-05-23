package org.cocos2dxjs.cocos2d.textinput

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.core.labelttf.t_ccLabelTTF
import org.cocos2dxjs.cocos2d.core.labelttf.ts_ccLabelTTF

@js.native
trait t_ccTextFieldDelegate extends t_ccClass {
  def onTextFieldAttachWithIME(sender:t_ccTextFieldTTF):Boolean = js.native
  def onTextFieldDetachWithIME(sender:t_ccTextFieldTTF):Boolean = js.native
  def onTextFieldInsertText(sender:t_ccTextFieldTTF, text:String, len:Float):Boolean = js.native
  def onTextFieldDeleteBackward(sender:t_ccTextFieldTTF, delText:String, len:Float):Boolean = js.native
  def onDraw(sender:t_ccTextFieldTTF):Boolean = js.native
}

@js.native
trait ts_ccTextFieldDelegate extends ts_ccClass {
}

@js.native
@JSGlobal("cc.TextFieldDelegate")
class ccTextFieldDelegate extends t_ccTextFieldDelegate {
}

@js.native
@JSGlobal("cc.TextFieldDelegate")
object ccTextFieldDelegate extends ts_ccTextFieldDelegate {
}

@js.native
trait t_ccTextFieldTTF extends t_ccLabelTTF {
  var delegate: ccNode = js.native
  val charCount: Float = js.native
  var placeHolder: String = js.native
  var colorSpaceHolder: ccColor = js.native
  def getDelegate:ccNode = js.native
  def setDelegate(value:t_ccNode):Unit = js.native
  def getCharCount:Float = js.native
  def getColorSpaceHolder:ccColor = js.native
  def setColorSpaceHolder(value:t_ccColor):Unit = js.native
  def setTextColor(textColor:t_ccColor):Unit = js.native
  def initWithPlaceHolder(placeholder:String, dimensions:t_ccSize, alignment:Float, fontName:String, fontSize:Float):Boolean = js.native
  override def setString(text:String):Unit = js.native
  override def getString:String = js.native
  def setPlaceHolder(text:String):Unit = js.native
  def getPlaceHolder:String = js.native
  override def draw(ctx:js.Dynamic):Unit = js.native
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

@js.native
trait ts_ccTextFieldTTF extends ts_ccLabelTTF {
}

@js.native
@JSGlobal("cc.TextFieldTTF")
class ccTextFieldTTF(placeholder:String, dimensions:t_ccSize, alignment:Float, fontName:String, fontSize:Float) extends t_ccTextFieldTTF {
}

@js.native
@JSGlobal("cc.TextFieldTTF")
object ccTextFieldTTF extends ts_ccTextFieldTTF {
}


