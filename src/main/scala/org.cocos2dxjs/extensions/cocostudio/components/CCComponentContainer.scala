package org.cocos2dxjs.extensions.cocostudio.components

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass

@js.native
trait t_ccComponentContainer extends t_ccClass {
  def getComponent(name:js.Dynamic):js.Dynamic = js.native
  def add(component:t_ccComponent):Boolean = js.native
  def remove(name:String|t_ccComponent):Boolean = js.native
  def removeAll():Unit = js.native
  def visit(delta:Float):Unit = js.native
  def isEmpty():Boolean = js.native
}

@js.native
trait ts_ccComponentContainer extends ts_ccClass {
}

@js.native
@JSGlobal("cc.ComponentContainer")
class ccComponentContainer(node:js.Dynamic) extends t_ccComponentContainer {
}

@js.native
@JSGlobal("cc.ComponentContainer")
object ccComponentContainer extends ts_ccComponentContainer {
}


