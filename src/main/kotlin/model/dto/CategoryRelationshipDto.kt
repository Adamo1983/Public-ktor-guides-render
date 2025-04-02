package it.innovactors.model.dto

import kotlinx.serialization.Serializable

@Serializable
data class CategoryRelationshipDto(
    val parentCategoryId: Int,
    val childCategoryId: Int
)