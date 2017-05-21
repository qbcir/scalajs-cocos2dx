package org.cocos2dxjs.cocos2d.core.textures

import scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait t_cctextureCache extends js.Object {
}

@js.native
@JSGlobal("cc.textureCache")
class cctextureCache extends t_cctextureCache {
}

@js.native
@JSGlobal("cc.textureCache")
object cctextureCache extends js.Object {
  def addPVRTCImage(filename:String):ccTexture2D = js.native
  def addETCImage(filename:String):ccTexture2D = js.native
  def description:String = js.native
  def getTextureForKey(textureKeyName:String):ccTexture2D = js.native
  def getKeyByTexture(texture:js.Any):String = js.native
  def getTextureColors(texture:js.Any):js.Array[js.Any] = js.native
  def addPVRImage(path:String):ccTexture2D = js.native
  def removeAllTextures():Unit = js.native
  def removeTexture(texture:js.Any):Unit = js.native
  def removeTextureForKey(textureKeyName:String):Unit = js.native
  def cacheImage(path:String, texture:js.Any):Unit = js.native
  def addUIImage(image:js.Any, key:String):ccTexture2D = js.native
  def dumpCachedTextureInfo():Unit = js.native
}

