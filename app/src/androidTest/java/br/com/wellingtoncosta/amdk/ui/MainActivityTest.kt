package br.com.wellingtoncosta.amdk.ui

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.view.View
import br.com.wellingtoncosta.amdk.R
import br.com.wellingtoncosta.amdk.util.RecyclerViewItemCountAssertion.Companion.hasItemCount
import org.hamcrest.core.AllOf.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnit

/**
 * @author wellingtoncosta on 06/02/18.
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java, true, true)

    @Rule
    @JvmField
    var mockitoRule = MockitoJUnit.rule()

    @Test
    fun showActivityWithSuccess() {
        onView(withId(R.id.tabs))
                .check(matches(isDisplayed()))
    }

    @Test
    fun listUsersWithSuccess() {
        onView(allOf<View>(
                withId(R.id.recycler_view),
                isDescendantOfA(withId(R.id.list_users))
        )).check(hasItemCount(3))
    }

    @Test
    fun listColorssWithSuccess() {
        onView(allOf<View>(
                withText(R.string.colors),
                isDescendantOfA(withId(R.id.tabs))
        )).perform(click())

        onView(allOf<View>(
                withId(R.id.recycler_view),
                isDescendantOfA(withId(R.id.list_colors))
        )).check(hasItemCount(3))
    }

}