package com.vsdhoni5034.fitme.data.dto


import com.google.gson.annotations.SerializedName

data class RecipeDto(
    @SerializedName("count")
    val count: Int = 0,
    @SerializedName("from")
    val from: Int = 0,
    @SerializedName("hits")
    val hits: List<Hit> = listOf(),
    @SerializedName("_links")
    val links: LinksX = LinksX(),
    @SerializedName("to")
    val to: Int = 0
)