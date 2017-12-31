package br.com.wellingtoncosta.amdk.util.schedulers

import android.support.annotation.NonNull
import io.reactivex.Scheduler



/**
 * @author Wellington Costa on 31/12/2017.
 */
interface BaseScheduler {

    @NonNull
    fun io(): Scheduler

    @NonNull
    fun ui(): Scheduler

}