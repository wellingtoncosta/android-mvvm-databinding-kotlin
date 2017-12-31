package br.com.wellingtoncosta.amdk.domain.model

import com.google.gson.annotations.SerializedName

/**
 * @author Wellington Costa on 30/12/2017.
 */
data class Color (
        @SerializedName("id") val id: Int,
        @SerializedName("name") val name: String,
        @SerializedName("year") val year: Int,
        @SerializedName("color") val color: String
)