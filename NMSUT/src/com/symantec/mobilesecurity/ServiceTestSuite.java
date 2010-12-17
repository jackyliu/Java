/*
 * ServiceTestSuite.java 1.00 Fri Dec 17 11:06:52 +0800 2010
 *
 */

package com.symantec.mobilesecurity;
import junit.framework.TestSuite;
import android.test.suitebuilder.TestSuiteBuilder;
import junit.framework.Test;


/**
 * @version 1.00 
 * @author 
 */
public class ServiceTestSuite extends TestSuite{
    public static Test suite() {
        return new TestSuiteBuilder(ServiceTestSuite.class)
            .includePackages("com.symantec.mobilesecurity.service")
            .build();
    }
}
// vim: ft=java

