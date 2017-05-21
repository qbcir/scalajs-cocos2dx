package org.cocos2dxjs.extensions.ccui.uiwidgets.scrollwidget

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.extensions.ccui.system.t_ccuiProtectedNode

@js.native
trait t_ccuiPageViewIndicator extends t_ccuiProtectedNode {
  var spaceBetweenIndexNodes: Float = js.native
  def setDirection(direction:Float):Unit = js.native
  def reset(numberOfTotalPages:Float):Unit = js.native
  def indicate(index:Float):Unit = js.native
  def setSpaceBetweenIndexNodes(spaceBetweenIndexNodes:Float):Unit = js.native
  def getSpaceBetweenIndexNodes:Float = js.native
  def setSelectedIndexColor(color:ccColor):Unit = js.native
  def getSelectedIndexColor:ccColor = js.native
  def setIndexNodesColor(indexNodesColor:ccColor):Unit = js.native
  def getIndexNodesColor:ccColor = js.native
  def setIndexNodesScale(indexNodesScale:Float):Unit = js.native
  def getIndexNodesScale:Float = js.native
  def setIndexNodesTexture(texName:String, texType:Float):Unit = js.native
  def clear():Unit = js.native
}

@js.native
@JSGlobal("ccui.PageViewIndicator")
class ccuiPageViewIndicator extends t_ccuiPageViewIndicator {
}

@js.native
@JSGlobal("ccui.PageViewIndicator")
object ccuiPageViewIndicator extends js.Object {
  var SPACE_BETWEEN_INDEX_NODES_DEFAULT: js.Any = js.native
}


