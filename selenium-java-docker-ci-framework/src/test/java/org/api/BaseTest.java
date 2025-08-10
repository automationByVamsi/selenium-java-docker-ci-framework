package org.api;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.vamsi.seleniumframework.driver.DriverUtils;

public class BaseTest
{


    @BeforeMethod
    protected void setup()
    {
        DriverUtils.initDriver();
    }


    @AfterMethod
    protected void teardown()
    {
        DriverUtils.quitDriver();
    }
}
