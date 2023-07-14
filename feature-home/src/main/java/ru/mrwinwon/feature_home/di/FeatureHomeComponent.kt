package ru.mrwinwon.feature_home.di

import dagger.hilt.DefineComponent
import dagger.hilt.components.SingletonComponent
import ru.mrwinwon.core_lib.di.PerFeature

@PerFeature
@DefineComponent(parent = SingletonComponent::class)
interface FeatureHomeComponent {
    @DefineComponent.Builder
    interface Builder {
        fun build(): FeatureHomeComponent
    }
}