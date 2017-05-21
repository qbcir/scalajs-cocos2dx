package org.cocos2dxjs.cocos2d.core.textures

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.shaders.ccGLProgram
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass

@js.native
trait t_ccTexture2D extends t_ccClass {
  def releaseTexture():Unit = js.native
  def getPixelFormat:Float = js.native
  def getPixelsWide:Float = js.native
  def getPixelsHigh:Float = js.native
  def getName:js.Any = js.native
  def getContentSize:ccSize = js.native
  def getContentSizeInPixels:ccSize = js.native
  def getMaxS:Float = js.native
  def setMaxS(maxS:Float):Unit = js.native
  def getMaxT:Float = js.native
  def setMaxT(maxT:Float):Unit = js.native
  def getShaderProgram:ccGLProgram = js.native
  def setShaderProgram(shaderProgram:ccGLProgram):Unit = js.native
  def hasPremultipliedAlpha:Boolean = js.native
  def hasMipmaps:Boolean = js.native
  def description:String = js.native
  def releaseData(data:js.Array[js.Any]):Unit = js.native
  def initWithData(data:js.Array[js.Any], pixelFormat:Float, pixelsWide:Float, pixelsHigh:Float, contentSize:ccSize):Boolean = js.native
  def drawAtPoint(point:ccPoint):Unit = js.native
  def drawInRect(rect:ccRect):Unit = js.native
  def initWithImage(uiImage:js.Any):Boolean = js.native
  def initWithElement(element:js.Any):Unit = js.native
  def getHtmlElementObj:js.Any = js.native
  def isLoaded:Boolean = js.native
  def handleLoadedTexture(premultiplied:Boolean):Unit = js.native
  def initWithString(text:String, fontName:String, fontSize:Float, dimensions:ccSize, hAlignment:Float, vAlignment:Float):Boolean = js.native
  def initWithETCFile(file:String):Boolean = js.native
  def initWithPVRFile(file:String):Boolean = js.native
  def initWithPVRTCData(data:js.Array[js.Any], level:Float, bpp:Float, hasAlpha:Boolean, length:Float, pixelFormat:Float):Boolean = js.native
  def setTexParameters(texParams:js.Object, magFilter:Float, wrapS:Float, wrapT:Float):Unit = js.native
  def setAntiAliasTexParameters():Unit = js.native
  def setAliasTexParameters():Unit = js.native
  def generateMipmap():Unit = js.native
  def stringForFormat:String = js.native
  def bitsPerPixelForFormat:Float = js.native
  def removeLoadedEventListener(target:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.Texture2D")
class ccTexture2D extends t_ccTexture2D {
}

@js.native
@JSGlobal("cc.Texture2D")
object ccTexture2D extends js.Object {
}

