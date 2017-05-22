package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccColor extends js.Object {
}

@js.native
trait ts_ccColor extends js.Object {
}

@js.native
@JSGlobal("cc.Color")
class ccColor(r:Float, g:Float, b:Float, a:Float) extends t_ccColor {
}

@js.native
@JSGlobal("cc.Color")
object ccColor extends ts_ccColor {
}

@js.native
trait t_ccAcceleration extends js.Object {
}

@js.native
trait ts_ccAcceleration extends js.Object {
}

@js.native
@JSGlobal("cc.Acceleration")
class ccAcceleration(x:Float, y:Float, z:Float, timestamp:Float) extends t_ccAcceleration {
}

@js.native
@JSGlobal("cc.Acceleration")
object ccAcceleration extends ts_ccAcceleration {
}

@js.native
trait t_ccVertex2F extends js.Object {
}

@js.native
trait ts_ccVertex2F extends js.Object {
}

@js.native
@JSGlobal("cc.Vertex2F")
class ccVertex2F(x:Float, y:Float, arrayBuffer:js.Array[js.Any], offset:Float) extends t_ccVertex2F {
}

@js.native
@JSGlobal("cc.Vertex2F")
object ccVertex2F extends ts_ccVertex2F {
  val BYTES_PER_ELEMENT: Float = js.native
}

@js.native
trait t_ccVertex3F extends js.Object {
}

@js.native
trait ts_ccVertex3F extends js.Object {
}

@js.native
@JSGlobal("cc.Vertex3F")
class ccVertex3F(x:Float, y:Float, z:Float, arrayBuffer:js.Array[js.Any], offset:Float) extends t_ccVertex3F {
}

@js.native
@JSGlobal("cc.Vertex3F")
object ccVertex3F extends ts_ccVertex3F {
  val BYTES_PER_ELEMENT: Float = js.native
}

@js.native
trait t_ccTex2F extends js.Object {
}

@js.native
trait ts_ccTex2F extends js.Object {
}

@js.native
@JSGlobal("cc.Tex2F")
class ccTex2F(u:Float, v:Float, arrayBuffer:js.Array[js.Any], offset:Float) extends t_ccTex2F {
}

@js.native
@JSGlobal("cc.Tex2F")
object ccTex2F extends ts_ccTex2F {
  var BYTES_PER_ELEMENT: Float = js.native
}

@js.native
trait t_ccQuad2 extends js.Object {
}

@js.native
trait ts_ccQuad2 extends js.Object {
}

@js.native
@JSGlobal("cc.Quad2")
class ccQuad2(tl:ccVertex2F, tr:ccVertex2F, bl:ccVertex2F, br:ccVertex2F, arrayBuffer:js.Array[js.Any], offset:Float) extends t_ccQuad2 {
}

@js.native
@JSGlobal("cc.Quad2")
object ccQuad2 extends ts_ccQuad2 {
  val BYTES_PER_ELEMENT: Float = js.native
}

@js.native
trait t_ccQuad3 extends js.Object {
}

@js.native
trait ts_ccQuad3 extends js.Object {
}

@js.native
@JSGlobal("cc.Quad3")
class ccQuad3(bl:ccVertex3F, br:ccVertex3F, tl:ccVertex3F, tr:ccVertex3F) extends t_ccQuad3 {
}

@js.native
@JSGlobal("cc.Quad3")
object ccQuad3 extends ts_ccQuad3 {
  val BYTES_PER_ELEMENT: Float = js.native
}

@js.native
trait t_ccV3F_C4B_T2F extends js.Object {
}

@js.native
trait ts_ccV3F_C4B_T2F extends js.Object {
}

@js.native
@JSGlobal("cc.V3F_C4B_T2F")
class ccV3F_C4B_T2F(vertices:ccVertex3F, colors:ccColor, texCoords:ccTex2F, arrayBuffer:js.Array[js.Any], offset:Float) extends t_ccV3F_C4B_T2F {
}

@js.native
@JSGlobal("cc.V3F_C4B_T2F")
object ccV3F_C4B_T2F extends ts_ccV3F_C4B_T2F {
  val BYTES_PER_ELEMENT: Float = js.native
}

@js.native
trait t_ccV3F_C4B_T2F_Quad extends js.Object {
}

@js.native
trait ts_ccV3F_C4B_T2F_Quad extends js.Object {
}

@js.native
@JSGlobal("cc.V3F_C4B_T2F_Quad")
class ccV3F_C4B_T2F_Quad(tl:ccV3F_C4B_T2F, bl:ccV3F_C4B_T2F, tr:ccV3F_C4B_T2F, br:ccV3F_C4B_T2F, arrayBuffer:js.Array[js.Any], offset:Float) extends t_ccV3F_C4B_T2F_Quad {
}

@js.native
@JSGlobal("cc.V3F_C4B_T2F_Quad")
object ccV3F_C4B_T2F_Quad extends ts_ccV3F_C4B_T2F_Quad {
  val BYTES_PER_ELEMENT: Float = js.native
}

@js.native
trait t_ccV2F_C4B_T2F extends js.Object {
}

@js.native
trait ts_ccV2F_C4B_T2F extends js.Object {
}

@js.native
@JSGlobal("cc.V2F_C4B_T2F")
class ccV2F_C4B_T2F(vertices:ccVertex2F, colors:ccColor, texCoords:ccTex2F, arrayBuffer:js.Array[js.Any], offset:Float) extends t_ccV2F_C4B_T2F {
}

@js.native
@JSGlobal("cc.V2F_C4B_T2F")
object ccV2F_C4B_T2F extends ts_ccV2F_C4B_T2F {
  val BYTES_PER_ELEMENT: Float = js.native
}

@js.native
trait t_ccV2F_C4B_T2F_Triangle extends js.Object {
}

@js.native
trait ts_ccV2F_C4B_T2F_Triangle extends js.Object {
}

@js.native
@JSGlobal("cc.V2F_C4B_T2F_Triangle")
class ccV2F_C4B_T2F_Triangle(a:ccV2F_C4B_T2F, b:ccV2F_C4B_T2F, c:ccV2F_C4B_T2F, arrayBuffer:js.Array[js.Any], offset:Float) extends t_ccV2F_C4B_T2F_Triangle {
}

@js.native
@JSGlobal("cc.V2F_C4B_T2F_Triangle")
object ccV2F_C4B_T2F_Triangle extends ts_ccV2F_C4B_T2F_Triangle {
  val BYTES_PER_ELEMENT: Float = js.native
}

@js.native
trait t_ccBlendFunc extends js.Object {
}

@js.native
trait ts_ccBlendFunc extends js.Object {
}

@js.native
@JSGlobal("cc.BlendFunc")
class ccBlendFunc(src1:Float, dst1:Float) extends t_ccBlendFunc {
}

@js.native
@JSGlobal("cc.BlendFunc")
object ccBlendFunc extends ts_ccBlendFunc {
  var DISABLE: js.Dynamic = js.native
  var ALPHA_PREMULTIPLIED: js.Dynamic = js.native
  var ALPHA_NON_PREMULTIPLIED: js.Dynamic = js.native
  var ADDITIVE: js.Dynamic = js.native
}

@js.native
trait t_ccFontDefinition extends js.Object {
  def _getCanvasFontStr():Unit = js.native
}

@js.native
trait ts_ccFontDefinition extends js.Object {
}

@js.native
@JSGlobal("cc.FontDefinition")
class ccFontDefinition(properties:types.DynObject) extends t_ccFontDefinition {
}

@js.native
@JSGlobal("cc.FontDefinition")
object ccFontDefinition extends ts_ccFontDefinition {
}


