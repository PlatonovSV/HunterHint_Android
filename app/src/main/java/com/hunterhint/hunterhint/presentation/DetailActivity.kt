package com.hunterhint.hunterhint.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hunterhint.hunterhint.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val fragment = supportFragmentManager.findFragmentById(R.id.detail_frag)
                as GroundDetailFragment

        fragment.setGround(id = intent.extras!!.getInt(EXTRA_GROUND_ID))
    }

    companion object {
        const val EXTRA_GROUND_ID: String = "id"
    }
}