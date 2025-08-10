package org.vamsi.seleniumframework.constants;

public final class FrameworkConstants {

    private FrameworkConstants()
    {

    }

    private static final String WEBSITE_URL = "https://orgfarm-6798934e40-dev-ed.develop.my.salesforce.com/";
    private static final String ORANGE_HRM = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    private static final String CONFIG_RESOURCE_PATH= System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
    private static final int EXPLICIT_WAIT = 60;



    public static String getWebsiteURL(String website)
    {
        if(website.equals(ORANGE_HRM))
        {
            return ORANGE_HRM;
        }
        return WEBSITE_URL;
    }

    public static String getConfigResourcePath()
    {
        return CONFIG_RESOURCE_PATH;
    }

    public static int getExplicitWait()
    {
        return EXPLICIT_WAIT;
    }
}
