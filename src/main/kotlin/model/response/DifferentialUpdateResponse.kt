package it.innovactors.model.response

import it.innovactors.model.dto.CategoryDto
import it.innovactors.model.dto.CategoryRelationshipDto
import it.innovactors.model.dto.ContentDto
import kotlinx.serialization.Serializable

@Serializable
data class DifferentialUpdateResponse(
    val newVersion: Int,
    val categoriesToAdd: List<CategoryDto>,
    val contentsToAdd: List<ContentDto>,
    val categoryIdsToDelete: List<Int>,
    val contentIdsToDelete: List<Int>,
    val relationshipsToAdd: List<CategoryRelationshipDto>,
)