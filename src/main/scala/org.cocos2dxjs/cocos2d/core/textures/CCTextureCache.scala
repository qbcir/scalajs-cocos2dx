package org.cocos2dxjs.cocos2d.core.textures

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_cctextureCache extends js.Object {
}

@js.native
trait ts_cctextureCache extends js.Object {
  def addPVRTCImage(filename:String):ccTexture2D = js.native
  def addETCImage(filename:String):ccTexture2D = js.native
  def description():String = js.native
  def getTextureForKey(textureKeyName:String):ccTexture2D|js.Dynamic = js.native
  def getKeyByTexture(texture:js.Dynamic):String|js.Dynamic = js.native
  def getTextureColors(texture:js.Dynamic):js.Array[js.Any] = js.native
  def addPVRImage(path:String):ccTexture2D = js.native
  def removeAllTextures():Unit = js.native
  def removeTexture(texture:js.Dynamic):Unit = js.native
  def removeTextureForKey(textureKeyName:String):Unit = js.native
  def cacheImage(path:String, texture:js.Dynamic):Unit = js.native
  def addUIImage(image:js.Dynamic, key:String):ccTexture2D = js.native
  def dumpCachedTextureInfo():Unit = js.native
}

@js.native
@JSGlobal("cc.textureCache")
class cctextureCache() extends t_cctextureCache {
}

@js.native
@JSGlobal("cc.textureCache")
object cctextureCache extends ts_cctextureCache {
}


