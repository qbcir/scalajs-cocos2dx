package org.cocos2dxjs.cocos2d.core.textures

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.shaders.ccGLProgram
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.platform.ccFontDefinition
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass

@js.native
trait t_ccTexture2D extends t_ccClass {
  val name: js.Dynamic = js.native
  val pixelFormat: Float = js.native
  val pixelsWidth: Float = js.native
  val pixelsHeight: Float = js.native
  var width: Float = js.native
  var height: Float = js.native
  var shaderProgram: ccGLProgram = js.native
  var maxS: Float = js.native
  var maxT: Float = js.native
  def releaseTexture():Unit = js.native
  def getPixelFormat:Float = js.native
  def getPixelsWide:Float = js.native
  def getPixelsHigh:Float = js.native
  def getName:js.Dynamic = js.native
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
  def initWithImage(uiImage:js.Dynamic):Boolean = js.native
  def initWithElement(element:js.Dynamic | js.Dynamic):Unit = js.native
  def getHtmlElementObj:js.Dynamic = js.native
  def isLoaded:Boolean = js.native
  def handleLoadedTexture(premultiplied:Boolean):Unit = js.native
  def initWithString(text:String, fontName:String | ccFontDefinition, fontSize:Float, dimensions:ccSize, hAlignment:Float, vAlignment:Float):Boolean = js.native
  def initWithETCFile(file:String):Boolean = js.native
  def initWithPVRFile(file:String):Boolean = js.native
  def initWithPVRTCData(data:js.Array[js.Any], level:Float, bpp:Float, hasAlpha:Boolean, length:Float, pixelFormat:Float):Boolean = js.native
  def setTexParameters(texParams:types.DynObject | Float, magFilter:Float, wrapS:Float, wrapT:Float):Unit = js.native
  def setAntiAliasTexParameters():Unit = js.native
  def setAliasTexParameters():Unit = js.native
  def generateMipmap():Unit = js.native
  def stringForFormat:String = js.native
  def bitsPerPixelForFormat:Float = js.native
  def removeLoadedEventListener(target:ccNode):Unit = js.native
}

@js.native
trait ts_ccTexture2D extends ts_ccClass {
}

@js.native
@JSGlobal("cc.Texture2D")
class ccTexture2D extends t_ccTexture2D {
}

@js.native
@JSGlobal("cc.Texture2D")
object ccTexture2D extends ts_ccTexture2D {
  val PIXEL_FORMAT_RGBA8888: Float = js.native
  val PIXEL_FORMAT_RGB888: Float = js.native
  val PIXEL_FORMAT_RGB565: Float = js.native
  val PIXEL_FORMAT_A8: Float = js.native
  val PIXEL_FORMAT_I8: Float = js.native
  val PIXEL_FORMAT_AI88: Float = js.native
  val PIXEL_FORMAT_RGBA4444: Float = js.native
  val PIXEL_FORMAT_RGB5A1: Float = js.native
  val PIXEL_FORMAT_PVRTC4: Float = js.native
  val PIXEL_FORMAT_PVRTC2: Float = js.native
  val PIXEL_FORMAT_DEFAULT: Float = js.native
  var defaultPixelFormat: Float = js.native
}


