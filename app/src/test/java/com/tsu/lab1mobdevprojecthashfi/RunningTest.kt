package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows.shadowOf
import org.robolectric.annotation.Config

@Config(manifest = Config.NONE)
@RunWith(RobolectricTestRunner::class)
class RunningTest{
    @Test
    fun testButton6ClickStartsActivity7() {
        val activity = Robolectric.buildActivity(Running::class.java).create().get()
        activity.binding.button6.performClick()
        val expectedIntent = Intent(activity, WatchFilm::class.java)
        val actual = shadowOf(activity).nextStartedActivity
        assertEquals(expectedIntent.component, actual.component)
    }

    @Test
    fun testButton7ClickStartsActivity8() {
        val activity = Robolectric.buildActivity(Running::class.java).create().get()
        activity.binding.button7.performClick()
        val expectedIntent = Intent(activity, CelebrateHalloween::class.java)
        val actual = shadowOf(activity).nextStartedActivity
        assertEquals(expectedIntent.component, actual.component)
    }
}