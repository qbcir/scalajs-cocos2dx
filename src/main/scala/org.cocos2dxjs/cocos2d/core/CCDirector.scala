package org.cocos2dxjs.cocos2d.core

import scalajs.js
import org.cocos2dxjs.core.{Implicits, types}

import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.scenes.ccScene
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, ccEGLView}

@js.native
trait t_ccDirector extends js.Object {
  def calculateDeltaTime():Unit = js.native
  def convertToGL(uiPoint:ccPoint):ccPoint = js.native
  def convertToUI(glPoint:ccPoint):ccPoint = js.native
  def drawScene():Unit = js.native
  def end():Unit = js.native
  def getContentScaleFactor:Float = js.native
  def getNotificationNode:ccNode = js.native
  def getWinSize:ccSize = js.native
  def getWinSizeInPixels:ccSize = js.native
  def getVisibleSize:ccSize = js.native
  def getVisibleOrigin:ccPoint = js.native
  def getZEye:Float = js.native
  def pause():Unit = js.native
  def popScene():Unit = js.native
  def purgeCachedData():Unit = js.native
  def purgeDirector():Unit = js.native
  def pushScene(scene:ccScene):Unit = js.native
  def runScene(scene:ccScene):Unit = js.native
  def resume():Unit = js.native
  def setContentScaleFactor(scaleFactor:Float):Unit = js.native
  def setDepthTest(on:Boolean):Unit = js.native
  def setClearColor(clearColor:ccColor):Unit = js.native
  def setDefaultValues():Unit = js.native
  def setNextDeltaTimeZero(nextDeltaTimeZero:Boolean):Unit = js.native
  def setNextScene():Unit = js.native
  def setNotificationNode(node:ccNode):Unit = js.native
  def getDelegate:ccDirectorDelegate = js.native
  def setDelegate:ccDirectorDelegate = js.native
  def setOpenGLView(openGLView:ccEGLView):Unit = js.native
  def setProjection(projection:Float):Unit = js.native
  def setViewport():Unit = js.native
  def getOpenGLView:ccEGLView = js.native
  def getProjection:Float = js.native
  def setAlphaBlending(on:Boolean):Unit = js.native
  def isSendCleanupToScene:Boolean = js.native
  def getRunningScene:ccScene = js.native
  def getAnimationInterval:Float = js.native
  def isDisplayStats:Boolean = js.native
  def setDisplayStats(displayStats:Boolean):Unit = js.native
  def getSecondsPerFrame:Float = js.native
  def isNextDeltaTimeZero:Boolean = js.native
  def isPaused:Boolean = js.native
  def getTotalFrames:Float = js.native
  def popToRootScene():Unit = js.native
  def popToSceneStackLevel(level:Float):Unit = js.native
  def getScheduler:ccScheduler = js.native
  def setScheduler(scheduler:ccScheduler):Unit = js.native
  def getActionManager:ccActionManager = js.native
  def setActionManager(actionManager:ccActionManager):Unit = js.native
  def getDeltaTime:Float = js.native
  def startAnimation():Unit = js.native
  def mainLoop():Unit = js.native
  def stopAnimation():Unit = js.native
  def setAnimationInterval(value:Float):Unit = js.native
}

@js.native
trait ts_ccDirector extends js.Object {
}

@js.native
@JSGlobal("cc.Director")
class ccDirector extends t_ccDirector {
}

@js.native
@JSGlobal("cc.Director")
object ccDirector extends ts_ccDirector {
  val EVENT_PROJECTION_CHANGED: String = js.native
  val EVENT_AFTER_UPDATE: String = js.native
  val EVENT_AFTER_VISIT: String = js.native
  val EVENT_AFTER_DRAW: String = js.native
  val PROJECTION_2D: Float = js.native
  val PROJECTION_3D: Float = js.native
  val PROJECTION_CUSTOM: Float = js.native
  val PROJECTION_DEFAULT: Float = js.native
}


