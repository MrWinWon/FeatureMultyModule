package ru.mrwinwon.feature_home.di

import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.FragmentScreen
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@EntryPoint
@InstallIn(FeatureHomeComponent::class)
interface FeatureHomeEntryPoint {
    fun getHomeScreen(): FragmentScreen
    fun getRouter(): Router
}