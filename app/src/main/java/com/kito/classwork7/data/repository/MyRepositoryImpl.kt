package com.kito.classwork7.data.repository

import android.app.Application
import com.kito.classwork7.R
import com.kito.classwork7.data.remote.MyApi
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("")
    }

    override suspend fun doNetworkCall() {

    }
}