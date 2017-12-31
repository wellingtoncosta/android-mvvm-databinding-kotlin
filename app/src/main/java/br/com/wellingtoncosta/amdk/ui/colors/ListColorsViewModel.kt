package br.com.wellingtoncosta.amdk.ui.colors

import br.com.wellingtoncosta.amdk.data.remote.response.Response
import br.com.wellingtoncosta.amdk.data.remote.response.Status
import br.com.wellingtoncosta.amdk.domain.model.Color
import br.com.wellingtoncosta.amdk.domain.repository.ColorRepository
import br.com.wellingtoncosta.amdk.ui.base.BaseViewModel
import br.com.wellingtoncosta.amdk.util.schedulers.BaseScheduler
import javax.inject.Inject

/**
 * @author Wellington Costa on 31/12/2017.
 */
class ListColorsViewModel
@Inject constructor(
        private val scheduler: BaseScheduler,
        private val colorRepository: ColorRepository
) : BaseViewModel<List<Color>>() {

    override fun loadData() {
        colorRepository.getColors()
                .subscribeOn(scheduler.io())
                .observeOn(scheduler.ui())
                .doOnSubscribe { loadingStatus.setValue(true) }
                .doAfterTerminate { loadingStatus.setValue(false) }
                .subscribe({
                    result -> response.setValue(Response(Status.SUCCESS, result.data, null))
                }, {
                    throwable -> response.setValue(Response(Status.ERROR, null, throwable))
                })
    }

}