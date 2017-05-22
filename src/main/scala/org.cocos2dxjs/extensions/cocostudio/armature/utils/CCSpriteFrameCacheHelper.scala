package org.cocos2dxjs.extensions.cocostudio.armature.utils

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccsspriteFrameCacheHelper extends js.Object {
}

@js.native
trait ts_ccsspriteFrameCacheHelper extends js.Object {
  def addSpriteFrameFromFile(plistPath:js.Dynamic, imagePath:js.Dynamic):Unit = js.native
  def getTextureAtlasWithTexture(texture:js.Dynamic):js.Dynamic = js.native
  def clear():Unit = js.native
}

@js.native
@JSGlobal("ccs.spriteFrameCacheHelper")
class ccsspriteFrameCacheHelper extends t_ccsspriteFrameCacheHelper {
}

@js.native
@JSGlobal("ccs.spriteFrameCacheHelper")
object ccsspriteFrameCacheHelper extends ts_ccsspriteFrameCacheHelper {
}


