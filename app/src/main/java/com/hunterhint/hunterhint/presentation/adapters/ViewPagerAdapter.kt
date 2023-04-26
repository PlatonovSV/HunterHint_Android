package com.hunterhint.hunterhint.presentation.adapters
import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.hunterhint.hunterhint.R
import java.util.LinkedList
import java.util.Objects


class ViewPagerAdapter(// Context object
    context: Context, // Array of images
    private var images: LinkedList<Bitmap>
) :
    PagerAdapter() {
    // Layout Inflater
    private var mLayoutInflater: LayoutInflater

    // Viewpager Constructor
    init {
        mLayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getCount(): Int {
        // return the number of images
        return images.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as ImageView
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        // inflating the item.xml
        val itemView = mLayoutInflater.inflate(R.layout.item, container, false)

        // referencing the image view from the item.xml file
        val imageView = itemView.findViewById(R.id.imageViewMain) as ImageView

        // setting the image in the imageView
        imageView.setImageBitmap(images[position])

        // Adding the View
        Objects.requireNonNull(container).addView(itemView)
        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ImageView)
    }
}