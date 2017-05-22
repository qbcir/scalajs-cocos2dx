package org.cocos2dxjs.extensions.gui.scrollview

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass

@js.native
trait t_ccSortableObject extends t_ccClass {
}

@js.native
trait ts_ccSortableObject extends ts_ccClass {
}

@js.native
@JSGlobal("cc.SortableObject")
class ccSortableObject extends t_ccSortableObject {
}

@js.native
@JSGlobal("cc.SortableObject")
object ccSortableObject extends ts_ccSortableObject {
}

@js.native
trait t_ccSortedObject extends t_ccSortableObject {
}

@js.native
trait ts_ccSortedObject extends ts_ccSortableObject {
}

@js.native
@JSGlobal("cc.SortedObject")
class ccSortedObject extends t_ccSortedObject {
}

@js.native
@JSGlobal("cc.SortedObject")
object ccSortedObject extends ts_ccSortedObject {
}

@js.native
trait t_ccArrayForObjectSorting extends js.Object {
  def insertSortedObject(addObject:types.DynObject):Unit = js.native
}

@js.native
trait ts_ccArrayForObjectSorting extends js.Object {
}

@js.native
@JSGlobal("cc.ArrayForObjectSorting")
class ccArrayForObjectSorting extends t_ccArrayForObjectSorting {
}

@js.native
@JSGlobal("cc.ArrayForObjectSorting")
object ccArrayForObjectSorting extends ts_ccArrayForObjectSorting {
}


