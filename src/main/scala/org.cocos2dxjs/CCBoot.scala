package org.cocos2dxjs

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.actions.ccAction
import org.cocos2dxjs.cocos2d.actions.ccActionInterval
import org.cocos2dxjs.cocos2d.actions.ccSpeed
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.actions.ccFollow
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.actions.ccCardinalSplineTo
import org.cocos2dxjs.cocos2d.actions.ccCardinalSplineBy
import org.cocos2dxjs.cocos2d.actions.ccCatmullRomTo
import org.cocos2dxjs.cocos2d.actions.ccCatmullRomBy
import org.cocos2dxjs.cocos2d.actions.ccActionEase
import org.cocos2dxjs.cocos2d.actions.ccEaseRateAction
import org.cocos2dxjs.cocos2d.actions.ccShow
import org.cocos2dxjs.cocos2d.actions.ccHide
import org.cocos2dxjs.cocos2d.actions.ccToggleVisibility
import org.cocos2dxjs.cocos2d.actions.ccRemoveSelf
import org.cocos2dxjs.cocos2d.actions.ccFlipX
import org.cocos2dxjs.cocos2d.actions.ccFlipY
import org.cocos2dxjs.cocos2d.actions.ccPlace
import org.cocos2dxjs.cocos2d.actions.ccCallFunc
import org.cocos2dxjs.cocos2d.actions.ccSequence
import org.cocos2dxjs.cocos2d.actions.ccFiniteTimeAction
import org.cocos2dxjs.cocos2d.actions.ccRepeat
import org.cocos2dxjs.cocos2d.actions.ccRepeatForever
import org.cocos2dxjs.cocos2d.actions.ccRotateTo
import org.cocos2dxjs.cocos2d.actions.ccRotateBy
import org.cocos2dxjs.cocos2d.actions.ccMoveBy
import org.cocos2dxjs.cocos2d.actions.ccSkewTo
import org.cocos2dxjs.cocos2d.actions.ccSkewBy
import org.cocos2dxjs.cocos2d.actions.ccJumpBy
import org.cocos2dxjs.cocos2d.actions.ccJumpTo
import org.cocos2dxjs.cocos2d.actions.ccBezierBy
import org.cocos2dxjs.cocos2d.actions.ccBezierTo
import org.cocos2dxjs.cocos2d.actions.ccScaleTo
import org.cocos2dxjs.cocos2d.actions.ccScaleBy
import org.cocos2dxjs.cocos2d.actions.ccBlink
import org.cocos2dxjs.cocos2d.actions.ccFadeTo
import org.cocos2dxjs.cocos2d.actions.ccFadeIn
import org.cocos2dxjs.cocos2d.actions.ccFadeOut
import org.cocos2dxjs.cocos2d.actions.ccTintTo
import org.cocos2dxjs.cocos2d.actions.ccTintBy
import org.cocos2dxjs.cocos2d.actions.ccDelayTime
import org.cocos2dxjs.cocos2d.actions.ccReverseTime
import org.cocos2dxjs.cocos2d.core.sprites.ccAnimation
import org.cocos2dxjs.cocos2d.actions.ccAnimate
import org.cocos2dxjs.cocos2d.actions.ccTargetedAction
import org.cocos2dxjs.cocos2d.actions.ccActionTween
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.actions3d.ccGridAction
import org.cocos2dxjs.cocos2d.actions3d.ccGrid3DAction
import org.cocos2dxjs.cocos2d.actions3d.ccTiledGrid3DAction
import org.cocos2dxjs.cocos2d.actions3d.ccStopGrid
import org.cocos2dxjs.cocos2d.actions3d.ccReuseGrid
import org.cocos2dxjs.cocos2d.actions3d.ccFlipX3D
import org.cocos2dxjs.cocos2d.actions3d.ccFlipY3D
import org.cocos2dxjs.cocos2d.actions3d.ccLens3D
import org.cocos2dxjs.cocos2d.actions3d.ccRipple3D
import org.cocos2dxjs.cocos2d.actions3d.ccShaky3D
import org.cocos2dxjs.cocos2d.actions3d.ccLiquid
import org.cocos2dxjs.cocos2d.actions3d.ccWaves
import org.cocos2dxjs.cocos2d.actions3d.ccTwirl
import org.cocos2dxjs.cocos2d.actions3d.ccPageTurn3D
import org.cocos2dxjs.cocos2d.actions3d.ccShakyTiles3D
import org.cocos2dxjs.cocos2d.actions3d.ccShatteredTiles3D
import org.cocos2dxjs.cocos2d.actions3d.ccShuffleTiles
import org.cocos2dxjs.cocos2d.actions3d.ccFadeOutTRTiles
import org.cocos2dxjs.cocos2d.actions3d.ccFadeOutBLTiles
import org.cocos2dxjs.cocos2d.actions3d.ccFadeOutUpTiles
import org.cocos2dxjs.cocos2d.actions3d.ccFadeOutDownTiles
import org.cocos2dxjs.cocos2d.actions3d.ccTurnOffTiles
import org.cocos2dxjs.cocos2d.actions3d.ccWavesTiles3D
import org.cocos2dxjs.cocos2d.actions3d.ccJumpTiles3D
import org.cocos2dxjs.cocos2d.actions3d.ccSplitRows
import org.cocos2dxjs.cocos2d.actions3d.ccSplitCols
import org.cocos2dxjs.cocos2d.core.cocoa.ccAffineTransform
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.platform.ccV3F_C4B_T2F_Quad
import org.cocos2dxjs.cocos2d.core.platform.ccVertex2F
import org.cocos2dxjs.cocos2d.core.platform.ccVertex3F
import org.cocos2dxjs.cocos2d.core.platform.ccTex2F
import org.cocos2dxjs.cocos2d.core.platform.ccBlendFunc
import org.cocos2dxjs.cocos2d.progresstimer.ccProgressTo
import org.cocos2dxjs.cocos2d.progresstimer.ccProgressFromTo
import org.cocos2dxjs.cocos2d.shaders.ccGLProgram
import org.cocos2dxjs.cocos2d.core.textures.ccTexture2D
import org.cocos2dxjs.cocos2d.tilemap.ccImageTGA
import org.cocos2dxjs.cocos2d.core.platform.ccEGLView
import org.cocos2dxjs.cocos2d.core.ccDirector
import org.cocos2dxjs.cocos2d.core.platform.ccPlistParser
import org.cocos2dxjs.cocos2d.kazmath.ccmathMatrix4
import org.cocos2dxjs.cocos2d.core.ccDrawingPrimitiveWebGL
import org.cocos2dxjs.cocos2d.core.ccDrawingPrimitiveCanvas

@js.native
trait t_ccAsyncPool extends js.Object {
}

@js.native
@JSGlobal("cc.AsyncPool")
class ccAsyncPool extends t_ccAsyncPool {
}

@js.native
@JSGlobal("cc.AsyncPool")
object ccAsyncPool extends js.Object {
}

@js.native
trait t_ccasync extends js.Object {
}

@js.native
@JSGlobal("cc.async")
class ccasync extends t_ccasync {
}

@js.native
@JSGlobal("cc.async")
object ccasync extends js.Object {
  def series(tasks:js.Array[js.Any], cb:js.Function, target:js.Object):ccAsyncPool = js.native
  def parallel(tasks:js.Array[js.Any], cb:js.Function, target:js.Object):ccAsyncPool = js.native
  def waterfall(tasks:js.Array[js.Any], cb:js.Function, target:js.Object):ccAsyncPool = js.native
  def map(tasks:js.Array[js.Any], iterator:js.Function, callback:js.Function, target:js.Object):ccAsyncPool = js.native
  def mapLimit(tasks:js.Array[js.Any], limit:Float, iterator:js.Function, cb:js.Function, target:js.Object):Unit = js.native
}

@js.native
trait t_ccpath extends js.Object {
}

@js.native
@JSGlobal("cc.path")
class ccpath extends t_ccpath {
}

@js.native
@JSGlobal("cc.path")
object ccpath extends js.Object {
  def join:String = js.native
  def extname(pathStr:String):js.Any = js.native
  def mainFileName(fileName:String):String = js.native
  def basename(pathStr:String, extname:String):js.Any = js.native
  def dirname(pathStr:String):js.Any = js.native
  def changeExtname(pathStr:String, extname:String):String = js.native
  def changeBasename(pathStr:String, basename:String, isSameExt:Boolean):String = js.native
}

@js.native
trait t_ccLoader extends js.Object {
  def getXMLHttpRequest:js.Any = js.native
  def loadJs(baseDir:String, jsList:js.Any, cb:js.Function):js.Any = js.native
  def loadJsWithImg(baseDir:String, jsList:js.Any, cb:js.Function):Unit = js.native
  def loadTxt(url:String, cb:js.Function):Unit = js.native
  def loadJson(url:String, cb:js.Function):Unit = js.native
  def loadImg(url:String, option:js.Object, callback:js.Function):js.Any = js.native
  def _loadResIterator(item:js.Object, index:Float, cb:js.Function):js.Any = js.native
  def getUrl(basePath:String, url:String):js.Any = js.native
  def load(resources:String, option:js.Function, loadCallback:js.Function):ccAsyncPool = js.native
  def loadAliases(url:String, callback:js.Function):Unit = js.native
  def register(extNames:String, loader:js.Function):Unit = js.native
  def getRes(url:js.Any):js.Any = js.native
  def _getAliase(url:js.Any):js.Any = js.native
  def release(url:js.Any):Unit = js.native
  def releaseAll():Unit = js.native
}

@js.native
@JSGlobal("cc.Loader")
class ccLoader extends t_ccLoader {
  var resPath: String = js.native
  var audioPath: String = js.native
  var cache: js.Object = js.native
}

@js.native
@JSGlobal("cc.Loader")
object ccLoader extends js.Object {
}

@js.native
trait t_ccgame extends js.Object {
}

@js.native
@JSGlobal("cc.game")
class ccgame extends t_ccgame {
}

@js.native
@JSGlobal("cc.game")
object ccgame extends js.Object {
  var frame: js.Object = js.native
  var container: js.Object = js.native
  var canvas: js.Object = js.native
  var config: js.Object = js.native
  var onStart: js.Function = js.native
  var onStop: js.Function = js.native
  def setFrameRate(frameRate:js.Any):Unit = js.native
  def step():Unit = js.native
  def pause():Unit = js.native
  def resume():Unit = js.native
  def isPaused():Unit = js.native
  def restart():Unit = js.native
  def end():Unit = js.native
  def prepare(cb:js.Any):Unit = js.native
  def run(config:js.Object, onStart:js.Any):Unit = js.native
}


@js.native
@JSGlobal("cc")
object cc extends js.Object {
  type cckmMat4 = ccmathMatrix4
  type ccDrawingPrimitive = ccDrawingPrimitiveCanvas | ccDrawingPrimitiveWebGL

  var _drawingUtil: ccDrawingPrimitive = js.native
  var _renderContext: js.Any = js.native
  var _canvas: js.Any = js.native
  var container: js.Any = js.native
  var loader: ccLoader = js.native
  var view: ccEGLView = js.native
  var director: ccDirector = js.native
  var winSize: ccSize = js.native
  var Audio: js.Any = js.native
  var stencilBits: Float = js.native
  var Codec: js.Any = js.native
  var defaultFPS: Float = js.native
  var s_globalOrderOfArrival: js.Any = js.native
  var _EventListenerVector: js.Any = js.native
  var ENGINE_VERSION: String = js.native
  var Touches: js.Any = js.native
  var plistParser: ccPlistParser = js.native
  var NodeGrid: js.Any = js.native
  var tiffReader: js.Any = js.native
  var BuilderReader: js.Any = js.native
  var CONTROL_EVENT_TOTAL_NUMBER: js.Any = js.native
  var CONTROL_EVENT_TOUCH_DOWN: js.Any = js.native
  var CONTROL_STATE_NORMAL: js.Any = js.native
  var CONTROL_ZOOM_ACTION_TAG: js.Any = js.native
  var SLIDER_MARGIN_H: js.Any = js.native
  var CONTROL_STEPPER_PARTMINUS: js.Any = js.native
  var SCROLLVIEW_DIRECTION_NONE: js.Any = js.native
  var network: js.Object = js.native
  def each(obj:js.Object, iterator:js.Function, context:js.Object):Unit = js.native
  def extend(target:js.Object, sources:js.Object):js.Object = js.native
  def inherits(childCtor:js.Function, parentCtor:js.Function):Unit = js.native
  def isFunction(obj:js.Any):Boolean = js.native
  def isNumber(obj:js.Any):Boolean = js.native
  def isString(obj:js.Any):Boolean = js.native
  def isArray(obj:js.Any):Boolean = js.native
  def isUndefined(obj:js.Any):Boolean = js.native
  def isObject(obj:js.Any):Boolean = js.native
  def isCrossOrigin(url:String):Boolean = js.native
  def formatStr:String = js.native
  def _initDebugSetting(mode:Float):Unit = js.native
  def action:ccAction = js.native
  def speed(action:ccActionInterval, speed:Float):ccSpeed = js.native
  def follow(followedNode:ccNode, rect:ccRect):ccFollow = js.native
  def cardinalSplineAt(p0:ccPoint, p1:ccPoint, p2:ccPoint, p3:ccPoint, tension:Float, t:Float, out:ccPoint):ccPoint = js.native
  def reverseControlPoints:js.Array[js.Any] = js.native
  def cloneControlPoints(controlPoints:js.Any):js.Array[js.Any] = js.native
  def getControlPointAt(controlPoints:js.Array[js.Any], pos:Float):js.Array[js.Any] = js.native
  def reverseControlPointsInline(controlPoints:js.Any):Unit = js.native
  def cardinalSplineTo(duration:Float, points:js.Array[js.Any], tension:Float):ccCardinalSplineTo = js.native
  def cardinalSplineBy(duration:Float, points:js.Array[js.Any], tension:Float):ccCardinalSplineBy = js.native
  def catmullRomTo(dt:Float, points:js.Array[js.Any]):ccCatmullRomTo = js.native
  def catmullRomBy(dt:Float, points:js.Array[js.Any]):ccCatmullRomBy = js.native
  def actionEase(action:ccActionInterval):ccActionEase = js.native
  def easeRateAction(action:ccActionInterval, rate:Float):ccEaseRateAction = js.native
  def easeIn(rate:Float):js.Object = js.native
  def easeOut(rate:Float):js.Object = js.native
  def easeInOut(rate:Float):js.Object = js.native
  def easeExponentialIn:js.Object = js.native
  def easeExponentialOut:js.Object = js.native
  def easeExponentialInOut:js.Object = js.native
  def easeSineIn:js.Object = js.native
  def easeSineOut:js.Object = js.native
  def easeSineInOut:js.Object = js.native
  def easeElasticIn(period:Float):js.Object = js.native
  def easeElasticOut(period:Float):js.Object = js.native
  def easeElasticInOut(period:Float):js.Object = js.native
  def easeBounceIn:js.Object = js.native
  def easeBounceOut:js.Object = js.native
  def easeBounceInOut:js.Object = js.native
  def easeBackIn:js.Object = js.native
  def easeBackOut:js.Object = js.native
  def easeBackInOut:js.Object = js.native
  def easeBezierAction(p0:Float, p1:Float, p2:Float, p3:Float):js.Object = js.native
  def easeQuadraticActionIn:js.Object = js.native
  def easeQuadraticActionOut:js.Object = js.native
  def easeQuadraticActionInOut:js.Object = js.native
  def easeQuarticActionIn:js.Object = js.native
  def easeQuarticActionOut:js.Object = js.native
  def easeQuarticActionInOut:js.Object = js.native
  def easeQuinticActionIn:js.Object = js.native
  def easeQuinticActionOut:js.Object = js.native
  def easeQuinticActionInOut:js.Object = js.native
  def easeCircleActionIn:js.Object = js.native
  def easeCircleActionOut:js.Object = js.native
  def easeCircleActionInOut:js.Object = js.native
  def easeCubicActionIn:js.Object = js.native
  def easeCubicActionOut:js.Object = js.native
  def easeCubicActionInOut:js.Object = js.native
  def show:ccShow = js.native
  def hide:ccHide = js.native
  def toggleVisibility:ccToggleVisibility = js.native
  def removeSelf(isNeedCleanUp:Boolean):ccRemoveSelf = js.native
  def flipX(flip:Boolean):ccFlipX = js.native
  def flipY(flip:Boolean):ccFlipY = js.native
  def place(pos:ccPoint, y:Float):ccPlace = js.native
  def callFunc(selector:js.Function, selectorTarget:js.Object, data:js.Any):ccCallFunc = js.native
  def actionInterval(d:Float):ccActionInterval = js.native
  def sequence(tempArray:js.Array[js.Any]):ccSequence = js.native
  def repeat(action:ccFiniteTimeAction, times:Float):ccRepeat = js.native
  def repeatForever(action:ccFiniteTimeAction):ccRepeatForever = js.native
  def spawn(tempArray:js.Array[js.Any]):ccFiniteTimeAction = js.native
  def rotateTo(duration:Float, deltaAngleX:Float, deltaAngleY:Float):ccRotateTo = js.native
  def rotateBy(duration:Float, deltaAngleX:Float, deltaAngleY:Float):ccRotateBy = js.native
  def moveBy(duration:Float, deltaPos:ccPoint, deltaY:Float):ccMoveBy = js.native
  def moveTo(duration:Float, position:ccPoint, y:Float):ccMoveBy = js.native
  def skewTo(t:Float, sx:Float, sy:Float):ccSkewTo = js.native
  def skewBy(t:Float, sx:Float, sy:Float):ccSkewBy = js.native
  def jumpBy(duration:Float, position:ccPoint, y:Float, height:Float, jumps:Float):ccJumpBy = js.native
  def jumpTo(duration:Float, position:ccPoint, y:Float, height:Float, jumps:Float):ccJumpTo = js.native
  def bezierAt(a:Float, b:Float, c:Float, d:Float, t:Float):Float = js.native
  def bezierBy(t:Float, c:js.Array[js.Any]):ccBezierBy = js.native
  def bezierTo(t:Float, c:js.Array[js.Any]):ccBezierTo = js.native
  def scaleTo(duration:Float, sx:Float, sy:Float):ccScaleTo = js.native
  def scaleBy(duration:Float, sx:Float, sy:Float):ccScaleBy = js.native
  def blink(duration:Float, blinks:js.Any):ccBlink = js.native
  def fadeTo(duration:Float, opacity:Float):ccFadeTo = js.native
  def fadeIn(duration:Float):ccFadeIn = js.native
  def fadeOut(d:Float):ccFadeOut = js.native
  def tintTo(duration:Float, red:Float, green:Float, blue:Float):ccTintTo = js.native
  def tintBy(duration:Float, deltaRed:Float, deltaGreen:Float, deltaBlue:Float):ccTintBy = js.native
  def delayTime(d:Float):ccDelayTime = js.native
  def reverseTime(action:ccFiniteTimeAction):ccReverseTime = js.native
  def animate(animation:ccAnimation):ccAnimate = js.native
  def targetedAction(target:ccNode, action:ccFiniteTimeAction):ccTargetedAction = js.native
  def actionTween(duration:Float, key:String, from:Float, to:Float):ccActionTween = js.native
  def gridAction(duration:Float, gridSize:ccSize):ccGridAction = js.native
  def grid3DAction(duration:Float, gridSize:ccSize):ccGrid3DAction = js.native
  def tiledGrid3DAction(duration:Float, gridSize:ccSize):ccTiledGrid3DAction = js.native
  def stopGrid:ccStopGrid = js.native
  def reuseGrid(times:Float):ccReuseGrid = js.native
  def waves3D(duration:Float, gridSize:ccSize, waves:Float, amplitude:Float):Unit = js.native
  def flipX3D(duration:Float):ccFlipX3D = js.native
  def flipY3D(duration:Float):ccFlipY3D = js.native
  def lens3D(duration:Float, gridSize:ccSize, position:ccPoint, radius:Float):ccLens3D = js.native
  def ripple3D(duration:Float, gridSize:ccSize, position:ccPoint, radius:Float, waves:Float, amplitude:Float):ccRipple3D = js.native
  def shaky3D(duration:Float, gridSize:ccSize, range:Float, shakeZ:Boolean):ccShaky3D = js.native
  def liquid(duration:Float, gridSize:ccSize, waves:Float, amplitude:Float):ccLiquid = js.native
  def waves(duration:Float, gridSize:ccSize, waves:Float, amplitude:Float, horizontal:Boolean, vertical:Boolean):ccWaves = js.native
  def twirl(duration:Float, gridSize:ccSize, position:ccPoint, twirls:Float, amplitude:Float):ccTwirl = js.native
  def pageTurn3D(duration:Float, gridSize:ccSize):ccPageTurn3D = js.native
  def shakyTiles3D(duration:Float, gridSize:ccSize, range:Float, shakeZ:Boolean):ccShakyTiles3D = js.native
  def shatteredTiles3D(duration:Float, gridSize:ccSize, range:Float, shatterZ:Boolean):ccShatteredTiles3D = js.native
  def shuffleTiles(duration:Float, gridSize:ccSize, seed:Float):ccShuffleTiles = js.native
  def fadeOutTRTiles(duration:js.Any, gridSize:js.Any):ccFadeOutTRTiles = js.native
  def fadeOutBLTiles(duration:js.Any, gridSize:js.Any):ccFadeOutBLTiles = js.native
  def fadeOutUpTiles(duration:Float, gridSize:ccSize):ccFadeOutUpTiles = js.native
  def fadeOutDownTiles(duration:Float, gridSize:ccSize):ccFadeOutDownTiles = js.native
  def turnOffTiles(duration:Float, gridSize:ccSize, seed:Float):ccTurnOffTiles = js.native
  def wavesTiles3D(duration:Float, gridSize:ccSize, waves:Float, amplitude:Float):ccWavesTiles3D = js.native
  def jumpTiles3D(duration:Float, gridSize:ccSize, numberOfJumps:Float, amplitude:Float):ccJumpTiles3D = js.native
  def splitRows(duration:Float, rows:Float):ccSplitRows = js.native
  def splitCols(duration:Float, cols:Float):ccSplitCols = js.native
  def unzip(input:js.Array[js.Any]):String = js.native
  def unzipBase64(input:String):String = js.native
  def unzipBase64AsArray(input:String, bytes:Float):js.Array[js.Any] = js.native
  def unzipAsArray(input:js.Array[js.Any], bytes:Float):js.Array[js.Any] = js.native
  def StringToArray(input:String):js.Array[js.Any] = js.native
  def affineTransformMake(a:Float, b:Float, c:Float, d:Float, tx:Float, ty:Float):ccAffineTransform = js.native
  def pointApplyAffineTransform(point:ccPoint, transOrY:ccAffineTransform, t:ccAffineTransform):ccPoint = js.native
  def sizeApplyAffineTransform(size:ccSize, t:ccAffineTransform):ccSize = js.native
  def affineTransformMakeIdentity:ccAffineTransform = js.native
  def rectApplyAffineTransform(rect:ccRect, anAffineTransform:ccAffineTransform):ccRect = js.native
  def affineTransformTranslate(t:ccAffineTransform, tx:Float, ty:Float):ccAffineTransform = js.native
  def affineTransformScale(t:ccAffineTransform, sx:Float, sy:Float):ccAffineTransform = js.native
  def affineTransformRotate(aTransform:ccAffineTransform, anAngle:Float):ccAffineTransform = js.native
  def affineTransformConcat(t1:ccAffineTransform, t2:ccAffineTransform):ccAffineTransform = js.native
  def affineTransformConcatIn(t1:ccAffineTransform, t2:ccAffineTransform):ccAffineTransform = js.native
  def affineTransformEqualToTransform(t1:ccAffineTransform, t2:ccAffineTransform):Boolean = js.native
  def affineTransformInvert(t:ccAffineTransform):ccAffineTransform = js.native
  def p(x:Float, y:Float):ccPoint = js.native
  def pointEqualToPoint(point1:ccPoint, point2:ccPoint):Boolean = js.native
  def size(w:Float, h:Float):ccSize = js.native
  def sizeEqualToSize(size1:ccSize, size2:ccSize):Boolean = js.native
  def rect(x:Float, y:Float, w:Float, h:Float):ccRect = js.native
  def rectEqualToRect(rect1:ccRect, rect2:ccRect):Boolean = js.native
  def rectContainsRect(rect1:ccRect, rect2:ccRect):Boolean = js.native
  def rectGetMaxX(rect:ccRect):Float = js.native
  def rectGetMidX(rect:ccRect):Float = js.native
  def rectGetMinX(rect:ccRect):Float = js.native
  def rectGetMaxY(rect:ccRect):Float = js.native
  def rectGetMidY(rect:ccRect):Float = js.native
  def rectGetMinY(rect:ccRect):Float = js.native
  def rectContainsPoint(rect:ccRect, point:ccPoint):Boolean = js.native
  def rectIntersectsRect(rectA:ccRect, rectB:ccRect):Boolean = js.native
  def rectOverlapsRect(rectA:ccRect, rectB:ccRect):Boolean = js.native
  def rectUnion(rectA:ccRect, rectB:ccRect):ccRect = js.native
  def rectIntersection(rectA:ccRect, rectB:ccRect):ccRect = js.native
  def defineGetterSetter(proto:js.Object, prop:String, getter:js.Function, setter:js.Function, getterName:String, setterName:String):Unit = js.native
  def clone(obj:js.Object):Unit = js.native
  def associateWithNative(jsObj:js.Object, superclass:js.Object):Unit = js.native
  def getImageFormatByData(imgData:js.Array[js.Any]):Float = js.native
  def lerp(a:Float, b:Float, r:Float):Unit = js.native
  def rand:Float = js.native
  def randomMinus1To1:Float = js.native
  def random0To1:Float = js.native
  def degreesToRadians(angle:Float):Float = js.native
  def radiansToDegrees(angle:Float):Float = js.native
  def radiansToDegress(angle:Float):Float = js.native
  def nodeDrawSetup(node:ccNode):Unit = js.native
  def enableDefaultGLStates():Unit = js.native
  def disableDefaultGLStates():Unit = js.native
  def incrementGLDraws(addNumber:Float):Unit = js.native
  def contentScaleFactor:Float = js.native
  def pointPointsToPixels(points:ccPoint):ccPoint = js.native
  def pointPixelsToPoints(pixels:ccRect):ccPoint = js.native
  def sizePointsToPixels(sizeInPoints:ccSize):ccSize = js.native
  def sizePixelsToPoints(sizeInPixels:ccSize):ccSize = js.native
  def rectPixelsToPoints(pixel:ccRect):ccRect = js.native
  def rectPointsToPixels(point:ccRect):ccRect = js.native
  def checkGLErrorDebug():Unit = js.native
  def arrayVerifyType(arr:js.Array[js.Any], _type:js.Function):Boolean = js.native
  def arrayRemoveObject(arr:js.Array[js.Any], delObj:js.Any):Unit = js.native
  def arrayRemoveArray(arr:js.Array[js.Any], minusArr:js.Array[js.Any]):Unit = js.native
  def arrayAppendObjectsToIndex(arr:js.Array[js.Any], addObjs:js.Array[js.Any], index:Float):js.Array[js.Any] = js.native
  def copyArray(arr:js.Array[js.Any]):js.Array[js.Any] = js.native
  def color(r:Float, g:Float, b:Float, a:Float):ccColor = js.native
  def colorEqual(color1:ccColor, color2:ccColor):Boolean = js.native
  def V3F_C4B_T2F_QuadZero:ccV3F_C4B_T2F_Quad = js.native
  def V3F_C4B_T2F_QuadCopy(sourceQuad:ccV3F_C4B_T2F_Quad):ccV3F_C4B_T2F_Quad = js.native
  def V3F_C4B_T2F_QuadsCopy(sourceQuads:js.Array[js.Any]):js.Array[js.Any] = js.native
  def vertex2(x:Float, y:Float):ccVertex2F = js.native
  def vertex3(x:Float, y:Float, z:Float):ccVertex3F = js.native
  def tex2(u:Float, v:Float):ccTex2F = js.native
  def blendFuncDisable:ccBlendFunc = js.native
  def hexToColor(hex:String):ccColor = js.native
  def colorToHex(color:ccColor):String = js.native
  def pNeg(point:ccPoint):ccPoint = js.native
  def pAdd(v1:ccPoint, v2:ccPoint):ccPoint = js.native
  def pSub(v1:ccPoint, v2:ccPoint):ccPoint = js.native
  def pMult(point:ccPoint, floatVar:Float):ccPoint = js.native
  def pMidpoint(v1:ccPoint, v2:ccPoint):ccPoint = js.native
  def pDot(v1:ccPoint, v2:ccPoint):Float = js.native
  def pCross(v1:ccPoint, v2:ccPoint):Float = js.native
  def pPerp(point:ccPoint):ccPoint = js.native
  def pRPerp(point:ccPoint):ccPoint = js.native
  def pProject(v1:ccPoint, v2:ccPoint):ccPoint = js.native
  def pRotate(v1:ccPoint, v2:ccPoint):ccPoint = js.native
  def pUnrotate(v1:ccPoint, v2:ccPoint):ccPoint = js.native
  def pLengthSQ(v:ccPoint):Float = js.native
  def pDistanceSQ(point1:ccPoint, point2:ccPoint):Float = js.native
  def pLength(v:ccPoint):Float = js.native
  def pDistance(v1:ccPoint, v2:ccPoint):Float = js.native
  def pNormalize(v:ccPoint):ccPoint = js.native
  def pForAngle(a:Float):ccPoint = js.native
  def pToAngle(v:ccPoint):Float = js.native
  def clampf(value:Float, min_inclusive:Float, max_inclusive:Float):Float = js.native
  def pClamp(p:js.Any, min_inclusive:Float, max_inclusive:Float):ccPoint = js.native
  def pFromSize(s:ccSize):ccPoint = js.native
  def pCompOp(p:ccPoint, opFunc:js.Function):ccPoint = js.native
  def pLerp(a:ccPoint, b:ccPoint, alpha:Float):ccPoint = js.native
  def pFuzzyEqual(a:ccPoint, b:ccPoint, variance:Float):Boolean = js.native
  def pCompMult(a:ccPoint, b:ccPoint):ccPoint = js.native
  def pAngleSigned(a:ccPoint, b:ccPoint):Float = js.native
  def pAngle(a:ccPoint, b:ccPoint):Float = js.native
  def pRotateByAngle(v:ccPoint, pivot:ccPoint, angle:Float):ccPoint = js.native
  def pLineIntersect(A:ccPoint, B:ccPoint, C:ccPoint, D:ccPoint, retP:ccPoint):Boolean = js.native
  def pSegmentIntersect(A:ccPoint, B:ccPoint, C:ccPoint, D:ccPoint):Boolean = js.native
  def pIntersectPoint(A:ccPoint, B:ccPoint, C:ccPoint, D:ccPoint):ccPoint = js.native
  def pSameAs(A:ccPoint, B:ccPoint):Boolean = js.native
  def pZeroIn(v:ccPoint):Unit = js.native
  def pIn(v1:ccPoint, v2:ccPoint):Unit = js.native
  def pMultIn(point:ccPoint, floatVar:Float):Unit = js.native
  def pSubIn(v1:ccPoint, v2:ccPoint):Unit = js.native
  def pAddIn(v1:ccPoint, v2:ccPoint):Unit = js.native
  def pNormalizeIn(v:ccPoint):Unit = js.native
  def vertexLineToPolygon(points:js.Any, stroke:Float, vertices:js.Any, offset:Float, nuPoints:Float):Unit = js.native
  def vertexLineIntersect(Ax:Float, Ay:Float, Bx:Float, By:Float, Cx:Float, Cy:Float, Dx:Float, Dy:Float):js.Object = js.native
  def vertexListIsClockwise(verts:js.Array[js.Any]):Boolean = js.native
  def CGAffineToGL(trans:ccAffineTransform, mat:cckmMat4):Unit = js.native
  def GLToCGAffine(mat:cckmMat4, trans:ccAffineTransform):Unit = js.native
  def kmMat4Identity(pOut:js.Any):Unit = js.native
  def kmMat4Inverse():Unit = js.native
  def kmMat4Multiply():Unit = js.native
  def kmMat4Assign():Unit = js.native
  def kmMat4Translation():Unit = js.native
  def kmMat4PerspectiveProjection():Unit = js.native
  def kmMat4OrthographicProjection():Unit = js.native
  def kmMat4LookAt():Unit = js.native
  def kmMat4RotationAxisAngle():Unit = js.native
  def __convertVerts(verts:js.Array[js.Any]):js.Array[js.Any] = js.native
  def ColorForBody(body:js.Any):ccColor = js.native
  def DrawShape(shape:js.Any, renderer:js.Any):Unit = js.native
  def DrawConstraint(constraint:js.Any, renderer:js.Any):Unit = js.native
  def progressTo(duration:Float, percent:Float):ccProgressTo = js.native
  def progressFromTo(duration:Float, fromPercentage:Float, toPercentage:Float):ccProgressFromTo = js.native
  def NextPOT(x:Float):Float = js.native
  def setProgram(node:ccNode, program:ccGLProgram):Unit = js.native
  def glInvalidateStateCache():Unit = js.native
  def glUseProgram(program:js.Any):Unit = js.native
  def glDeleteProgram(program:js.Any):Unit = js.native
  def setBlending(sfactor:Float, dfactor:Float):Unit = js.native
  def glBlendFunc(sfactor:Float, dfactor:Float):Unit = js.native
  def glBlendFuncForParticle(sfactor:Float, dfactor:Float):Unit = js.native
  def glBlendResetToCache():Unit = js.native
  def setProjectionMatrixDirty():Unit = js.native
  def glBindTexture2D(textureId:ccTexture2D):Unit = js.native
  def glBindTexture2DN(textureUnit:Float, textureId:ccTexture2D):Unit = js.native
  def glDeleteTexture(textureId:js.Any):Unit = js.native
  def glDeleteTextureN(textureUnit:Float, textureId:js.Any):Unit = js.native
  def glBindVAO(vaoId:Float):Unit = js.native
  def glEnable(flags:Float):Unit = js.native
  def tgaLoadHeader(buffer:js.Array[js.Any], bufSize:Float, psInfo:ccImageTGA):Boolean = js.native
  def tgaLoadImageData(buffer:js.Array[js.Any], bufSize:Float, psInfo:ccImageTGA):Boolean = js.native
  def tgaRGBtogreyscale(psInfo:ccImageTGA):Unit = js.native
  def tgaDestroy(psInfo:ccImageTGA):Unit = js.native
  def tgaLoadRLEImageData(buffer:js.Any, bufSize:js.Any, psInfo:js.Any):Boolean = js.native
  def tgaFlipImage(psInfo:ccImageTGA):Unit = js.native
}

