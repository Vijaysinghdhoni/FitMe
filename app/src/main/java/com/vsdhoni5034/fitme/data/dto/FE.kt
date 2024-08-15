package com.vsdhoni5034.fitme.data.dto


import com.google.gson.annotations.SerializedName

data class FE(
    @SerializedName("label")
    val label: String = "",
    @SerializedName("quantity")
    val quantity: Double = 0.0,
    @SerializedName("unit")
    val unit: String = ""
)