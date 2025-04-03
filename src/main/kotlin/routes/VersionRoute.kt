package it.innovactors.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import it.innovactors.data.Guide
import it.innovactors.data.Url
import it.innovactors.model.response.GuideVersionResponse


fun Route.versionRoute(){

    get(Url.RELATIVE_VERSION) {
        call.respond(
            HttpStatusCode.OK,
            GuideVersionResponse(version = Guide.VERSION)
        )

    }
}