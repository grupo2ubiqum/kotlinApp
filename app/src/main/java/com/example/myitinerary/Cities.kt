package com.example.myitinerary

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.squareup.picasso.Picasso
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

        fetchCities()

        city_filter.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s != null && s.length > 0) {
                    showCities(filterCities(s))
                }
                else
                    showCities(cityList)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    fun filterCities(stringToFind: CharSequence): ArrayList<City>{
        val filteredList = ArrayList<City>()

        for( city in cityList){
            if(city.name.toLowerCase().startsWith(stringToFind.toString().toLowerCase()))
                filteredList.add(city)
        }

        return filteredList
    }

    fun showCities(cities: ArrayList<City>) {
        val adaptador = CustomAdapter(this, cities)
        lista_cities.adapter = adaptador
    }

    fun fetchCities(){
        val retrofit = Retrofit.Builder()
            .baseUrl("https://mytinerary-grupo2.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create<Api>(Api::class.java)

        service.getCities().enqueue(object : Callback<JsonObject> {
            override fun onResponse(call: Call<JsonObject>?, response: Response<JsonObject>?) {
                val resultado = response?.body()
                if (resultado != null) {
                    val cities = Gson().fromJson(resultado["ciudadesFromRoutes"], Array<City>::class.java)

                    val allCities = arrayListOf<City>()
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
}