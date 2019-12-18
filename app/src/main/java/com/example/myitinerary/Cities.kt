package com.example.myitinerary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.cities_activity.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Cities : AppCompatActivity() {
    var cityList = ArrayList<City>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cities_activity)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://mytinerary-grupo2.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create<Api>(Api::class.java)
        service.getCities().enqueue(object : Callback<JsonObject> {

            override fun onResponse(call: Call<JsonObject>?, response: Response<JsonObject>?) {
                var resultado = response?.body()
                if (resultado != null) {
                    var cities = Gson().fromJson(resultado["ciudadesFromRoutes"], Array<City>::class.java)

                    var allCities = arrayListOf<City>()
                    for (ciudad in cities) {
                        allCities.add(ciudad)
                    }
                    cityList = allCities
                    showCities(allCities)
                }
            }

            override fun onFailure(call: Call<JsonObject>?, t: Throwable?) {
                t?.printStackTrace()
            }
        })
    }

    fun showCities(cities: ArrayList<City>) {
        val adaptador = CustomAdapter(this, cities)
        lista_cities.adapter = adaptador
    }
}