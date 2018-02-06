package br.com.wellingtoncosta.amdk.viewmodel

import android.arch.core.executor.testing.InstantTaskExecutorRule
import android.arch.lifecycle.Observer
import br.com.wellingtoncosta.amdk.data.remote.response.ApiListResponse
import br.com.wellingtoncosta.amdk.data.remote.response.Response
import br.com.wellingtoncosta.amdk.domain.model.User
import br.com.wellingtoncosta.amdk.domain.repository.UserRepository
import br.com.wellingtoncosta.amdk.mock.Mocks.createUsers
import br.com.wellingtoncosta.amdk.ui.users.ListUsersViewModel
import br.com.wellingtoncosta.amdk.util.schedulers.TestSchedulerProvider
import io.reactivex.Observable.just
import io.reactivex.schedulers.TestScheduler
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito.*

/**
 * @author wellingtoncosta on 05/02/18.
 */
@RunWith(JUnit4::class)
class ListUsersViewModelTest {

    @Rule
    @JvmField
    val instantExecutor = InstantTaskExecutorRule()

    private lateinit var userRepository: UserRepository

    private lateinit var listUsersViewModel: ListUsersViewModel

    @Before
    fun setUp() {
        userRepository = mock<UserRepository>(UserRepository::class.java)
        listUsersViewModel = ListUsersViewModel(
                TestSchedulerProvider(TestScheduler()),
                userRepository
        )
        `when`(userRepository.getUsers()).thenReturn(just(ApiListResponse(
                0,
                0,
                0,
                0,
                createUsers()
        )))
    }

    @Test
    fun empty() {
        val result = mock(Observer::class.java)
        listUsersViewModel.response.observeForever(result as Observer<Response<List<User>>>)
        verifyNoMoreInteractions(userRepository)
    }

    @Test
    fun loadUsersWithSuccess() {
        val result = mock(Observer::class.java)
        listUsersViewModel.response.observeForever(result as Observer<Response<List<User>>>)
        listUsersViewModel.loadData()
        verify<UserRepository>(userRepository).getUsers()
    }

}