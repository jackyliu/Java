package com.symantec.mobilesecurity.ui;

import android.test.ActivityInstrumentationTestCase2;
import junit.framework.Assert;
import android.test.MoreAsserts;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.symantec.mobilesecurity.ui.MainScreenTest \
 * com.symantec.mobilesecurity.tests/android.test.InstrumentationTestRunner
 */
public class MainScreenTest extends ActivityInstrumentationTestCase2<MainScreen> {

    public MainScreenTest() {
        super("com.symantec.mobilesecurity", MainScreen.class);
    }
    public void testABC() {
        MoreAsserts.assertContainsRegex("regex sample", "[a-z]{3}", "he1lo");
        //Assert.assertTrue(false);
        //assertEquals("hello", 1, 2);
    }

}
