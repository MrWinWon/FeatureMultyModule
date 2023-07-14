package ru.mrwinwon.feature_home.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.mrwinwon.feature_home.HomeFragment

class HomeScreen : FragmentScreen {

    override fun createFragment(factory: FragmentFactory): Fragment {
        return HomeFragment()
    }
}