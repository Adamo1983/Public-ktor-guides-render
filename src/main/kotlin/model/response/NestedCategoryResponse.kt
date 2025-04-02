package it.innovactors.model.response

import kotlinx.serialization.Serializable

@Serializable
data class NestedCategoryResponse(
    val parentCategoryId: Int,
    val childCategoryIds: List<Int>
)