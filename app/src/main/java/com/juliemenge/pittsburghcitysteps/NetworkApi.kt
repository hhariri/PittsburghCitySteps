package com.juliemenge.pittsburghcitysteps

import java.net.URL

class NetworkApi {
    fun getDataFromServer(neighborhood: String): String {
        // Review: Use String Templates as opposed to concatenation
        val storage = "\"43f40ca4-2211-4a12-8b4f-4d052662bb64\""
        return URL("https://data.wprdc.org/api/action/datastore_search_sql?sql=SELECT * from $storage WHERE neighborhood LIKE $neighborhood").readText()
    }
}