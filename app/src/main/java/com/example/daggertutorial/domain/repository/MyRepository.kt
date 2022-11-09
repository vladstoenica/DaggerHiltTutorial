package com.example.daggertutorial.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}