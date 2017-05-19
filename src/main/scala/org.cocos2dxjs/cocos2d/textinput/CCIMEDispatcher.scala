package org.cocos2dxjs.cocos2d.textinput

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccClass

@js.native
@JSGlobal("cc.IMEKeyboardNotificationInfo")
class ccIMEKeyboardNotificationInfo extends js.Object {
}

@js.native
@JSGlobal("cc.IMEDelegate")
class ccIMEDelegate extends ccClass {
  def removeDelegate():Unit = js.native
  def attachWithIME:Boolean = js.native
  def detachWithIME:Boolean = js.native
  def canAttachWithIME:Boolean = js.native
  def didAttachWithIME():Unit = js.native
  def canDetachWithIME:Boolean = js.native
  def didDetachWithIME():Unit = js.native
  def insertText():Unit = js.native
  def deleteBackward():Unit = js.native
  def getContentText:String = js.native
}

@js.native
@JSGlobal("cc.imeDispatcher")
class ccimeDispatcher extends js.Object {
  def dispatchInsertText(text:String, len:Float):Unit = js.native
  def dispatchDeleteBackward():Unit = js.native
  def getContentText:String = js.native
  def dispatchKeyboardWillShow(info:ccIMEKeyboardNotificationInfo):Unit = js.native
  def dispatchKeyboardDidShow(info:ccIMEKeyboardNotificationInfo):Unit = js.native
  def dispatchKeyboardWillHide(info:ccIMEKeyboardNotificationInfo):Unit = js.native
  def dispatchKeyboardDidHide(info:ccIMEKeyboardNotificationInfo):Unit = js.native
  def addDelegate(delegate:ccIMEDelegate):Unit = js.native
  def attachDelegateWithIME(delegate:ccIMEDelegate):Boolean = js.native
  def detachDelegateWithIME(delegate:ccIMEDelegate):Boolean = js.native
  def removeDelegate(delegate:ccIMEDelegate):Unit = js.native
  def processKeycode(keyCode:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.IMEDispatcher.Impl")
class ccIMEDispatcherImpl extends ccClass {
  def findDelegate(delegate:ccIMEDelegate):Float = js.native
}

