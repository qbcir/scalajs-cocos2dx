package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect

@js.native
trait t_ccview extends js.Object {
  def setTargetDensityDPI(densityDPI:String):Unit = js.native
  def getTargetDensityDPI:String = js.native
  def resizeWithBrowserSize(enabled:Boolean):Unit = js.native
  def setResizeCallback(callback:js.Function):Unit = js.native
  def setOrientation(orientation:Float):Unit = js.native
  def adjustViewPort(enabled:Boolean):Unit = js.native
  def enableRetina(enabled:Boolean):Unit = js.native
  def isRetinaEnabled:Boolean = js.native
  def enableAutoFullScreen(enabled:Boolean):Unit = js.native
  def isAutoFullScreenEnabled:Boolean = js.native
  def isOpenGLReady:Boolean = js.native
  def swapBuffers():Unit = js.native
  def setIMEKeyboardState(isOpen:Boolean):Unit = js.native
  def setContentTranslateLeftTop(offsetLeft:Float, offsetTop:Float):Unit = js.native
  def getContentTranslateLeftTop:ccSize = js.native
  def getCanvasSize:ccSize = js.native
  def getFrameSize:ccSize = js.native
  def setFrameSize(width:Float, height:Float):Unit = js.native
  def getVisibleSize:ccSize = js.native
  def getVisibleSizeInPixel:ccSize = js.native
  def getVisibleOrigin:ccPoint = js.native
  def getVisibleOriginInPixel:ccPoint = js.native
  def canSetContentScaleFactor:Boolean = js.native
  def getResolutionPolicy:ccResolutionPolicy = js.native
  def setResolutionPolicy(resolutionPolicy:ccResolutionPolicy):Unit = js.native
  def setDesignResolutionSize(width:Float, height:Float, resolutionPolicy:ccResolutionPolicy):Unit = js.native
  def getDesignResolutionSize:ccSize = js.native
  def setRealPixelResolution(width:Float, height:Float, resolutionPolicy:ccResolutionPolicy):Unit = js.native
  def setViewPortInPoints(x:Float, y:Float, w:Float, h:Float):Unit = js.native
  def setScissorInPoints(x:Float, y:Float, w:Float, h:Float):Unit = js.native
  def isScissorEnabled:Boolean = js.native
  def getScissorRect:ccRect = js.native
  def setViewName(viewName:String):Unit = js.native
  def getViewName:String = js.native
  def getViewPortRect:ccRect = js.native
  def getScaleX:Float = js.native
  def getScaleY:Float = js.native
  def getDevicePixelRatio:Float = js.native
  def convertToLocationInView(tx:Float, ty:Float, relatedPos:js.Object):ccPoint = js.native
}

@js.native
@JSGlobal("cc.view")
class ccview extends t_ccview {
}

@js.native
@JSGlobal("cc.view")
object ccview extends js.Object {
}

@js.native
trait t_ccContainerStrategy extends t_ccClass {
  def preApply(The:ccview):Unit = js.native
  def apply(view:ccview, designedResolution:ccSize):Unit = js.native
  def postApply(view:ccview):Unit = js.native
}

@js.native
@JSGlobal("cc.ContainerStrategy")
class ccContainerStrategy extends t_ccContainerStrategy {
}

@js.native
@JSGlobal("cc.ContainerStrategy")
object ccContainerStrategy extends js.Object {
}

@js.native
trait t_ccContentStrategy extends t_ccClass {
  def preApply(view:ccview):Unit = js.native
  def apply(view:ccview, designedResolution:ccSize):js.Object = js.native
  def postApply(view:ccview):Unit = js.native
}

@js.native
@JSGlobal("cc.ContentStrategy")
class ccContentStrategy extends t_ccContentStrategy {
}

@js.native
@JSGlobal("cc.ContentStrategy")
object ccContentStrategy extends js.Object {
}

@js.native
trait t_ccResolutionPolicy extends t_ccClass {
  def preApply(view:ccview):Unit = js.native
  def apply(view:ccview, designedResolution:ccSize):js.Object = js.native
  def postApply(view:ccview):Unit = js.native
  def setContainerStrategy(containerStg:ccContainerStrategy):Unit = js.native
  def setContentStrategy(contentStg:ccContentStrategy):Unit = js.native
}

@js.native
@JSGlobal("cc.ResolutionPolicy")
class ccResolutionPolicy(containerStg:ccContainerStrategy, contentStg:ccContentStrategy) extends t_ccResolutionPolicy {
}

@js.native
@JSGlobal("cc.ResolutionPolicy")
object ccResolutionPolicy extends js.Object {
}

