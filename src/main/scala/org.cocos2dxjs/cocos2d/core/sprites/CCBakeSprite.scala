package org.cocos2dxjs.cocos2d.core.sprites

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
trait t_ccBakeSprite extends js.Object {
  def resetCanvasSize(sizeOrWidth:ccSize, height:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.BakeSprite")
class ccBakeSprite extends t_ccBakeSprite {
}

@js.native
@JSGlobal("cc.BakeSprite")
object ccBakeSprite extends js.Object {
}

