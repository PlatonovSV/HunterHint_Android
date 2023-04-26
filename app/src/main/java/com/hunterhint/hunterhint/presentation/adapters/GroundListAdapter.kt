package com.hunterhint.hunterhint.presentation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.hunterhint.hunterhint.R
import com.hunterhint.hunterhint.data.repository.ImageRep
import com.hunterhint.hunterhint.presentation.models.GroundTemp
import com.hunterhint.hunterhint.presentation.repository.IImageRep

class GroundListAdapter(
    private val mContext: Context,
    private val resourceLayout: Int,
    items: List<GroundTemp>
) :
    ArrayAdapter<GroundTemp>(mContext, resourceLayout, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var v = convertView
        if (v == null) {
            v = LayoutInflater.from(mContext).inflate(resourceLayout, null)
        }
        val groundTemp: GroundTemp? = getItem(position)
        val imageRep:IImageRep = ImageRep()
        val imageList = imageRep.getImageListById(0)
        if (groundTemp != null) {
            val nameView = v!!.findViewById(R.id.ground_name) as TextView
            nameView.text = groundTemp.name
            val imageView = v.findViewById(R.id.imageGroundList) as ImageView
            imageView.setImageBitmap(imageList[groundTemp.imageId])
        }
        return v!!
    }
}