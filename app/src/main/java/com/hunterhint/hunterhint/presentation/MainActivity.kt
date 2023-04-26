package com.hunterhint.hunterhint.presentation

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.StrictMode
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.hunterhint.hunterhint.R


class MainActivity : AppCompatActivity(), GroundsListFragment.Listener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
    }

    override fun itemClicked(id: Long) {

        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            val detail = GroundDetailFragment()
            detail.setGround(id.toInt())
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, detail)
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            transaction.addToBackStack(null)
            transaction.commit()
        } else {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_GROUND_ID, id.toInt())
            startActivity(intent)
        }

    }
}