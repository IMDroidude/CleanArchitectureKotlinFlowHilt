package com.example.data.di

import com.example.core.prefs.PrefStore
import com.example.core.prefs.SharedPrefStore
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class UtilityModule {

    @Binds
    abstract fun bindPrefStore(sharedPrefStore: SharedPrefStore): PrefStore

    /*@Binds
    abstract fun bindFirebaseRepository(firebaseRepositoryImpl: FirebaseRepositoryImpl): FirebaseRepository*/
}