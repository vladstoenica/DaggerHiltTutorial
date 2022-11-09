package com.example.daggertutorial.data.repository

import com.example.daggertutorial.data.remote.MyApi
import com.example.daggertutorial.domain.repository.MyRepository

class MyRepositoryImplementation(
    private val api: MyApi
): MyRepository {
    override suspend fun doNetworkCall() {

    }
}