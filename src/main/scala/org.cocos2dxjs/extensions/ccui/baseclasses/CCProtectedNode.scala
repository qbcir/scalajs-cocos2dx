package org.cocos2dxjs.extensions.ccui.baseclasses

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode

@js.native
@JSGlobal("cc.ProtectedNode")
class ccProtectedNode extends ccNode {
  def addProtectedChild(child:ccNode, localZOrder:Float, tag:Float):Unit = js.native
  def getProtectedChildByTag(tag:Float):ccNode = js.native
  def removeProtectedChild(child:ccNode, cleanup:Boolean):Unit = js.native
  def removeProtectedChildByTag(tag:Float, cleanup:Boolean):Unit = js.native
  def removeAllProtectedChildren():Unit = js.native
  def removeAllProtectedChildrenWithCleanup(cleanup:Boolean):Unit = js.native
  def reorderProtectedChild(child:ccNode, localZOrder:Float):Unit = js.native
  def sortAllProtectedChildren():Unit = js.native
}

