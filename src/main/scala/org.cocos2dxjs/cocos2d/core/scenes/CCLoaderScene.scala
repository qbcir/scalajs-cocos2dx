package org.cocos2dxjs.cocos2d.core.scenes

import scalajs.js
import scala.scalajs.js.annotation._


@js.native
trait t_ccLoaderScene extends t_ccScene {
}

@js.native
@JSGlobal("cc.LoaderScene")
class ccLoaderScene extends t_ccLoaderScene {
  var _className: js.Any = js.native
}

@js.native
@JSGlobal("cc.LoaderScene")
object ccLoaderScene extends js.Object {
  def preload(resources:js.Any, cb:js.Any, target:js.Any):ccLoaderScene = js.native
}


