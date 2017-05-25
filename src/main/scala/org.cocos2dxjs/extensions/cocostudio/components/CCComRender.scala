package org.cocos2dxjs.extensions.cocostudio.components

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.extensions.cocostudio.t_ccsComponent
import org.cocos2dxjs.extensions.cocostudio.ts_ccsComponent

@js.native
trait t_ccsComRender extends t_ccsComponent {
  def onEnter():Unit = js.native
  def onExit():Unit = js.native
  def getNode():ccNode = js.native
  def setNode(node:t_ccNode):Unit = js.native
}

@js.native
trait ts_ccsComRender extends ts_ccsComponent {
}

@js.native
@JSGlobal("ccs.ComRender")
class ccsComRender(node:t_ccNode, comName:String) extends t_ccsComRender {
}

@js.native
@JSGlobal("ccs.ComRender")
object ccsComRender extends ts_ccsComRender {
}


