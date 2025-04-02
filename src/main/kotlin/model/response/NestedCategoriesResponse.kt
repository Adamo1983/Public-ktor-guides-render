package it.innovactors.model.response

import kotlinx.serialization.Serializable

@Serializable
data class NestedCategoriesResponse(
    val list: List<NestedCategoryResponse>
)
