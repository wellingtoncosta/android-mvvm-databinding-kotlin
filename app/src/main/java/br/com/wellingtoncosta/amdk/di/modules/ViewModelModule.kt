package br.com.wellingtoncosta.amdk.di.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import br.com.wellingtoncosta.amdk.di.keys.ViewModelKey
import br.com.wellingtoncosta.amdk.ui.common.ViewModelFactory
import br.com.wellingtoncosta.amdk.ui.users.ListUsersViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * @author Wellington Costa on 31/12/2017.
 */
@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ListUsersViewModel::class)
    fun bindListUsersViewModel(listUsersViewModel: ListUsersViewModel) : ViewModel

    @Binds
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

}