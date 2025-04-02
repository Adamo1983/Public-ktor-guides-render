package it.innovactors.model.dto

import kotlinx.serialization.Serializable

@Serializable
data class CategoryDto(
    val id: Int,
    val name: String,
    val imageUrl: String? = null
)