package pages;

import driver.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPages{

    public WebPages(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver = null;

    public static String HomePage = "https://www.ebay.com";
    public static String SignInPage = "https://www.ebay.com/signin/";
    public static String CarsAndTrucks = "https://www.ebay.com/b/Cars-Trucks/6001/bn_1865117";

    public static void LoadURL(WebDriver driver, String url){
        driver.get(url);
        //  Dismiss popup throwing off selectors from category menu
        WebElement acceptPrivacyPopUp = driver.findElement(By.id("gdpr-banner-accept"));
        if (acceptPrivacyPopUp.isDisplayed())
        {
            acceptPrivacyPopUp.click();
        }
    }
}
