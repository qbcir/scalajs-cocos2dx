package org.cocos2dxjs.cocos2d.menus

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite
import org.cocos2dxjs.cocos2d.core.sprites.ccSpriteFrame

@js.native
trait t_ccMenuItem extends t_ccNode {
  def isSelected:Boolean = js.native
  def setOpacityModifyRGB(value:js.Any):Unit = js.native
  override def isOpacityModifyRGB:Boolean = js.native
  def isEnabled:Boolean = js.native
  def setEnabled(enable:Boolean):Unit = js.native
  def initWithCallback(callback:js.Function, target:ccNode):Boolean = js.native
  def rect:ccRect = js.native
  def selected():Unit = js.native
  def unselected():Unit = js.native
  def setCallback(callback:js.Function, target:ccNode):Unit = js.native
  def activate():Unit = js.native
}

@js.native
@JSGlobal("cc.MenuItem")
class ccMenuItem(callback:js.Function, target:ccNode) extends t_ccMenuItem {
}

@js.native
@JSGlobal("cc.MenuItem")
object ccMenuItem extends js.Object {
}

@js.native
trait t_ccMenuItemLabel extends t_ccMenuItem {
  def getDisabledColor:ccColor = js.native
  def setDisabledColor(color:ccColor):Unit = js.native
  def getLabel:ccNode = js.native
  def setLabel(label:ccNode):Unit = js.native
  override def setEnabled(enabled:Boolean):Unit = js.native
  def initWithLabel(label:ccNode, selector:js.Function, target:ccNode):Boolean = js.native
  def setString(label:String):Unit = js.native
  def getString:String = js.native
  override def activate():Unit = js.native
  override def selected():Unit = js.native
  override def unselected():Unit = js.native
}

@js.native
@JSGlobal("cc.MenuItemLabel")
class ccMenuItemLabel(label:ccNode, selector:js.Function, target:ccNode) extends t_ccMenuItemLabel {
}

@js.native
@JSGlobal("cc.MenuItemLabel")
object ccMenuItemLabel extends js.Object {
}

@js.native
trait t_ccMenuItemAtlasFont extends t_ccMenuItemLabel {
  def initWithString(value:String, charMapFile:String, itemWidth:Float, itemHeight:Float, startCharMap:String, callback:js.Function, target:ccNode):Boolean = js.native
}

@js.native
@JSGlobal("cc.MenuItemAtlasFont")
class ccMenuItemAtlasFont(value:String, charMapFile:String, itemWidth:Float, itemHeight:Float, startCharMap:String, callback:js.Function, target:ccNode) extends t_ccMenuItemAtlasFont {
}

@js.native
@JSGlobal("cc.MenuItemAtlasFont")
object ccMenuItemAtlasFont extends js.Object {
}

@js.native
trait t_ccMenuItemFont extends t_ccMenuItemLabel {
  def initWithString(value:String, callback:js.Function, target:ccNode):Boolean = js.native
  def setFontSize(s:Float):Unit = js.native
  def getFontSize:Float = js.native
  def setFontName(name:String):Unit = js.native
  def getFontName:String = js.native
}

@js.native
@JSGlobal("cc.MenuItemFont")
class ccMenuItemFont(value:String, callback:js.Function, target:ccNode) extends t_ccMenuItemFont {
}

@js.native
@JSGlobal("cc.MenuItemFont")
object ccMenuItemFont extends js.Object {
  def setFontSize(fontSize:Float):Unit = js.native
  def fontSize:Float = js.native
  def setFontName(name:js.Any):Unit = js.native
  def fontName:String = js.native
}

@js.native
trait t_ccMenuItemSprite extends t_ccMenuItem {
  def getNormalImage:ccSprite = js.native
  def setNormalImage(normalImage:ccSprite):Unit = js.native
  def getSelectedImage:ccSprite = js.native
  def setSelectedImage(selectedImage:ccSprite):Unit = js.native
  def getDisabledImage:ccSprite = js.native
  def setDisabledImage(disabledImage:ccSprite):Unit = js.native
  def initWithNormalSprite(normalSprite:ccNode, selectedSprite:ccNode, disabledSprite:ccNode, callback:js.Function, target:ccNode):Boolean = js.native
  override def selected():Unit = js.native
  override def unselected():Unit = js.native
  override def setEnabled(bEnabled:Boolean):Unit = js.native
}

@js.native
@JSGlobal("cc.MenuItemSprite")
class ccMenuItemSprite(normalSprite:js.Any, selectedSprite:js.Any, three:js.Any, four:String, five:String) extends t_ccMenuItemSprite {
}

@js.native
@JSGlobal("cc.MenuItemSprite")
object ccMenuItemSprite extends js.Object {
}

@js.native
trait t_ccMenuItemImage extends t_ccMenuItemSprite {
  def setNormalSpriteFrame(frame:ccSpriteFrame):Unit = js.native
  def setSelectedSpriteFrame(frame:ccSpriteFrame):Unit = js.native
  def setDisabledSpriteFrame(frame:ccSpriteFrame):Unit = js.native
  def initWithNormalImage(normalImage:String, selectedImage:String, disabledImage:String, callback:js.Function, target:ccNode):Boolean = js.native
}

@js.native
@JSGlobal("cc.MenuItemImage")
class ccMenuItemImage(normalImage:String, selectedImage:String, disabledImage:String, callback:js.Function, target:ccNode) extends t_ccMenuItemImage {
}

@js.native
@JSGlobal("cc.MenuItemImage")
object ccMenuItemImage extends js.Object {
}

@js.native
trait t_ccMenuItemToggle extends t_ccMenuItem {
  override def getOpacity:Float = js.native
  override def setOpacity(opacity:Float):Unit = js.native
  override def getColor:ccColor = js.native
  override def setColor(Color:ccColor):Unit = js.native
  def getSelectedIndex:Float = js.native
  def setSelectedIndex(SelectedIndex:Float):Unit = js.native
  def getSubItems:js.Array[js.Any] = js.native
  def setSubItems(subItems:ccMenuItem):Unit = js.native
  def initWithItems(array:ccMenuItem, secondTolast:js.Function, last:ccNode):Boolean = js.native
  def addSubItem(item:ccMenuItem):Unit = js.native
  override def activate():Unit = js.native
  override def selected():Unit = js.native
  override def unselected():Unit = js.native
  override def setEnabled(enabled:Boolean):Unit = js.native
  def selectedItem:ccMenuItem = js.native
  def getSelectedItem:ccMenuItem = js.native
  override def onEnter():Unit = js.native
}

@js.native
@JSGlobal("cc.MenuItemToggle")
class ccMenuItemToggle extends t_ccMenuItemToggle {
}

@js.native
@JSGlobal("cc.MenuItemToggle")
object ccMenuItemToggle extends js.Object {
}



