package com.vsdhoni5034.fitme.data.dto


import com.google.gson.annotations.SerializedName

data class THUMBNAIL(
    @SerializedName("height")
    val height: Int = 0,
    @SerializedName("url")
    val url: String = "",
    @SerializedName("width")
    val width: Int = 0
)