package com.kdbrian.core.service

import com.kdbrian.core.domain.User

interface AuthenticationService {
    val currentUser: User?
        get() = null

    suspend fun signInEmailPassword(email: String, password: String): Result<Boolean>
    suspend fun signInPhoneNumber(phoneNumber: String): Result<Boolean>
    suspend fun signUpEmailPassword(email: String, password: String): Result<Boolean>
    suspend fun verifyEmail(email: String)
    fun signOut(): Result<Boolean>

}