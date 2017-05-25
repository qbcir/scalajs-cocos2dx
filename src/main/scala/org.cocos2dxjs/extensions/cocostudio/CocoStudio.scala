package org.cocos2dxjs.extensions.cocostudio

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccsClass extends js.Object {
}

@js.native
trait ts_ccsClass extends js.Object {
}

@js.native
@JSGlobal("ccs.Class")
class ccsClass() extends t_ccsClass {
}

@js.native
@JSGlobal("ccs.Class")
object ccsClass extends ts_ccsClass {
}

@js.native
trait t_ccsNode extends t_ccsClass {
}

@js.native
trait ts_ccsNode extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.Node")
class ccsNode() extends t_ccsNode {
}

@js.native
@JSGlobal("ccs.Node")
object ccsNode extends ts_ccsNode {
}

@js.native
trait t_ccsSprite extends t_ccsClass {
}

@js.native
trait ts_ccsSprite extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.Sprite")
class ccsSprite() extends t_ccsSprite {
}

@js.native
@JSGlobal("ccs.Sprite")
object ccsSprite extends ts_ccsSprite {
}

@js.native
trait t_ccsComponent extends t_ccsClass {
}

@js.native
trait ts_ccsComponent extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.Component")
class ccsComponent() extends t_ccsComponent {
}

@js.native
@JSGlobal("ccs.Component")
object ccsComponent extends ts_ccsComponent {
}


@js.native
@JSGlobal("ccs")
object ccs extends js.Object {

  val cocostudioVersion: String = js.native
  val FRAME_TYPE_MOVE: Float = js.native
  val FRAME_TYPE_SCALE: Float = js.native
  val FRAME_TYPE_ROTATE: Float = js.native
  val FRAME_TYPE_TINT: Float = js.native
  val FRAME_TYPE_FADE: Float = js.native
  val FRAME_TYPE_MAX: Float = js.native
  val FrameEaseType: types.DynObject = js.native
  val MovementEventType: types.DynObject = js.native
  val ANIMATION_TYPE_SINGLE_FRAME: Float = js.native
  val ANIMATION_TYPE_NO_LOOP: Float = js.native
  val ANIMATION_TYPE_TO_LOOP_FRONT: Float = js.native
  val ANIMATION_TYPE_TO_LOOP_BACK: Float = js.native
  val ANIMATION_TYPE_LOOP_FRONT: Float = js.native
  val ANIMATION_TYPE_LOOP_BACK: Float = js.native
  val ANIMATION_TYPE_MAX: Float = js.native
  val BLEND_TYPE_NORMAL: Float = js.native
  val BLEND_TYPE_LAYER: Float = js.native
  val BLEND_TYPE_DARKEN: Float = js.native
  val BLEND_TYPE_MULTIPLY: Float = js.native
  val BLEND_TYPE_LIGHTEN: Float = js.native
  val BLEND_TYPE_SCREEN: Float = js.native
  val BLEND_TYPE_OVERLAY: Float = js.native
  val BLEND_TYPE_HIGHLIGHT: Float = js.native
  val BLEND_TYPE_ADD: Float = js.native
  val BLEND_TYPE_SUBTRACT: Float = js.native
  val BLEND_TYPE_DIFFERENCE: Float = js.native
  val BLEND_TYPE_INVERT: Float = js.native
  val BLEND_TYPE_ALPHA: Float = js.native
  val BLEND_TYPE_ERASE: Float = js.native
  val DISPLAY_TYPE_SPRITE: Float = js.native
  val DISPLAY_TYPE_ARMATURE: Float = js.native
  val DISPLAY_TYPE_PARTICLE: Float = js.native
  var displayFactory: js.Dynamic = js.native
  var PT_RATIO: js.Dynamic = js.native
  var VERSION_COMBINED: js.Dynamic = js.native
  var CONST_VERSION: js.Dynamic = js.native
  var TweenType: types.DynObject = js.native
  def armatureVersion():String = js.native
  def load(file:String, path:String):types.DynObject = js.native
  def loadWithVisibleSize(file:String, path:String):types.DynObject = js.native
  def sendEvent(event:Float):Unit = js.native
  def registerTriggerClass(className:String, func:js.Function):Unit = js.native
}

