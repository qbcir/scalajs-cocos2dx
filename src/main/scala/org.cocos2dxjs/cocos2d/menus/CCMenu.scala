package org.cocos2dxjs.cocos2d.menus

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.layers.ccLayer

@js.native
@JSGlobal("cc.Menu")
class ccMenu extends ccLayer {
  override def onEnter():Unit = js.native
  def isEnabled:Boolean = js.native
  def setEnabled(enabled:Boolean):Unit = js.native
  def initWithItems(args:js.Array[js.Any]):Boolean = js.native
  def initWithArray(arrayOfItems:js.Array[js.Any]):Boolean = js.native
  override def addChild(child:ccNode, zOrder:Float, tag:Float):Unit = js.native
  def alignItemsVertically():Unit = js.native
  def alignItemsVerticallyWithPadding(padding:Float):Unit = js.native
  def alignItemsHorizontally():Unit = js.native
  def alignItemsHorizontallyWithPadding(padding:Float):Unit = js.native
  def alignItemsInColumns():Unit = js.native
  def alignItemsInRows(_unnamed0:Float):Unit = js.native
  override def removeChild(child:ccNode, cleanup:Boolean):Unit = js.native
  override def onExit():Unit = js.native
  def setOpacityModifyRGB(value:js.Any):Unit = js.native
  override def isOpacityModifyRGB:Boolean = js.native
}

