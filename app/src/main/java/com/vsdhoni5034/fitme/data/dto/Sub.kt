package com.vsdhoni5034.fitme.data.dto


import com.google.gson.annotations.SerializedName

data class Sub(
    @SerializedName("daily")
    val daily: Double = 0.0,
    @SerializedName("hasRDI")
    val hasRDI: Boolean = false,
    @SerializedName("label")
    val label: String = "",
    @SerializedName("schemaOrgTag")
    val schemaOrgTag: String? = null,
    @SerializedName("tag")
    val tag: String = "",
    @SerializedName("total")
    val total: Double = 0.0,
    @SerializedName("unit")
    val unit: String = ""
)