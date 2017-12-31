package br.com.wellingtoncosta.amdk.di.modules

import br.com.wellingtoncosta.amdk.ui.colors.ListColorsFragment
import dagger.Module
import br.com.wellingtoncosta.amdk.ui.users.ListUsersFragment
import dagger.android.ContributesAndroidInjector

/**
 * @author Wellington Costa on 31/12/2017.
 */
@Module
interface FragmentBuildersModule {

    @ContributesAndroidInjector
    fun contributeListUsersFragment(): ListUsersFragment

    @ContributesAndroidInjector
    fun contributeListColorsFragment(): ListColorsFragment

}