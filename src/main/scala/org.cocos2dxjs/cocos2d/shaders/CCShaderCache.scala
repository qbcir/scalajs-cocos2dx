package org.cocos2dxjs.cocos2d.shaders

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccshaderCache extends js.Object {
}

@js.native
trait ts_ccshaderCache extends js.Object {
  def loadDefaultShaders():Unit = js.native
  def reloadDefaultShaders():Unit = js.native
  def programForKey(key:String):Unit = js.native
  def getProgram(shaderName:String):ccGLProgram = js.native
  def addProgram(program:ccGLProgram, key:String):Unit = js.native
}

@js.native
@JSGlobal("cc.shaderCache")
class ccshaderCache extends t_ccshaderCache {
}

@js.native
@JSGlobal("cc.shaderCache")
object ccshaderCache extends ts_ccshaderCache {
  val TYPE_POSITION_TEXTURECOLOR: Float = js.native
  val TYPE_POSITION_TEXTURECOLOR_ALPHATEST: Float = js.native
  val TYPE_POSITION_COLOR: Float = js.native
  val TYPE_POSITION_TEXTURE: Float = js.native
  val TYPE_POSITION_TEXTURE_UCOLOR: Float = js.native
  val TYPE_POSITION_TEXTURE_A8COLOR: Float = js.native
  val TYPE_POSITION_UCOLOR: Float = js.native
  val TYPE_POSITION_LENGTH_TEXTURECOLOR: Float = js.native
  val TYPE_SPRITE_POSITION_TEXTURECOLOR: Float = js.native
  val TYPE_SPRITE_POSITION_TEXTURECOLOR_ALPHATEST: Float = js.native
  val TYPE_SPRITE_POSITION_COLOR: Float = js.native
  val TYPE_SPRITE_POSITION_TEXTURECOLOR_GRAY: Float = js.native
  val TYPE_MAX: Float = js.native
}


