package ru.mrwinwon.core_lib.base

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<V : ViewBinding, VM : BaseViewModel>(
    @LayoutRes private val layoutResId: Int
) : Fragment(layoutResId) {

    protected abstract val binding: V
    abstract val viewModel: VM

}