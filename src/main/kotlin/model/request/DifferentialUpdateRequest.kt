package it.innovactors.model.request

import kotlinx.serialization.Serializable

@Serializable
data class DifferentialUpdateRequest(
    val currentVersion: Int,
)