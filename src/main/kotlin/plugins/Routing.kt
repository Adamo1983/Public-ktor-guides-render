package it.innovactors.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import it.innovactors.data.Url
import it.innovactors.routes.*

fun Application.configureRouting() {
    routing {
        route(Url.ROOT){
            versionRoute()
            categoryRoute()
            contentRoute()
            nestedCategoriesRoute()
            differentialUpdate()
        }


        get("/") {
            call.respondText("Hello World!")
        }
        // Static plugin. Try to access `/static/index.html`
        static {
            resources(Url.STATIC)
        }
    }
}
