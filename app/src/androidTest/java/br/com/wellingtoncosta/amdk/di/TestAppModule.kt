package br.com.wellingtoncosta.amdk.di

import br.com.wellingtoncosta.amdk.data.remote.Api
import br.com.wellingtoncosta.amdk.data.remote.response.ApiListResponse
import br.com.wellingtoncosta.amdk.di.modules.ViewModelModule
import br.com.wellingtoncosta.amdk.domain.repository.ColorRepository
import br.com.wellingtoncosta.amdk.domain.repository.UserRepository
import br.com.wellingtoncosta.amdk.mock.Mocks.createColors
import br.com.wellingtoncosta.amdk.mock.Mocks.createUsers
import br.com.wellingtoncosta.amdk.util.schedulers.BaseScheduler
import br.com.wellingtoncosta.amdk.util.schedulers.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.Observable.just
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import javax.inject.Singleton

/**
 * @author wellingtoncosta on 06/02/18.
 */
@Module(includes = [(ViewModelModule::class)])
internal class TestAppModule {

    @Provides
    @Singleton
    fun provideApi(): Api {
        val api = mock<Api>(Api::class.java)
        `when`(api.fetchUsers()).thenReturn(just(ApiListResponse(
                0,
                0,
                0,
                0,
                createUsers()
        )))
        `when`(api.fetchColors()).thenReturn(just(ApiListResponse(
                0,
                0,
                0,
                0,
                createColors()
        )))
        return api
    }

    @Provides
    @Singleton
    fun provideUserRepository(api: Api): UserRepository {
        return UserRepository(api)
    }

    @Provides
    @Singleton
    fun provideRepoRepository(api: Api): ColorRepository {
        return ColorRepository(api)
    }

    @Provides
    @Singleton
    fun provideScheduler(): BaseScheduler {
        return SchedulerProvider()
    }

}