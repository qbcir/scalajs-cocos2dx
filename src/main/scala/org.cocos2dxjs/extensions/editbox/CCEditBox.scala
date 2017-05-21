package org.cocos2dxjs.extensions.editbox

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode

@js.native
trait t_ccEditBoxDelegate extends t_ccClass {
}

@js.native
@JSGlobal("cc.EditBoxDelegate")
class ccEditBoxDelegate extends t_ccEditBoxDelegate {
}

@js.native
@JSGlobal("cc.EditBoxDelegate")
object ccEditBoxDelegate extends js.Object {
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
  var delegate: js.Object = js.native
  var inputMode: Float = js.native
  var returnType: Float = js.native
}

@js.native
@JSGlobal("cc.EditBox")
class ccEditBox extends t_ccEditBox {
}

@js.native
@JSGlobal("cc.EditBox")
object ccEditBox extends js.Object {
}


