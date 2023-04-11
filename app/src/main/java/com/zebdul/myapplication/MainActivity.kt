package com.zebdul.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zebdul.instalib.instaLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        instaLibrary.simpleToast(this,"Welcome")
    }
}