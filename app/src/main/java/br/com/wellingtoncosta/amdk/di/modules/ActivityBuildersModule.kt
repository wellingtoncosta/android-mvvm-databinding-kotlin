package br.com.wellingtoncosta.amdk.di.modules

import br.com.wellingtoncosta.amdk.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author Wellington Costa on 31/12/2017.
 */
@Module
interface ActivityBuildersModule {

    @ContributesAndroidInjector(/*modules = {FragmentBuildersModule.class}*/)
    fun contributeMainActivity(): MainActivity

}