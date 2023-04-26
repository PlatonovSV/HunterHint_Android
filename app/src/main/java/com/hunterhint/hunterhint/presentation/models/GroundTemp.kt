package com.hunterhint.hunterhint.presentation.models

import java.io.Serializable

class GroundTemp(val name: String, val description: String, val imageId:Int):Serializable {
    override fun toString(): String {
        return name
    }

    companion object {
        private val serialVersionUID:Long = 1L
        val groundTemps = listOf(
            GroundTemp(
                "Big Game Hunting in Argentina '2023'",
                "Welcome to hunting on a private ranch in the heart of La Pampa (Patagonia Argentina)\n" +
                        "The lodge is 150 km (93 miles) apart from Santa Rosa (Capital of La Pampa), in the best hunting area surroundings with plenty of Red Deers, Blackbucks, Fallow Deers and Wild Boars, 87,000 acres of free-range extension.\n" +
                        "There is also a game farm (more than 2,000 acres) with excellent trophies (red deers, buffalos, plainsgames, fallow deer, rams and others) which is part of a breeding improvement plan.\n" +
                        "During your stay in the “Red Deer Land”, you will be taken care of at all times enjoying the services of a five star hotel and excellent meals.\n" +
                        "Every hunter is accompanied by a professional guide to guarantee the success of your hunt!\n",
                0
            ),
            GroundTemp(
                "Core Agony",
                "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats",
                1
            ),
            GroundTemp(
                "Big Game Hunt",
                "We suggest 3 days to complete a successful hunt. Our assistants and guides will take you very close. The rest is up to you.\n" +
                        "\n" +
                        "We are close to Buenos Aires, which adds an excellent bonus to continue resting after a strenuous hunting trip.\n" +
                        "\n" +
                        "You can add some days also for dove hunting.",
                2
            ),
            GroundTemp(
                "Duck hunt 3 days",
                "3 full day Duck hunt - 3,500.00 per person\n" +
                        "\n" +
                        "Includes:\n" +
                        "Transfer from Airport to Lodge - way round.\n" +
                        "12 boxes of shells per person.\n" +
                        "Full lodging, all meals, drinks.\n" +
                        "Guides.\n" +
                        "Guns.\n" +
                        "Licences.",
                3
            ),
            GroundTemp(
                "6 Days Red Stag & Wingshooting",
                "We offer 4 free range hunting days for Red stag, 2 days wingshooting, 7 nights lodging in the heart of La Pampa.\n" +
                        "This package is a special offer, however it may be modified to meet clients’ requests. The package price doesn't include non hunters. Additional days and non hunter can be added to the package by request.",
                4
            ),
            GroundTemp(
                "3 Days Dove and Pigeon NO LIMIT SHOOT",
                "The package includes 3 days lodging accommodation with private rooms in suite, meals & guiding, we can guarantee you 2000 shoots per day!\n" +
                        "Hunting season is all year round.",
                5
            ),
            GroundTemp(
                "Strength and Length",
                "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups",
                6
            ),
            GroundTemp(
                "Strength and Length",
                "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups",
                7
            )
        )
    }
}