package org.cocos2dxjs.extensions.cocostudio.components

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.t_ccsComponent
import org.cocos2dxjs.extensions.cocostudio.ts_ccsComponent

@js.native
trait t_ccsComController extends t_ccsComponent {
  def onEnter():Unit = js.native
  def isEnabled:Boolean = js.native
  def setEnabled(bool:Boolean):Unit = js.native
}

@js.native
trait ts_ccsComController extends ts_ccsComponent {
}

@js.native
@JSGlobal("ccs.ComController")
class ccsComController extends t_ccsComController {
}

@js.native
@JSGlobal("ccs.ComController")
object ccsComController extends ts_ccsComController {
}


