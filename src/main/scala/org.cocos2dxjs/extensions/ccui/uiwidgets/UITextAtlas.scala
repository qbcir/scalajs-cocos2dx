package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.extensions.ccui.baseclasses.{ccuiWidget, t_ccuiWidget}
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.ts_ccuiWidget

@js.native
trait t_ccuiTextAtlas extends t_ccuiWidget {
  var string: String = js.native
  def setProperty(stringValue:String, charMapFile:String, itemWidth:Float, itemHeight:Float, startCharMap:String):Unit = js.native
  def setString(value:String):Unit = js.native
  def getString():String = js.native
  def getStringLength():Float|js.Dynamic = js.native
  override def getVirtualRendererSize():ccSize = js.native
  override def getVirtualRenderer():ccuiWidget = js.native
  override def getDescription():String = js.native
}

@js.native
trait ts_ccuiTextAtlas extends ts_ccuiWidget {
}

@js.native
@JSGlobal("ccui.TextAtlas")
class ccuiTextAtlas(stringValue:String, charMapFile:String, itemWidth:Float, itemHeight:Float, startCharMap:String) extends t_ccuiTextAtlas {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.TextAtlas")
object ccuiTextAtlas extends ts_ccuiTextAtlas {
  var RENDERER_ZORDER: Float = js.native
}


