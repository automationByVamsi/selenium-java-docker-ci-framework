package org.vamsi.seleniumframework.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.vamsi.seleniumframework.constants.FrameworkConstants;
import org.vamsi.seleniumframework.driver.DriverManager;
import org.vamsi.seleniumframework.enums.WaitStrategy;

import java.time.Duration;

public final class WaitFactory {


    public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by)
    {

        WebElement element =null;
        if (waitStrategy == WaitStrategy.VISIBLE) {
           element = new WebDriverWait(DriverManager.getDriverLocal(),
                    Duration.ofSeconds(FrameworkConstants.getExplicitWait())).until(ExpectedConditions.visibilityOfElementLocated(by));


        } else if (waitStrategy == WaitStrategy.CLICKABLE) {
           element =  new WebDriverWait(DriverManager.getDriverLocal(),
                    Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
            .until(ExpectedConditions.elementToBeClickable(by));
        }

        else
        {
            element = DriverManager.getDriverLocal().findElement(by);
        }

        return element;

        }


    public static WebElement explicitlyWaitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriverLocal(),
                Duration.ofSeconds(FrameworkConstants.getExplicitWait()));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }




    public static WebElement performExplicitWait(WaitStrategy waitStrategy, WebElement element) {

        WebElement element1 =null;
        if (waitStrategy == WaitStrategy.VISIBLE) {
           element1 = new WebDriverWait(DriverManager.getDriverLocal(),
                    Duration.ofSeconds(FrameworkConstants.getExplicitWait())).
                    until(ExpectedConditions.visibilityOf(element));


        } else if (waitStrategy == WaitStrategy.CLICKABLE) {
           element1 = new WebDriverWait(DriverManager.getDriverLocal(), Duration.ofSeconds(25))
                    .until(ExpectedConditions.elementToBeClickable(element));
        }

        return element1;

    }
}
