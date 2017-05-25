package org.cocos2dxjs.extensions.ccui.system

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.ccui.layouts.{ccuilinearVerticalLayoutManager, t_ccuilinearVerticalLayoutManager}
import org.cocos2dxjs.extensions.ccui.layouts.{ccuilinearHorizontalLayoutManager, t_ccuilinearHorizontalLayoutManager}
import org.cocos2dxjs.extensions.ccui.layouts.{ccuirelativeLayoutManager, t_ccuirelativeLayoutManager}
import org.cocos2dxjs.extensions.ccui.layouts.{ccuiMargin, t_ccuiMargin}

@js.native
trait t_ccuiClass extends js.Object {
}

@js.native
trait ts_ccuiClass extends js.Object {
}

@js.native
@JSGlobal("ccui.Class")
class ccuiClass() extends t_ccuiClass {
}

@js.native
@JSGlobal("ccui.Class")
object ccuiClass extends ts_ccuiClass {
}

@js.native
trait t_ccuiNode extends t_ccuiClass {
}

@js.native
trait ts_ccuiNode extends ts_ccuiClass {
}

@js.native
@JSGlobal("ccui.Node")
class ccuiNode() extends t_ccuiNode {
}

@js.native
@JSGlobal("ccui.Node")
object ccuiNode extends ts_ccuiNode {
}

@js.native
trait t_ccuiProtectedNode extends t_ccuiNode {
}

@js.native
trait ts_ccuiProtectedNode extends ts_ccuiNode {
}

@js.native
@JSGlobal("ccui.ProtectedNode")
class ccuiProtectedNode() extends t_ccuiProtectedNode {
}

@js.native
@JSGlobal("ccui.ProtectedNode")
object ccuiProtectedNode extends ts_ccuiProtectedNode {
}


@js.native
@JSGlobal("ccui")
object ccui extends js.Object {

  var LINEAR_GRAVITY_NONE: js.Dynamic = js.native
  var cocosGUIVersion: String = js.native
  var _TextFieldRenderer: js.Dynamic = js.native
  def getLayoutManager(_type:Float):Null|ccuilinearHorizontalLayoutManager|ccuilinearVerticalLayoutManager|ccuirelativeLayoutManager = js.native
  def MarginZero():ccuiMargin = js.native
}

