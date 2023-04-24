package com.hunterhint.hunterhint.presentation

import android.graphics.drawable.Drawable
import android.os.Bundle
import com.hunterhint.hunterhint.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.hunterhint.hunterhint.presentation.models.Ground


class GroundDetailFragment : Fragment() {
    var groundId:Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ground_detail, container, false)
    }

    override fun onStart() {
        super.onStart()
        val view = view
        if (view != null) {
            val title = view.findViewById(R.id.textTitle) as TextView
            val ground: Ground = Ground.grounds[groundId]
            title.text = ground.name
            val description = view.findViewById(R.id.textDescription) as TextView
            description.text =ground.description
        }
    }

}