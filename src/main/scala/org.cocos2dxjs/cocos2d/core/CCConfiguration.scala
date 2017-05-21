package org.cocos2dxjs.cocos2d.core

import scalajs.js
import scala.scalajs.js.annotation._


@js.native
trait t_ccconfiguration extends js.Object {
}

@js.native
@JSGlobal("cc.configuration")
class ccconfiguration extends t_ccconfiguration {
}

@js.native
@JSGlobal("cc.configuration")
object ccconfiguration extends js.Object {
  def getMaxTextureSize:Float = js.native
  def getMaxModelviewStackDepth:Float = js.native
  def getMaxTextureUnits:Float = js.native
  def supportsNPOT:Boolean = js.native
  def supportsPVRTC:Boolean = js.native
  def supportsETC:Boolean = js.native
  def supportsS3TC:Boolean = js.native
  def supportsATITC:Boolean = js.native
  def supportsBGRA8888:Boolean = js.native
  def supportsDiscardFramebuffer:Boolean = js.native
  def supportsShareableVAO:Boolean = js.native
  def checkForGLExtension(searchName:String):Unit = js.native
  def getValue(key:String, default_value:String):String = js.native
  def setValue(key:String, value:String):Unit = js.native
  def dumpInfo():Unit = js.native
  def gatherGPUInfo():Unit = js.native
  def loadConfigFile(url:String):Unit = js.native
}


