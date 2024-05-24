package com.example.finalproject

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
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
        val text: TextView = findViewById(R.id.topLeftButton) as TextView
        text.setOnClickListener {
            text.setText(getString(R.string.playerMove))
        }

    }
    fun topMidClick(view: View) {
        val text: TextView = findViewById(R.id.TopMiddlebutton) as TextView
        text.setOnClickListener {
            text.setText(getString(R.string.playerMove))
        }

    }
    fun TopRightClick(view: View) {
        val text: TextView = findViewById(R.id.topRightbutton) as TextView
        text.setOnClickListener {
            text.setText(getString(R.string.playerMove))
        }

    }
    fun midLeftClick(view: View) {
        val text: TextView = findViewById(R.id.midRightbutton) as TextView
        text.setOnClickListener {
            text.setText(getString(R.string.playerMove))
        }

    }
    fun MiddleClick(view: View) {
        val text: TextView = findViewById(R.id.Middlebutton) as TextView
        text.setOnClickListener {
            text.setText(getString(R.string.playerMove))
        }

    }
    fun midRightClick(view: View) {
        val text: TextView = findViewById(R.id.midRightbutton) as TextView
        text.setOnClickListener {
            text.setText(getString(R.string.playerMove))
        }

    }
    fun botLeftClick(view: View) {
        val text: TextView = findViewById(R.id.botLeftbutton) as TextView
        text.setOnClickListener {
            text.setText(getString(R.string.playerMove))
        }

    }
    fun botMidClick(view: View) {
        val text: TextView = findViewById(R.id.botMiddlebutton) as TextView
        text.setOnClickListener {
            text.setText(getString(R.string.playerMove))
        }

    }
    fun botRightClick(view: View) {
        val text: TextView = findViewById(R.id.botRightbutton) as TextView
        text.setOnClickListener {
            text.setText(getString(R.string.playerMove))
        }

    }
}