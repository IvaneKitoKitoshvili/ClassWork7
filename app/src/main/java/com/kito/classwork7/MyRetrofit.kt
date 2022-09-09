package com.kito.classwork7

import com.kito.classwork7.data.CourseData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private const val BASE_URL = "https://run.mocky.io/v3/"
    val retrofitBuilder by lazy {
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getMovieData() =
        retrofitBuilder.create(CourseData::class.java)


}
