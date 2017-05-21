package org.cocos2dxjs.cocos2d.physics

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.shapenodes.t_ccDrawNode

@js.native
trait t_ccPhysicsDebugNode extends t_ccDrawNode {
  var space: js.Any = js.native
}

@js.native
@JSGlobal("cc.PhysicsDebugNode")
class ccPhysicsDebugNode extends t_ccPhysicsDebugNode {
}

@js.native
@JSGlobal("cc.PhysicsDebugNode")
object ccPhysicsDebugNode extends js.Object {
}


