package org.cocos2dxjs.extensions.cocostudio.components

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.extensions.cocostudio.t_ccsComponent

@js.native
trait t_ccsComAudio extends t_ccsComponent {
  def init:Boolean = js.native
  def onExit():Unit = js.native
  def end():Unit = js.native
  def preloadBackgroundMusic(pszFilePath:String):Unit = js.native
  def playBackgroundMusic(pszFilePath:String, loop:Boolean):Unit = js.native
  def stopBackgroundMusic(releaseData:String):Unit = js.native
  def pauseBackgroundMusic():Unit = js.native
  def resumeBackgroundMusic():Unit = js.native
  def rewindBackgroundMusic():Unit = js.native
  def willPlayBackgroundMusic:Boolean = js.native
  def isBackgroundMusicPlaying:Boolean = js.native
  def getBackgroundMusicVolume:Float = js.native
  def setBackgroundMusicVolume(volume:Float):Unit = js.native
  def getEffectsVolume:Float = js.native
  def setEffectsVolume(volume:Float):Unit = js.native
  def playEffect(pszFilePath:String, loop:Boolean):Boolean = js.native
  def pauseEffect(soundId:Float):Unit = js.native
  def pauseAllEffects():Unit = js.native
  def resumeEffect(soundId:Float):Unit = js.native
  def resumeAllEffects():Unit = js.native
  def stopEffect(soundId:Float):Unit = js.native
  def stopAllEffects():Unit = js.native
  def preloadEffect(pszFilePath:String):Unit = js.native
  def unloadEffect(pszFilePath:String):Unit = js.native
  def setFile(pszFilePath:String):Unit = js.native
  def setLoop(loop:Boolean):Unit = js.native
  def getFile:String = js.native
  def isLoop:Boolean = js.native
}

@js.native
@JSGlobal("ccs.ComAudio")
class ccsComAudio extends t_ccsComAudio {
}

@js.native
@JSGlobal("ccs.ComAudio")
object ccsComAudio extends js.Object {
}


