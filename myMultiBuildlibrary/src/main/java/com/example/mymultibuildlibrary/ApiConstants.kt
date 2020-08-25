package com.example.mymultibuildlibrary



object ApiConstants {


    val BASE_URL = getBaseUrl()

    fun getBaseUrl(): String {
        return when (BuildConfig.QA ) { //Todo hamdy
            FlavorType.DEVELOPING.value -> "http://dev.nashmi.co/"
            FlavorType.STAGING.value-> "http://stage.nashmi.co/"
            FlavorType.PRODUCTION.value -> "https://api.nashmi.co/"
            else -> "http://dev.nashmi.co/"
        }

    }
}