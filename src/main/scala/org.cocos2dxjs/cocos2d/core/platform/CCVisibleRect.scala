package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect

@js.native
trait t_ccvisibleRect extends js.Object {
}

@js.native
@JSGlobal("cc.visibleRect")
class ccvisibleRect extends t_ccvisibleRect {
}

@js.native
@JSGlobal("cc.visibleRect")
object ccvisibleRect extends js.Object {
  def init(visibleRect:ccRect):Unit = js.native
}

