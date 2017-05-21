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
trait t_ccplistParser extends t_ccSAXParser {
  override def parse(xmlTxt:String):js.Any = js.native
}

@js.native
@JSGlobal("cc.plistParser")
class ccplistParser extends t_ccplistParser {
}

@js.native
@JSGlobal("cc.plistParser")
object ccplistParser extends js.Object {
}

