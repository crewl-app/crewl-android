package com.alis.repository.onboarding

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

class OnboardingRepository @Inject constructor(context: Context) {
    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "onboardingPreferences")

    private object PreferencesKey {
        val onboardingKey = booleanPreferencesKey(name = "isOnboardingCompleted")
    }

    private val dataStore = context.dataStore

    fun readOnboardingState(): Flow<Boolean> = dataStore.data.catch { exception ->
        if (exception is IOException)
            emit(emptyPreferences())
        else
            throw exception
    }.map { preferences ->
        val onboardingState = preferences[PreferencesKey.onboardingKey] ?: false
        onboardingState
    }

    suspend fun saveOnboardingState(isCompleted: Boolean) {
        dataStore.edit { preferences ->
            preferences[PreferencesKey.onboardingKey] = isCompleted
        }
    }

    /* Todo: Add HMS Onboarding library */
}