
package com.example.notereminder

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testAppContext() {
        /* Test case: Memastikan nama package aplikasi sesuai dengan konfigurasi */
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.notereminder", appContext.packageName)
    }

    @Test
    fun testActivityLaunch() {
        /* Test case: Memastikan MainActivity berhasil diluncurkan */
        val activity = activityRule.activity
        assertNotNull(activity)
    }
}
