package com.tsu.lab1mobdevprojecthashfi

import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@Config(manifest = Config.NONE)
@RunWith(RobolectricTestRunner::class)
class MainActivity2Test {
    @Test
    fun testBindingVariableInitialized() {
        val activity2 = Robolectric.buildActivity(MainActivity::class.java).create().get()
        assertNotNull(activity2.binding.root)
    }

}