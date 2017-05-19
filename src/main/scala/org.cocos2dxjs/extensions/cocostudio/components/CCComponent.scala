package org.cocos2dxjs.extensions.cocostudio.components

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccClass

@js.native
@JSGlobal("cc.Component")
class ccComponent extends ccClass {
  def init:Boolean = js.native
  def onEnter():Unit = js.native
  def onExit():Unit = js.native
  def update(delta:js.Any):Unit = js.native
  def serialize(reader:js.Any):Unit = js.native
  def isEnabled:Boolean = js.native
  def setEnabled(enable:js.Any):Unit = js.native
  def getName:String = js.native
  def setName(name:String):Unit = js.native
  def setOwner(owner:js.Any):Unit = js.native
  def getOwner:js.Any = js.native
}

