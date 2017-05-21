package org.cocos2dxjs.extensions.gui.scrollview

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
trait t_ccTableViewCell extends t_ccNode {
  var objectId: Float = js.native
  def getIdx():Unit = js.native
  def reset():Unit = js.native
}

@js.native
@JSGlobal("cc.TableViewCell")
class ccTableViewCell extends t_ccTableViewCell {
}

@js.native
@JSGlobal("cc.TableViewCell")
object ccTableViewCell extends js.Object {
}

@js.native
trait t_ccTableViewDelegate extends t_ccClass {
  def tableCellTouched(table:ccTableView, cell:ccTableViewCell):Unit = js.native
  def tableCellHighlight(table:ccTableView, cell:ccTableViewCell):Unit = js.native
  def tableCellUnhighlight(table:ccTableView, cell:ccTableViewCell):Unit = js.native
  def tableCellWillRecycle(table:js.Any, cell:js.Any):Unit = js.native
}

@js.native
@JSGlobal("cc.TableViewDelegate")
class ccTableViewDelegate extends t_ccTableViewDelegate {
}

@js.native
@JSGlobal("cc.TableViewDelegate")
object ccTableViewDelegate extends js.Object {
}

@js.native
trait t_ccTableViewDataSource extends t_ccClass {
  def tableCellSizeForIndex(table:ccTableView, idx:Float):ccSize = js.native
  def cellSizeForTable(table:ccTableView):ccSize = js.native
  def tableCellAtIndex(table:ccTableView, idx:js.Any):ccTableView = js.native
  def numberOfCellsInTableView(table:ccTableView):Float = js.native
}

@js.native
@JSGlobal("cc.TableViewDataSource")
class ccTableViewDataSource extends t_ccTableViewDataSource {
}

@js.native
@JSGlobal("cc.TableViewDataSource")
object ccTableViewDataSource extends js.Object {
}

@js.native
trait t_ccTableView extends t_ccScrollView {
  var dataSource: ccTableViewDataSource = js.native
  var verticalFillOrder: Float = js.native
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

@js.native
@JSGlobal("cc.TableView")
class ccTableView(dataSource:js.Any, size:js.Any, container:js.Any) extends t_ccTableView {
}

@js.native
@JSGlobal("cc.TableView")
object ccTableView extends js.Object {
}


