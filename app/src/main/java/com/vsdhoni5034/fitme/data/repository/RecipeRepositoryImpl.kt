package com.vsdhoni5034.fitme.data.repository

import com.vsdhoni5034.fitme.data.dto.RecipeDto
import com.vsdhoni5034.fitme.domain.RecipeRepository

class RecipeRepositoryImpl : RecipeRepository {
    override suspend fun getSearchedRecipe(query: String): RecipeDto {
        TODO("Not yet implemented")
    }
}