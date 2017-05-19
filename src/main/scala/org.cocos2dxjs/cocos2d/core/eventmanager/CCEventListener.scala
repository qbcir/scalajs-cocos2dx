package org.cocos2dxjs.cocos2d.core.eventmanager

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.ccClass

@js.native
@JSGlobal("cc.EventListener")
class ccEventListener extends ccClass {
  def _setPaused(paused:Boolean):Unit = js.native
  def _isPaused:Boolean = js.native
  def _setRegistered(registered:Boolean):Unit = js.native
  def _isRegistered:Boolean = js.native
  def _getType:Float = js.native
  def _getListenerID:String = js.native
  def _setFixedPriority(fixedPriority:Float):Unit = js.native
  def _getFixedPriority:Float = js.native
  def _setSceneGraphPriority(node:ccNode):Unit = js.native
  def _getSceneGraphPriority:ccNode = js.native
  def checkAvailable:Boolean = js.native
  override def clone:ccEventListener = js.native
  def setEnabled(enabled:Boolean):Unit = js.native
  def isEnabled:Boolean = js.native
  def retain():Unit = js.native
  def release():Unit = js.native
  def create(argObj:js.Object):ccEventListener = js.native
}

