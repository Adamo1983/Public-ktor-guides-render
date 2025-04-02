package it.innovactors.model.response


import kotlinx.serialization.Serializable

@Serializable
data class GuideVersionResponse(
    val version: Int
)