package com.hunterhint.hunterhint.domain.models

class User (val id:Int, val name:String, val lastName:String,
            val patronymic:String, val email:String,
            val  phoneNumber:String, val hashValue: String, val dynamicSalt:String)