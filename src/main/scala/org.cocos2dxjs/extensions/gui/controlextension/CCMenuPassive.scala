package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.layers.t_ccLayer
import org.cocos2dxjs.cocos2d.core.platform.ccColor

@js.native
trait t_ccSpacer extends t_ccLayer {
}

@js.native
@JSGlobal("cc.Spacer")
class ccSpacer extends t_ccSpacer {
}

@js.native
@JSGlobal("cc.Spacer")
object ccSpacer extends js.Object {
}

@js.native
trait t_ccMenuPassive extends t_ccLayer {
  override def getColor:ccColor = js.native
  override def getOpacity:Float = js.native
  def initWithItems():Unit = js.native
  def alignItemsVertically():Unit = js.native
  def alignItemsVerticallyWithPadding():Unit = js.native
  def alignItemsHorizontally():Unit = js.native
  def alignItemsHorizontallyWithPadding():Unit = js.native
  def alignItemsInColumns():Unit = js.native
  def alignItemsInRows():Unit = js.native
}

@js.native
@JSGlobal("cc.MenuPassive")
class ccMenuPassive extends t_ccMenuPassive {
}

@js.native
@JSGlobal("cc.MenuPassive")
object ccMenuPassive extends js.Object {
  def create():Unit = js.native
  def createWithItem():Unit = js.native
}

