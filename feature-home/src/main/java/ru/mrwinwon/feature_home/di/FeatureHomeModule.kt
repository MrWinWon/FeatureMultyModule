package ru.mrwinwon.feature_home.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import ru.mrwinwon.core_lib.di.PerFeature
import ru.mrwinwon.feature_home.navigation.FeatureHomeImpl

@Module
@InstallIn(FeatureHomeComponent::class)
abstract class FeatureHomeModule {

    @PerFeature
    @Binds
    abstract fun provideHome(client: FeatureHomeImpl): FeatureHomeEntryPoint
}