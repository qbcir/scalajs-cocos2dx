package org.cocos2dxjs.cocos2d.actions3d

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}

@js.native
trait t_ccWaves3D extends t_ccGrid3DAction {
  def getAmplitude():Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate():Float = js.native
  override def setAmplitudeRate(amplitudeRate:Float):Unit = js.native
  def initWithDuration(duration:Float, gridSize:t_ccSize, waves:Float, amplitude:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
trait ts_ccWaves3D extends ts_ccGrid3DAction {
}

@js.native
@JSGlobal("cc.Waves3D")
class ccWaves3D(duration:Float, gridSize:t_ccSize, waves:Float, amplitude:Float) extends t_ccWaves3D {
}

@js.native
@JSGlobal("cc.Waves3D")
object ccWaves3D extends ts_ccWaves3D {
}

@js.native
trait t_ccFlipX3D extends t_ccGrid3DAction {
  override def initWithDuration(duration:Float):Boolean = js.native
  def initWithSize(gridSize:t_ccSize, duration:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
trait ts_ccFlipX3D extends ts_ccGrid3DAction {
}

@js.native
@JSGlobal("cc.FlipX3D")
class ccFlipX3D(duration:Float) extends t_ccFlipX3D {
}

@js.native
@JSGlobal("cc.FlipX3D")
object ccFlipX3D extends ts_ccFlipX3D {
}

@js.native
trait t_ccFlipY3D extends t_ccFlipX3D {
  override def update(dt:Float):Unit = js.native
}

@js.native
trait ts_ccFlipY3D extends ts_ccFlipX3D {
}

@js.native
@JSGlobal("cc.FlipY3D")
class ccFlipY3D(duration:Float) extends t_ccFlipY3D {
}

@js.native
@JSGlobal("cc.FlipY3D")
object ccFlipY3D extends ts_ccFlipY3D {
}

@js.native
trait t_ccLens3D extends t_ccGrid3DAction {
  def getLensEffect():Float = js.native
  def setLensEffect(lensEffect:Float):Unit = js.native
  def setConcave(concave:Boolean):Unit = js.native
  def getPosition():ccPoint = js.native
  def setPosition(position:t_ccPoint):Unit = js.native
  def initWithDuration(duration:Float, gridSize:t_ccSize, position:t_ccPoint, radius:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
trait ts_ccLens3D extends ts_ccGrid3DAction {
}

@js.native
@JSGlobal("cc.Lens3D")
class ccLens3D(duration:Float, gridSize:t_ccSize, position:t_ccPoint, radius:Float) extends t_ccLens3D {
}

@js.native
@JSGlobal("cc.Lens3D")
object ccLens3D extends ts_ccLens3D {
}

@js.native
trait t_ccRipple3D extends t_ccGrid3DAction {
  def getPosition():ccPoint = js.native
  def setPosition(position:t_ccPoint):Unit = js.native
  def getAmplitude():Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate():Float = js.native
  override def setAmplitudeRate(amplitudeRate:Float):Unit = js.native
  def initWithDuration(duration:Float, gridSize:t_ccSize, position:t_ccPoint, radius:Float, waves:Float, amplitude:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
trait ts_ccRipple3D extends ts_ccGrid3DAction {
}

@js.native
@JSGlobal("cc.Ripple3D")
class ccRipple3D(duration:Float, gridSize:t_ccSize, position:t_ccPoint, radius:Float, waves:Float, amplitude:Float) extends t_ccRipple3D {
}

@js.native
@JSGlobal("cc.Ripple3D")
object ccRipple3D extends ts_ccRipple3D {
}

@js.native
trait t_ccShaky3D extends t_ccGrid3DAction {
  def initWithDuration(duration:Float, gridSize:t_ccSize, range:Float, shakeZ:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
trait ts_ccShaky3D extends ts_ccGrid3DAction {
}

@js.native
@JSGlobal("cc.Shaky3D")
class ccShaky3D(duration:Float, gridSize:t_ccSize, range:Float, shakeZ:Boolean) extends t_ccShaky3D {
}

@js.native
@JSGlobal("cc.Shaky3D")
object ccShaky3D extends ts_ccShaky3D {
}

@js.native
trait t_ccLiquid extends t_ccGrid3DAction {
  def getAmplitude():Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate():Float = js.native
  override def setAmplitudeRate(amplitudeRate:Float):Unit = js.native
  def initWithDuration(duration:Float, gridSize:t_ccSize, waves:Float, amplitude:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
trait ts_ccLiquid extends ts_ccGrid3DAction {
}

@js.native
@JSGlobal("cc.Liquid")
class ccLiquid(duration:Float, gridSize:t_ccSize, waves:Float, amplitude:Float) extends t_ccLiquid {
}

@js.native
@JSGlobal("cc.Liquid")
object ccLiquid extends ts_ccLiquid {
}

@js.native
trait t_ccWaves extends t_ccGrid3DAction {
  def getAmplitude():Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate():Float = js.native
  override def setAmplitudeRate(amplitudeRate:Float):Unit = js.native
  def initWithDuration(duration:Float, gridSize:t_ccSize, waves:Float, amplitude:Float, horizontal:Boolean, vertical:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
trait ts_ccWaves extends ts_ccGrid3DAction {
}

@js.native
@JSGlobal("cc.Waves")
class ccWaves(duration:Float, gridSize:t_ccSize, waves:Float, amplitude:Float, horizontal:Boolean, vertical:Boolean) extends t_ccWaves {
}

@js.native
@JSGlobal("cc.Waves")
object ccWaves extends ts_ccWaves {
}

@js.native
trait t_ccTwirl extends t_ccGrid3DAction {
  def getPosition():ccPoint = js.native
  def setPosition(position:t_ccPoint):Unit = js.native
  def getAmplitude():Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate():Float = js.native
  override def setAmplitudeRate(amplitudeRate:Float):Unit = js.native
  def initWithDuration():Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
trait ts_ccTwirl extends ts_ccGrid3DAction {
}

@js.native
@JSGlobal("cc.Twirl")
class ccTwirl(duration:Float, gridSize:t_ccSize, position:t_ccPoint, twirls:Float, amplitude:Float) extends t_ccTwirl {
}

@js.native
@JSGlobal("cc.Twirl")
object ccTwirl extends ts_ccTwirl {
}


