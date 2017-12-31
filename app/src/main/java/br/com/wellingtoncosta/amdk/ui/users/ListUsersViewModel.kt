package br.com.wellingtoncosta.amdk.ui.users

import br.com.wellingtoncosta.amdk.data.remote.response.Response
import br.com.wellingtoncosta.amdk.data.remote.response.Status
import br.com.wellingtoncosta.amdk.domain.model.User
import br.com.wellingtoncosta.amdk.domain.repository.UserRepository
import br.com.wellingtoncosta.amdk.ui.base.BaseViewModel
import br.com.wellingtoncosta.amdk.util.schedulers.BaseScheduler
import javax.inject.Inject

/**
 * @author Wellington Costa on 31/12/2017.
 */
class ListUsersViewModel
@Inject constructor(
        private val scheduler: BaseScheduler,
        private val userRepository: UserRepository
) : BaseViewModel<List<User>>() {

    override fun loadData() {
        userRepository.getUsers()
                .subscribeOn(scheduler.io())
                .observeOn(scheduler.ui())
                .doOnSubscribe { loadingStatus.setValue(true) }
                .doAfterTerminate { loadingStatus.setValue(false) }
                .subscribe({
                    result -> response.setValue(Response(Status.SUCCESS, result.data, null))
                }, {
                    throwable -> response.setValue(Response(Status.SUCCESS, null, throwable))
                })

    }

}