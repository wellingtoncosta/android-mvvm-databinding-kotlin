package br.com.wellingtoncosta.amdk.domain.repository

import br.com.wellingtoncosta.amdk.data.remote.Api
import br.com.wellingtoncosta.amdk.data.remote.response.ApiListResponse
import br.com.wellingtoncosta.amdk.domain.model.User
import io.reactivex.Observable
import javax.inject.Inject

/**
 * @author Wellington Costa on 30/12/2017.
 */
class UserRepository @Inject constructor(private val api: Api) {

    fun getUsers(): Observable<ApiListResponse<User>> {
        return api.fetchUsers()
    }

}