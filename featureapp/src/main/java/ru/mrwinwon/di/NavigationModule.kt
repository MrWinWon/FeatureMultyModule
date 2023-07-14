package ru.mrwinwon.di

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import org.intellij.lang.annotations.Flow
import ru.mrwinwon.feature_home.di.FeatureHomeComponent
import javax.inject.Singleton

@Module
@InstallIn(FeatureHomeComponent::class)
class NavigationModule {

    @Provides
    @Flow
    @Singleton
    fun provideCicerone(): Cicerone<Router> = Cicerone.create()

    @Provides
    @Flow
    @Singleton
    fun provideRouter(@Singleton cicerone: Cicerone<Router>) = cicerone.router

    @Provides
    @Flow
    @Singleton
    fun provideNavigatorHolder(@Singleton cicerone: Cicerone<Router>) =
        cicerone.getNavigatorHolder()

    @Provides
    @Singleton
    fun provideFeatureHomeComponentOwner(componentBuilder: FeatureHomeComponent.Builder) =
        FeatureHomeComponentOwner(componentBuilder)
}