package com.hunterhint.hunterhint.presentation.repository

import com.hunterhint.hunterhint.presentation.models.GroundTemp

interface IGroundRep {
    fun getGroundById(id:Int):GroundTemp
}