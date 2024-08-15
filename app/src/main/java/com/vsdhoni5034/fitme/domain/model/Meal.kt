package com.vsdhoni5034.fitme.domain.model

data class Meal(
    val totalCalories: Double,
    val carbs: Double,
    val protein: Double,
    val fat: Double,
    val imageUrl: String,
    val ingredients: List<String>,
    val mealType: List<String>,
    val weight: Double,
    val totalTime: Double,
    val cuisineType: List<String>
)
