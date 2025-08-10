package org.vamsi.seleniumframework.pages.demoblaze;

import org.openqa.selenium.By;
import org.vamsi.seleniumframework.enums.WaitStrategy;
import org.vamsi.seleniumframework.pages.PageActions;

public final class CartPage extends PageActions
{

     CartPage(){}

    private static final By link_cart =By.xpath("//a[.=\"Cart\"]");
     private static final By button_placeOrder = By.xpath("//button[.=\"Place Order\"]");

     public CartPage navigateToCart()
     {
         PageActions.click(link_cart, WaitStrategy.CLICKABLE);
         return this;
     }

     public void clickOnPlaceOrder()
     {
         PageActions.click(button_placeOrder,WaitStrategy.CLICKABLE);
     }






}
