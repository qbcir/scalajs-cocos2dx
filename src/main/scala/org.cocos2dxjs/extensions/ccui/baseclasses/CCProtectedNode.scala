package org.cocos2dxjs.extensions.ccui.baseclasses

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode

@js.native
trait t_ccProtectedNode extends t_ccNode {
  def addProtectedChild(child:t_ccNode, localZOrder:Float, tag:Float):Unit = js.native
  def getProtectedChildByTag(tag:Float):ccNode = js.native
  def removeProtectedChild(child:t_ccNode, cleanup:Boolean):Unit = js.native
  def removeProtectedChildByTag(tag:Float, cleanup:Boolean):Unit = js.native
  def removeAllProtectedChildren():Unit = js.native
  def removeAllProtectedChildrenWithCleanup(cleanup:Boolean):Unit = js.native
  def reorderProtectedChild(child:t_ccNode, localZOrder:Float):Unit = js.native
  def sortAllProtectedChildren():Unit = js.native
}

@js.native
trait ts_ccProtectedNode extends ts_ccNode {
}

@js.native
@JSGlobal("cc.ProtectedNode")
class ccProtectedNode extends t_ccProtectedNode {
}

@js.native
@JSGlobal("cc.ProtectedNode")
object ccProtectedNode extends ts_ccProtectedNode {
}


