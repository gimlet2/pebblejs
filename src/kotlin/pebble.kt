package pebble

import ui.Card

fun card(title: String, body: String ="") : Card {
     val c = Card()
     c.title(title)
     c.body(body)
     return c
}