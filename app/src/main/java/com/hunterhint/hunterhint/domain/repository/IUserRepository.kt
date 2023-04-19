package com.hunterhint.hunterhint.domain.repository

import com.hunterhint.hunterhint.domain.models.User

interface IUserRepository {
    fun getUserById(userId: Int): User
}