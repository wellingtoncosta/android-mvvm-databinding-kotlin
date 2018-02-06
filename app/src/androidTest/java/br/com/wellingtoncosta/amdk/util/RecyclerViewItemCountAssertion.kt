package br.com.wellingtoncosta.amdk.util

import android.support.test.espresso.NoMatchingViewException
import android.support.test.espresso.ViewAssertion
import android.support.test.espresso.matcher.ViewMatchers.assertThat
import android.support.v7.widget.RecyclerView
import android.view.View
import org.hamcrest.core.Is.`is`

/**
 * @author wellingtoncosta on 06/02/18.
 */
class RecyclerViewItemCountAssertion private constructor(private val expectedCount: Int) : ViewAssertion {

    override fun check(view: View, noViewFoundException: NoMatchingViewException?) {
        if (noViewFoundException != null) {
            throw noViewFoundException
        }

        val recyclerView = view as RecyclerView
        val actualItemCount = recyclerView.adapter.itemCount
        assertThat<Int>(actualItemCount, `is`<Int>(expectedCount))
    }

    companion object {

        fun hasItemCount(expectedCount: Int): RecyclerViewItemCountAssertion {
            return RecyclerViewItemCountAssertion(expectedCount)
        }
    }

}