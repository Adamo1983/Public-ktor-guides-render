package it.innovactors.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import it.innovactors.data.Guide
import it.innovactors.data.Url
import it.innovactors.model.response.ContentResponse


fun Route.contentRoute(){

    get(Url.RELATIVE_CONTENTS) {
        call.respond(
            HttpStatusCode.OK,
            ContentResponse(
                contents = Guide.contents
            )
        )
    }

}