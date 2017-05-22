package org.cocos2dxjs.cocos2d.tilemap

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass

@js.native
trait t_ccTMXObjectGroup extends t_ccClass {
  var properties: js.Array[js.Any] = js.native
  var groupName: String = js.native
  def getPositionOffset:ccPoint = js.native
  def setPositionOffset(offset:t_ccPoint):Unit = js.native
  def getProperties:js.Array[js.Any] = js.native
  def setProperties(Var:types.DynObject):Unit = js.native
  def getGroupName:String = js.native
  def setGroupName(groupName:String):Unit = js.native
  def propertyNamed(propertyName:String):types.DynObject = js.native
  def getObject(objectName:String):types.DynObject | js.Dynamic = js.native
  def getObjects:js.Array[js.Any] = js.native
  def setObjects(objects:types.DynObject):Unit = js.native
}

@js.native
trait ts_ccTMXObjectGroup extends ts_ccClass {
}

@js.native
@JSGlobal("cc.TMXObjectGroup")
class ccTMXObjectGroup extends t_ccTMXObjectGroup {
}

@js.native
@JSGlobal("cc.TMXObjectGroup")
object ccTMXObjectGroup extends ts_ccTMXObjectGroup {
}


