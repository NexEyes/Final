package com.example.finalproject

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets



        }
    }

    fun topLeftClick(view: View) {


    }
    fun topMidClick(view: View) {


    }
    fun TopRightClick(view: View) {


    }
    fun midLeftClick(view: View) {


    }
    fun MiddleClick(view: View) {


    }
    fun midRightClick(view: View) {


    }
    fun botLeftClick(view: View) {


    }
    fun botMidClick(view: View) {


    }
    fun botRightClick(view: View) {


    }
}