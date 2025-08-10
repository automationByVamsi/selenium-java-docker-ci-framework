package org.vamsi.seleniumframework.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.vamsi.seleniumframework.constants.FrameworkConstants;
import org.vamsi.seleniumframework.driver.DriverManager;
import org.vamsi.seleniumframework.enums.WaitStrategy;
import org.vamsi.seleniumframework.factory.WaitFactory;

import java.time.Duration;

public class PageActions {

    protected PageActions(){}


    protected static void click(By ele, WaitStrategy waitStrategy)
    {

        WebElement element = WaitFactory.performExplicitWait(waitStrategy,ele);
        element.click();
    }

    protected static void click(WebElement ele,WaitStrategy waitStrategy)
    {
        WebElement element = WaitFactory.performExplicitWait(waitStrategy,ele);
        element.click();
    }


    protected static void sendKeys(By ele,String input,WaitStrategy waitStrategy)
    {
        WebElement element = WaitFactory.performExplicitWait(waitStrategy,ele);
        element.sendKeys(input);
    }



    protected static void clickWithDynamicLocator(String name)
    {
        String placeholderProductName="//a[@href][.=\"%s\"]";
        String actualProduct = placeholderProductName.replace("%s",name);
        By dynamicLocator = By.xpath(actualProduct);
       WebElement ele = WaitFactory.explicitlyWaitForElementToBeClickable(dynamicLocator);
        click(ele,WaitStrategy.CLICKABLE);
    }


    protected static void acceptAlert()
    {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriverLocal(),
                Duration.ofSeconds(FrameworkConstants.getExplicitWait()));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = DriverManager.getDriverLocal().switchTo().alert();


        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);

        alert.accept();
    }


}
