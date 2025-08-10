package org.api;

import com.google.common.util.concurrent.Uninterruptibles;
import org.testng.annotations.Test;
import org.vamsi.seleniumframework.driver.DriverManager;
import org.vamsi.seleniumframework.enums.ConfigProperties;
import org.vamsi.seleniumframework.pages.demoblaze.ProductsHomePage;
import org.vamsi.seleniumframework.utils.ConfigLoader;

import java.util.concurrent.TimeUnit;

public class DemoBlazeTest extends BaseTest {


    @Test
    public void signUpAndPlaceOrder() throws Exception {

        DriverManager.getDriverLocal().get(ConfigLoader.getValueFromConfigMap(ConfigProperties.URL));

        ProductsHomePage cartHomePage = new ProductsHomePage();
        cartHomePage.selectMonitorsCategory().selectProduct("ASUS Full HD")
                .clickOnAddToCart()
                .navigateToCart()
                .clickOnPlaceOrder();


        Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);


    }
}
