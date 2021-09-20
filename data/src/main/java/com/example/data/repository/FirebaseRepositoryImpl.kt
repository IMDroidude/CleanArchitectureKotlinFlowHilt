package com.example.data.repository

import com.example.domain.repository.FirebaseRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FirebaseRepositoryImpl @Inject constructor(
    //add dataSource here...
): FirebaseRepository {
    override fun fetchContactInfo(): Flow<String> = flow {
        emit("Loading..")
        kotlinx.coroutines.delay(200)
        emit("Wao")
    }
}