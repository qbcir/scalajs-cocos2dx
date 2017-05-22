package org.cocos2dxjs.cocos2d.menus

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.sprites.{ccSprite, t_ccSprite}
import org.cocos2dxjs.cocos2d.core.sprites.{ccSpriteFrame, t_ccSpriteFrame}

@js.native
trait t_ccMenuItem extends t_ccNode {
  def isSelected:Boolean = js.native
  def setOpacityModifyRGB(value:js.Dynamic):Unit = js.native
  override def isOpacityModifyRGB:Boolean = js.native
  def isEnabled:Boolean = js.native
  def setEnabled(enable:Boolean):Unit = js.native
  def initWithCallback(callback:js.Function | String, target:t_ccNode):Boolean = js.native
  def rect:ccRect = js.native
  def selected():Unit = js.native
  def unselected():Unit = js.native
  def setCallback(callback:js.Function | String, target:t_ccNode):Unit = js.native
  def activate():Unit = js.native
}

@js.native
trait ts_ccMenuItem extends ts_ccNode {
}

@js.native
@JSGlobal("cc.MenuItem")
class ccMenuItem(callback:js.Function | String, target:t_ccNode) extends t_ccMenuItem {
}

@js.native
@JSGlobal("cc.MenuItem")
object ccMenuItem extends ts_ccMenuItem {
}

@js.native
trait t_ccMenuItemLabel extends t_ccMenuItem {
  var string: String = js.native
  var label: ccNode = js.native
  var disabledColor: ccColor = js.native
  def getDisabledColor:ccColor = js.native
  def setDisabledColor(color:t_ccColor):Unit = js.native
  def getLabel:ccNode = js.native
  def setLabel(label:t_ccNode):Unit = js.native
  override def setEnabled(enabled:Boolean):Unit = js.native
  def initWithLabel(label:t_ccNode, selector:js.Function | String, target:t_ccNode):Boolean = js.native
  def setString(label:String):Unit = js.native
  def getString:String = js.native
  override def activate():Unit = js.native
  override def selected():Unit = js.native
  override def unselected():Unit = js.native
}

@js.native
trait ts_ccMenuItemLabel extends ts_ccMenuItem {
}

@js.native
@JSGlobal("cc.MenuItemLabel")
class ccMenuItemLabel(label:t_ccNode, selector:js.Function | String, target:t_ccNode) extends t_ccMenuItemLabel {
}

@js.native
@JSGlobal("cc.MenuItemLabel")
object ccMenuItemLabel extends ts_ccMenuItemLabel {
}

@js.native
trait t_ccMenuItemAtlasFont extends t_ccMenuItemLabel {
  def initWithString(value:String, charMapFile:String, itemWidth:Float, itemHeight:Float, startCharMap:String, callback:js.Function | String | js.Dynamic, target:t_ccNode | js.Dynamic):Boolean = js.native
}

@js.native
trait ts_ccMenuItemAtlasFont extends ts_ccMenuItemLabel {
}

@js.native
@JSGlobal("cc.MenuItemAtlasFont")
class ccMenuItemAtlasFont(value:String, charMapFile:String, itemWidth:Float, itemHeight:Float, startCharMap:String, callback:js.Function | String | js.Dynamic, target:t_ccNode | js.Dynamic) extends t_ccMenuItemAtlasFont {
}

@js.native
@JSGlobal("cc.MenuItemAtlasFont")
object ccMenuItemAtlasFont extends ts_ccMenuItemAtlasFont {
}

@js.native
trait t_ccMenuItemFont extends t_ccMenuItemLabel {
  def initWithString(value:String, callback:js.Function | String, target:t_ccNode):Boolean = js.native
  def setFontSize(s:Float):Unit = js.native
  def getFontSize:Float = js.native
  def setFontName(name:String):Unit = js.native
  def getFontName:String = js.native
}

@js.native
trait ts_ccMenuItemFont extends ts_ccMenuItemLabel {
  def setFontSize(fontSize:Float):Unit = js.native
  def fontSize:Float = js.native
  def setFontName(name:js.Dynamic):Unit = js.native
  def fontName:String = js.native
}

@js.native
@JSGlobal("cc.MenuItemFont")
class ccMenuItemFont(value:String, callback:js.Function | String, target:t_ccNode) extends t_ccMenuItemFont {
}

@js.native
@JSGlobal("cc.MenuItemFont")
object ccMenuItemFont extends ts_ccMenuItemFont {
}

@js.native
trait t_ccMenuItemSprite extends t_ccMenuItem {
  var normalImage: ccSprite = js.native
  var selectedImage: ccSprite = js.native
  var disabledImage: ccSprite = js.native
  def getNormalImage:ccSprite = js.native
  def setNormalImage(normalImage:t_ccSprite):Unit = js.native
  def getSelectedImage:ccSprite = js.native
  def setSelectedImage(selectedImage:t_ccSprite):Unit = js.native
  def getDisabledImage:ccSprite = js.native
  def setDisabledImage(disabledImage:t_ccSprite):Unit = js.native
  def initWithNormalSprite(normalSprite:t_ccNode, selectedSprite:t_ccNode, disabledSprite:t_ccNode, callback:js.Function | String, target:t_ccNode):Boolean = js.native
  override def selected():Unit = js.native
  override def unselected():Unit = js.native
  override def setEnabled(bEnabled:Boolean):Unit = js.native
}

@js.native
trait ts_ccMenuItemSprite extends ts_ccMenuItem {
}

@js.native
@JSGlobal("cc.MenuItemSprite")
class ccMenuItemSprite(normalSprite:js.Dynamic | js.Dynamic, selectedSprite:js.Dynamic | js.Dynamic, three:js.Dynamic | t_ccNode | js.Dynamic, four:String | js.Function | t_ccNode | js.Dynamic, five:String | js.Function | js.Dynamic) extends t_ccMenuItemSprite {
}

@js.native
@JSGlobal("cc.MenuItemSprite")
object ccMenuItemSprite extends ts_ccMenuItemSprite {
}

@js.native
trait t_ccMenuItemImage extends t_ccMenuItemSprite {
  def setNormalSpriteFrame(frame:t_ccSpriteFrame):Unit = js.native
  def setSelectedSpriteFrame(frame:t_ccSpriteFrame):Unit = js.native
  def setDisabledSpriteFrame(frame:t_ccSpriteFrame):Unit = js.native
  def initWithNormalImage(normalImage:String | js.Dynamic, selectedImage:String | js.Dynamic, disabledImage:String | js.Dynamic, callback:js.Function | String | js.Dynamic, target:t_ccNode | js.Dynamic):Boolean = js.native
}

@js.native
trait ts_ccMenuItemImage extends ts_ccMenuItemSprite {
}

@js.native
@JSGlobal("cc.MenuItemImage")
class ccMenuItemImage(normalImage:String | js.Dynamic, selectedImage:String | js.Dynamic, disabledImage:String | js.Dynamic, callback:js.Function | String | js.Dynamic, target:t_ccNode | js.Dynamic) extends t_ccMenuItemImage {
}

@js.native
@JSGlobal("cc.MenuItemImage")
object ccMenuItemImage extends ts_ccMenuItemImage {
}

@js.native
trait t_ccMenuItemToggle extends t_ccMenuItem {
  var subItems: js.Array[js.Any] = js.native
  var selectedIndex: Float = js.native
  override def getOpacity:Float = js.native
  override def setOpacity(opacity:Float):Unit = js.native
  override def getColor:ccColor = js.native
  override def setColor(Color:t_ccColor):Unit = js.native
  def getSelectedIndex:Float = js.native
  def setSelectedIndex(SelectedIndex:Float):Unit = js.native
  def getSubItems:js.Array[js.Any] = js.native
  def setSubItems(subItems:t_ccMenuItem):Unit = js.native
  def initWithItems(array:t_ccMenuItem, secondTolast:js.Function | String, last:t_ccNode):Boolean = js.native
  def addSubItem(item:t_ccMenuItem):Unit = js.native
  override def activate():Unit = js.native
  override def selected():Unit = js.native
  override def unselected():Unit = js.native
  override def setEnabled(enabled:Boolean):Unit = js.native
  def selectedItem:ccMenuItem = js.native
  def getSelectedItem:ccMenuItem = js.native
  override def onEnter():Unit = js.native
}

@js.native
trait ts_ccMenuItemToggle extends ts_ccMenuItem {
}

@js.native
@JSGlobal("cc.MenuItemToggle")
class ccMenuItemToggle extends t_ccMenuItemToggle {
}

@js.native
@JSGlobal("cc.MenuItemToggle")
object ccMenuItemToggle extends ts_ccMenuItemToggle {
}


