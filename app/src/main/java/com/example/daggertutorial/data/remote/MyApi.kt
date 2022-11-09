package com.example.daggertutorial.data.remote

import retrofit2.http.GET

interface MyApi {

    //suspend function can be stopped and started at a later time
    @GET("test")
    suspend fun doNetworkCall()
}