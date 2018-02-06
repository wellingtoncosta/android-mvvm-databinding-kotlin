package br.com.wellingtoncosta.amdk.util.schedulers

import io.reactivex.Scheduler
import io.reactivex.schedulers.TestScheduler

/**
 * @author wellingtoncosta on 05/02/18.
 */
class TestSchedulerProvider(private val testScheduler: TestScheduler) : BaseScheduler {

    override fun io(): Scheduler {
        return testScheduler
    }

    override fun ui(): Scheduler {
        return testScheduler
    }

}