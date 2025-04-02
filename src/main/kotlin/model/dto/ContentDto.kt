package it.innovactors.model.dto

import kotlinx.serialization.Serializable

@Serializable
data class ContentDto(
    val id: Int,
    val categoryId: Int,
    val name: String,
    val url: String,
    val imageUrl: String?
)
