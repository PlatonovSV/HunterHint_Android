package com.hunterhint.hunterhint.data.repository

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.hunterhint.hunterhint.presentation.repository.IImageRep
import java.net.HttpURLConnection
import java.net.URL
import java.util.LinkedList


class ImageRep: IImageRep {

    companion object {
        val bitmaps:LinkedList<Bitmap> = LinkedList<Bitmap>()
    }


    override fun getImageListById(id: Int): LinkedList<Bitmap> {
        if (bitmaps.isEmpty()) {
            val urls = arrayListOf(
                "https://wp-s.ru/wallpapers/9/14/511940900554254/goluboe-oblachnoe-nebo-nad-dolinoj-i-gorami.jpg",
                "https://i.pinimg.com/originals/29/ad/06/29ad06fbaa3f80f154d4d3044486d12a.jpg",
                "https://images3.alphacoders.com/201/thumb-1920-201555.jpg",
                "https://images.hdqwalls.com/download/forest-lakeside-stock-5k-bv-1152x864.jpg",
                "https://img5.goodfon.ru/original/1600x1200/a/c6/ozero-gory-sosny.jpg",
                "https://10wallpaper.com/wallpaper/1280x1024/1805/China_Jiuzhaigou_Parks_Autumn_Lake_Mountains_1280x1024.jpg",
                "https://publish.com.ua/images/2022/05/20/moraine-lake_5120x3414_gyjf4_large.jpg",
                "https://i.pinimg.com/originals/53/2e/be/532ebe8d65bceb24516228700b924be5.jpg",
                "https://cdn.culture.ru/images/9b0f83ef-f2d3-5b93-9d01-94d063bfe39f",
                "https://s1.1zoom.me/b5050/474/354282-admin_1920x1200.jpg",
                "https://st-gdefon.gallery.world/wallpapers_original/242041_gallery.world.jpg"
            )

            for (address in urls) {

                val url = URL(address)
                val connection = url.openConnection() as HttpURLConnection
                connection.requestMethod = "GET"
                val responseCode = connection.responseCode
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    val inputStream = connection.inputStream
                    val bitmap = BitmapFactory.decodeStream(inputStream)
//            val stream = ByteArrayOutputStream()
//            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream)
//            val byteArray = stream.toByteArray()
//            val inputStream2 = ByteArrayInputStream(byteArray)
//            val bitmap2 = BitmapFactory.decodeStream(inputStream2)
                    bitmaps.add(bitmap)
                }
            }
        }

        return bitmaps
    }
}