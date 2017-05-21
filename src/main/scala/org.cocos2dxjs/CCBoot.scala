package org.cocos2dxjs

import scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait t_ccAsyncPool extends js.Object {
}

@js.native
@JSGlobal("cc.AsyncPool")
class ccAsyncPool extends t_ccAsyncPool {
}

@js.native
@JSGlobal("cc.AsyncPool")
object ccAsyncPool extends js.Object {
}

@js.native
trait t_ccasync extends js.Object {
}

@js.native
@JSGlobal("cc.async")
class ccasync extends t_ccasync {
}

@js.native
@JSGlobal("cc.async")
object ccasync extends js.Object {
  def series(tasks:js.Array[js.Any], cb:js.Function, target:js.Object):ccAsyncPool = js.native
  def parallel(tasks:js.Array[js.Any], cb:js.Function, target:js.Object):ccAsyncPool = js.native
  def waterfall(tasks:js.Array[js.Any], cb:js.Function, target:js.Object):ccAsyncPool = js.native
  def map(tasks:js.Array[js.Any], iterator:js.Function, callback:js.Function, target:js.Object):ccAsyncPool = js.native
  def mapLimit(tasks:js.Array[js.Any], limit:Float, iterator:js.Function, cb:js.Function, target:js.Object):Unit = js.native
}

@js.native
trait t_ccpath extends js.Object {
}

@js.native
@JSGlobal("cc.path")
class ccpath extends t_ccpath {
}

@js.native
@JSGlobal("cc.path")
object ccpath extends js.Object {
  def join:String = js.native
  def extname(pathStr:String):js.Any = js.native
  def mainFileName(fileName:String):String = js.native
  def basename(pathStr:String, extname:String):js.Any = js.native
  def dirname(pathStr:String):js.Any = js.native
  def changeExtname(pathStr:String, extname:String):String = js.native
  def changeBasename(pathStr:String, basename:String, isSameExt:Boolean):String = js.native
}

@js.native
trait t_ccLoader extends js.Object {
  def getXMLHttpRequest:js.Any = js.native
  def loadJs(baseDir:String, jsList:js.Any, cb:js.Function):js.Any = js.native
  def loadJsWithImg(baseDir:String, jsList:js.Any, cb:js.Function):Unit = js.native
  def loadTxt(url:String, cb:js.Function):Unit = js.native
  def loadJson(url:String, cb:js.Function):Unit = js.native
  def loadImg(url:String, option:js.Object, callback:js.Function):js.Any = js.native
  def _loadResIterator(item:js.Object, index:Float, cb:js.Function):js.Any = js.native
  def getUrl(basePath:String, url:String):js.Any = js.native
  def load(resources:String, option:js.Function, loadCallback:js.Function):ccAsyncPool = js.native
  def loadAliases(url:String, callback:js.Function):Unit = js.native
  def register(extNames:String, loader:js.Function):Unit = js.native
  def getRes(url:js.Any):js.Any = js.native
  def _getAliase(url:js.Any):js.Any = js.native
  def release(url:js.Any):Unit = js.native
  def releaseAll():Unit = js.native
}

@js.native
@JSGlobal("cc.Loader")
class ccLoader extends t_ccLoader {
}

@js.native
@JSGlobal("cc.Loader")
object ccLoader extends js.Object {
}

@js.native
trait t_ccgame extends js.Object {
}

@js.native
@JSGlobal("cc.game")
class ccgame extends t_ccgame {
}

@js.native
@JSGlobal("cc.game")
object ccgame extends js.Object {
  def setFrameRate(frameRate:js.Any):Unit = js.native
  def step():Unit = js.native
  def pause():Unit = js.native
  def resume():Unit = js.native
  def isPaused():Unit = js.native
  def restart():Unit = js.native
  def end():Unit = js.native
  def prepare(cb:js.Any):Unit = js.native
  def run(config:js.Object, onStart:js.Any):Unit = js.native
}

