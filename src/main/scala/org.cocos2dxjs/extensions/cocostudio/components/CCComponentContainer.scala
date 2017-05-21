package org.cocos2dxjs.extensions.cocostudio.components

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass

@js.native
trait t_ccComponentContainer extends t_ccClass {
  def getComponent(name:js.Any):js.Any = js.native
  def add(component:ccComponent):Boolean = js.native
  def remove(name:String):Boolean = js.native
  def removeAll():Unit = js.native
  def visit(delta:Float):Unit = js.native
  def isEmpty:Boolean = js.native
}

@js.native
@JSGlobal("cc.ComponentContainer")
class ccComponentContainer(node:js.Any) extends t_ccComponentContainer {
}

@js.native
@JSGlobal("cc.ComponentContainer")
object ccComponentContainer extends js.Object {
}

