package org.cocos2dxjs.cocos2d.shaders

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.platform.t_ccClass

@js.native
trait t_ccGLProgram extends t_ccClass {
  def destroyProgram():Unit = js.native
  def initWithVertexShaderByteArray(vertShaderStr:String, fragShaderStr:String):Boolean = js.native
  def initWithString(vertShaderStr:String, fragShaderStr:String):Boolean = js.native
  def initWithVertexShaderFilename(vShaderFilename:String, fShaderFileName:String):Boolean = js.native
  def init(vShaderFilename:String, fShaderFileName:String):Boolean = js.native
  def addAttribute(attributeName:String, index:Float):Unit = js.native
  def link:Boolean = js.native
  def use():Unit = js.native
  def updateUniforms():Unit = js.native
  def getUniformLocationForName(name:String):Float = js.native
  def getUniformMVPMatrix:js.Any = js.native
  def getUniformSampler:js.Any = js.native
  def setUniformLocationWith1i(location:js.Any, i1:Float):Unit = js.native
  def setUniformLocationWith2i(location:js.Any, i1:Float, i2:Float):Unit = js.native
  def setUniformLocationWith3i(location:js.Any, i1:Float, i2:Float, i3:Float):Unit = js.native
  def setUniformLocationWith4i(location:js.Any, i1:Float, i2:Float, i3:Float, i4:Float):Unit = js.native
  def setUniformLocationWith2iv(location:js.Any, intArray:js.Any, numberOfArrays:Float):Unit = js.native
  def setUniformLocationWith3iv(location:js.Any, intArray:js.Any):Unit = js.native
  def setUniformLocationWith4iv(location:js.Any, intArray:js.Any):Unit = js.native
  def setUniformLocationI32(location:js.Any, i1:Float):Unit = js.native
  def setUniformLocationWith1f(location:js.Any, f1:Float):Unit = js.native
  def setUniformLocationWith2f(location:js.Any, f1:Float, f2:Float):Unit = js.native
  def setUniformLocationWith3f(location:js.Any, f1:Float, f2:Float, f3:Float):Unit = js.native
  def setUniformLocationWith4f(location:js.Any, f1:Float, f2:Float, f3:Float, f4:Float):Unit = js.native
  def setUniformLocationWith2fv(location:js.Any, floatArray:js.Any):Unit = js.native
  def setUniformLocationWith3fv(location:js.Any, floatArray:js.Any):Unit = js.native
  def setUniformLocationWith4fv(location:js.Any, floatArray:js.Any):Unit = js.native
  def setUniformLocationWithMatrix3fv(location:js.Any, matrixArray:js.Any):Unit = js.native
  def setUniformLocationWithMatrix4fv(location:js.Any, matrixArray:js.Any):Unit = js.native
  def setUniformsForBuiltins():Unit = js.native
  def setUniformForModelViewProjectionMatrix():Unit = js.native
  def vertexShaderLog:String = js.native
  def getVertexShaderLog:String = js.native
  def getFragmentShaderLog:String = js.native
  def fragmentShaderLog:String = js.native
  def programLog:String = js.native
  def getProgramLog:String = js.native
  def reset():Unit = js.native
  def getProgram:js.Any = js.native
  def retain():Unit = js.native
}

@js.native
@JSGlobal("cc.GLProgram")
class ccGLProgram(vShaderFileName:String, fShaderFileName:String) extends t_ccGLProgram {
}

@js.native
@JSGlobal("cc.GLProgram")
object ccGLProgram extends js.Object {
}


