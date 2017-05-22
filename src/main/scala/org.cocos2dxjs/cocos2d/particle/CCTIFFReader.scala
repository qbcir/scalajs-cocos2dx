package org.cocos2dxjs.cocos2d.particle

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_cctiffReader extends js.Object {
}

@js.native
trait ts_cctiffReader extends js.Object {
  def parseTIFF(tiffData:js.Array[js.Any], canvas:js.Dynamic):js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.tiffReader")
class cctiffReader extends t_cctiffReader {
}

@js.native
@JSGlobal("cc.tiffReader")
object cctiffReader extends ts_cctiffReader {
}


