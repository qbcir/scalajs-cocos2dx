package org.cocos2dxjs.cocos2d.core.basenodes

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.ccActionManager
import org.cocos2dxjs.cocos2d.core.ccScheduler
import org.cocos2dxjs.cocos2d.effects.ccGridBase
import org.cocos2dxjs.cocos2d.shaders.ccGLProgram
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.actions.ccAction
import org.cocos2dxjs.cocos2d.core.cocoa.ccAffineTransform
import org.cocos2dxjs.cocos2d.core.eventmanager.ccTouch
import org.cocos2dxjs.extensions.cocostudio.components.ccComponent
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass

@js.native
trait t_ccNode extends t_ccClass {
  def init:Boolean = js.native
  def attr(attrs:js.Object):Unit = js.native
  def getSkewX:Float = js.native
  def setSkewX(newSkewX:Float):Unit = js.native
  def getSkewY:Float = js.native
  def setSkewY(newSkewY:Float):Unit = js.native
  def setLocalZOrder(localZOrder:Float):Unit = js.native
  def getLocalZOrder:Float = js.native
  def setGlobalZOrder(globalZOrder:Float):Unit = js.native
  def getGlobalZOrder:Float = js.native
  def getVertexZ:Float = js.native
  def setVertexZ(Var:Float):Unit = js.native
  def getRotation:Float = js.native
  def setRotation(newRotation:Float):Unit = js.native
  def getRotationX:Float = js.native
  def setRotationX(rotationX:Float):Unit = js.native
  def getRotationY:Float = js.native
  def setRotationY(rotationY:js.Any):Unit = js.native
  def getScale:Float = js.native
  def setScale(scale:Float, scaleY:Float):Unit = js.native
  def getScaleX:Float = js.native
  def setScaleX(newScaleX:Float):Unit = js.native
  def getScaleY:Float = js.native
  def setScaleY(newScaleY:Float):Unit = js.native
  def setPosition(newPosOrxValue:ccPoint, yValue:Float):Unit = js.native
  def setNormalizedPosition(posOrX:ccPoint, y:Float):Unit = js.native
  def getPosition:ccPoint = js.native
  def getNormalizedPosition:ccPoint = js.native
  def getPositionX:Float = js.native
  def setPositionX(x:Float):Unit = js.native
  def getPositionY:Float = js.native
  def setPositionY(y:Float):Unit = js.native
  def getChildrenCount:Float = js.native
  def getChildren:js.Array[js.Any] = js.native
  def isVisible:Boolean = js.native
  def setVisible(visible:Boolean):Unit = js.native
  def getAnchorPoint:ccPoint = js.native
  def setAnchorPoint(point:ccPoint, y:Float):Unit = js.native
  def getAnchorPointInPoints:ccPoint = js.native
  def getContentSize:ccSize = js.native
  def setContentSize(size:ccSize, height:Float):Unit = js.native
  def isRunning:Boolean = js.native
  def getParent:ccNode = js.native
  def setParent(parent:ccNode):Unit = js.native
  def isIgnoreAnchorPointForPosition:Boolean = js.native
  def ignoreAnchorPointForPosition(newValue:Boolean):Unit = js.native
  def getTag:Float = js.native
  def setTag(tag:Float):Unit = js.native
  def setName(name:String):Unit = js.native
  def getName:String = js.native
  def getUserData:js.Object = js.native
  def setUserData(Var:js.Object):Unit = js.native
  def getUserObject:js.Object = js.native
  def setUserObject(newValue:js.Object):Unit = js.native
  def getOrderOfArrival:Float = js.native
  def setOrderOfArrival(Var:Float):Unit = js.native
  def getActionManager:ccActionManager = js.native
  def setActionManager(actionManager:ccActionManager):Unit = js.native
  def getScheduler:ccScheduler = js.native
  def setScheduler(scheduler:js.Any):Unit = js.native
  def getBoundingBox:ccRect = js.native
  def cleanup():Unit = js.native
  def getChildByTag(aTag:Float):ccNode = js.native
  def getChildByName(name:String):ccNode = js.native
  def addChild(child:ccNode, localZOrder:Float, tag:Float):Unit = js.native
  def removeFromParent(cleanup:Boolean):Unit = js.native
  def removeChild(child:ccNode, cleanup:Boolean):Unit = js.native
  def removeChildByTag(tag:Float, cleanup:Boolean):Unit = js.native
  def removeAllChildrenWithCleanup(cleanup:Boolean):Unit = js.native
  def removeAllChildren(cleanup:Boolean):Unit = js.native
  def reorderChild(child:ccNode, zOrder:Float):Unit = js.native
  def sortAllChildren():Unit = js.native
  def draw(ctx:js.Any):Unit = js.native
  def onEnter():Unit = js.native
  def onEnterTransitionDidFinish():Unit = js.native
  def onExitTransitionDidStart():Unit = js.native
  def onExit():Unit = js.native
  def runAction(action:ccAction):ccAction = js.native
  def stopAllActions():Unit = js.native
  def stopAction(action:ccAction):Unit = js.native
  def stopActionByTag(tag:Float):Unit = js.native
  def getActionByTag(tag:Float):ccAction = js.native
  def getNumberOfRunningActions:Float = js.native
  def scheduleUpdate():Unit = js.native
  def scheduleUpdateWithPriority(priority:Float):Unit = js.native
  def unscheduleUpdate():Unit = js.native
  def schedule(callback:js.Function, interval:Float, repeat:Float, delay:Float, key:String):Unit = js.native
  def scheduleOnce(callback:js.Function, delay:Float, key:String):Unit = js.native
  def unschedule(callback_fn:js.Function):Unit = js.native
  def unscheduleAllCallbacks():Unit = js.native
  def resume():Unit = js.native
  def pause():Unit = js.native
  def setAdditionalTransform(additionalTransform:ccAffineTransform):Unit = js.native
  def getParentToNodeTransform:ccAffineTransform = js.native
  def getNodeToWorldTransform:ccAffineTransform = js.native
  def getWorldToNodeTransform:ccAffineTransform = js.native
  def convertToNodeSpace(worldPoint:ccPoint):ccPoint = js.native
  def convertToWorldSpace(nodePoint:ccPoint):ccPoint = js.native
  def convertToNodeSpaceAR(worldPoint:ccPoint):ccPoint = js.native
  def convertToWorldSpaceAR(nodePoint:ccPoint):ccPoint = js.native
  def convertTouchToNodeSpace(touch:ccTouch):ccPoint = js.native
  def convertTouchToNodeSpaceAR(touch:ccTouch):ccPoint = js.native
  def update(dt:Float):Unit = js.native
  def updateTransform():Unit = js.native
  def retain():Unit = js.native
  def release():Unit = js.native
  def getComponent(name:String):ccComponent = js.native
  def addComponent(component:ccComponent):Unit = js.native
  def removeComponent(component:String):Unit = js.native
  def removeAllComponents():Unit = js.native
  def visit(parent:ccNode):Unit = js.native
  def transform(parentCmd:js.Any/*ccNodeRenderCmd*/, recursive:Boolean):Unit = js.native
  def getNodeToParentTransform:ccAffineTransform = js.native
  def getShaderProgram:ccGLProgram = js.native
  def setShaderProgram(newShaderProgram:ccGLProgram):Unit = js.native
  def getBoundingBoxToWorld:ccRect = js.native
  def getOpacity:Float = js.native
  def getDisplayedOpacity:Float = js.native
  def setOpacity(opacity:Float):Unit = js.native
  def updateDisplayedOpacity(parentOpacity:Float):Unit = js.native
  def isCascadeOpacityEnabled:Boolean = js.native
  def setCascadeOpacityEnabled(cascadeOpacityEnabled:Boolean):Unit = js.native
  def getColor:ccColor = js.native
  def getDisplayedColor:ccColor = js.native
  def setColor(color:ccColor):Unit = js.native
  def updateDisplayedColor(parentColor:ccColor):Unit = js.native
  def isCascadeColorEnabled:Boolean = js.native
  def setCascadeColorEnabled(cascadeColorEnabled:Boolean):Unit = js.native
  def setOpacityModifyRGB(opacityValue:Boolean):Unit = js.native
  def isOpacityModifyRGB:Boolean = js.native
  def enumerateChildren(name:js.Any, callback:js.Any):Unit = js.native
}

@js.native
@JSGlobal("cc.Node")
class ccNode extends t_ccNode {
}

@js.native
@JSGlobal("cc.Node")
object ccNode extends js.Object {
}

