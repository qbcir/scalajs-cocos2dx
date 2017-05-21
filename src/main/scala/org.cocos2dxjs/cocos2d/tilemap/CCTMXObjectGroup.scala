package org.cocos2dxjs.cocos2d.tilemap

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass

@js.native
trait t_ccTMXObjectGroup extends t_ccClass {
  var properties: js.Array[js.Any] = js.native
  var groupName: String = js.native
  def getPositionOffset:ccPoint = js.native
  def setPositionOffset(offset:ccPoint):Unit = js.native
  def getProperties:js.Array[js.Any] = js.native
  def setProperties(Var:js.Object):Unit = js.native
  def getGroupName:String = js.native
  def setGroupName(groupName:String):Unit = js.native
  def propertyNamed(propertyName:String):js.Object = js.native
  def getObject(objectName:String):js.Object = js.native
  def getObjects:js.Array[js.Any] = js.native
  def setObjects(objects:js.Object):Unit = js.native
}

@js.native
@JSGlobal("cc.TMXObjectGroup")
class ccTMXObjectGroup extends t_ccTMXObjectGroup {
}

@js.native
@JSGlobal("cc.TMXObjectGroup")
object ccTMXObjectGroup extends js.Object {
}


