package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.ts_ccuiWidget

@js.native
trait t_ccuiLabelBMFont extends t_ccuiWidget {
  var string: String = js.native
}

@js.native
trait ts_ccuiLabelBMFont extends ts_ccuiWidget {
}

@js.native
@JSGlobal("ccui.LabelBMFont")
class ccuiLabelBMFont() extends t_ccuiLabelBMFont {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.LabelBMFont")
object ccuiLabelBMFont extends ts_ccuiLabelBMFont {
}


