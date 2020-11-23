package dev.base.expand.mvvm

import android.app.Application
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.base.able.IDevBaseViewModel
import dev.base.expand.viewdata.DevBaseViewDataBindingFragment
import dev.base.utils.assist.DevBaseViewModelAssist

/**
 * detail: Fragment MVVM 基类
 * @author Ttt
 */
abstract class DevBaseMVVMFragment<VDB : ViewDataBinding, VM : ViewModel> :
    DevBaseViewDataBindingFragment<VDB>(),
    IDevBaseViewModel<VM> {

    lateinit var viewModel: VM

    @JvmField // DevBase ViewModel 辅助类
    protected var viewModelAssist = DevBaseViewModelAssist()

    // =====================
    // = IDevBaseViewModel =
    // =====================

    override fun getAppViewModelProvider(application: Application?): ViewModelProvider? {
        return viewModelAssist.getAppViewModelProvider(application)
    }

    override fun getAppFactory(application: Application?): ViewModelProvider.Factory? {
        return viewModelAssist.getAppFactory(application)
    }
}