package org.vamsi.seleniumframework.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.Objects;

public final class DriverUtils {

    private static WebDriver driver;
    private DriverUtils() {
    }

    public static void initDriver()
    {


        if(Objects.isNull(DriverManager.getDriverLocal())) {

            ChromeOptions options = new ChromeOptions();
           options.addArguments("--disable-notifications");
            options.addArguments("--disable-notifications");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--start-maximized"); // or --window-size=1920,1080
            options.addArguments("--disable-blink-features=AutomationControlled"); // make it less "bot-like"
            options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
            options.setExperimentalOption("useAutomationExtension", false);

            driver = new ChromeDriver(options);
            DriverManager.setDriverLocal(driver);


        }

    }


    public static void quitDriver()
    {
        if(!Objects.isNull(driver))
        {
            DriverManager.getDriverLocal().quit();
            DriverManager.unloadDriverLocal();
        }
    }


}
