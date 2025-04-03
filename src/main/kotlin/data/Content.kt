package it.innovactors.data

import it.innovactors.model.dto.ContentDto

object Content {



    private const val CHARGING_ID = 1
    private const val DISPERSION_ID = 2
    private const val USAGE_MAINTENANCE_ID = 3
    private const val PAPER_FINISH_ID= 4
    private const val PAPER_JAM_ID = 5

    private const val CHARGING_NAME = "Carica batteria"
    private const val DISPERSION_NAME = "Dispersione batteria"
    private const val USAGE_MAINTENANCE_NAME = "Uso e manutenzione"
    private const val PAPER_FINISH_NAME = "Rollino carta terminato"
    private const val PAPER_JAM_NAME = "Rollino carta inceppato"


    //region BATTERY

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

    private val batteryList = listOf(
        batteryCharging, batteryDispersion, batteryUsage
    )

    //endregion

    //region Paper

    private val paper1: ContentDto = ContentDto(
        id = PAPER_FINISH_ID,
        categoryId = Category.PAPER_ID,
        name = PAPER_FINISH_NAME,
        url = Url.BASE + Url.RELATIVE_CONTENT_PAPER_FINISH_PAGE,
        imageUrl = Url.BASE + Url.RELATIVE_CONTENT_PAPER1_IMAGE
    )

    private val paper2: ContentDto = ContentDto(
        id = PAPER_JAM_ID,
        categoryId = Category.PAPER_ID,
        name = PAPER_JAM_NAME,
        url = Url.BASE + Url.RELATIVE_CONTENT_PAPER_JAM_PAGE,
        imageUrl = Url.BASE + Url.RELATIVE_CONTENT_PAPER2_IMAGE
    )

    private val paperList = listOf(
        paper1, paper2
    )

    val list = batteryList + paperList


    //endregion

}