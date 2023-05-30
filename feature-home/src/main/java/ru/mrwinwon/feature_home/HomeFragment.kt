package ru.mrwinwon.feature_home

import androidx.fragment.app.viewModels
import ru.mrwinwon.core_lib.base.BaseFragment
import ru.mrwinwon.feature_home.databinding.HomeFragmentBinding
import vsukharew.viewbindingdelegation.fragmentViewBinding

class HomeFragment(): BaseFragment<HomeFragmentBinding, HomeViewModel>(R.layout.home_fragment) {
    override val binding: HomeFragmentBinding by fragmentViewBinding(HomeFragmentBinding::bind)
    override val viewModel: HomeViewModel by viewModels()
}