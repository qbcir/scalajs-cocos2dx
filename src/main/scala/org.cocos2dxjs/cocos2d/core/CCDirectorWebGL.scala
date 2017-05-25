package org.cocos2dxjs.cocos2d.core

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass

@js.native
trait t_ccDirectorDelegate extends t_ccClass {
  def updateProjection():Unit = js.native
}

@js.native
trait ts_ccDirectorDelegate extends ts_ccClass {
}

@js.native
@JSGlobal("cc.DirectorDelegate")
class ccDirectorDelegate() extends t_ccDirectorDelegate {
}

@js.native
@JSGlobal("cc.DirectorDelegate")
object ccDirectorDelegate extends ts_ccDirectorDelegate {
}


