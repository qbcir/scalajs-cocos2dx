package org.cocos2dxjs

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
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
import org.cocos2dxjs.cocos2d.actions.ccFiniteTimeAction
import org.cocos2dxjs.cocos2d.actions.ccSequence
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
import org.cocos2dxjs.cocos2d.core.ccDrawingPrimitiveCanvas
import org.cocos2dxjs.cocos2d.core.ccDrawingPrimitiveWebGL

@js.native
trait t_ccAsyncPool extends js.Object {
}

@js.native
trait ts_ccAsyncPool extends js.Object {
}

@js.native
@JSGlobal("cc.AsyncPool")
class ccAsyncPool(srcObj:types.DynObject | js.Array[js.Any], limit:Float, iterator:js.Function, onEnd:js.Function, target:types.DynObject) extends t_ccAsyncPool {
}

@js.native
@JSGlobal("cc.AsyncPool")
object ccAsyncPool extends ts_ccAsyncPool {
}

@js.native
trait t_ccasync extends js.Object {
}

@js.native
trait ts_ccasync extends js.Object {
  def series(tasks:js.Array[js.Any] | types.DynObject, cb:js.Function, target:types.DynObject):ccAsyncPool = js.native
  def parallel(tasks:js.Array[js.Any] | types.DynObject, cb:js.Function, target:types.DynObject):ccAsyncPool = js.native
  def waterfall(tasks:js.Array[js.Any] | types.DynObject, cb:js.Function, target:types.DynObject):ccAsyncPool = js.native
  def map(tasks:js.Array[js.Any] | types.DynObject, iterator:js.Function | types.DynObject, callback:js.Function, target:types.DynObject):ccAsyncPool = js.native
  def mapLimit(tasks:js.Array[js.Any] | types.DynObject, limit:Float, iterator:js.Function, cb:js.Function, target:types.DynObject):Unit = js.native
}

@js.native
@JSGlobal("cc.async")
class ccasync extends t_ccasync {
}

@js.native
@JSGlobal("cc.async")
object ccasync extends ts_ccasync {
}

@js.native
trait t_ccpath extends js.Object {
}

@js.native
trait ts_ccpath extends js.Object {
  def join:String = js.native
  def extname(pathStr:String):js.Dynamic = js.native
  def mainFileName(fileName:String):String = js.native
  def basename(pathStr:String, extname:String):js.Dynamic = js.native
  def dirname(pathStr:String):js.Dynamic = js.native
  def changeExtname(pathStr:String, extname:String):String = js.native
  def changeBasename(pathStr:String, basename:String, isSameExt:Boolean):String = js.native
}

@js.native
@JSGlobal("cc.path")
class ccpath extends t_ccpath {
}

@js.native
@JSGlobal("cc.path")
object ccpath extends ts_ccpath {
}

@js.native
trait t_ccLoader extends js.Object {
  def getXMLHttpRequest:js.Dynamic = js.native
  def loadJs(baseDir:String, jsList:js.Dynamic, cb:js.Function):js.Dynamic = js.native
  def loadJsWithImg(baseDir:String, jsList:js.Dynamic, cb:js.Function):Unit = js.native
  def loadTxt(url:String, cb:js.Function):Unit = js.native
  def loadJson(url:String, cb:js.Function):Unit = js.native
  def loadImg(url:String, option:types.DynObject, callback:js.Function):js.Dynamic = js.native
  def _loadResIterator(item:types.DynObject, index:Float, cb:js.Function):js.Dynamic = js.native
  def getUrl(basePath:String, url:String):js.Dynamic = js.native
  def load(resources:String, option:js.Function, loadCallback:js.Function | types.DynObject):ccAsyncPool = js.native
  def loadAliases(url:String, callback:js.Function):Unit = js.native
  def register(extNames:String, loader:js.Function):Unit = js.native
  def getRes(url:js.Dynamic):js.Dynamic = js.native
  def _getAliase(url:js.Dynamic):js.Dynamic = js.native
  def release(url:js.Dynamic):Unit = js.native
  def releaseAll():Unit = js.native
}

@js.native
trait ts_ccLoader extends js.Object {
}

@js.native
@JSGlobal("cc.Loader")
class ccLoader extends t_ccLoader {
  var resPath: String = js.native
  var audioPath: String = js.native
  var cache: types.DynObject = js.native
}

@js.native
@JSGlobal("cc.Loader")
object ccLoader extends ts_ccLoader {
}

@js.native
trait t_ccgame extends js.Object {
}

@js.native
trait ts_ccgame extends js.Object {
  def setFrameRate(frameRate:js.Dynamic):Unit = js.native
  def step():Unit = js.native
  def pause():Unit = js.native
  def resume():Unit = js.native
  def isPaused():Unit = js.native
  def restart():Unit = js.native
  def end():Unit = js.native
  def prepare(cb:js.Dynamic):Unit = js.native
  def run(config:types.DynObject | js.Function, onStart:js.Function):Unit = js.native
}

@js.native
@JSGlobal("cc.game")
class ccgame extends t_ccgame {
}

@js.native
@JSGlobal("cc.game")
object ccgame extends ts_ccgame {
  val DEBUG_MODE_NONE: Float = js.native
  val DEBUG_MODE_INFO: Float = js.native
  val DEBUG_MODE_WARN: Float = js.native
  val DEBUG_MODE_ERROR: Float = js.native
  val DEBUG_MODE_INFO_FOR_WEB_PAGE: Float = js.native
  val DEBUG_MODE_WARN_FOR_WEB_PAGE: Float = js.native
  val DEBUG_MODE_ERROR_FOR_WEB_PAGE: Float = js.native
  val EVENT_HIDE: String = js.native
  val EVENT_SHOW: String = js.native
  val EVENT_RESIZE: String = js.native
  val EVENT_RENDERER_INITED: String = js.native
  val RENDER_TYPE_CANVAS: Float = js.native
  val RENDER_TYPE_WEBGL: Float = js.native
  val RENDER_TYPE_OPENGL: Float = js.native
  val CONFIG_KEY: types.DynObject = js.native
  var frame: types.DynObject = js.native
  var container: types.DynObject = js.native
  var canvas: types.DynObject = js.native
  var config: types.DynObject = js.native
  var onStart: js.Function | js.Dynamic = js.native
  var onStop: js.Function | js.Dynamic = js.native
}


@js.native
@JSGlobal("cc")
object cc extends js.Object {
  type cckmMat4 = ccmathMatrix4
  type ccDrawingPrimitive = ccDrawingPrimitiveCanvas | ccDrawingPrimitiveWebGL

  val ACTION_TAG_INVALID: Float = js.native
  val PI2: Float = js.native
  val NODE_TAG_INVALID: Float = js.native
  val KEY: types.DynObject = js.native
  val FMT_JPG: Float = js.native
  val FMT_PNG: Float = js.native
  val FMT_TIFF: Float = js.native
  val FMT_RAWDATA: Float = js.native
  val FMT_WEBP: Float = js.native
  val FMT_UNKNOWN: Float = js.native
  val FIX_ARTIFACTS_BY_STRECHING_TEXEL: Float = js.native
  val DIRECTOR_STATS_POSITION: ccPoint = js.native
  val DIRECTOR_FPS_INTERVAL: Float = js.native
  val COCOSNODE_RENDER_SUBPIXEL: Float = js.native
  val SPRITEBATCHNODE_RENDER_SUBPIXEL: Float = js.native
  val OPTIMIZE_BLEND_FUNC_FOR_PREMULTIPLIED_ALPHA: Float = js.native
  val TEXTURE_ATLAS_USE_TRIANGLE_STRIP: Float = js.native
  val TEXTURE_ATLAS_USE_VAO: Float = js.native
  val TEXTURE_NPOT_SUPPORT: Float = js.native
  val RETINA_DISPLAY_FILENAME_SUFFIX: String = js.native
  val USE_LA88_LABELS: Float = js.native
  val SPRITE_DEBUG_DRAW: Float = js.native
  val SPRITEBATCHNODE_DEBUG_DRAW: Float = js.native
  val LABELBMFONT_DEBUG_DRAW: Float = js.native
  val LABELATLAS_DEBUG_DRAW: Float = js.native
  val DEFAULT_ENGINE: String = js.native
  val ENABLE_STACKABLE_ACTIONS: Float = js.native
  val ENABLE_GL_STATE_CACHE: Float = js.native
  val UIInterfaceOrientationLandscapeLeft: Float = js.native
  val UIInterfaceOrientationLandscapeRight: Float = js.native
  val UIInterfaceOrientationPortraitUpsideDown: Float = js.native
  val UIInterfaceOrientationPortrait: Float = js.native
  val INVALID_INDEX: Float = js.native
  val PI: Float = js.native
  val FLT_MAX: Float = js.native
  val FLT_MIN: Float = js.native
  val RAD: Float = js.native
  val DEG: Float = js.native
  val UINT_MAX: Float = js.native
  val REPEAT_FOREVER: Float = js.native
  val FLT_EPSILON: Float = js.native
  val ONE: Float = js.native
  val ZERO: Float = js.native
  val SRC_ALPHA: Float = js.native
  val SRC_ALPHA_SATURATE: Float = js.native
  val SRC_COLOR: Float = js.native
  val DST_ALPHA: Float = js.native
  val DST_COLOR: Float = js.native
  val ONE_MINUS_SRC_ALPHA: Float = js.native
  val ONE_MINUS_SRC_COLOR: Float = js.native
  val ONE_MINUS_DST_ALPHA: Float = js.native
  val ONE_MINUS_DST_COLOR: Float = js.native
  val ONE_MINUS_CONSTANT_ALPHA: Float = js.native
  val ONE_MINUS_CONSTANT_COLOR: Float = js.native
  val LINEAR: Float = js.native
  val REPEAT: Float = js.native
  val CLAMP_TO_EDGE: Float = js.native
  val MIRRORED_REPEAT: Float = js.native
  val BLEND_SRC: Float = js.native
  val BLEND_DST: Float = js.native
  val ORIENTATION_PORTRAIT: Float = js.native
  val ORIENTATION_LANDSCAPE: Float = js.native
  val ORIENTATION_AUTO: Float = js.native
  val CONCURRENCY_HTTP_REQUEST_COUNT: Float = js.native
  val VERTEX_ATTRIB_FLAG_NONE: Float = js.native
  val VERTEX_ATTRIB_FLAG_POSITION: Float = js.native
  val VERTEX_ATTRIB_FLAG_COLOR: Float = js.native
  val VERTEX_ATTRIB_FLAG_TEX_COORDS: Float = js.native
  val VERTEX_ATTRIB_FLAG_POS_COLOR_TEX: Float = js.native
  val GL_ALL: Float = js.native
  val VERTEX_ATTRIB_POSITION: Float = js.native
  val VERTEX_ATTRIB_COLOR: Float = js.native
  val VERTEX_ATTRIB_TEX_COORDS: Float = js.native
  val VERTEX_ATTRIB_MAX: Float = js.native
  val UNIFORM_PMATRIX: Float = js.native
  val UNIFORM_MVMATRIX: Float = js.native
  val UNIFORM_MVPMATRIX: Float = js.native
  val UNIFORM_TIME: Float = js.native
  val UNIFORM_SINTIME: Float = js.native
  val UNIFORM_COSTIME: Float = js.native
  val UNIFORM_RANDOM01: Float = js.native
  val UNIFORM_SAMPLER: Float = js.native
  val UNIFORM_MAX: Float = js.native
  val SHADER_POSITION_TEXTURECOLOR: String = js.native
  val SHADER_SPRITE_POSITION_TEXTURECOLOR: String = js.native
  val SHADER_SPRITE_POSITION_TEXTURECOLOR_GRAY: String = js.native
  val SHADER_POSITION_TEXTURECOLORALPHATEST: String = js.native
  val SHADER_SPRITE_POSITION_TEXTURECOLORALPHATEST: String = js.native
  val SHADER_POSITION_COLOR: String = js.native
  val SHADER_SPRITE_POSITION_COLOR: String = js.native
  val SHADER_POSITION_TEXTURE: String = js.native
  val SHADER_POSITION_TEXTURE_UCOLOR: String = js.native
  val SHADER_POSITION_TEXTUREA8COLOR: String = js.native
  val SHADER_POSITION_UCOLOR: String = js.native
  val SHADER_POSITION_LENGTHTEXTURECOLOR: String = js.native
  val UNIFORM_PMATRIX_S: String = js.native
  val UNIFORM_MVMATRIX_S: String = js.native
  val UNIFORM_MVPMATRIX_S: String = js.native
  val UNIFORM_TIME_S: String = js.native
  val UNIFORM_SINTIME_S: String = js.native
  val UNIFORM_COSTIME_S: String = js.native
  val UNIFORM_RANDOM01_S: String = js.native
  val UNIFORM_SAMPLER_S: String = js.native
  val UNIFORM_ALPHA_TEST_VALUE_S: String = js.native
  val ATTRIBUTE_NAME_COLOR: String = js.native
  val ATTRIBUTE_NAME_POSITION: String = js.native
  val ATTRIBUTE_NAME_TEX_COORD: String = js.native
  val ATTRIBUTE_NAME_MVMAT: String = js.native
  val ITEM_SIZE: Float = js.native
  val CURRENT_ITEM: Float = js.native
  val ZOOM_ACTION_TAG: Float = js.native
  val NORMAL_TAG: Float = js.native
  val SELECTED_TAG: Float = js.native
  val DISABLE_TAG: Float = js.native
  val TEXT_ALIGNMENT_LEFT: Float = js.native
  val TEXT_ALIGNMENT_CENTER: Float = js.native
  val TEXT_ALIGNMENT_RIGHT: Float = js.native
  val VERTICAL_TEXT_ALIGNMENT_TOP: Float = js.native
  val VERTICAL_TEXT_ALIGNMENT_CENTER: Float = js.native
  val VERTICAL_TEXT_ALIGNMENT_BOTTOM: Float = js.native
  val POINT_EPSILON: Float = js.native
  val MENU_STATE_WAITING: Float = js.native
  val MENU_STATE_TRACKING_TOUCH: Float = js.native
  val MENU_HANDLER_PRIORITY: Float = js.native
  val DEFAULT_PADDING: Float = js.native
  val PARTICLE_DEFAULT_CAPACITY: Float = js.native
  val CONSTRAINT_COLOR: ccColor = js.native
  val IMAGE_FORMAT_JPEG: Float = js.native
  val IMAGE_FORMAT_PNG: Float = js.native
  val IMAGE_FORMAT_RAWDATA: Float = js.native
  val SHADER_POSITION_UCOLOR_FRAG: String = js.native
  val SHADER_POSITION_UCOLOR_VERT: String = js.native
  val SHADER_POSITION_COLOR_FRAG: String = js.native
  val SHADER_POSITION_COLOR_VERT: String = js.native
  val SHADER_POSITION_COLOR_LENGTH_TEXTURE_FRAG: String = js.native
  val SHADER_POSITION_COLOR_LENGTH_TEXTURE_VERT: String = js.native
  val SHADER_POSITION_TEXTURE_FRAG: String = js.native
  val SHADER_POSITION_TEXTURE_VERT: String = js.native
  val SHADER_POSITION_TEXTURE_UCOLOR_FRAG: String = js.native
  val SHADER_POSITION_TEXTURE_UCOLOR_VERT: String = js.native
  val SHADER_POSITION_TEXTURE_A8COLOR_FRAG: String = js.native
  val SHADER_POSITION_TEXTURE_A8COLOR_VERT: String = js.native
  val SHADER_POSITION_TEXTURE_COLOR_FRAG: String = js.native
  val SHADER_POSITION_TEXTURE_COLOR_VERT: String = js.native
  val SHADER_SPRITE_POSITION_TEXTURE_COLOR_VERT: String = js.native
  val SHADER_POSITION_TEXTURE_COLOR_ALPHATEST_FRAG: String = js.native
  val SHADEREX_SWITCHMASK_FRAG: String = js.native
  val TGA_OK: Float = js.native
  val TGA_ERROR_FILE_OPEN: Float = js.native
  val TGA_ERROR_READING_FILE: Float = js.native
  val TGA_ERROR_INDEXED_COLOR: Float = js.native
  val TGA_ERROR_MEMORY: Float = js.native
  val TGA_ERROR_COMPRESSED_FILE: Float = js.native
  val TMX_ORIENTATION_ORTHO: Float = js.native
  val TMX_ORIENTATION_HEX: Float = js.native
  val TMX_ORIENTATION_ISO: Float = js.native
  val TMX_PROPERTY_NONE: Float = js.native
  val TMX_PROPERTY_MAP: Float = js.native
  val TMX_PROPERTY_LAYER: Float = js.native
  val TMX_PROPERTY_OBJECTGROUP: Float = js.native
  val TMX_PROPERTY_OBJECT: Float = js.native
  val TMX_PROPERTY_TILE: Float = js.native
  val TMX_TILE_HORIZONTAL_FLAG: Float = js.native
  val TMX_TILE_VERTICAL_FLAG: Float = js.native
  val TMX_TILE_DIAGONAL_FLAG: Float = js.native
  val TMX_TILE_FLIPPED_ALL: Float = js.native
  val TMX_TILE_FLIPPED_MASK: Float = js.native
  val SCENE_FADE: Float = js.native
  val TRANSITION_ORIENTATION_LEFT_OVER: Float = js.native
  val TRANSITION_ORIENTATION_RIGHT_OVER: Float = js.native
  val TRANSITION_ORIENTATION_UP_OVER: Float = js.native
  val TRANSITION_ORIENTATION_DOWN_OVER: Float = js.native
  val ADJUST_FACTOR: Float = js.native
  val SCENE_RADIAL: Float = js.native
  val KEYBOARD_RETURNTYPE_DEFAULT: Float = js.native
  val KEYBOARD_RETURNTYPE_DONE: Float = js.native
  val KEYBOARD_RETURNTYPE_SEND: Float = js.native
  val KEYBOARD_RETURNTYPE_SEARCH: Float = js.native
  val KEYBOARD_RETURNTYPE_GO: Float = js.native
  val EDITBOX_INPUT_MODE_ANY: Float = js.native
  val EDITBOX_INPUT_MODE_EMAILADDR: Float = js.native
  val EDITBOX_INPUT_MODE_NUMERIC: Float = js.native
  val EDITBOX_INPUT_MODE_PHONENUMBER: Float = js.native
  val EDITBOX_INPUT_MODE_URL: Float = js.native
  val EDITBOX_INPUT_MODE_DECIMAL: Float = js.native
  val EDITBOX_INPUT_MODE_SINGLELINE: Float = js.native
  val EDITBOX_INPUT_FLAG_PASSWORD: Float = js.native
  val EDITBOX_INPUT_FLAG_SENSITIVE: Float = js.native
  val EDITBOX_INPUT_FLAG_INITIAL_CAPS_WORD: Float = js.native
  val EDITBOX_INPUT_FLAG_INITIAL_CAPS_SENTENCE: Float = js.native
  val EDITBOX_INPUT_FLAG_INITIAL_CAPS_ALL_CHARACTERS: Float = js.native
  val TABLEVIEW_FILL_TOPDOWN: Float = js.native
  val TABLEVIEW_FILL_BOTTOMUP: Float = js.native
  var _drawingUtil: ccDrawingPrimitive = js.native
  var _renderContext: js.Dynamic | js.Dynamic = js.native
  var _canvas: js.Dynamic = js.native
  var container: js.Dynamic = js.native
  var loader: ccLoader = js.native
  var view: ccEGLView = js.native
  var director: ccDirector = js.native
  var winSize: ccSize = js.native
  var Audio: js.Dynamic = js.native
  var stencilBits: Float = js.native
  var Codec: js.Dynamic = js.native
  var defaultFPS: Float = js.native
  var s_globalOrderOfArrival: js.Dynamic = js.native
  var _EventListenerVector: js.Dynamic = js.native
  var ENGINE_VERSION: String = js.native
  var Touches: js.Dynamic = js.native
  var plistParser: ccPlistParser = js.native
  var NodeGrid: js.Dynamic = js.native
  var tiffReader: js.Dynamic = js.native
  var BuilderReader: js.Dynamic = js.native
  var CONTROL_EVENT_TOTAL_NUMBER: js.Dynamic = js.native
  var CONTROL_EVENT_TOUCH_DOWN: js.Dynamic = js.native
  var CONTROL_STATE_NORMAL: js.Dynamic = js.native
  var CONTROL_ZOOM_ACTION_TAG: js.Dynamic = js.native
  var SLIDER_MARGIN_H: js.Dynamic = js.native
  var CONTROL_STEPPER_PARTMINUS: js.Dynamic = js.native
  var SCROLLVIEW_DIRECTION_NONE: js.Dynamic = js.native
  var network: types.DynObject | js.Dynamic = js.native
  def each(obj:types.DynObject | js.Dynamic, iterator:js.Function, context:types.DynObject):Unit = js.native
  def extend(target:types.DynObject, sources:types.DynObject):types.DynObject = js.native
  def inherits(childCtor:js.Function, parentCtor:js.Function):Unit = js.native
  def isFunction(obj:js.Dynamic):Boolean = js.native
  def isNumber(obj:js.Dynamic):Boolean = js.native
  def isString(obj:js.Dynamic):Boolean = js.native
  def isArray(obj:js.Dynamic):Boolean = js.native
  def isUndefined(obj:js.Dynamic):Boolean = js.native
  def isObject(obj:js.Dynamic):Boolean = js.native
  def isCrossOrigin(url:String):Boolean = js.native
  def formatStr:String = js.native
  def _initDebugSetting(mode:Float):Unit = js.native
  def action:ccAction = js.native
  def speed(action:ccActionInterval, speed:Float):ccSpeed = js.native
  def follow(followedNode:ccNode, rect:ccRect):ccFollow | js.Dynamic = js.native
  def cardinalSplineAt(p0:ccPoint, p1:ccPoint, p2:ccPoint, p3:ccPoint, tension:Float, t:Float, out:ccPoint):ccPoint = js.native
  def reverseControlPoints:js.Array[js.Any] = js.native
  def cloneControlPoints(controlPoints:js.Dynamic):js.Array[js.Any] = js.native
  def getControlPointAt(controlPoints:js.Array[js.Any], pos:Float):js.Array[js.Any] = js.native
  def reverseControlPointsInline(controlPoints:js.Dynamic):Unit = js.native
  def cardinalSplineTo(duration:Float, points:js.Array[js.Any], tension:Float):ccCardinalSplineTo = js.native
  def cardinalSplineBy(duration:Float, points:js.Array[js.Any], tension:Float):ccCardinalSplineBy = js.native
  def catmullRomTo(dt:Float, points:js.Array[js.Any]):ccCatmullRomTo = js.native
  def catmullRomBy(dt:Float, points:js.Array[js.Any]):ccCatmullRomBy = js.native
  def actionEase(action:ccActionInterval):ccActionEase = js.native
  def easeRateAction(action:ccActionInterval, rate:Float):ccEaseRateAction = js.native
  def easeIn(rate:Float):types.DynObject = js.native
  def easeOut(rate:Float):types.DynObject = js.native
  def easeInOut(rate:Float):types.DynObject = js.native
  def easeExponentialIn:types.DynObject = js.native
  def easeExponentialOut:types.DynObject = js.native
  def easeExponentialInOut:types.DynObject = js.native
  def easeSineIn:types.DynObject = js.native
  def easeSineOut:types.DynObject = js.native
  def easeSineInOut:types.DynObject = js.native
  def easeElasticIn(period:Float):types.DynObject = js.native
  def easeElasticOut(period:Float):types.DynObject = js.native
  def easeElasticInOut(period:Float):types.DynObject = js.native
  def easeBounceIn:types.DynObject = js.native
  def easeBounceOut:types.DynObject = js.native
  def easeBounceInOut:types.DynObject = js.native
  def easeBackIn:types.DynObject = js.native
  def easeBackOut:types.DynObject = js.native
  def easeBackInOut:types.DynObject = js.native
  def easeBezierAction(p0:Float, p1:Float, p2:Float, p3:Float):types.DynObject = js.native
  def easeQuadraticActionIn:types.DynObject = js.native
  def easeQuadraticActionOut:types.DynObject = js.native
  def easeQuadraticActionInOut:types.DynObject = js.native
  def easeQuarticActionIn:types.DynObject = js.native
  def easeQuarticActionOut:types.DynObject = js.native
  def easeQuarticActionInOut:types.DynObject = js.native
  def easeQuinticActionIn:types.DynObject = js.native
  def easeQuinticActionOut:types.DynObject = js.native
  def easeQuinticActionInOut:types.DynObject = js.native
  def easeCircleActionIn:types.DynObject = js.native
  def easeCircleActionOut:types.DynObject = js.native
  def easeCircleActionInOut:types.DynObject = js.native
  def easeCubicActionIn:types.DynObject = js.native
  def easeCubicActionOut:types.DynObject = js.native
  def easeCubicActionInOut:types.DynObject = js.native
  def show:ccShow = js.native
  def hide:ccHide = js.native
  def toggleVisibility:ccToggleVisibility = js.native
  def removeSelf(isNeedCleanUp:Boolean):ccRemoveSelf = js.native
  def flipX(flip:Boolean):ccFlipX = js.native
  def flipY(flip:Boolean):ccFlipY = js.native
  def place(pos:ccPoint | Float, y:Float):ccPlace = js.native
  def callFunc(selector:js.Function, selectorTarget:types.DynObject | js.Dynamic, data:js.Dynamic | js.Dynamic):ccCallFunc = js.native
  def actionInterval(d:Float):ccActionInterval = js.native
  def sequence(tempArray:js.Array[js.Any] | ccFiniteTimeAction):ccSequence = js.native
  def repeat(action:ccFiniteTimeAction, times:Float):ccRepeat = js.native
  def repeatForever(action:ccFiniteTimeAction):ccRepeatForever = js.native
  def spawn(tempArray:js.Array[js.Any] | ccFiniteTimeAction):ccFiniteTimeAction = js.native
  def rotateTo(duration:Float, deltaAngleX:Float, deltaAngleY:Float):ccRotateTo = js.native
  def rotateBy(duration:Float, deltaAngleX:Float, deltaAngleY:Float):ccRotateBy = js.native
  def moveBy(duration:Float, deltaPos:ccPoint | Float, deltaY:Float):ccMoveBy = js.native
  def moveTo(duration:Float, position:ccPoint, y:Float):ccMoveBy = js.native
  def skewTo(t:Float, sx:Float, sy:Float):ccSkewTo = js.native
  def skewBy(t:Float, sx:Float, sy:Float):ccSkewBy = js.native
  def jumpBy(duration:Float, position:ccPoint | Float, y:Float, height:Float, jumps:Float):ccJumpBy = js.native
  def jumpTo(duration:Float, position:ccPoint | Float, y:Float, height:Float, jumps:Float):ccJumpTo = js.native
  def bezierAt(a:Float, b:Float, c:Float, d:Float, t:Float):Float = js.native
  def bezierBy(t:Float, c:js.Array[js.Any]):ccBezierBy = js.native
  def bezierTo(t:Float, c:js.Array[js.Any]):ccBezierTo = js.native
  def scaleTo(duration:Float, sx:Float, sy:Float):ccScaleTo = js.native
  def scaleBy(duration:Float, sx:Float, sy:Float | js.Dynamic):ccScaleBy = js.native
  def blink(duration:Float, blinks:js.Dynamic):ccBlink = js.native
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
  def fadeOutTRTiles(duration:js.Dynamic, gridSize:js.Dynamic):ccFadeOutTRTiles = js.native
  def fadeOutBLTiles(duration:js.Dynamic, gridSize:js.Dynamic):ccFadeOutBLTiles = js.native
  def fadeOutUpTiles(duration:Float, gridSize:ccSize):ccFadeOutUpTiles = js.native
  def fadeOutDownTiles(duration:Float, gridSize:ccSize):ccFadeOutDownTiles = js.native
  def turnOffTiles(duration:Float, gridSize:ccSize, seed:Float | js.Dynamic):ccTurnOffTiles = js.native
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
  def pointApplyAffineTransform(point:ccPoint | Float, transOrY:ccAffineTransform | Float, t:ccAffineTransform):ccPoint = js.native
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
  def p(x:Float | ccPoint, y:Float):ccPoint = js.native
  def pointEqualToPoint(point1:ccPoint, point2:ccPoint):Boolean = js.native
  def size(w:Float | ccSize, h:Float):ccSize = js.native
  def sizeEqualToSize(size1:ccSize, size2:ccSize):Boolean = js.native
  def rect(x:Float | ccRect, y:Float, w:Float, h:Float):ccRect = js.native
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
  def defineGetterSetter(proto:types.DynObject, prop:String, getter:js.Function, setter:js.Function, getterName:String, setterName:String):Unit = js.native
  def clone(obj:types.DynObject | js.Array[js.Any]):js.Array[js.Any] | types.DynObject = js.native
  def associateWithNative(jsObj:types.DynObject, superclass:types.DynObject):Unit = js.native
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
  def arrayRemoveObject(arr:js.Array[js.Any], delObj:js.Dynamic):Unit = js.native
  def arrayRemoveArray(arr:js.Array[js.Any], minusArr:js.Array[js.Any]):Unit = js.native
  def arrayAppendObjectsToIndex(arr:js.Array[js.Any], addObjs:js.Array[js.Any], index:Float):js.Array[js.Any] = js.native
  def copyArray(arr:js.Array[js.Any]):js.Array[js.Any] = js.native
  def color(r:Float | String | ccColor, g:Float, b:Float, a:Float):ccColor = js.native
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
  def pClamp(p:js.Dynamic, min_inclusive:Float, max_inclusive:Float):ccPoint = js.native
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
  def vertexLineToPolygon(points:js.Dynamic, stroke:Float, vertices:js.Dynamic, offset:Float, nuPoints:Float):Unit = js.native
  def vertexLineIntersect(Ax:Float, Ay:Float, Bx:Float, By:Float, Cx:Float, Cy:Float, Dx:Float, Dy:Float):types.DynObject = js.native
  def vertexListIsClockwise(verts:js.Array[js.Any]):Boolean = js.native
  def CGAffineToGL(trans:ccAffineTransform, mat:cckmMat4):Unit = js.native
  def GLToCGAffine(mat:cckmMat4, trans:ccAffineTransform):Unit = js.native
  def kmMat4Identity(pOut:js.Dynamic):Unit = js.native
  def kmMat4Inverse():Unit = js.native
  def kmMat4Multiply():Unit = js.native
  def kmMat4Assign():Unit = js.native
  def kmMat4Translation():Unit = js.native
  def kmMat4PerspectiveProjection():Unit = js.native
  def kmMat4OrthographicProjection():Unit = js.native
  def kmMat4LookAt():Unit = js.native
  def kmMat4RotationAxisAngle():Unit = js.native
  def __convertVerts(verts:js.Array[js.Any]):js.Array[js.Any] = js.native
  def ColorForBody(body:js.Dynamic):ccColor = js.native
  def DrawShape(shape:js.Dynamic, renderer:js.Dynamic):Unit = js.native
  def DrawConstraint(constraint:js.Dynamic, renderer:js.Dynamic):Unit = js.native
  def progressTo(duration:Float, percent:Float):ccProgressTo = js.native
  def progressFromTo(duration:Float, fromPercentage:Float, toPercentage:Float):ccProgressFromTo = js.native
  def NextPOT(x:Float):Float = js.native
  def setProgram(node:ccNode, program:ccGLProgram):Unit = js.native
  def glInvalidateStateCache():Unit = js.native
  def glUseProgram(program:js.Dynamic):Unit = js.native
  def glDeleteProgram(program:js.Dynamic):Unit = js.native
  def setBlending(sfactor:Float, dfactor:Float):Unit = js.native
  def glBlendFunc(sfactor:Float, dfactor:Float):Unit = js.native
  def glBlendFuncForParticle(sfactor:Float, dfactor:Float):Unit = js.native
  def glBlendResetToCache():Unit = js.native
  def setProjectionMatrixDirty():Unit = js.native
  def glBindTexture2D(textureId:ccTexture2D):Unit = js.native
  def glBindTexture2DN(textureUnit:Float, textureId:ccTexture2D):Unit = js.native
  def glDeleteTexture(textureId:js.Dynamic):Unit = js.native
  def glDeleteTextureN(textureUnit:Float, textureId:js.Dynamic):Unit = js.native
  def glBindVAO(vaoId:Float):Unit = js.native
  def glEnable(flags:Float):Unit = js.native
  def tgaLoadHeader(buffer:js.Array[js.Any], bufSize:Float, psInfo:ccImageTGA):Boolean = js.native
  def tgaLoadImageData(buffer:js.Array[js.Any], bufSize:Float, psInfo:ccImageTGA):Boolean = js.native
  def tgaRGBtogreyscale(psInfo:ccImageTGA):Unit = js.native
  def tgaDestroy(psInfo:ccImageTGA):Unit = js.native
  def tgaLoadRLEImageData(buffer:js.Dynamic, bufSize:js.Dynamic, psInfo:js.Dynamic):Boolean = js.native
  def tgaFlipImage(psInfo:ccImageTGA):Unit = js.native
}

@js.native
@JSGlobal("cc.sys")
object ccsys extends js.Object {

  val LANGUAGE_ENGLISH: Float = js.native
  val LANGUAGE_CHINESE: Float = js.native
  val LANGUAGE_FRENCH: Float = js.native
  val LANGUAGE_ITALIAN: Float = js.native
  val LANGUAGE_GERMAN: Float = js.native
  val LANGUAGE_SPANISH: Float = js.native
  val LANGUAGE_DUTCH: Float = js.native
  val LANGUAGE_RUSSIAN: Float = js.native
  val LANGUAGE_KOREAN: Float = js.native
  val LANGUAGE_JAPANESE: Float = js.native
  val LANGUAGE_HUNGARIAN: Float = js.native
  val LANGUAGE_PORTUGUESE: Float = js.native
  val LANGUAGE_ARABIC: Float = js.native
  val LANGUAGE_NORWEGIAN: Float = js.native
  val LANGUAGE_POLISH: Float = js.native
  val LANGUAGE_UNKNOWN: Float = js.native
  val OS_IOS: String = js.native
  val OS_ANDROID: String = js.native
  val OS_WINDOWS: String = js.native
  val OS_MARMALADE: String = js.native
  val OS_LINUX: String = js.native
  val OS_BADA: String = js.native
  val OS_BLACKBERRY: String = js.native
  val OS_OSX: String = js.native
  val OS_WP8: String = js.native
  val OS_WINRT: String = js.native
  val OS_UNKNOWN: String = js.native
  val UNKNOWN: Float = js.native
  val WIN32: Float = js.native
  val LINUX: Float = js.native
  val MACOS: Float = js.native
  val ANDROID: Float = js.native
  val IOS: Float = js.native
  val BLACKBERRY: Float = js.native
  val NACL: Float = js.native
  val EMSCRIPTEN: Float = js.native
  val TIZEN: Float = js.native
  val WINRT: Float = js.native
  val WP8: Float = js.native
  val MOBILE_BROWSER: Float = js.native
  val DESKTOP_BROWSER: Float = js.native
  var isNative: Boolean = js.native
  var isMobile: Boolean = js.native
  var platform: Float = js.native
  var language: String = js.native
  var os: String = js.native
  var osVersion: String = js.native
  var osMainVersion: Float = js.native
  var browserType: String = js.native
  var browserVersion: String = js.native
  var windowPixelResolution: js.Dynamic = js.native
  var localStorage: types.DynObject = js.native
  var capabilities: types.DynObject = js.native
  var openURL: js.Dynamic = js.native
  var now: js.Dynamic = js.native
  def garbageCollect():Unit = js.native
  def dumpRoot():Unit = js.native
  def restartVM():Unit = js.native
  def cleanScript(jsfile:String):Unit = js.native
  def isObjectValid(obj:types.DynObject):Boolean = js.native
  def dump():Unit = js.native
}

