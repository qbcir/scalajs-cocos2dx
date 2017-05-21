package org.cocos2dxjs.extensions.cocostudio.armature.physics

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsContourData

@js.native
trait t_ccsColliderFilter extends t_ccsClass {
}

@js.native
@JSGlobal("ccs.ColliderFilter")
class ccsColliderFilter extends t_ccsColliderFilter {
}

@js.native
@JSGlobal("ccs.ColliderFilter")
object ccsColliderFilter extends js.Object {
}

@js.native
trait t_ccsColliderBody extends t_ccsClass {
  def getContourData:ccsContourData = js.native
  def setColliderFilter(colliderFilter:ccsColliderFilter):Unit = js.native
  def getCalculatedVertexList:js.Array[js.Any] = js.native
  def setShape(shape:js.Any/*ccsShape*/):Unit = js.native
  def getShape:js.Any/*ccsShape*/ = js.native
  def setContourData(contourData:ccsContourData):Unit = js.native
  def getColliderFilter:ccsColliderFilter = js.native
}

@js.native
@JSGlobal("ccs.ColliderBody")
class ccsColliderBody extends t_ccsColliderBody {
}

@js.native
@JSGlobal("ccs.ColliderBody")
object ccsColliderBody extends js.Object {
}

@js.native
trait t_ccsColliderDetector extends t_ccsClass {
  def addContourData(contourData:ccsContourData):Unit = js.native
  def addContourDataList(contourDataList:js.Array[js.Any]):Unit = js.native
  def removeContourData(contourData:js.Any):Unit = js.native
  def removeAll():Unit = js.native
  def setColliderFilter(filter:ccsColliderFilter):Unit = js.native
  def getColliderFilter:ccsColliderFilter = js.native
}

@js.native
@JSGlobal("ccs.ColliderDetector")
class ccsColliderDetector extends t_ccsColliderDetector {
}

@js.native
@JSGlobal("ccs.ColliderDetector")
object ccsColliderDetector extends js.Object {
}

