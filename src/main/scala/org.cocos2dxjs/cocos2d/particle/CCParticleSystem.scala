package org.cocos2dxjs.cocos2d.particle

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.sprites.ccSpriteBatchNode
import org.cocos2dxjs.cocos2d.core.textures.ccTexture2D
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.platform.ccBlendFunc
import org.cocos2dxjs.cocos2d.core.sprites.ccSpriteFrame
import org.cocos2dxjs.cocos2d.core.platform.ccClass
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode

@js.native
trait t_ccParticle extends js.Object {
}

@js.native
@JSGlobal("cc.Particle")
class ccParticle(pos:ccPoint, startPos:ccPoint, color:ccColor, deltaColor:ccColor, size:ccSize, deltaSize:ccSize, rotation:Float, deltaRotation:Float, timeToLive:Float, atlasIndex:Float, modeA:ccParticleModeA, modeB:ccParticleModeA) extends t_ccParticle {
}

@js.native
@JSGlobal("cc.Particle")
object ccParticle extends js.Object {
  var TemporaryPoints: js.Any = js.native
}

@js.native
trait t_ccParticleModeA extends js.Object {
}

@js.native
@JSGlobal("cc.Particle.ModeA")
class ccParticleModeA(dir:ccPoint, radialAccel:Float, tangentialAccel:Float) extends t_ccParticleModeA {
}

@js.native
@JSGlobal("cc.Particle.ModeA")
object ccParticleModeA extends js.Object {
}

@js.native
trait t_ccParticleModeB extends js.Object {
}

@js.native
@JSGlobal("cc.Particle.ModeB")
class ccParticleModeB(angle:Float, degreesPerSecond:Float, radius:Float, deltaRadius:Float) extends t_ccParticleModeB {
}

@js.native
@JSGlobal("cc.Particle.ModeB")
object ccParticleModeB extends js.Object {
}

@js.native
trait t_ccParticleSystem extends t_ccNode {
  var batchNode: ccSpriteBatchNode = js.native
  val active: Boolean = js.native
  var shapeType: Float = js.native
  var atlasIndex: Float = js.native
  var particleCount: Float = js.native
  var duration: Float = js.native
  var sourcePos: ccPoint = js.native
  var posVar: ccPoint = js.native
  var life: Float = js.native
  var lifeVar: Float = js.native
  var angle: Float = js.native
  var angleVar: Float = js.native
  var startSize: Float = js.native
  var startSizeVar: Float = js.native
  var endSize: Float = js.native
  var endSizeVar: Float = js.native
  var startSpin: Float = js.native
  var startSpinVar: Float = js.native
  var endSpin: Float = js.native
  var endSpinVar: Float = js.native
  var gravity: ccPoint = js.native
  var speed: ccPoint = js.native
  var speedVar: ccPoint = js.native
  var tangentialAccel: Float = js.native
  var tangentialAccelVar: Float = js.native
  var rotationIsDir: Boolean = js.native
  var startRadius: Float = js.native
  var startRadiusVar: Float = js.native
  var endRadius: Float = js.native
  var endRadiusVar: Float = js.native
  var rotatePerS: Float = js.native
  var rotatePerSVar: Float = js.native
  var startColor: ccColor = js.native
  var startColorVar: ccColor = js.native
  var endColor: ccColor = js.native
  var endColorVar: ccColor = js.native
  var emissionRate: Float = js.native
  var emitterMode: Float = js.native
  var positionType: Float = js.native
  var totalParticles: Float = js.native
  var autoRemoveOnFinish: Boolean = js.native
  var texture: ccTexture2D = js.native
  def ignoreColor(ignore:Boolean):Unit = js.native
  def initTexCoordsWithRect(pointRect:ccRect):Unit = js.native
  def getBatchNode:ccParticleBatchNode = js.native
  def setBatchNode(batchNode:ccParticleBatchNode):Unit = js.native
  def getAtlasIndex:Float = js.native
  def setAtlasIndex(atlasIndex:Float):Unit = js.native
  def getDrawMode:Float = js.native
  def setDrawMode(drawMode:Float):Unit = js.native
  def getShapeType:Float = js.native
  def setShapeType(shapeType:Float):Unit = js.native
  def isActive:Boolean = js.native
  def getParticleCount:Float = js.native
  def setParticleCount(particleCount:Float):Unit = js.native
  def getDuration:Float = js.native
  def setDuration(duration:Float):Unit = js.native
  def getSourcePosition:ccPoint = js.native
  def setSourcePosition(sourcePosition:js.Any):Unit = js.native
  def getPosVar:ccPoint = js.native
  def setPosVar(posVar:ccPoint):Unit = js.native
  def getLife:Float = js.native
  def setLife(life:Float):Unit = js.native
  def getLifeVar:Float = js.native
  def setLifeVar(lifeVar:Float):Unit = js.native
  def getAngle:Float = js.native
  def setAngle(angle:Float):Unit = js.native
  def getAngleVar:Float = js.native
  def setAngleVar(angleVar:js.Any):Unit = js.native
  def getGravity:ccPoint = js.native
  def setGravity(gravity:ccPoint):Unit = js.native
  def getSpeed:Float = js.native
  def setSpeed(speed:Float):Unit = js.native
  def getSpeedVar:Float = js.native
  def setSpeedVar(speedVar:Float):Unit = js.native
  def getTangentialAccel:Float = js.native
  def setTangentialAccel(tangentialAccel:Float):Unit = js.native
  def getTangentialAccelVar:Float = js.native
  def setTangentialAccelVar(tangentialAccelVar:Float):Unit = js.native
  def getRadialAccel:Float = js.native
  def setRadialAccel(radialAccel:Float):Unit = js.native
  def getRadialAccelVar:Float = js.native
  def setRadialAccelVar(radialAccelVar:Float):Unit = js.native
  def getRotationIsDir:Boolean = js.native
  def setRotationIsDir(t:Boolean):Unit = js.native
  def getStartRadius:Float = js.native
  def setStartRadius(startRadius:Float):Unit = js.native
  def getStartRadiusVar:Float = js.native
  def setStartRadiusVar(startRadiusVar:Float):Unit = js.native
  def getEndRadius:Float = js.native
  def setEndRadius(endRadius:Float):Unit = js.native
  def getEndRadiusVar:Float = js.native
  def setEndRadiusVar(endRadiusVar:js.Any):Unit = js.native
  def getRotatePerSecond:Float = js.native
  def setRotatePerSecond(degrees:Float):Unit = js.native
  def getRotatePerSecondVar:Float = js.native
  def setRotatePerSecondVar(degrees:js.Any):Unit = js.native
  def getStartSize:Float = js.native
  def setStartSize(startSize:Float):Unit = js.native
  def getStartSizeVar:Float = js.native
  def setStartSizeVar(startSizeVar:Float):Unit = js.native
  def getEndSize:Float = js.native
  def setEndSize(endSize:js.Any):Unit = js.native
  def getEndSizeVar:Float = js.native
  def setEndSizeVar(endSizeVar:Float):Unit = js.native
  def getStartColor:ccColor = js.native
  def setStartColor(startColor:ccColor):Unit = js.native
  def getStartColorVar:ccColor = js.native
  def setStartColorVar(startColorVar:ccColor):Unit = js.native
  def getEndColor:ccColor = js.native
  def setEndColor(endColor:ccColor):Unit = js.native
  def getEndColorVar:ccColor = js.native
  def setEndColorVar(endColorVar:ccColor):Unit = js.native
  def getStartSpin:Float = js.native
  def setStartSpin(startSpin:Float):Unit = js.native
  def getStartSpinVar:Float = js.native
  def setStartSpinVar(startSpinVar:Float):Unit = js.native
  def getEndSpin:Float = js.native
  def setEndSpin(endSpin:Float):Unit = js.native
  def getEndSpinVar:Float = js.native
  def setEndSpinVar(endSpinVar:Float):Unit = js.native
  def getEmissionRate:Float = js.native
  def setEmissionRate(emissionRate:Float):Unit = js.native
  def getTotalParticles:Float = js.native
  def setTotalParticles(tp:Float):Unit = js.native
  def getTexture:ccTexture2D = js.native
  def setTexture(texture:ccTexture2D):Unit = js.native
  def getBlendFunc:ccBlendFunc = js.native
  def setBlendFunc(src:Float, dst:Float):Unit = js.native
  override def isOpacityModifyRGB:Boolean = js.native
  def setOpacityModifyRGB(newValue:js.Any):Unit = js.native
  def isBlendAdditive:Boolean = js.native
  def setBlendAdditive(isBlendAdditive:Boolean):Unit = js.native
  def getPositionType:Float = js.native
  def setPositionType(positionType:Float):Unit = js.native
  def isAutoRemoveOnFinish:Boolean = js.native
  def setAutoRemoveOnFinish(isAutoRemoveOnFinish:Boolean):Unit = js.native
  def getEmitterMode:Float = js.native
  def setEmitterMode(emitterMode:Float):Unit = js.native
  override def init:Boolean = js.native
  def initWithFile(plistFile:String):Boolean = js.native
  override def getBoundingBoxToWorld:ccRect = js.native
  def initWithDictionary(dictionary:js.Object, dirname:String):Boolean = js.native
  def initWithTotalParticles(numberOfParticles:Float):Boolean = js.native
  def destroyParticleSystem():Unit = js.native
  def addParticle:Boolean = js.native
  def initParticle(particle:ccParticle):Unit = js.native
  def stopSystem():Unit = js.native
  def resetSystem():Unit = js.native
  def isFull:Boolean = js.native
  def updateQuadWithParticle(particle:ccParticle, newPosition:ccPoint):Unit = js.native
  def postStep():Unit = js.native
  override def update(dt:Float):Unit = js.native
  def updateWithNoTime():Unit = js.native
  override def clone:ccParticleSystem = js.native
  def setDisplayFrame(spriteFrame:ccSpriteFrame):Unit = js.native
  def setTextureWithRect(texture:ccTexture2D, rect:ccRect):Unit = js.native
  def listenBackToForeground(obj:ccClass):Unit = js.native
}

@js.native
@JSGlobal("cc.ParticleSystem")
class ccParticleSystem(plistFile:String) extends t_ccParticleSystem {
}

@js.native
@JSGlobal("cc.ParticleSystem")
object ccParticleSystem extends js.Object {
  val SHAPE_MODE: Float = js.native
  val TEXTURE_MODE: Float = js.native
  val STAR_SHAPE: Float = js.native
  val BALL_SHAPE: Float = js.native
  val DURATION_INFINITY: Float = js.native
  val START_SIZE_EQUAL_TO_END_SIZE: Float = js.native
  val START_RADIUS_EQUAL_TO_END_RADIUS: Float = js.native
  val MODE_GRAVITY: Float = js.native
  val MODE_RADIUS: Float = js.native
  val TYPE_FREE: Float = js.native
  val TYPE_RELATIVE: Float = js.native
  val TYPE_GROUPED: Float = js.native
  def WebGLRenderCmd():Unit = js.native
}

@js.native
trait t_ccParticleSystemModeA extends js.Object {
}

@js.native
@JSGlobal("cc.ParticleSystem.ModeA")
class ccParticleSystemModeA(gravity:ccPoint, speed:Float, speedVar:Float, tangentialAccel:Float, tangentialAccelVar:Float, radialAccel:Float, radialAccelVar:Float, rotationIsDir:Boolean) extends t_ccParticleSystemModeA {
  var gravity: js.Any = js.native
  var speed: js.Any = js.native
  var speedVar: js.Any = js.native
  var tangentialAccel: js.Any = js.native
  var tangentialAccelVar: js.Any = js.native
  var radialAccel: js.Any = js.native
  var radialAccelVar: js.Any = js.native
  var rotationIsDir: js.Any = js.native
}

@js.native
@JSGlobal("cc.ParticleSystem.ModeA")
object ccParticleSystemModeA extends js.Object {
}

@js.native
trait t_ccParticleSystemModeB extends js.Object {
}

@js.native
@JSGlobal("cc.ParticleSystem.ModeB")
class ccParticleSystemModeB(startRadius:Float, startRadiusVar:Float, endRadius:Float, endRadiusVar:Float, rotatePerSecond:Float, rotatePerSecondVar:Float) extends t_ccParticleSystemModeB {
  var startRadius: js.Any = js.native
  var startRadiusVar: js.Any = js.native
  var endRadius: js.Any = js.native
  var endRadiusVar: js.Any = js.native
  var rotatePerSecond: js.Any = js.native
  var rotatePerSecondVar: js.Any = js.native
}

@js.native
@JSGlobal("cc.ParticleSystem.ModeB")
object ccParticleSystemModeB extends js.Object {
}


