package com.example.myapplication.data

object SearchRepositoryProvider {

    fun provideSearchRepository()
        : SearchRepository
        = SearchRepository(BashImApiService.create())
}