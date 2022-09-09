package com.kito.classwork7

import com.kito.classwork7.data.remote.MovieData
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

object RetrofitClient {

    private const val BASE_URL = "https://api.themoviedb.org/"
    val retrofitBuilder by lazy {
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getMovieData() =
        retrofitBuilder.create(MovieData::class.java)


}
