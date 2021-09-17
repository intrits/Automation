package helpers;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AssertMethods {

    public static WebDriver driver;
    public static String HomePage = "https://www.ebay.com";

    public static void main(String[] args){
    }

    public static void assertTitleEquals(WebDriver driver, String expectedTitle) {
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }

    public static void assertElementExists(WebDriver driver, By by) {
        Boolean isPresent = driver.findElements(by).size() > 0;
    }

    public static void assertGetElementTextEquals(WebElement element, String expectedString) {
        Assert.assertEquals(expectedString, element.getText());
    }

    public static void assertSelectedMenuOption(WebElement element, String expectedOption) {

        boolean menuOption = false;

        Select selectElement = new Select(element);
        List<WebElement> optionElements = selectElement.getAllSelectedOptions();

        for (WebElement option : optionElements) {
            if(option.getText().equals(expectedOption)) {
                menuOption=true;
            }
        }
        Assert.assertTrue("Expected menu option was not selected: " + expectedOption,menuOption);
    }
}

