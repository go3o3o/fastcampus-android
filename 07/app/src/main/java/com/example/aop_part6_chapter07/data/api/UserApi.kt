package com.example.aop_part6_chapter07.data.api

import com.google.firebase.firestore.auth.User

interface UserApi {

    suspend fun saveUser(user: User): User
}