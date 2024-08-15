package com.vsdhoni5034.fitme.data.api

import com.vsdhoni5034.fitme.util.Constants
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET(Constants.SEARCH_END_POINT)
    suspend fun getSearchRecipe(
        @Query("q") name: String,
    )

}