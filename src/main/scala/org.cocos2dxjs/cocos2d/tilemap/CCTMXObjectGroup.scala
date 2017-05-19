package org.cocos2dxjs.cocos2d.tilemap

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.platform.ccClass

@js.native
@JSGlobal("cc.TMXObjectGroup")
class ccTMXObjectGroup extends ccClass {
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
