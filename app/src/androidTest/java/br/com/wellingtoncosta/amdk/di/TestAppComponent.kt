package br.com.wellingtoncosta.amdk.di

import br.com.wellingtoncosta.amdk.TestApp
import br.com.wellingtoncosta.amdk.di.modules.ActivityBuildersModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * @author wellingtoncosta on 06/02/18.
 */
@Singleton
@Component(modules = [
    (AndroidSupportInjectionModule::class),
    (ActivityBuildersModule::class),
    (TestAppModule::class)
])
interface TestAppComponent : AndroidInjector<TestApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<TestApp>()

}