package org.cocos2dxjs.cocos2d.physics

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.shapenodes.t_ccDrawNode
import org.cocos2dxjs.cocos2d.shapenodes.ts_ccDrawNode

@js.native
trait t_ccPhysicsDebugNode extends t_ccDrawNode {
  var space: js.Dynamic = js.native
}

@js.native
trait ts_ccPhysicsDebugNode extends ts_ccDrawNode {
}

@js.native
@JSGlobal("cc.PhysicsDebugNode")
class ccPhysicsDebugNode extends t_ccPhysicsDebugNode {
}

@js.native
@JSGlobal("cc.PhysicsDebugNode")
object ccPhysicsDebugNode extends ts_ccPhysicsDebugNode {
}


