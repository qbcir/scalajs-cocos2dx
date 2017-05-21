package org.cocos2dxjs.extensions.gui.scrollview

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass

@js.native
trait t_ccSortableObject extends t_ccClass {
}

@js.native
@JSGlobal("cc.SortableObject")
class ccSortableObject extends t_ccSortableObject {
}

@js.native
@JSGlobal("cc.SortableObject")
object ccSortableObject extends js.Object {
}

@js.native
trait t_ccSortedObject extends t_ccSortableObject {
}

@js.native
@JSGlobal("cc.SortedObject")
class ccSortedObject extends t_ccSortedObject {
}

@js.native
@JSGlobal("cc.SortedObject")
object ccSortedObject extends js.Object {
}

@js.native
trait t_ccArrayForObjectSorting extends js.Object {
  def insertSortedObject(addObject:js.Object):Unit = js.native
}

@js.native
@JSGlobal("cc.ArrayForObjectSorting")
class ccArrayForObjectSorting extends t_ccArrayForObjectSorting {
}

@js.native
@JSGlobal("cc.ArrayForObjectSorting")
object ccArrayForObjectSorting extends js.Object {
}

