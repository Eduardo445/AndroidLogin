package edu.csumb.esotorodriguez.androidlogin;

import android.content.Context;
import android.content.Intent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void intentTest() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        Intent intent = Welcome.getIntent(appContext, 42);
        assertEquals("edu.csumb.esotorodriguez.androidlogin.Welcome", intent.resolveActivity(appContext.getPackageManager()).getClassName());
    }
}