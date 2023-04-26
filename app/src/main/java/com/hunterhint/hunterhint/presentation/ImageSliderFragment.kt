package com.hunterhint.hunterhint.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.hunterhint.hunterhint.R
import com.hunterhint.hunterhint.data.repository.ImageRep
import com.hunterhint.hunterhint.presentation.adapters.ViewPagerAdapter
import com.hunterhint.hunterhint.presentation.repository.IImageRep

class ImageSliderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_image_slider, container, false)
        val viewPager = view.findViewById<ViewPager>(R.id.viewPager)
        val imageRep:IImageRep = ImageRep()
        val imageList = imageRep.getImageListById(0)
        val adapter = ViewPagerAdapter(inflater.context, imageList)
        viewPager.adapter = adapter
        return view
    }
}