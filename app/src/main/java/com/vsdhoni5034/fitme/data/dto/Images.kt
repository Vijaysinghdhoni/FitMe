package com.vsdhoni5034.fitme.data.dto


import com.google.gson.annotations.SerializedName

data class Images(
    @SerializedName("LARGE")
    val lARGE: LARGE? = null,
    @SerializedName("REGULAR")
    val rEGULAR: REGULAR = REGULAR(),
    @SerializedName("SMALL")
    val sMALL: SMALL = SMALL(),
    @SerializedName("THUMBNAIL")
    val tHUMBNAIL: THUMBNAIL = THUMBNAIL()
)