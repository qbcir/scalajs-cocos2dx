package org.cocos2dxjs.extensions.cocostudio.components

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.extensions.cocostudio.t_ccsComponent

@js.native
trait t_ccsComAttribute extends t_ccsComponent {
  def init:Boolean = js.native
  def setInt(key:String, value:Float):Unit = js.native
  def setDouble(key:String, value:Float):Unit = js.native
  def setFloat(key:String, value:Float):Unit = js.native
  def setBool(key:String, value:Boolean):Unit = js.native
  def setString(key:String, value:Boolean):Unit = js.native
  def setObject(key:String, value:js.Object):Unit = js.native
  def getInt(key:String):Float = js.native
  def getDouble(key:String):Float = js.native
  def getFloat(key:String):Float = js.native
  def getBool(key:String):Boolean = js.native
  def getString(key:String):String = js.native
  def getObject(key:String):js.Object = js.native
  def parse(filename:js.Any):Unit = js.native
}

@js.native
@JSGlobal("ccs.ComAttribute")
class ccsComAttribute extends t_ccsComAttribute {
}

@js.native
@JSGlobal("ccs.ComAttribute")
object ccsComAttribute extends js.Object {
}


