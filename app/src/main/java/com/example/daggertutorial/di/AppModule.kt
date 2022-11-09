package com.example.daggertutorial.di

import com.example.daggertutorial.data.remote.MyApi
import com.example.daggertutorial.data.repository.MyRepositoryImplementation
import com.example.daggertutorial.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)  //ce e in paranteza dicteaza cat traiesc dependency-urile - aici singleton inseamna ca life-ul lor e cat al aplicatiei
//exista si ActivityComponent, ViewmodelComponent, RetainedComp (pt screen rotation), ServiceComp ...
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi{
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)

    }

    @Provides
    @Singleton
    fun provideMyRepository(api: MyApi): MyRepository{
        return MyRepositoryImplementation(api)
    }
}