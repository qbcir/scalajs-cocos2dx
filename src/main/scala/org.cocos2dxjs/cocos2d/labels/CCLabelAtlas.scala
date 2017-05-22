package org.cocos2dxjs.cocos2d.labels

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccLabelAtlas extends t_ccLabelBMFont {
}

@js.native
trait ts_ccLabelAtlas extends ts_ccLabelBMFont {
}

@js.native
@JSGlobal("cc.LabelAtlas")
class ccLabelAtlas(strText:String, charMapFile:String, itemWidth:Float, itemHeight:Float, startCharMap:Float) extends t_ccLabelAtlas {
}

@js.native
@JSGlobal("cc.LabelAtlas")
object ccLabelAtlas extends ts_ccLabelAtlas {
}


