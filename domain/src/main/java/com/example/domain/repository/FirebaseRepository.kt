package com.example.domain.repository

import kotlinx.coroutines.flow.Flow

interface FirebaseRepository {

    fun fetchContactInfo(): Flow<String>
}