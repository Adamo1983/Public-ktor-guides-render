package it.innovactors.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import it.innovactors.data.Guide
import it.innovactors.data.Url
import it.innovactors.model.response.DifferentialUpdateResponse


fun Route.differentialUpdate(){

    get(Url.RELATIVE_NESTED_UPDATE_DIFF_GET){
        try{
            val currentVersion = call.parameters["currentVersion"]?.toIntOrNull()
            if(currentVersion == null){
                call.respond(HttpStatusCode.BadRequest)
                return@get
            }
            if(currentVersion >= Guide.nextVersion){
                call.respond(HttpStatusCode.NotModified)
                return@get
            }
            val nextVersion = Guide.nextVersion
            val categoriesToAdd = Guide.categoriesToAdd
            val contentsToAdd = Guide.contentsToAdd
            val categoryIdsToDelete = Guide.categoryIdsToDelete
            val contentIdsToDelete = Guide.contentIdsToDelete
            val relationshipsToAdd = Guide.relationshipsToAdd

            val response = DifferentialUpdateResponse(
                newVersion = nextVersion,
                categoriesToAdd = categoriesToAdd,
                contentsToAdd = contentsToAdd,
                categoryIdsToDelete = categoryIdsToDelete,
                contentIdsToDelete = contentIdsToDelete,
                relationshipsToAdd = relationshipsToAdd
            )

            call.respond(HttpStatusCode.OK, response)
        }catch (e: Exception) {
            call.respond(
                HttpStatusCode.InternalServerError,
                mapOf("error" to (e.message ?: "Invalid request"))
            )
        }
    }
}

