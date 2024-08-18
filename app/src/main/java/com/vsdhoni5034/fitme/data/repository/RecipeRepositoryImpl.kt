package com.vsdhoni5034.fitme.data.repository

import com.vsdhoni5034.fitme.data.api.ApiService
import com.vsdhoni5034.fitme.data.dto.RecipeDto
import com.vsdhoni5034.fitme.domain.RecipeRepository
import com.vsdhoni5034.fitme.util.Constants
import com.vsdhoni5034.fitme.util.Resource

class RecipeRepositoryImpl(
    private val apiService:
    ApiService
) : RecipeRepository {
    override suspend fun getSearchedRecipe(query: String): Resource<RecipeDto?> {
        TODO("Not yet implemented")
    }

    override suspend fun getBreakFastRecipes(): Resource<RecipeDto?> {
        try {
            val response = apiService.getGivenMealTypeRecipes(
                mealType = "Breakfast",
                caloriesRange = "100-300",
                diet = "balanced"
            )
            return if (response.isSuccessful) {
                Resource.Success(response.body())
            } else {
                Resource.Error(response.message())
            }
        } catch (ex: Exception) {
            println()
            return Resource.Error(ex.localizedMessage ?: "Something went wrong")
        }
    }

    override suspend fun getLunchRecipes(): Resource<RecipeDto?> {
        try {
            val response = apiService.getGivenMealTypeRecipes(
                mealType = Constants.LUNCH,
                caloriesRange = "500-800",
                diet = "high protein"
            )
            return if (response.isSuccessful) {
                Resource.Success(response.body())
            } else {
                Resource.Error(response.message())
            }
        } catch (ex: Exception) {
            println()
            return Resource.Error(ex.localizedMessage ?: "Something went wrong")
        }
    }

    override suspend fun getSnacksRecipes(): Resource<RecipeDto?> {
        try {
            val response = apiService.getGivenMealTypeRecipes(
                mealType = Constants.SNACK,
                caloriesRange = "200-300",
                diet = "balanced"
            )
            return if (response.isSuccessful) {
                Resource.Success(response.body())
            } else {
                Resource.Error(response.message())
            }
        } catch (ex: Exception) {
            println()
            return Resource.Error(ex.localizedMessage ?: "Something went wrong")
        }
    }

    override suspend fun getDinnerRecipes(): Resource<RecipeDto?> {
        try {
            val response = apiService.getGivenMealTypeRecipes(
                mealType = Constants.DINNER,
                caloriesRange = "500-800",
                diet = "low carb"
            )
            return if (response.isSuccessful) {
                Resource.Success(response.body())
            } else {
                Resource.Error(response.message())
            }
        } catch (ex: Exception) {
            println()
            return Resource.Error(ex.localizedMessage ?: "Something went wrong")
        }
    }
}