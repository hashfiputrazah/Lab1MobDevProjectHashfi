package com.tsu.lab1mobdevprojecthashfi

import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@Config(manifest = Config.NONE)
@RunWith(RobolectricTestRunner::class)
class MainActivityTest {
    @Test
    fun testBindingVariableInitialized() {
        val activity = Robolectric.buildActivity(MainActivity::class.java).create().get()
        assertNotNull(activity.binding.root)
    }

}