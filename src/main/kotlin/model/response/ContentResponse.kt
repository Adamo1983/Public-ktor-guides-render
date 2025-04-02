package it.innovactors.model.response

import it.innovactors.model.dto.ContentDto
import kotlinx.serialization.Serializable

@Serializable
data class ContentResponse(
    val contents: List<ContentDto>
)