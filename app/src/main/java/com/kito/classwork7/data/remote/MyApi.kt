package com.kito.classwork7.data.remote

import retrofit2.http.GET

interface MyApi {

    @GET("3/movie/550?api_key=8ae7bfece8bccdc8e4e9d4d42dd1f6f0")
    suspend fun doNetworkCall()
}