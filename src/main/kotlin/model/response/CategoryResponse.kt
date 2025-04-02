package it.innovactors.model.response

import it.innovactors.model.dto.CategoryDto
import kotlinx.serialization.Serializable

@Serializable
data class CategoryResponse(
    val categories: List<CategoryDto>
)