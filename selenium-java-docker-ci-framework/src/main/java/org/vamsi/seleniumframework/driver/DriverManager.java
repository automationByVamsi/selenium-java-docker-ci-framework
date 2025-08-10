package org.vamsi.seleniumframework.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {


    private DriverManager()
    {

    }

    private static final ThreadLocal<WebDriver> driverLocal = new ThreadLocal<>();

    public static WebDriver getDriverLocal() {
        return driverLocal.get();
    }


    public static void setDriverLocal(WebDriver driver) {
        driverLocal.set(driver);


    }

    public static void unloadDriverLocal() {
        driverLocal.remove();

    }

}




