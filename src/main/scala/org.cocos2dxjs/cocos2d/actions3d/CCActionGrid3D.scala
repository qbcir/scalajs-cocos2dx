package org.cocos2dxjs.cocos2d.actions3d

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint

@js.native
@JSGlobal("cc.Waves3D")
class ccWaves3D extends ccGrid3DAction {
  def getAmplitude:Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate:Float = js.native
  override def setAmplitudeRate(amplitudeRate:Float):Unit = js.native
  def initWithDuration(duration:Float, gridSize:ccSize, waves:Float, amplitude:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.FlipX3D")
class ccFlipX3D extends ccGrid3DAction {
  override def initWithDuration(duration:Float):Boolean = js.native
  def initWithSize(gridSize:ccSize, duration:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.FlipY3D")
class ccFlipY3D extends ccFlipX3D {
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.Lens3D")
class ccLens3D extends ccGrid3DAction {
  def getLensEffect:Float = js.native
  def setLensEffect(lensEffect:Float):Unit = js.native
  def setConcave(concave:Boolean):Unit = js.native
  def getPosition:ccPoint = js.native
  def setPosition(position:ccPoint):Unit = js.native
  def initWithDuration(duration:Float, gridSize:ccSize, position:ccPoint, radius:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.Ripple3D")
class ccRipple3D extends ccGrid3DAction {
  def getPosition:ccPoint = js.native
  def setPosition(position:ccPoint):Unit = js.native
  def getAmplitude:Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate:Float = js.native
  override def setAmplitudeRate(amplitudeRate:Float):Unit = js.native
  def initWithDuration(duration:Float, gridSize:ccSize, position:ccPoint, radius:Float, waves:Float, amplitude:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.Shaky3D")
class ccShaky3D extends ccGrid3DAction {
  def initWithDuration(duration:Float, gridSize:ccSize, range:Float, shakeZ:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.Liquid")
class ccLiquid extends ccGrid3DAction {
  def getAmplitude:Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate:Float = js.native
  override def setAmplitudeRate(amplitudeRate:Float):Unit = js.native
  def initWithDuration(duration:Float, gridSize:ccSize, waves:Float, amplitude:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.Waves")
class ccWaves extends ccGrid3DAction {
  def getAmplitude:Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate:Float = js.native
  override def setAmplitudeRate(amplitudeRate:Float):Unit = js.native
  def initWithDuration(duration:Float, gridSize:ccSize, waves:Float, amplitude:Float, horizontal:Boolean, vertical:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.Twirl")
class ccTwirl extends ccGrid3DAction {
  def getPosition:ccPoint = js.native
  def setPosition(position:ccPoint):Unit = js.native
  def getAmplitude:Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate:Float = js.native
  override def setAmplitudeRate(amplitudeRate:Float):Unit = js.native
  def initWithDuration():Unit = js.native
  override def update(dt:Float):Unit = js.native
}

