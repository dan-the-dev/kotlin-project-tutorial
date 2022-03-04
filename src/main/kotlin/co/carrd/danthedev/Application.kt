package co.carrd.danthedev

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import co.carrd.danthedev.plugins.*

fun main() {
    embeddedServer(Netty, port = 8181, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureSerialization()
    }.start(wait = true)
}
