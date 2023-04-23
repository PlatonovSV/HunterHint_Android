package com.hunterhint.hunterhint.presentation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.hunterhint.hunterhint.R
import com.hunterhint.hunterhint.presentation.models.Ground

class GroundListAdapter(
    private val mContext: Context,
    private val resourceLayout: Int,
    items: List<Ground>
) :
    ArrayAdapter<Ground>(mContext, resourceLayout, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var v = convertView
        if (v == null) {
            v = LayoutInflater.from(mContext).inflate(resourceLayout, null)
        }
        val ground: Ground? = getItem(position)
        if (ground != null) {
            val nameView = v!!.findViewById(R.id.ground_name) as TextView
            nameView.text = ground.name
            val imageView = v.findViewById(R.id.imageGroundList) as ImageView
            imageView.setImageResource(ground.imageId)
        }
        return v!!
    }
}