package com.vsdhoni5034.fitme.data.api

import com.vsdhoni5034.fitme.BuildConfig
import com.vsdhoni5034.fitme.data.dto.RecipeDto
import com.vsdhoni5034.fitme.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET(Constants.SEARCH_END_POINT)
    suspend fun getSearchRecipe(
        @Query("q") name: String,
    ): Response<RecipeDto>

    @GET(Constants.SEARCH_END_POINT)
    suspend fun getGivenMealTypeRecipes(
        @Query("type") type: String = "public",
        @Query("app_id") appId: String = BuildConfig.APPLICATION_ID,
        @Query("app_key") appKey: String = BuildConfig.APPLICATION_KEY,
        @Query("diet") diet: String,
        @Query("mealType") mealType: String,
        @Query("calories") caloriesRange: String,
    ): Response<RecipeDto>

}