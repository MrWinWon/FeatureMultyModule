package ru.mrwinwon.di

import ru.mrwinwon.feature_home.di.FeatureHomeComponent
import javax.inject.Inject
import javax.inject.Singleton

object FeatureProxyInjector {

}

@Singleton
class FeatureHomeComponentOwner @Inject constructor(
    private val componentBuilder: FeatureHomeComponent.Builder
) {
    private var flowFragmentComponent: FeatureHomeComponent? = null

    val component by lazy {
        flowFragmentComponent ?: componentBuilder.build().also { flowFragmentComponent = it }
    }

    fun destroyComponent() {
        flowFragmentComponent = null
    }
}