package org.cocos2dxjs.cocos2d.core.scenes

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode

@js.native
trait t_ccScene extends t_ccNode {
}

@js.native
trait ts_ccScene extends ts_ccNode {
}

@js.native
@JSGlobal("cc.Scene")
class ccScene() extends t_ccScene {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.Scene")
object ccScene extends ts_ccScene {
}


