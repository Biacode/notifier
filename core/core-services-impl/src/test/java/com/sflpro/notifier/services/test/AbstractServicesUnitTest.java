package com.sflpro.notifier.services.test;

import com.sflpro.notifier.services.helper.ServicesImplTestHelper;
import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.junit.Ignore;
import org.junit.runner.RunWith;

import java.util.UUID;

/**
 * User: Ruben Dilanyan
 * Company: SFL LLC
 * Date: 10/01/14
 * Time: 10:18 PM
 */
@RunWith(EasyMockRunner.class)
@Ignore
public abstract class AbstractServicesUnitTest extends EasyMockSupport {

    /* Properties */
    private final ServicesImplTestHelper servicesImplTestHelper;

    public AbstractServicesUnitTest() {
        servicesImplTestHelper = new ServicesImplTestHelper();
    }

    /* Utility methods */
    protected boolean isWindowsOS() {
        return System.getProperty("os.name").contains("win");
    }

    /* Getters and setters */
    protected ServicesImplTestHelper getServicesImplTestHelper() {
        return servicesImplTestHelper;
    }

    public static String uuid(){
        return UUID.randomUUID().toString();
    }
}
