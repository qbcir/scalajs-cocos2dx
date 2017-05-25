package org.cocos2dxjs.extensions.cocostudio.components

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.t_ccsComponent
import org.cocos2dxjs.extensions.cocostudio.ts_ccsComponent

@js.native
trait t_ccsComAttribute extends t_ccsComponent {
  def init():Boolean = js.native
  def setInt(key:String, value:Float):Unit = js.native
  def setDouble(key:String, value:Float):Unit = js.native
  def setFloat(key:String, value:Float):Unit = js.native
  def setBool(key:String, value:Boolean):Unit = js.native
  def setString(key:String, value:Boolean):Unit = js.native
  def setObject(key:String, value:types.DynObject):Unit = js.native
  def getInt(key:String):Float = js.native
  def getDouble(key:String):Float = js.native
  def getFloat(key:String):Float = js.native
  def getBool(key:String):Boolean = js.native
  def getString(key:String):String = js.native
  def getObject(key:String):types.DynObject = js.native
  def parse(filename:js.Dynamic):Unit = js.native
}

@js.native
trait ts_ccsComAttribute extends ts_ccsComponent {
}

@js.native
@JSGlobal("ccs.ComAttribute")
class ccsComAttribute() extends t_ccsComAttribute {
}

@js.native
@JSGlobal("ccs.ComAttribute")
object ccsComAttribute extends ts_ccsComAttribute {
}


