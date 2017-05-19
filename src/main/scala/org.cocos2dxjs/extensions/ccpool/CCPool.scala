package org.cocos2dxjs.extensions.ccpool

import scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("cc.pool")
class ccpool extends js.Object {
  def putInPool(obj:js.Any):Unit = js.native
  def hasObject(objClass:js.Any):Boolean = js.native
  def removeObject(obj:js.Any):Unit = js.native
  def getFromPool(args:js.Any):js.Any = js.native
  def drainAllPools():Unit = js.native
}

