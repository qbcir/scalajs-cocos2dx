package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget

@js.native
@JSGlobal("ccui.WebView")
class ccuiWebView extends ccuiWidget {
  def loadURL(url:String):Unit = js.native
  def stopLoading():Unit = js.native
  def reload():Unit = js.native
  def canGoBack():Unit = js.native
  def canGoForward():Unit = js.native
  def goBack():Unit = js.native
  def goForward():Unit = js.native
  def evaluateJS(str:String):Unit = js.native
  def setScalesPageToFit():Unit = js.native
  def setEventListener(event:js.Any/*ccuiWebViewEventType*/, callback:js.Function):Unit = js.native
  def removeEventListener(event:js.Any/*ccuiWebViewEventType*/):Unit = js.native
  def setContentSize(w:Float, h:Float):Unit = js.native
  def cleanup():Unit = js.native
}

