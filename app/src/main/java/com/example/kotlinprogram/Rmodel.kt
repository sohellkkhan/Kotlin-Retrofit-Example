package com.example.kotlinprogram

import android.media.Rating
import com.google.gson.annotations.SerializedName

class Rmodel {

   /* val body: String
    val id: Int
    val title: String
    val userId: Int

    constructor(body: String, id: Int, title: String, userId: Int) {
        this.body = body
        this.id = id
        this.title = title
        this.userId = userId
    }
    */

    @SerializedName("id"          ) var id          : Int?    = null
    @SerializedName("title"       ) var title       : String? = null
    @SerializedName("price"       ) var price       : Double? = null
    @SerializedName("description" ) var description : String? = null
    @SerializedName("category"    ) var category    : String? = null
    @SerializedName("image"       ) var image       : String? = null

}