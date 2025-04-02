package it.innovactors.data

import it.innovactors.model.dto.ContentDto

object Content {

    //region BATTERY

    private const val CHARGING_ID = 1
    private const val DISPERSION_ID = 2
    private const val USAGE_MAINTENANCE_ID = 3

    private const val CHARGING_NAME = "Carica batteria"
    private const val DISPERSION_NAME = "Dispersione batteria"
    private const val USAGE_MAINTENANCE_NAME = "Uso e manutenzione"


    private val batteryCharging: ContentDto = ContentDto(
        id = CHARGING_ID,
        categoryId = Category.BATTERY_ID,
        name = CHARGING_NAME,
        url = Url.BASE + Url.RELATIVE_CONTENT_BATTERY_CHARGING_PAGE,
        imageUrl = Url.BASE + Url.RELATIVE_CONTENT_BATTERY_CHARGING_IMAGE
    )

    private val batteryDispersion: ContentDto = ContentDto(
        id = DISPERSION_ID,
        categoryId = Category.BATTERY_ID,
        name = DISPERSION_NAME,
        url = Url.BASE + Url.RELATIVE_CONTENT_BATTERY_DISPERSION_PAGE,
        imageUrl = Url.BASE + Url.RELATIVE_CONTENT_BATTERY_DISPERSION_IMAGE
    )

    private val batteryUsage: ContentDto = ContentDto(
        id = USAGE_MAINTENANCE_ID,
        categoryId = Category.BATTERY_ID,
        name = USAGE_MAINTENANCE_NAME,
        url = Url.BASE + Url.RELATIVE_CONTENT_BATTERY_USAGE_PAGE,
        imageUrl = Url.BASE + Url.RELATIVE_CONTENT_BATTERY_USAGE_MAINTENANCE_IMAGE
    )

    val list = listOf(
        batteryCharging, batteryDispersion, batteryUsage
    )

    //endregion

}