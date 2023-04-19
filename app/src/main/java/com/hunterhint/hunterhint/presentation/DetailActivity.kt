package com.hunterhint.hunterhint.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hunterhint.hunterhint.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val fragment = supportFragmentManager.findFragmentById(R.id.detail_frag)
                as GroundDetailFragment
        fragment.groundId = 1

    }
}