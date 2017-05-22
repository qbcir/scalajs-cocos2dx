package org.cocos2dxjs.cocos2d.core.sprites

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
trait t_ccBakeSprite extends js.Object {
  def resetCanvasSize(sizeOrWidth:ccSize | Float, height:Float):Unit = js.native
}

@js.native
trait ts_ccBakeSprite extends js.Object {
}

@js.native
@JSGlobal("cc.BakeSprite")
class ccBakeSprite extends t_ccBakeSprite {
}

@js.native
@JSGlobal("cc.BakeSprite")
object ccBakeSprite extends ts_ccBakeSprite {
}


