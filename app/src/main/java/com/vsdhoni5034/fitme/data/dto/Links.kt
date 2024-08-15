package com.vsdhoni5034.fitme.data.dto


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("self")
    val self: Self = Self()
)