package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.ts_ccuiWidget

@js.native
trait t_ccuiVideoPlayer extends t_ccuiWidget {
  var path: String = js.native
  def setURL(address:String):Unit = js.native
  def getURL():String = js.native
  def play():Unit = js.native
  def pause():Unit = js.native
  def resume():Unit = js.native
  def stop():Unit = js.native
  def seekTo(sec:Float):Unit = js.native
  def isPlaying():Boolean = js.native
  def setKeepAspectRatioEnabled():Unit = js.native
  def setFullScreenEnabled(enable:Boolean):Unit = js.native
  def isFullScreenEnabled():Unit = js.native
  def setEventListener(event:js.Any/*ccuiVideoPlayerEventType*/, callback:js.Function):Unit = js.native
  def removeEventListener(event:js.Any/*ccuiVideoPlayerEventType*/):Unit = js.native
  def onPlayEvent():Unit = js.native
}

@js.native
trait ts_ccuiVideoPlayer extends ts_ccuiWidget {
}

@js.native
@JSGlobal("ccui.VideoPlayer")
class ccuiVideoPlayer() extends t_ccuiVideoPlayer {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.VideoPlayer")
object ccuiVideoPlayer extends ts_ccuiVideoPlayer {
  var EventType: types.DynObject = js.native
}


