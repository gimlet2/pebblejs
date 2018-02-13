
@file:JsModule("ui")
package ui

import kotlin.js.JsModule

external class Card {
     constructor()
     constructor(obj: Map<String, Any>)
     constructor(title: String, body: String)
     fun show()
     fun body(body: String)
     fun title(title: String)
}
