package com.hunterhint.hunterhint.presentation

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.hunterhint.hunterhint.R


class MainActivity : AppCompatActivity(), GroundsListFragment.Listener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun itemClicked(id: Long) {

        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            val detail = GroundDetailFragment()
            detail.groundId = id.toInt()
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
// сохранить обёкт - страницу
// при перевороте - уничтожение активности и сохраниние текущего состояния
// при извлечении транзакции из стека возврата - открвается стартовая страница
// при сохраниении обекта страницы - при перевороте
// переворот - обёкт сохраняется один раз используется для востановления и больше не храниться
// переворот из - l в p cnhfybwf и использу5тся 1 раз
// переворот из p в l - ybxtuj yt ghjb[hjlbn