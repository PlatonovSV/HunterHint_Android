package com.hunterhint.hunterhint.presentation.models

import com.hunterhint.hunterhint.R

class Ground
private constructor(val name: String, val description: String, val imageId:Int) {

    override fun toString(): String {
        return name
    }

    companion object {
        val grounds = listOf(
            Ground(
                "The Limb Loosener",
                "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups",
                R.drawable.i1
            ),
            Ground(
                "Core Agony",
                "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats",
                R.drawable.i2
            ),
            Ground(
                "The Wimp Special",
                "5 Pull-ups\n10 Push-ups\n15 Squats",
                R.drawable.i3
            ),
            Ground(
                "Strength and Length",
                "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups",
                R.drawable.i4
            ),
            Ground(
                "Strength and Length",
                "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups",
                R.drawable.i5
            ),
            Ground(
                "Strength and Length",
                "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups",
                R.drawable.i6
            ),
            Ground(
                "Strength and Length",
                "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups",
                R.drawable.i7
            ),
            Ground(
                "Strength and Length",
                "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups",
                R.drawable.i1
            )
        )
    }
}