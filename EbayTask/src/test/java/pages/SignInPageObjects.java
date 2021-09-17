package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPageObjects {

    public SignInPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver = null;

    String signInPageURL = "https://www.ebay.com/signin/";

    By textbox_emailOrUserName = By.id("userid");
    By button_continue = By.id("signin-continue-btn");
    By textbox_password = By.id("pass");
    By button_askMeLater = By.id("test-ask-me-later-btn");
    By button_SignIn = By.id("sgnBt");
    By link_signout = By.xpath("//*[@id=\"gh-uo\"]/a");

    public void loadSignInPage(WebDriver driver){
        driver.get(signInPageURL);
    }

    public void setTextIntextbox_EmailOrUserName(String searchTerm){
        driver.findElement(textbox_emailOrUserName).sendKeys(searchTerm);
    }

    public void clickContinueButton(){
        driver.findElement(button_continue).click();
    }

    public void setTextIntextbox_Password(String searchTerm){
        driver.findElement(textbox_password).sendKeys(searchTerm);
    }

    public void clickSignInButton(){
        driver.findElement(button_SignIn).click();
    }

    public void clickAskMeLaterButton(){
        if(driver.findElement(button_askMeLater).isDisplayed())
        {
            driver.findElement(button_askMeLater).click();
        }
    }
}
