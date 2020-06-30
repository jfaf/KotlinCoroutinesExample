package com.example.CoroutinesFlow.data.model

import com.squareup.moshi.Json

/*
class for storing data. By using the notation "data" class User, the getters, setters, etc are already implied so we do not
need to create them.
 */

data class User(

    /*
    The @Json annotation helps to map the variable name to the Json identifier. It is not needed in this case
    as the names are the same as the identifiers and are valid Json values. This is best used in the case of
    @Json(name = "lucky number") int luckyNumber; where the name would not be valid as it has a space in between.
     */

    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "name")
    val name: String = "",
    @Json(name = "email")
    val email: String = "",
    @Json(name = "avatar")
    val avatar: String = ""
)