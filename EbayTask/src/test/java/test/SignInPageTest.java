package test;

import driver.*;
import pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInPageTest{

    @Before
    public void setUpTest()
    {
        DriverClass.InitialiseDriver();
    }

    @Test
    public void AccountSignin()
    {
        WebPages.LoadURL(DriverClass.driver, WebPages.SignInPage);

        SignInPageObjects PageObj = new SignInPageObjects(DriverClass.driver);

        PageObj.loadSignInPage(DriverClass.driver);

        PageObj.setTextIntextbox_EmailOrUserName("usertest1account@protonmail.com");
        PageObj.clickContinueButton();

        PageObj.setTextIntextbox_Password("pass123!!!");
        PageObj.clickSignInButton();

        PageObj.clickAskMeLaterButton();
    }

    @After
    public void tearDownTest()
    {
        DriverClass.QuitDriver();
    }
}
