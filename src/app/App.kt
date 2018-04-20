package app

import kotlinx.html.classes
import kotlinx.html.style
import logo.logo
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.code
import react.dom.div
import react.dom.h2
import react.dom.p
import ticker.ticker

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("App-header") {
            logo()
            h2 {
                attrs.classes = setOf("Test","brzydkiAtrybut")
                attrs["class"] = "Innyatrybut 123" +attrs.classes.joinToString(separator = " ")
//                attrs.style = kotlinext.js.js {
//                    display = "flex"
//                }
                +"Welcome to React with Kotlin"
                +"Test thing"
            }
        }
        p("App-intro") {
            +"To get started, edit "
            code { +"src/app/App.kt" }
            +" and save to reload."
        }
        p("App-ticker") {
            ticker()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
