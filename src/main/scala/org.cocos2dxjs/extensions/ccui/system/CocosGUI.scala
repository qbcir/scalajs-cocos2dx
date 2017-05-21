package org.cocos2dxjs.extensions.ccui.system

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.extensions.ccui.layouts.ccuilinearVerticalLayoutManager
import org.cocos2dxjs.extensions.ccui.layouts.ccuiMargin

@js.native
trait t_ccuiClass extends js.Object {
}

@js.native
@JSGlobal("ccui.Class")
class ccuiClass extends t_ccuiClass {
}

@js.native
@JSGlobal("ccui.Class")
object ccuiClass extends js.Object {
}

@js.native
trait t_ccuiNode extends t_ccuiClass {
}

@js.native
@JSGlobal("ccui.Node")
class ccuiNode extends t_ccuiNode {
}

@js.native
@JSGlobal("ccui.Node")
object ccuiNode extends js.Object {
}

@js.native
trait t_ccuiProtectedNode extends t_ccuiNode {
}

@js.native
@JSGlobal("ccui.ProtectedNode")
class ccuiProtectedNode extends t_ccuiProtectedNode {
}

@js.native
@JSGlobal("ccui.ProtectedNode")
object ccuiProtectedNode extends js.Object {
}


@js.native
@JSGlobal("ccui")
object ccui extends js.Object {

  var LINEAR_GRAVITY_NONE: js.Any = js.native
  var cocosGUIVersion: String = js.native
  var _TextFieldRenderer: js.Any = js.native
  def getLayoutManager(_type:Float):ccuilinearVerticalLayoutManager = js.native
  def MarginZero:ccuiMargin = js.native
}

