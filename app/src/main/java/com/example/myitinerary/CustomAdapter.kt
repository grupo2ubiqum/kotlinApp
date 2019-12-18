package com.example.myitinerary

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import com.squareup.picasso.Picasso


class CustomAdapter(var context: Context, var city: ArrayList<City>) : BaseAdapter(){

    private class ViewHolder(row: View?){
        var txtName: TextView
        var imgCity: ImageView

        init{
            this.txtName = row?.findViewById(R.id.txtName) as TextView
            this.imgCity = row?.findViewById(R.id.imgCity) as ImageView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder
        if(convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.image_with_text, parent, false)
            viewHolder = ViewHolder((view))
            view.tag = viewHolder
        }
        else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var city: City = getItem(position) as City
        println(city)
        viewHolder.txtName.text = city.name
        viewHolder.txtName.id = position

        Picasso.get().load(city.image).fit().into(viewHolder.imgCity)
        viewHolder.imgCity.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent( context, ItineraryActivity::class.java)
                intent.putExtra("cityName", city.name)
                startActivity(context, intent, Bundle())
            }
        })

        return view as View
    }

    override fun getItem(position: Int): Any {
        return city.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return city.count()
    }

}