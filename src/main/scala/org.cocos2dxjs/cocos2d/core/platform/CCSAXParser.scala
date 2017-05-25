package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccSAXParser extends t_ccClass {
  def parse(xmlTxt:String):js.Dynamic = js.native
}

@js.native
trait ts_ccSAXParser extends ts_ccClass {
}

@js.native
@JSGlobal("cc.SAXParser")
class ccSAXParser() extends t_ccSAXParser {
}

@js.native
@JSGlobal("cc.SAXParser")
object ccSAXParser extends ts_ccSAXParser {
}

@js.native
trait t_ccPlistParser extends t_ccSAXParser {
  override def parse(xmlTxt:String):js.Dynamic = js.native
}

@js.native
trait ts_ccPlistParser extends ts_ccSAXParser {
}

@js.native
@JSGlobal("cc.PlistParser")
class ccPlistParser() extends t_ccPlistParser {
}

@js.native
@JSGlobal("cc.PlistParser")
object ccPlistParser extends ts_ccPlistParser {
}


