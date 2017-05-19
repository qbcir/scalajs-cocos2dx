package org.cocos2dxjs.extensions.gui.scrollview

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccClass

@js.native
@JSGlobal("cc.SortableObject")
class ccSortableObject extends ccClass {
}

@js.native
@JSGlobal("cc.SortedObject")
class ccSortedObject extends ccSortableObject {
}

@js.native
@JSGlobal("cc.ArrayForObjectSorting")
class ccArrayForObjectSorting extends js.Object {
  def insertSortedObject(addObject:js.Object):Unit = js.native
}

