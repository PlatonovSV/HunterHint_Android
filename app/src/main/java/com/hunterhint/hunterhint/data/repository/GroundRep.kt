package com.hunterhint.hunterhint.data.repository

import com.hunterhint.hunterhint.presentation.models.GroundTemp
import com.hunterhint.hunterhint.presentation.repository.IGroundRep

class GroundRep:IGroundRep {
    override fun getGroundById(id: Int): GroundTemp {
        return GroundTemp.groundTemps[id]
    }
}