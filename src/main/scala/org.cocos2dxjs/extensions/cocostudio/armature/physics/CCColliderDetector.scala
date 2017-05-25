package org.cocos2dxjs.extensions.cocostudio.armature.physics

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass
import org.cocos2dxjs.extensions.cocostudio.ts_ccsClass
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsContourData, t_ccsContourData}
import org.cocos2dxjs.extensions.cocostudio.armature.{ccsBone, t_ccsBone}

@js.native
trait t_ccsColliderFilter extends t_ccsClass {
}

@js.native
trait ts_ccsColliderFilter extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.ColliderFilter")
class ccsColliderFilter() extends t_ccsColliderFilter {
}

@js.native
@JSGlobal("ccs.ColliderFilter")
object ccsColliderFilter extends ts_ccsColliderFilter {
}

@js.native
trait t_ccsColliderBody extends t_ccsClass {
  var contourData: ccsContourData = js.native
  var shape: js.Any/*ccsShape*/ = js.native
  var colliderFilter: ccsColliderFilter = js.native
  def getContourData():ccsContourData = js.native
  def setColliderFilter(colliderFilter:t_ccsColliderFilter):Unit = js.native
  def getCalculatedVertexList():js.Array[js.Any] = js.native
  def setShape(shape:js.Any/*ccsShape*/):Unit = js.native
  def getShape():js.Any/*ccsShape*/ = js.native
  def setContourData(contourData:t_ccsContourData):Unit = js.native
  def getColliderFilter():ccsColliderFilter = js.native
}

@js.native
trait ts_ccsColliderBody extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.ColliderBody")
class ccsColliderBody() extends t_ccsColliderBody {
}

@js.native
@JSGlobal("ccs.ColliderBody")
object ccsColliderBody extends ts_ccsColliderBody {
}

@js.native
trait t_ccsColliderDetector extends t_ccsClass {
  var colliderFilter: ccsColliderFilter = js.native
  var active: Boolean = js.native
  var body: types.DynObject = js.native
  def addContourData(contourData:t_ccsContourData):Unit = js.native
  def addContourDataList(contourDataList:js.Array[js.Any]):Unit = js.native
  def removeContourData(contourData:js.Dynamic):Unit = js.native
  def removeAll():Unit = js.native
  def setColliderFilter(filter:t_ccsColliderFilter):Unit = js.native
  def getColliderFilter():ccsColliderFilter = js.native
}

@js.native
trait ts_ccsColliderDetector extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.ColliderDetector")
class ccsColliderDetector(bone:t_ccsBone) extends t_ccsColliderDetector {
}

@js.native
@JSGlobal("ccs.ColliderDetector")
object ccsColliderDetector extends ts_ccsColliderDetector {
}


