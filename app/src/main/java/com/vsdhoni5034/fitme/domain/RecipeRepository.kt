package com.vsdhoni5034.fitme.domain

import com.vsdhoni5034.fitme.data.dto.RecipeDto

interface RecipeRepository {


    suspend fun getSearchedRecipe(query: String): RecipeDto

}