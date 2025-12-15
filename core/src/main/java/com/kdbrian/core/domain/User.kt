package com.kdbrian.core.domain

interface User {
    val email: String
    val datejoined: Long
        get() = System.currentTimeMillis()
}