package org.cocos2dxjs.cocos2d.shaders

import scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait t_ccshaderCache extends js.Object {
}

@js.native
@JSGlobal("cc.shaderCache")
class ccshaderCache extends t_ccshaderCache {
}

@js.native
@JSGlobal("cc.shaderCache")
object ccshaderCache extends js.Object {
  def loadDefaultShaders():Unit = js.native
  def reloadDefaultShaders():Unit = js.native
  def programForKey(key:String):Unit = js.native
  def getProgram(shaderName:String):ccGLProgram = js.native
  def addProgram(program:ccGLProgram, key:String):Unit = js.native
}

