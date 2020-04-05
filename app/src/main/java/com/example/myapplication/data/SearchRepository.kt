package com.example.myapplication.data

class SearchRepository(val apiService: BashImApiService) {

    private val QUOTES_NUM: Int = 50

    fun searchQuotes(site: String, name: String, num: Int = QUOTES_NUM)
            : io.reactivex.Observable<List<Quote>>
            = apiService.searchQuotes(site, name, num)

    fun searchSourcesOfQoutes()
            : io.reactivex.Observable<List<SourceOfQuotes>>
            = apiService.searchSources()
}