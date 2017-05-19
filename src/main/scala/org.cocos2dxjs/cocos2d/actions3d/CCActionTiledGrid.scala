package org.cocos2dxjs.cocos2d.actions3d

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode

@js.native
@JSGlobal("cc.ShakyTiles3D")
class ccShakyTiles3D extends ccTiledGrid3DAction {
  def initWithDuration(duration:Float, gridSize:ccSize, range:Float, shakeZ:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.ShatteredTiles3D")
class ccShatteredTiles3D extends ccTiledGrid3DAction {
  def initWithDuration(duration:Float, gridSize:ccSize, range:Float, shatterZ:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.Tile")
class ccTile extends js.Object {
}

@js.native
@JSGlobal("cc.ShuffleTiles")
class ccShuffleTiles extends ccTiledGrid3DAction {
  def initWithDuration(duration:Float, gridSize:ccSize, seed:Float):Boolean = js.native
  def shuffle(array:js.Array[js.Any], len:Float):Unit = js.native
  def getDelta(pos:ccSize):Unit = js.native
  def placeTile(pos:ccPoint, tile:ccTile):Unit = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.FadeOutTRTiles")
class ccFadeOutTRTiles extends ccTiledGrid3DAction {
  def testFunc(pos:ccPoint, time:Float):Unit = js.native
  def turnOnTile(pos:ccPoint):Unit = js.native
  def turnOffTile(pos:ccPoint):Unit = js.native
  def transformTile(pos:ccPoint, distance:Float):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.FadeOutBLTiles")
class ccFadeOutBLTiles extends ccFadeOutTRTiles {
  override def testFunc(pos:ccPoint, time:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.FadeOutUpTiles")
class ccFadeOutUpTiles extends ccFadeOutTRTiles {
  override def testFunc(pos:ccPoint, time:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.FadeOutDownTiles")
class ccFadeOutDownTiles extends ccFadeOutUpTiles {
  override def testFunc(pos:ccPoint, time:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.TurnOffTiles")
class ccTurnOffTiles extends ccTiledGrid3DAction {
  def initWithDuration(duration:Float, gridSize:ccSize, seed:Float):Boolean = js.native
  def shuffle(array:js.Array[js.Any], len:Float):Unit = js.native
  def turnOnTile(pos:ccPoint):Unit = js.native
  def turnOffTile(pos:ccPoint):Unit = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.WavesTiles3D")
class ccWavesTiles3D extends ccTiledGrid3DAction {
  def getAmplitude:Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate:Float = js.native
  override def setAmplitudeRate(amplitudeRate:Float):Unit = js.native
  def initWithDuration(duration:Float, gridSize:ccSize, waves:Float, amplitude:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.JumpTiles3D")
class ccJumpTiles3D extends ccTiledGrid3DAction {
  def getAmplitude:Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate:Float = js.native
  def setAmplitudeRate(amplitudeRate:js.Any):Unit = js.native
  def initWithDuration(duration:Float, gridSize:ccSize, numberOfJumps:Float, amplitude:Float):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.SplitRows")
class ccSplitRows extends ccTiledGrid3DAction {
  def initWithDuration(duration:Float, rows:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.SplitCols")
class ccSplitCols extends ccTiledGrid3DAction {
  def initWithDuration(duration:Float, cols:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
}

