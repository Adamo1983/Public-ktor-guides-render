package it.innovactors.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import it.innovactors.data.Guide
import it.innovactors.data.Url
import it.innovactors.model.response.CategoryResponse



fun Route.categoryRoute(){

    get(Url.RELATIVE_CATEGORIES) {
        call.respond(
            HttpStatusCode.OK,
            CategoryResponse(categories = Guide.categories)
        )
    }
}