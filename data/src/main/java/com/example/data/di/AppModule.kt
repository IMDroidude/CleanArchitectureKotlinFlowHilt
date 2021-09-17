package com.example.data.di

import android.content.Context
import com.example.core.prefs.SharedPrefStore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun providePrefs(@ApplicationContext context: Context): SharedPrefStore {
        return SharedPrefStore(context)
    }

    /*@Provides
    fun provideFirebaseDatabase():FirebaseDatabase{
        return FirebaseDatabase.getInstance()
    }*/
}