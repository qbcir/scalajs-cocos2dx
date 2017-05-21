package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget

@js.native
trait t_ccuiVideoPlayer extends t_ccuiWidget {
  def setURL(address:String):Unit = js.native
  def getURL:String = js.native
  def play():Unit = js.native
  def pause():Unit = js.native
  def resume():Unit = js.native
  def stop():Unit = js.native
  def seekTo(sec:Float):Unit = js.native
  def isPlaying:Boolean = js.native
  def setKeepAspectRatioEnabled():Unit = js.native
  def setFullScreenEnabled(enable:Boolean):Unit = js.native
  def isFullScreenEnabled():Unit = js.native
  def setEventListener(event:js.Any/*ccuiVideoPlayerEventType*/, callback:js.Function):Unit = js.native
  def removeEventListener(event:js.Any/*ccuiVideoPlayerEventType*/):Unit = js.native
  def onPlayEvent():Unit = js.native
}

@js.native
@JSGlobal("ccui.VideoPlayer")
class ccuiVideoPlayer extends t_ccuiVideoPlayer {
  var onFocusChanged: js.Any = js.native
  var onNextFocusedWidget: js.Any = js.native
}

@js.native
@JSGlobal("ccui.VideoPlayer")
object ccuiVideoPlayer extends js.Object {
  var EventType: js.Object = js.native
}



