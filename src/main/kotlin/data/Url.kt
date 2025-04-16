package it.innovactors.data

object Url {

    //privato
    //private val IP = System.getenv("BASE_IP") ?: "localhost"

    // x REnder
    //ktor-guides-example.onrender.com
    private const val IP = "ktor-guides-example.onrender.com"

    const val BASE = "http://$IP"

    const val ROOT = "/api"

    const val RELATIVE_VERSION: String = "/guide/version"
    const val RELATIVE_CATEGORIES: String = "/guide/categories"
    const val RELATIVE_CONTENTS: String = "/guide/contents"
    const val RELATIVE_NESTED_CATEGORY: String = "/guide/nested-categories"
    const val RELATIVE_NESTED_UPDATE_DIFF_GET: String = "/guide/differential-update/get"

    const val STATIC: String = "static"

    const val RELATIVE_CATEGORY_BATTERY_IMAGE: String = "/category/battery.png"
    const val RELATIVE_CATEGORY_CREDIT_CARD_IMAGE: String = "/category/credit-card.png"
    const val RELATIVE_CATEGORY_PAPER_ROLL_IMAGE: String = "/category/toilet-roll.png"

    const val RELATIVE_CONTENT_BATTERY_CHARGING_IMAGE = "/content/battery-charging.png"
    const val RELATIVE_CONTENT_BATTERY_DISPERSION_IMAGE = "/content/battery-ko.png"
    const val RELATIVE_CONTENT_BATTERY_USAGE_MAINTENANCE_IMAGE = "/content/battery-reading.png"

    const val  RELATIVE_CONTENT_PAPER1_IMAGE = "/content/riciclab.jpg"
    const val  RELATIVE_CONTENT_PAPER2_IMAGE = "/content/pazzi-scontrini.jpg"

    const val RELATIVE_CONTENT_BATTERY_CHARGING_PAGE = "/page/charging_battery.html"
    const val RELATIVE_CONTENT_BATTERY_DISPERSION_PAGE = "/page/dispersion_battery.html"
    const val RELATIVE_CONTENT_BATTERY_USAGE_PAGE = "/page/usage_battery.html"

    const val RELATIVE_CONTENT_PAPER_FINISH_PAGE = "/page/paper_finish.html"
    const val RELATIVE_CONTENT_PAPER_JAM_PAGE = "/page/paper_jam.html"


}