package test;

import driver.*;
import pages.*;
import helpers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class HomePageTest{

    @Before
    public void setUpTest()
    {
        DriverClass.InitialiseDriver();
    }

    @Test
    public void LoadHomePage()
    {
        WebPages.LoadURL(DriverClass.driver, WebPages.HomePage);

        AssertMethods.assertTitleEquals(DriverClass.driver,"Electronics, Cars, Fashion, Collectibles & More | eBay");
        AssertMethods.assertElementExists(DriverClass.driver, By.id("gh-ac"));
    }

    @After
    public void tearDownTest()
    {
        DriverClass.QuitDriver();
    }
}
