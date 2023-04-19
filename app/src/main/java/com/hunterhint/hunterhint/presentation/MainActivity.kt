package com.hunterhint.hunterhint.presentation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.hunterhint.hunterhint.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onShowDetails(view: View) {
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
}