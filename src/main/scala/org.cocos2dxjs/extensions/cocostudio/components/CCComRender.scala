package org.cocos2dxjs.extensions.cocostudio.components

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.extensions.cocostudio.t_ccsComponent

@js.native
trait t_ccsComRender extends t_ccsComponent {
  def onEnter():Unit = js.native
  def onExit():Unit = js.native
  def getNode:ccNode = js.native
  def setNode(node:ccNode):Unit = js.native
}

@js.native
@JSGlobal("ccs.ComRender")
class ccsComRender(node:ccNode, comName:String) extends t_ccsComRender {
}

@js.native
@JSGlobal("ccs.ComRender")
object ccsComRender extends js.Object {
}

