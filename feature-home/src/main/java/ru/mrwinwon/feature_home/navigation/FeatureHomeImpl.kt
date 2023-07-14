package ru.mrwinwon.feature_home.navigation

import com.github.terrakok.cicerone.Router
import ru.mrwinwon.feature_home.di.FeatureHomeEntryPoint
import javax.inject.Inject

class FeatureHomeImpl @Inject constructor(
    private val router: Router
) : FeatureHomeEntryPoint {
    override fun getHomeScreen(): HomeScreen {
        return HomeScreen()
    }

    override fun getRouter() = router
}