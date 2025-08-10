package org.vamsi.seleniumframework.pages.demoblaze;

import org.openqa.selenium.By;
import org.vamsi.seleniumframework.enums.WaitStrategy;
import org.vamsi.seleniumframework.pages.PageActions;

public final class ProductOverviewPage extends PageActions {


    private static By button_addToCart = By.xpath("//a[.=\"Add to cart\"]");


    public static CartPage clickOnAddToCart()
    {
        PageActions.click(button_addToCart, WaitStrategy.CLICKABLE);
        PageActions.acceptAlert();
        return new CartPage();
    }




}
