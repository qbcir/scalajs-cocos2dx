package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import scala.scalajs.js.annotation._


@js.native
trait t_ccSAXParser extends t_ccClass {
  def parse(xmlTxt:String):js.Any = js.native
}

@js.native
@JSGlobal("cc.SAXParser")
class ccSAXParser extends t_ccSAXParser {
}

@js.native
@JSGlobal("cc.SAXParser")
object ccSAXParser extends js.Object {
}

@js.native
trait t_ccPlistParser extends t_ccSAXParser {
  override def parse(xmlTxt:String):js.Any = js.native
}

@js.native
@JSGlobal("cc.PlistParser")
class ccPlistParser extends t_ccPlistParser {
}

@js.native
@JSGlobal("cc.PlistParser")
object ccPlistParser extends js.Object {
}


