package org.vamsi.seleniumframework.pages.demoblaze;

import org.openqa.selenium.By;
import org.vamsi.seleniumframework.enums.WaitStrategy;
import org.vamsi.seleniumframework.pages.PageActions;

public final class ProductsHomePage extends PageActions {


    private final By link_phones= By.xpath("//a[.=\"Phones\"]");
    private final By link_laptops = By.xpath("//a[.=\"Laptops\"]");
    private final By link_monitors=  By.xpath("//a[.=\"Monitors\"]");
    private final By link_productName = By.xpath("//a[@href][.=\"ASUS Full HD\"]");


    public ProductsHomePage selectMonitorsCategory()
    {


        PageActions.click(link_monitors, WaitStrategy.CLICKABLE);
        return this;
    }

    public static ProductOverviewPage selectProduct(String name)
    {

        PageActions.clickWithDynamicLocator(name);
        return new ProductOverviewPage();
    }




}
