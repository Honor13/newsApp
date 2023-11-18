package com.example.newsapp.di

import com.example.newsapp.data.datasource.NewsDataSource
import com.example.newsapp.data.repo.NewsRepository
import com.example.newsapp.retrofit.ApiUtils
import com.example.newsapp.retrofit.NewsHeadLineDao
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
    fun provideNewsDataSource(nDaoInterface : NewsHeadLineDao):NewsDataSource {
        return  NewsDataSource(nDaoInterface)
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


}