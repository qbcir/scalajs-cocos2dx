package org.cocos2dxjs.extensions.cocostudio.components

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccClass

@js.native
@JSGlobal("cc.ComponentContainer")
class ccComponentContainer extends ccClass {
  def getComponent(name:js.Any):js.Any = js.native
  def add(component:ccComponent):Boolean = js.native
  def remove(name:String):Boolean = js.native
  def removeAll():Unit = js.native
  def visit(delta:Float):Unit = js.native
  def isEmpty:Boolean = js.native
}

