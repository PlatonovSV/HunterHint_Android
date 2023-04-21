package com.hunterhint.hunterhint.presentation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hunterhint.hunterhint.R


class MainActivity : AppCompatActivity(), GroundsListFragment.Listener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun itemClicked(id: Long) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_GROUND_ID, id.toInt())
        startActivity(intent)
    }
}
