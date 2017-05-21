package org.cocos2dxjs.cocos2d.actions3d

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode

@js.native
trait t_ccShakyTiles3D extends t_ccTiledGrid3DAction {
  def initWithDuration(duration:Float, gridSize:ccSize, range:Float, shakeZ:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.ShakyTiles3D")
class ccShakyTiles3D(duration:Float, gridSize:ccSize, range:Float, shakeZ:Boolean) extends t_ccShakyTiles3D {
}

@js.native
@JSGlobal("cc.ShakyTiles3D")
object ccShakyTiles3D extends js.Object {
}

@js.native
trait t_ccShatteredTiles3D extends t_ccTiledGrid3DAction {
  def initWithDuration(duration:Float, gridSize:ccSize, range:Float, shatterZ:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.ShatteredTiles3D")
class ccShatteredTiles3D(duration:Float, gridSize:ccSize, range:Float, shatterZ:Boolean) extends t_ccShatteredTiles3D {
}

@js.native
@JSGlobal("cc.ShatteredTiles3D")
object ccShatteredTiles3D extends js.Object {
}

@js.native
trait t_ccTile extends js.Object {
}

@js.native
@JSGlobal("cc.Tile")
class ccTile(position:ccPoint, startPosition:ccPoint, delta:ccSize) extends t_ccTile {
}

@js.native
@JSGlobal("cc.Tile")
object ccTile extends js.Object {
}

@js.native
trait t_ccShuffleTiles extends t_ccTiledGrid3DAction {
  def initWithDuration(duration:Float, gridSize:ccSize, seed:Float):Boolean = js.native
  def shuffle(array:js.Array[js.Any], len:Float):Unit = js.native
  def getDelta(pos:ccSize):Unit = js.native
  def placeTile(pos:ccPoint, tile:ccTile):Unit = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.ShuffleTiles")
class ccShuffleTiles(duration:Float, gridSize:ccSize, seed:Float) extends t_ccShuffleTiles {
}

@js.native
@JSGlobal("cc.ShuffleTiles")
object ccShuffleTiles extends js.Object {
}

@js.native
trait t_ccFadeOutTRTiles extends t_ccTiledGrid3DAction {
  def testFunc(pos:ccPoint, time:Float):Unit = js.native
  def turnOnTile(pos:ccPoint):Unit = js.native
  def turnOffTile(pos:ccPoint):Unit = js.native
  def transformTile(pos:ccPoint, distance:Float):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.FadeOutTRTiles")
class ccFadeOutTRTiles extends t_ccFadeOutTRTiles {
}

@js.native
@JSGlobal("cc.FadeOutTRTiles")
object ccFadeOutTRTiles extends js.Object {
}

@js.native
trait t_ccFadeOutBLTiles extends t_ccFadeOutTRTiles {
  override def testFunc(pos:ccPoint, time:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.FadeOutBLTiles")
class ccFadeOutBLTiles extends t_ccFadeOutBLTiles {
}

@js.native
@JSGlobal("cc.FadeOutBLTiles")
object ccFadeOutBLTiles extends js.Object {
}

@js.native
trait t_ccFadeOutUpTiles extends t_ccFadeOutTRTiles {
  override def testFunc(pos:ccPoint, time:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.FadeOutUpTiles")
class ccFadeOutUpTiles extends t_ccFadeOutUpTiles {
}

@js.native
@JSGlobal("cc.FadeOutUpTiles")
object ccFadeOutUpTiles extends js.Object {
}

@js.native
trait t_ccFadeOutDownTiles extends t_ccFadeOutUpTiles {
  override def testFunc(pos:ccPoint, time:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.FadeOutDownTiles")
class ccFadeOutDownTiles extends t_ccFadeOutDownTiles {
}

@js.native
@JSGlobal("cc.FadeOutDownTiles")
object ccFadeOutDownTiles extends js.Object {
}

@js.native
trait t_ccTurnOffTiles extends t_ccTiledGrid3DAction {
  def initWithDuration(duration:Float, gridSize:ccSize, seed:Float):Boolean = js.native
  def shuffle(array:js.Array[js.Any], len:Float):Unit = js.native
  def turnOnTile(pos:ccPoint):Unit = js.native
  def turnOffTile(pos:ccPoint):Unit = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.TurnOffTiles")
class ccTurnOffTiles(duration:Float, gridSize:ccSize, seed:Float) extends t_ccTurnOffTiles {
}

@js.native
@JSGlobal("cc.TurnOffTiles")
object ccTurnOffTiles extends js.Object {
}

@js.native
trait t_ccWavesTiles3D extends t_ccTiledGrid3DAction {
  def getAmplitude:Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate:Float = js.native
  override def setAmplitudeRate(amplitudeRate:Float):Unit = js.native
  def initWithDuration(duration:Float, gridSize:ccSize, waves:Float, amplitude:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.WavesTiles3D")
class ccWavesTiles3D(duration:Float, gridSize:ccSize, waves:Float, amplitude:Float) extends t_ccWavesTiles3D {
}

@js.native
@JSGlobal("cc.WavesTiles3D")
object ccWavesTiles3D extends js.Object {
}

@js.native
trait t_ccJumpTiles3D extends t_ccTiledGrid3DAction {
  def getAmplitude:Float = js.native
  def setAmplitude(amplitude:Float):Unit = js.native
  override def getAmplitudeRate:Float = js.native
  def setAmplitudeRate(amplitudeRate:js.Any):Unit = js.native
  def initWithDuration(duration:Float, gridSize:ccSize, numberOfJumps:Float, amplitude:Float):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.JumpTiles3D")
class ccJumpTiles3D(duration:Float, gridSize:ccSize, numberOfJumps:Float, amplitude:Float) extends t_ccJumpTiles3D {
}

@js.native
@JSGlobal("cc.JumpTiles3D")
object ccJumpTiles3D extends js.Object {
}

@js.native
trait t_ccSplitRows extends t_ccTiledGrid3DAction {
  def initWithDuration(duration:Float, rows:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.SplitRows")
class ccSplitRows(duration:Float, rows:Float) extends t_ccSplitRows {
}

@js.native
@JSGlobal("cc.SplitRows")
object ccSplitRows extends js.Object {
}

@js.native
trait t_ccSplitCols extends t_ccTiledGrid3DAction {
  def initWithDuration(duration:Float, cols:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.SplitCols")
class ccSplitCols(duration:Float, cols:Float) extends t_ccSplitCols {
}

@js.native
@JSGlobal("cc.SplitCols")
object ccSplitCols extends js.Object {
}


