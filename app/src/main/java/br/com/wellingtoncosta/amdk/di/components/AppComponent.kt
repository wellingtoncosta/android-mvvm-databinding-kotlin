package br.com.wellingtoncosta.amdk.di.components

import br.com.wellingtoncosta.amdk.App
import br.com.wellingtoncosta.amdk.di.modules.AppModule
import br.com.wellingtoncosta.amdk.di.modules.NetworkModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * @author Wellington Costa on 31/12/2017.
 */
@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class), (AppModule::class), (NetworkModule::class)])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()

}