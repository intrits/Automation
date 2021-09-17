package test;

import driver.*;
import helpers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.*;

public class AddProductToCartTest{

    @Before
    public void setUpTest()
    {
        DriverClass.InitialiseDriver();
    }

    @Test
    public void AddProductToCart() {
        WebPages.LoadURL(DriverClass.driver, WebPages.HomePage);

        DriverClass.driver.findElement(By.id("gh-ac")).sendKeys("outdoor pizza oven");
        DriverClass.driver.findElement(By.id("gh-btn")).click();
        DriverClass.driver.findElement(By.xpath("//div[2]/a/h3")).click();
        DriverClass.driver.findElement(By.id("atcRedesignId_btn")).click();
        DriverClass.driver.get("https://cart.payments.ebay.com/");

        //  Assert the site wide cart icon now displays a notification of '1'
        AssertMethods.assertGetElementTextEquals(DriverClass.driver.findElement(By.id("gh-cart-n")), "1");

        //  assert selected option of "1" in quantity menu
        AssertMethods.assertSelectedMenuOption(DriverClass.driver.findElement(By.className("listbox__control")), "1");
    }

    @After
    public void tearDownTest()
    {
        DriverClass.QuitDriver();
    }
}
