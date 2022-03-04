package co.carrd.danthedev.plugins

import co.carrd.danthedev.Response
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    routing {
        get("/") {
            val response = Response(200, "Hello world!")
            call.respond(response)
        }
    }
}
