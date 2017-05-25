package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccClass extends js.Object {
}

@js.native
trait ts_ccClass extends js.Object {
  def extend(props:types.DynObject):js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.Class")
class ccClass() extends t_ccClass {
}

@js.native
@JSGlobal("cc.Class")
object ccClass extends ts_ccClass {
}


@js.native
@JSGlobal("ClassManager")
object ClassManager extends js.Object {

}

