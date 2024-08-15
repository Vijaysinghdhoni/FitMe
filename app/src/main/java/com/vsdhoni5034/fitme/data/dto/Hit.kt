package com.vsdhoni5034.fitme.data.dto


import com.google.gson.annotations.SerializedName

data class Hit(
    @SerializedName("_links")
    val links: Links = Links(),
    @SerializedName("recipe")
    val recipe: Recipe = Recipe()
)