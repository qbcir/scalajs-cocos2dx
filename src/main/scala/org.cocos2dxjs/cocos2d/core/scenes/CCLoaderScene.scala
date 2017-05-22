package org.cocos2dxjs.cocos2d.core.scenes

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccLoaderScene extends t_ccScene {
}

@js.native
trait ts_ccLoaderScene extends ts_ccScene {
  def preload(resources:js.Dynamic, cb:js.Dynamic, target:js.Dynamic):ccLoaderScene | js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.LoaderScene")
class ccLoaderScene extends t_ccLoaderScene {
  var _className: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.LoaderScene")
object ccLoaderScene extends ts_ccLoaderScene {
}


