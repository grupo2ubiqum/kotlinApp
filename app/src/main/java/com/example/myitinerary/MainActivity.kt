package com.example.myitinerary

import android.app.Activity
import android.content.ContentResolver
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ClickableSpan
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import androidx.core.text.set
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSerchCities.setOnClickListener {
            val intent = Intent(baseContext, Cities::class.java)
            startActivity(intent)
        }

        val loginText = "Create an Account."
        val ss = SpannableString(loginText)

        ss.setSpan(UnderlineSpan(), 0, 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        clickableText.text = ss

        clickableText.setOnClickListener{
            val intent = Intent(baseContext, CreateAcount::class.java)
            startActivity(intent)
        }
    }
}
