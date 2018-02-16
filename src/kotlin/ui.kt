
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
    fun subtitle(subtitle: String)
    
    fun titleColor(titleColor: String)
    fun subtitleColor(subtitleColor: String)
    fun bodyColor(bodyColor: String)
    fun icon(icon: String)
    fun subicon(subicon: String)
    fun banner(banner: String)
    fun up(up: String)
    fun select(select: String)
    fun back(back: String)
    fun style(style: String)
    fun backgroundColor(backgroundColor: String)

}
