package it.innovactors.data

import it.innovactors.model.dto.CategoryDto

object Category {

    //region ID

    const val BATTERY_ID = 1
    const val PAPER_ID = 2
    const val BANKING_ID = 3

    //endregion

    //region NAME

    private const val BATTERY_NAME = "Batteria"
    private const val PAPER_NAME = "Rotolino carta"
    private const val BANKING_NAME = "Bancario"

    //endregion


    private val battery: CategoryDto = CategoryDto(
        id = BATTERY_ID,
        name = BATTERY_NAME,
        imageUrl = Url.BASE + Url.RELATIVE_CATEGORY_BATTERY_IMAGE
    )

    private val paper: CategoryDto = CategoryDto(
        id = PAPER_ID,
        name = PAPER_NAME,
        imageUrl = Url.BASE + Url.RELATIVE_CATEGORY_PAPER_ROLL_IMAGE
    )

    private val banking: CategoryDto = CategoryDto(
        id = BANKING_ID,
        name = BANKING_NAME,
        imageUrl = Url.BASE + Url.RELATIVE_CATEGORY_CREDIT_CARD_IMAGE
    )

    val list = listOf(
        battery, paper, banking
    )



}