package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.extensions.ccui.baseclasses.{ccuiWidget, t_ccuiWidget}
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.ts_ccuiWidget

@js.native
trait t_ccuiImageView extends t_ccuiWidget {
  def loadTexture(fileName:String, texType:Float | Float):Unit = js.native
  def setTextureRect(rect:t_ccRect):Unit = js.native
  def setScale9Enabled(able:Boolean):Unit = js.native
  def isScale9Enabled:Boolean = js.native
  override def ignoreContentAdaptWithSize(ignore:Boolean):Unit = js.native
  def setCapInsets(capInsets:t_ccRect):Unit = js.native
  def getCapInsets:ccRect = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  override def getDescription:String = js.native
  override def setContentSize(contentSize:t_ccSize | Float, height:Float):Unit = js.native
}

@js.native
trait ts_ccuiImageView extends ts_ccuiWidget {
}

@js.native
@JSGlobal("ccui.ImageView")
class ccuiImageView(imageFileName:String, texType:Float) extends t_ccuiImageView {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.ImageView")
object ccuiImageView extends ts_ccuiImageView {
  val RENDERER_ZORDER: Float = js.native
}


