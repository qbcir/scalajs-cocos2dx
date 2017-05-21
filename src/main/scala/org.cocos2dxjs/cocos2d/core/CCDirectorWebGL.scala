package org.cocos2dxjs.cocos2d.core

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.platform.t_ccClass

@js.native
trait t_ccDirectorDelegate extends t_ccClass {
  def updateProjection():Unit = js.native
}

@js.native
@JSGlobal("cc.DirectorDelegate")
class ccDirectorDelegate extends t_ccDirectorDelegate {
}

@js.native
@JSGlobal("cc.DirectorDelegate")
object ccDirectorDelegate extends js.Object {
}


