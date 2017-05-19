package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget

@js.native
@JSGlobal("ccui.ImageView")
class ccuiImageView extends ccuiWidget {
  def loadTexture(fileName:String, texType:Float):Unit = js.native
  def setTextureRect(rect:ccRect):Unit = js.native
  def setScale9Enabled(able:Boolean):Unit = js.native
  def isScale9Enabled:Boolean = js.native
  override def ignoreContentAdaptWithSize(ignore:Boolean):Unit = js.native
  def setCapInsets(capInsets:ccRect):Unit = js.native
  def getCapInsets:ccRect = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  override def getDescription:String = js.native
  override def setContentSize(contentSize:ccSize, height:Float):Unit = js.native
}

