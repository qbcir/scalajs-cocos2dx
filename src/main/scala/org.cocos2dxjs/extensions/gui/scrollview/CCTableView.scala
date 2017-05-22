package org.cocos2dxjs.extensions.gui.scrollview

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}

@js.native
trait t_ccTableViewCell extends t_ccNode {
  var objectId: Float = js.native
  def getIdx():Unit = js.native
  def reset():Unit = js.native
}

@js.native
trait ts_ccTableViewCell extends ts_ccNode {
}

@js.native
@JSGlobal("cc.TableViewCell")
class ccTableViewCell extends t_ccTableViewCell {
}

@js.native
@JSGlobal("cc.TableViewCell")
object ccTableViewCell extends ts_ccTableViewCell {
}

@js.native
trait t_ccTableViewDelegate extends t_ccClass {
  def tableCellTouched(table:t_ccTableView, cell:t_ccTableViewCell):Unit = js.native
  def tableCellHighlight(table:t_ccTableView, cell:t_ccTableViewCell):Unit = js.native
  def tableCellUnhighlight(table:t_ccTableView, cell:t_ccTableViewCell):Unit = js.native
  def tableCellWillRecycle(table:js.Dynamic, cell:js.Dynamic):Unit = js.native
}

@js.native
trait ts_ccTableViewDelegate extends ts_ccClass {
}

@js.native
@JSGlobal("cc.TableViewDelegate")
class ccTableViewDelegate extends t_ccTableViewDelegate {
}

@js.native
@JSGlobal("cc.TableViewDelegate")
object ccTableViewDelegate extends ts_ccTableViewDelegate {
}

@js.native
trait t_ccTableViewDataSource extends t_ccClass {
  def tableCellSizeForIndex(table:t_ccTableView, idx:Float):ccSize = js.native
  def cellSizeForTable(table:t_ccTableView):ccSize = js.native
  def tableCellAtIndex(table:t_ccTableView, idx:js.Dynamic):ccTableView = js.native
  def numberOfCellsInTableView(table:t_ccTableView):Float = js.native
}

@js.native
trait ts_ccTableViewDataSource extends ts_ccClass {
}

@js.native
@JSGlobal("cc.TableViewDataSource")
class ccTableViewDataSource extends t_ccTableViewDataSource {
}

@js.native
@JSGlobal("cc.TableViewDataSource")
object ccTableViewDataSource extends ts_ccTableViewDataSource {
}

@js.native
trait t_ccTableView extends t_ccScrollView {
  var dataSource: ccTableViewDataSource = js.native
  var verticalFillOrder: Float = js.native
  def getDataSource():Unit = js.native
  def getDelegate():Unit = js.native
  def setVerticalFillOrder():Unit = js.native
  def updateCellAtIndex(idx:js.Dynamic):Unit = js.native
  def insertCellAtIndex(idx:js.Dynamic):Unit = js.native
  def removeCellAtIndex(idx:js.Dynamic):Unit = js.native
  def reloadData():Unit = js.native
  def dequeueCell:js.Dynamic = js.native
  def cellAtIndex(idx:js.Dynamic):ccTableViewCell = js.native
}

@js.native
trait ts_ccTableView extends ts_ccScrollView {
}

@js.native
@JSGlobal("cc.TableView")
class ccTableView(dataSource:js.Dynamic, size:js.Dynamic, container:js.Dynamic) extends t_ccTableView {
}

@js.native
@JSGlobal("cc.TableView")
object ccTableView extends ts_ccTableView {
}


