package org.cocos2dxjs.extensions.cocostudio.components

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.cocostudio.ccsComponent

@js.native
@JSGlobal("ccs.ComController")
class ccsComController extends ccsComponent {
  def onEnter():Unit = js.native
  def isEnabled:Boolean = js.native
  def setEnabled(bool:Boolean):Unit = js.native
}

