package com.kito.classwork7.data.remote

import retrofit2.http.GET

interface MyApi {

    @GET("4167a598-b68c-420f-b6e1-fef68b89a10d")
    suspend fun doNetworkCall()
}