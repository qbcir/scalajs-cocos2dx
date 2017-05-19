package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget

@js.native
@JSGlobal("ccui.TextAtlas")
class ccuiTextAtlas extends ccuiWidget {
  def setProperty(stringValue:String, charMapFile:String, itemWidth:Float, itemHeight:Float, startCharMap:String):Unit = js.native
  def setString(value:String):Unit = js.native
  def getString:String = js.native
  def getStringLength:js.Any = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  override def getDescription:String = js.native
}

