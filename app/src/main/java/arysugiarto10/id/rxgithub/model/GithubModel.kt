package arysugiarto10.id.rxgithub.model

import com.google.gson.annotations.SerializedName

data class GithubModel (
    val full_name: String?,
    val description: String?,
    val language: String?,
    @SerializedName("stargazers_count") val star: String? //menghubungkan menggunakan serialize name
)