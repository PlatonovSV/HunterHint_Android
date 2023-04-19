package com.hunterhint.hunterhint.presentation

class Ground
private constructor(val name: String, val description: String) {

    override fun toString(): String {
        return name
    }

    companion object {
        val grounds = arrayOf(
            Ground(
                "The Limb Loosener",
                "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"
            ),
            Ground(
                "Core Agony",
                "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"
            ),
            Ground(
                "The Wimp Special",
                "5 Pull-ups\n10 Push-ups\n15 Squats"
            ),
            Ground(
                "Strength and Length",
                "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups"
            ),
            Ground(
                "Strength and Length",
                "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups"
            ),
            Ground(
                "Strength and Length",
                "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups"
            ),
            Ground(
                "Strength and Length",
                "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups"
            ),
            Ground(
                "Strength and Length",
                "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups"
            )
        )
    }
}