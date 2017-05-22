package org.cocos2dxjs.extensions.ccpool

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccpool extends js.Object {
}

@js.native
trait ts_ccpool extends js.Object {
  def putInPool(obj:js.Dynamic):Unit = js.native
  def hasObject(objClass:js.Dynamic):Boolean = js.native
  def removeObject(obj:js.Dynamic):Unit = js.native
  def getFromPool(args:js.Dynamic):js.Dynamic = js.native
  def drainAllPools():Unit = js.native
}

@js.native
@JSGlobal("cc.pool")
class ccpool extends t_ccpool {
}

@js.native
@JSGlobal("cc.pool")
object ccpool extends ts_ccpool {
}


