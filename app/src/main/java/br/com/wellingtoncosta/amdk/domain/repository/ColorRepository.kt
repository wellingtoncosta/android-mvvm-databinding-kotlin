package br.com.wellingtoncosta.amdk.domain.repository

import br.com.wellingtoncosta.amdk.data.remote.Api
import br.com.wellingtoncosta.amdk.data.remote.response.ApiListResponse
import br.com.wellingtoncosta.amdk.domain.model.Color
import io.reactivex.Observable
import javax.inject.Inject

/**
 * @author Wellington Costa on 30/12/2017.
 */
class ColorRepository @Inject constructor(private val api: Api) {

    fun getColors(): Observable<ApiListResponse<Color>> {
        return api.fetchColors()
    }

}