package org.cocos2dxjs.extensions.cocostudio.components

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.extensions.cocostudio.ccsComponent

@js.native
@JSGlobal("ccs.ComRender")
class ccsComRender extends ccsComponent {
  def onEnter():Unit = js.native
  def onExit():Unit = js.native
  def getNode:ccNode = js.native
  def setNode(node:ccNode):Unit = js.native
}

