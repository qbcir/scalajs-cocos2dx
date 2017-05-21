package org.cocos2dxjs.cocos2d.core.scenes

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode

@js.native
trait t_ccScene extends t_ccNode {
}

@js.native
@JSGlobal("cc.Scene")
class ccScene extends t_ccScene {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.Scene")
object ccScene extends js.Object {
}


