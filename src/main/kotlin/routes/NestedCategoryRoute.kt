package it.innovactors.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import it.innovactors.data.Guide
import it.innovactors.data.Url


fun Route.nestedCategoriesRoute(){

    get(Url.RELATIVE_NESTED_CATEGORY) {
        call.respond(
            HttpStatusCode.OK,
            Guide.nestedCategories
        )
    }

}