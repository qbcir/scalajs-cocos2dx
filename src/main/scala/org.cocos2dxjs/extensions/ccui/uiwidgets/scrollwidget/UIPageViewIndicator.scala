package org.cocos2dxjs.extensions.ccui.uiwidgets.scrollwidget

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.extensions.ccui.system.ccuiProtectedNode

@js.native
@JSGlobal("ccui.PageViewIndicator")
class ccuiPageViewIndicator extends ccuiProtectedNode {
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

