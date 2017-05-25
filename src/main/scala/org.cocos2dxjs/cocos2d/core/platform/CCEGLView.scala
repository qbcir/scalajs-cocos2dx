package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}

@js.native
trait t_ccEGLView extends js.Object {
  def setTargetDensityDPI(densityDPI:String):Unit = js.native
  def getTargetDensityDPI():String = js.native
  def resizeWithBrowserSize(enabled:Boolean):Unit = js.native
  def setResizeCallback(callback:Null|js.Function):Unit = js.native
  def setOrientation(orientation:Float):Unit = js.native
  def adjustViewPort(enabled:Boolean):Unit = js.native
  def enableRetina(enabled:Boolean):Unit = js.native
  def isRetinaEnabled():Boolean = js.native
  def enableAutoFullScreen(enabled:Boolean):Unit = js.native
  def isAutoFullScreenEnabled():Boolean = js.native
  def isOpenGLReady():Boolean = js.native
  def swapBuffers():Unit = js.native
  def setIMEKeyboardState(isOpen:Boolean):Unit = js.native
  def setContentTranslateLeftTop(offsetLeft:Float, offsetTop:Float):Unit = js.native
  def getContentTranslateLeftTop():ccSize|types.DynObject = js.native
  def getCanvasSize():ccSize = js.native
  def getFrameSize():ccSize = js.native
  def setFrameSize(width:Float, height:Float):Unit = js.native
  def getVisibleSize():ccSize = js.native
  def getVisibleSizeInPixel():ccSize = js.native
  def getVisibleOrigin():ccPoint = js.native
  def getVisibleOriginInPixel():ccPoint = js.native
  def canSetContentScaleFactor():Boolean = js.native
  def getResolutionPolicy():ccResolutionPolicy = js.native
  def setResolutionPolicy(resolutionPolicy:Float|t_ccResolutionPolicy):Unit = js.native
  def setDesignResolutionSize(width:Float, height:Float, resolutionPolicy:Float|t_ccResolutionPolicy):Unit = js.native
  def getDesignResolutionSize():ccSize = js.native
  def setRealPixelResolution(width:Float, height:Float, resolutionPolicy:Float|t_ccResolutionPolicy):Unit = js.native
  def setViewPortInPoints(x:Float, y:Float, w:Float, h:Float):Unit = js.native
  def setScissorInPoints(x:Float, y:Float, w:Float, h:Float):Unit = js.native
  def isScissorEnabled():Boolean = js.native
  def getScissorRect():ccRect = js.native
  def setViewName(viewName:String):Unit = js.native
  def getViewName():String = js.native
  def getViewPortRect():ccRect = js.native
  def getScaleX():Float = js.native
  def getScaleY():Float = js.native
  def getDevicePixelRatio():Float = js.native
  def convertToLocationInView(tx:Float, ty:Float, relatedPos:types.DynObject):ccPoint = js.native
}

@js.native
trait ts_ccEGLView extends js.Object {
  def _getInstance():ccEGLView = js.native
}

@js.native
@JSGlobal("cc.EGLView")
class ccEGLView() extends t_ccEGLView {
}

@js.native
@JSGlobal("cc.EGLView")
object ccEGLView extends ts_ccEGLView {
}

@js.native
trait t_ccContainerStrategy extends t_ccClass {
  def preApply(The:t_ccEGLView):Unit = js.native
  def apply(view:t_ccEGLView, designedResolution:t_ccSize):Unit = js.native
  def postApply(view:t_ccEGLView):Unit = js.native
}

@js.native
trait ts_ccContainerStrategy extends ts_ccClass {
}

@js.native
@JSGlobal("cc.ContainerStrategy")
class ccContainerStrategy() extends t_ccContainerStrategy {
}

@js.native
@JSGlobal("cc.ContainerStrategy")
object ccContainerStrategy extends ts_ccContainerStrategy {
}

@js.native
trait t_ccContentStrategy extends t_ccClass {
  def preApply(view:t_ccEGLView):Unit = js.native
  def apply(view:t_ccEGLView, designedResolution:t_ccSize):types.DynObject = js.native
  def postApply(view:t_ccEGLView):Unit = js.native
}

@js.native
trait ts_ccContentStrategy extends ts_ccClass {
}

@js.native
@JSGlobal("cc.ContentStrategy")
class ccContentStrategy() extends t_ccContentStrategy {
}

@js.native
@JSGlobal("cc.ContentStrategy")
object ccContentStrategy extends ts_ccContentStrategy {
}

@js.native
trait t_ccResolutionPolicy extends t_ccClass {
  def preApply(view:t_ccEGLView):Unit = js.native
  def apply(view:t_ccEGLView, designedResolution:t_ccSize):types.DynObject = js.native
  def postApply(view:t_ccEGLView):Unit = js.native
  def setContainerStrategy(containerStg:t_ccContainerStrategy):Unit = js.native
  def setContentStrategy(contentStg:t_ccContentStrategy):Unit = js.native
}

@js.native
trait ts_ccResolutionPolicy extends ts_ccClass {
}

@js.native
@JSGlobal("cc.ResolutionPolicy")
class ccResolutionPolicy(containerStg:t_ccContainerStrategy, contentStg:t_ccContentStrategy) extends t_ccResolutionPolicy {
}

@js.native
@JSGlobal("cc.ResolutionPolicy")
object ccResolutionPolicy extends ts_ccResolutionPolicy {
  val EXACT_FIT: Float = js.native
  val NO_BORDER: Float = js.native
  val SHOW_ALL: Float = js.native
  val FIXED_HEIGHT: Float = js.native
  val FIXED_WIDTH: Float = js.native
  val UNKNOWN: Float = js.native
}


