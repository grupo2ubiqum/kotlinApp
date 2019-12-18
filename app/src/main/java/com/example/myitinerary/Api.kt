package com.example.myitinerary

import com.google.gson.JsonObject
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("/api/cities")
    fun getCities(): Call<JsonObject>
}