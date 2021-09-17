package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePageObjects{

    public HomePageObjects(WebDriver driver){
        this.driver = driver;
    }

    WebDriver driver = null;

    By textbox_search = By.id("gh-ac");
    By button_search = By.id("gh-btn");
    By heading = By.xpath("//div[@class=\"main-header\"]");
    By logoutBtn = By.id("submit");
    String homePageURL = "https://www.ebay.com";

    public String getHeadingText() {
        String headingText = driver.findElement(heading).getText();
        return headingText;
    }
}
