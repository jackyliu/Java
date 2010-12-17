/*
 * HelloTest.java 1.00 Fri Dec 17 11:09:09 +0800 2010
 *
 */

package com.symantec.mobilesecurity.service;
import android.test.AndroidTestCase;
import junit.framework.Assert;


/**
 * @version 1.00 
 * @author 
 */
public class HelloTest extends AndroidTestCase {
    public void testHello() {
        Assert.assertTrue(1 + 1 == 2);
    }
    public void testHelloFailed() {
        Assert.assertTrue(1 + 1 == 2);
    }
}
// vim: ft=java

