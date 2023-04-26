package com.hunterhint.hunterhint.presentation.repository

import android.graphics.Bitmap
import java.util.LinkedList

interface IImageRep {
    fun getImageListById(id: Int):LinkedList<Bitmap>
}