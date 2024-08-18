package com.vsdhoni5034.fitme.domain

import com.vsdhoni5034.fitme.data.dto.Recipe
import com.vsdhoni5034.fitme.data.dto.RecipeDto
import com.vsdhoni5034.fitme.util.Resource

interface RecipeRepository {


    suspend fun getSearchedRecipe(query: String): Resource<RecipeDto?>

    suspend fun getBreakFastRecipes(): Resource<RecipeDto?>

    suspend fun getLunchRecipes(): Resource<RecipeDto?>

    suspend fun getSnacksRecipes(): Resource<RecipeDto?>

    suspend fun getDinnerRecipes(): Resource<RecipeDto?>

}