package ru.mrwinwon.di

import android.os.Bundle
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner
import dagger.hilt.EntryPoints
import ru.mrwinwon.feature_home.di.FeatureHomeEntryPoint
import ru.mrwinwon.featureapp.MainViewModel

@Suppress("UNCHECKED_CAST")
fun featureHomeFactory(
    savedStateRegistryOwner: SavedStateRegistryOwner,
    componentsOwner: FeatureHomeComponentOwner,
    arguments: Bundle?
) = object : AbstractSavedStateViewModelFactory(savedStateRegistryOwner, arguments) {
    override fun <T : ViewModel> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {
        val flowEntryPoint = EntryPoints.get(
            componentsOwner.component,
            FeatureHomeEntryPoint::class.java
        )
        return flowEntryPoint.run {
            MainViewModel(
                featureHomeScreen = getHomeScreen(),
                router = getRouter()
            ) as T
        }
    }
}