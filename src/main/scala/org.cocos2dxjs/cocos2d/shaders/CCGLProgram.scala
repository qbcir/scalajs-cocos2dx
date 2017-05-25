package org.cocos2dxjs.cocos2d.shaders

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass

@js.native
trait t_ccGLProgram extends t_ccClass {
  def destroyProgram():Unit = js.native
  def initWithVertexShaderByteArray(vertShaderStr:String, fragShaderStr:String):Boolean = js.native
  def initWithString(vertShaderStr:String, fragShaderStr:String):Boolean = js.native
  def initWithVertexShaderFilename(vShaderFilename:String, fShaderFileName:String):Boolean = js.native
  def init(vShaderFilename:String, fShaderFileName:String):Boolean = js.native
  def addAttribute(attributeName:String, index:Float):Unit = js.native
  def link():Boolean = js.native
  def use():Unit = js.native
  def updateUniforms():Unit = js.native
  def getUniformLocationForName(name:String):Float = js.native
  def getUniformMVPMatrix():js.Dynamic = js.native
  def getUniformSampler():js.Dynamic = js.native
  def setUniformLocationWith1i(location:String|js.Dynamic, i1:Float):Unit = js.native
  def setUniformLocationWith2i(location:String|js.Dynamic, i1:Float, i2:Float):Unit = js.native
  def setUniformLocationWith3i(location:String|js.Dynamic, i1:Float, i2:Float, i3:Float):Unit = js.native
  def setUniformLocationWith4i(location:String|js.Dynamic, i1:Float, i2:Float, i3:Float, i4:Float):Unit = js.native
  def setUniformLocationWith2iv(location:String|js.Dynamic, intArray:js.Dynamic, numberOfArrays:Float):Unit = js.native
  def setUniformLocationWith3iv(location:String|js.Dynamic, intArray:js.Dynamic):Unit = js.native
  def setUniformLocationWith4iv(location:String|js.Dynamic, intArray:js.Dynamic):Unit = js.native
  def setUniformLocationI32(location:String|js.Dynamic, i1:Float):Unit = js.native
  def setUniformLocationWith1f(location:String|js.Dynamic, f1:Float):Unit = js.native
  def setUniformLocationWith2f(location:String|js.Dynamic, f1:Float, f2:Float):Unit = js.native
  def setUniformLocationWith3f(location:String|js.Dynamic, f1:Float, f2:Float, f3:Float):Unit = js.native
  def setUniformLocationWith4f(location:String|js.Dynamic, f1:Float, f2:Float, f3:Float, f4:Float):Unit = js.native
  def setUniformLocationWith2fv(location:String|js.Dynamic, floatArray:js.Dynamic):Unit = js.native
  def setUniformLocationWith3fv(location:String|js.Dynamic, floatArray:js.Dynamic):Unit = js.native
  def setUniformLocationWith4fv(location:String|js.Dynamic, floatArray:js.Dynamic):Unit = js.native
  def setUniformLocationWithMatrix3fv(location:String|js.Dynamic, matrixArray:js.Dynamic):Unit = js.native
  def setUniformLocationWithMatrix4fv(location:String|js.Dynamic, matrixArray:js.Dynamic):Unit = js.native
  def setUniformsForBuiltins():Unit = js.native
  def setUniformForModelViewProjectionMatrix():Unit = js.native
  def vertexShaderLog():String = js.native
  def getVertexShaderLog():String = js.native
  def getFragmentShaderLog():String = js.native
  def fragmentShaderLog():String = js.native
  def programLog():String = js.native
  def getProgramLog():String = js.native
  def reset():Unit = js.native
  def getProgram():js.Dynamic = js.native
  def retain():Unit = js.native
}

@js.native
trait ts_ccGLProgram extends ts_ccClass {
}

@js.native
@JSGlobal("cc.GLProgram")
class ccGLProgram(vShaderFileName:String, fShaderFileName:String) extends t_ccGLProgram {
}

@js.native
@JSGlobal("cc.GLProgram")
object ccGLProgram extends ts_ccGLProgram {
}


