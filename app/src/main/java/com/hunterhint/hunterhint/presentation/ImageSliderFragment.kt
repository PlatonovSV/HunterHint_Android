package com.hunterhint.hunterhint.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.hunterhint.hunterhint.R
import com.hunterhint.hunterhint.presentation.adapters.ViewPagerAdapter

class ImageSliderFragment : Fragment() {
    private val images = intArrayOf(
        R.drawable.i1, R.drawable.i2, R.drawable.i3, R.drawable.i4,
        R.drawable.i5, R.drawable.i6, R.drawable.i7, R.drawable.i8, R.drawable.i9
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_image_slider, container, false)
        val viewPager = view.findViewById<ViewPager>(R.id.viewPager)
        val adapter = ViewPagerAdapter(inflater.context, images)
        viewPager.adapter = adapter
        return view
    }
}