package org.cocos2dxjs.cocos2d.menus

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.core.layers.t_ccLayer
import org.cocos2dxjs.cocos2d.core.layers.ts_ccLayer

@js.native
trait t_ccMenu extends t_ccLayer {
  override def onEnter():Unit = js.native
  def isEnabled:Boolean = js.native
  def setEnabled(enabled:Boolean):Unit = js.native
  def initWithItems(args:js.Array[js.Any]):Boolean = js.native
  def initWithArray(arrayOfItems:js.Array[js.Any]):Boolean = js.native
  def addChild(child:t_ccNode, zOrder:Float|js.Dynamic, tag:Float|js.Dynamic):Unit = js.native
  def alignItemsVertically():Unit = js.native
  def alignItemsVerticallyWithPadding(padding:Float):Unit = js.native
  def alignItemsHorizontally():Unit = js.native
  def alignItemsHorizontallyWithPadding(padding:Float):Unit = js.native
  def alignItemsInColumns():Unit = js.native
  def alignItemsInRows(_unnamed0:Float):Unit = js.native
  override def removeChild(child:t_ccNode, cleanup:Boolean):Unit = js.native
  override def onExit():Unit = js.native
  def setOpacityModifyRGB(value:js.Dynamic):Unit = js.native
  override def isOpacityModifyRGB:Boolean = js.native
}

@js.native
trait ts_ccMenu extends ts_ccLayer {
}

@js.native
@JSGlobal("cc.Menu")
class ccMenu(menuItems:Null|t_ccMenuItem) extends t_ccMenu {
}

@js.native
@JSGlobal("cc.Menu")
object ccMenu extends ts_ccMenu {
}


