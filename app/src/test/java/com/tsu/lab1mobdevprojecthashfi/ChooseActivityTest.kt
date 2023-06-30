package com.tsu.lab1mobdevprojecthashfi

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.core.app.launchActivity
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@Config(manifest = Config.NONE)
@RunWith(RobolectricTestRunner::class)
class ChooseActivityTest {
    @Test
    fun onCreate_shouldSetGreatText() {
        // Arrange
        val name = "John"
        val expectedText = "Hello, John! You're great!"

        val intent = Intent(ApplicationProvider.getApplicationContext(), ChooseActivity::class.java)
        intent.putExtra(ChooseActivity.NAME, name)

        val scenario = launchActivity<ChooseActivity>(intent)

        // Act
        val actualText = scenario.onActivity { activity ->
            activity.binding.textView3.text.toString()
        }

        // Assert
        assertEquals(expectedText, actualText)
    }

    @Test
    fun onCreate_shouldHideActionBar() {
        // Arrange
        val intent = Intent(ApplicationProvider.getApplicationContext(), ChooseActivity::class.java)

        val scenario = launchActivity<ChooseActivity>(intent)

        // Act
        val actualActionBarVisibility = scenario.onActivity { activity ->
            activity.supportActionBar?.isShowing
        }

        // Assert
        assertFalse(actualActionBarVisibility)
    }

    private fun assertFalse(actualActionBarVisibility: ActivityScenario<ChooseActivity>?) {

    }

    @Test
    fun onCreate_shouldStartMainActivity4_whenButton3Clicked() {
        // Arrange
        val intent = Intent(ApplicationProvider.getApplicationContext(), ChooseActivity::class.java)

        val scenario = launchActivity<ChooseActivity>(intent)

        // Act
        scenario.onActivity { activity ->
            activity.binding.button3.performClick()
        }

        // Assert
        intended(hasComponent(Running::class.java.name))
    }

    private fun intended(hasComponent: Any) {
        TODO("Not yet implemented")
    }

    @Test
    fun onCreate_shouldStartMainActivity5_whenButton4Clicked() {
        // Arrange
        val intent = Intent(ApplicationProvider.getApplicationContext(), ChooseActivity::class.java)

        val scenario = launchActivity<ChooseActivity>(intent)

        // Act
        scenario.onActivity { activity ->
            activity.binding.button4.performClick()
        }

        // Assert
        intended(hasComponent(Camping::class.java.name))
    }

    private fun hasComponent(name: String): Any {
        TODO("Not yet implemented")
    }

    @Test
    fun onCreate_shouldStartMainActivity6_whenButton5Clicked() {
        // Arrange
        val intent = Intent(ApplicationProvider.getApplicationContext(), ChooseActivity::class.java)

        val scenario = launchActivity<ChooseActivity>(intent)

        // Act
        scenario.onActivity { activity ->
            activity.binding.button5.performClick()
        }

        // Assert
        intended(hasComponent(Hiking::class.java.name))
    }

}
