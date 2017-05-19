package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("cc.SAXParser")
class ccSAXParser extends ccClass {
  def parse(xmlTxt:String):js.Any = js.native
}

@js.native
@JSGlobal("cc.plistParser")
class ccplistParser extends ccSAXParser {
  override def parse(xmlTxt:String):js.Any = js.native
}

