package org.cocos2dxjs.extensions.gui.scrollview

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.ccClass
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
@JSGlobal("cc.TableViewCell")
class ccTableViewCell extends ccNode {
  def getIdx():Unit = js.native
  def reset():Unit = js.native
}

@js.native
@JSGlobal("cc.TableViewDelegate")
class ccTableViewDelegate extends ccClass {
  def tableCellTouched(table:ccTableView, cell:ccTableViewCell):Unit = js.native
  def tableCellHighlight(table:ccTableView, cell:ccTableViewCell):Unit = js.native
  def tableCellUnhighlight(table:ccTableView, cell:ccTableViewCell):Unit = js.native
  def tableCellWillRecycle(table:js.Any, cell:js.Any):Unit = js.native
}

@js.native
@JSGlobal("cc.TableViewDataSource")
class ccTableViewDataSource extends ccClass {
  def tableCellSizeForIndex(table:ccTableView, idx:Float):ccSize = js.native
  def cellSizeForTable(table:ccTableView):ccSize = js.native
  def tableCellAtIndex(table:ccTableView, idx:js.Any):ccTableView = js.native
  def numberOfCellsInTableView(table:ccTableView):Float = js.native
}

@js.native
@JSGlobal("cc.TableView")
class ccTableView extends ccScrollView {
  def getDataSource():Unit = js.native
  def getDelegate():Unit = js.native
  def setVerticalFillOrder():Unit = js.native
  def updateCellAtIndex(idx:js.Any):Unit = js.native
  def insertCellAtIndex(idx:js.Any):Unit = js.native
  def removeCellAtIndex(idx:js.Any):Unit = js.native
  def reloadData():Unit = js.native
  def dequeueCell:js.Any = js.native
  def cellAtIndex(idx:js.Any):ccTableViewCell = js.native
}

