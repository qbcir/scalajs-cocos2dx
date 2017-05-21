package org.cocos2dxjs.cocos2d.core.textures

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.platform.ccV3F_C4B_T2F_Quad
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass

@js.native
trait t_ccTextureAtlas extends t_ccClass {
  var dirty: Boolean = js.native
  var texture: js.Any = js.native
  val capacity: Float = js.native
  val totalQuads: Float = js.native
  val quads: js.Array[js.Any] = js.native
  def getTotalQuads:Float = js.native
  def getCapacity:Float = js.native
  def getTexture:js.Any = js.native
  def setTexture(texture:js.Any):Unit = js.native
  def setDirty(dirty:Boolean):Unit = js.native
  def isDirty:Boolean = js.native
  def getQuads:js.Array[js.Any] = js.native
  def setQuads(quads:js.Array[js.Any]):Unit = js.native
  def description:String = js.native
  def initWithFile(file:String, capacity:Float):Boolean = js.native
  def initWithTexture(texture:js.Any, capacity:Float):Boolean = js.native
  def updateQuad(quad:ccV3F_C4B_T2F_Quad, index:Float):Unit = js.native
  def insertQuad(quad:ccV3F_C4B_T2F_Quad, index:Float):Unit = js.native
  def insertQuads(quads:js.Array[js.Any], index:Float, amount:Float):Unit = js.native
  def insertQuadFromIndex(fromIndex:Float, newIndex:Float):Unit = js.native
  def removeQuadAtIndex(index:Float):Unit = js.native
  def removeQuadsAtIndex(index:Float, amount:Float):Unit = js.native
  def removeAllQuads():Unit = js.native
  def resizeCapacity(newCapacity:Float):Boolean = js.native
  def increaseTotalQuadsWith(amount:Float):Unit = js.native
  def moveQuadsFromIndex(oldIndex:Float, amount:Float, newIndex:Float):Unit = js.native
  def fillWithEmptyQuadsFromIndex(index:Float, amount:Float):Unit = js.native
  def drawQuads():Unit = js.native
}

@js.native
@JSGlobal("cc.TextureAtlas")
class ccTextureAtlas(fileName:String, capacity:Float) extends t_ccTextureAtlas {
}

@js.native
@JSGlobal("cc.TextureAtlas")
object ccTextureAtlas extends js.Object {
}


