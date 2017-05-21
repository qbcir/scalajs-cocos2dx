package org.cocos2dxjs.cocos2d.textinput

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass

@js.native
trait t_ccIMEKeyboardNotificationInfo extends js.Object {
}

@js.native
@JSGlobal("cc.IMEKeyboardNotificationInfo")
class ccIMEKeyboardNotificationInfo extends t_ccIMEKeyboardNotificationInfo {
}

@js.native
@JSGlobal("cc.IMEKeyboardNotificationInfo")
object ccIMEKeyboardNotificationInfo extends js.Object {
}

@js.native
trait t_ccIMEDelegate extends t_ccClass {
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
@JSGlobal("cc.IMEDelegate")
class ccIMEDelegate extends t_ccIMEDelegate {
}

@js.native
@JSGlobal("cc.IMEDelegate")
object ccIMEDelegate extends js.Object {
}

@js.native
trait t_ccimeDispatcher extends js.Object {
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
@JSGlobal("cc.imeDispatcher")
class ccimeDispatcher extends t_ccimeDispatcher {
}

@js.native
@JSGlobal("cc.imeDispatcher")
object ccimeDispatcher extends js.Object {
}

@js.native
trait t_ccIMEDispatcherImpl extends t_ccClass {
  def findDelegate(delegate:ccIMEDelegate):Float = js.native
}

@js.native
@JSGlobal("cc.IMEDispatcher.Impl")
class ccIMEDispatcherImpl extends t_ccIMEDispatcherImpl {
}

@js.native
@JSGlobal("cc.IMEDispatcher.Impl")
object ccIMEDispatcherImpl extends js.Object {
}

