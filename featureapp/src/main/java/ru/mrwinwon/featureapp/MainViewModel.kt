package ru.mrwinwon.featureapp

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.mrwinwon.feature_home.navigation.HomeScreen

class MainViewModel(
    private val router: Router,
    private val featureHomeScreen: FragmentScreen
): ViewModel() {

    fun getHomeScreen() = router.navigateTo(featureHomeScreen)

}