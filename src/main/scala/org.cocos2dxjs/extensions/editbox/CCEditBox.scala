package org.cocos2dxjs.extensions.editbox

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode

@js.native
trait t_ccEditBoxDelegate extends t_ccClass {
}

@js.native
trait ts_ccEditBoxDelegate extends ts_ccClass {
}

@js.native
@JSGlobal("cc.EditBoxDelegate")
class ccEditBoxDelegate() extends t_ccEditBoxDelegate {
}

@js.native
@JSGlobal("cc.EditBoxDelegate")
object ccEditBoxDelegate extends ts_ccEditBoxDelegate {
}

@js.native
trait t_ccEditBox extends t_ccNode {
  var string: String = js.native
  var maxLength: String = js.native
  var font: String = js.native
  var fontName: String = js.native
  var fontSize: Float = js.native
  var fontColor: ccColor = js.native
  var placeHolder: String = js.native
  var placeHolderFont: String = js.native
  var placeHolderFontName: String = js.native
  var placeHolderFontSize: Float = js.native
  var placeHolderFontColor: ccColor = js.native
  var inputFlag: Float = js.native
  var delegate: types.DynObject = js.native
  var inputMode: Float = js.native
  var returnType: Float = js.native
}

@js.native
trait ts_ccEditBox extends ts_ccNode {
}

@js.native
@JSGlobal("cc.EditBox")
class ccEditBox() extends t_ccEditBox {
}

@js.native
@JSGlobal("cc.EditBox")
object ccEditBox extends ts_ccEditBox {
}


