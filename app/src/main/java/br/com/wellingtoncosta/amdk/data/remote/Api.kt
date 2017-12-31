package br.com.wellingtoncosta.amdk.data.remote

import br.com.wellingtoncosta.amdk.data.remote.response.ApiListResponse
import br.com.wellingtoncosta.amdk.domain.model.Color
import br.com.wellingtoncosta.amdk.domain.model.User
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * @author Wellington Costa on 30/12/2017.
 */
interface Api {

    @GET("users")
    fun fetchUsers(): Observable<ApiListResponse<User>>

    @GET("colors")
    fun fetchColors(): Observable<ApiListResponse<Color>>

}