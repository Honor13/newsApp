package com.example.newsapp.di

import com.example.newsapp.data.datasource.NewsDataSource
import com.example.newsapp.data.repo.NewsRepository
import com.example.newsapp.retrofit.ApiUtils
import com.example.newsapp.retrofit.NewsHeadLineDao
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {


    @Provides
    @Singleton
    fun provideNewsDataSource(nDaoInterface : NewsHeadLineDao,collectionFavorites:CollectionReference):NewsDataSource {
        return  NewsDataSource(nDaoInterface,collectionFavorites)
    }


    @Provides
    @Singleton
    fun provideNewsRepository(nDatasource : NewsDataSource):NewsRepository {
        return NewsRepository(nDatasource)
    }

    @Provides
    @Singleton
    fun provideNewsHeadLinesDao() : NewsHeadLineDao {
        return ApiUtils.getHeadLinesDao()
    }

    @Provides
    @Singleton
    fun providesCollectionFavorites() : CollectionReference {
        return Firebase.firestore.collection("Favorites")
    }


}