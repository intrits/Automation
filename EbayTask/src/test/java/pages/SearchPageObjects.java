package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPageObjects {

    public SearchPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver = null;

    public String HomePage = "https://www.ebay.com";
    String CarsAndTrucksURL = "https://www.ebay.com/b/Cars-Trucks/6001/bn_1865117";

    By shopByCategoryMenu = By.id("gh-shop-ei");
    By linkText_CarsAndTrucks = By.linkText("Cars & trucks");
    By SelectMenu_Make = By.name("Make");
    By SelectMenu_Model = By.name("Model");
    By SelectMenu_Condition = By.name("LH_ItemCondition");
    By textbox_ZipCode = By.name("_stpos");
    By button_FindVehicle = By.className("motors-finder__find-btn");

    public void clickShopByCategoryMenu(){
        driver.findElement(shopByCategoryMenu).click();
    }

    public void clickLinkText(){
        driver.findElement(linkText_CarsAndTrucks).click();
    }

    public void SetTextIntextbox_ZipCode(String searchTerm){
        //  clear auto complete entries first
        driver.findElement(textbox_ZipCode).clear();
        driver.findElement(textbox_ZipCode).sendKeys(searchTerm);
    }

    public void selectMakeByText(String make){
        Select allCategory = new Select(driver.findElement(SelectMenu_Make));
        allCategory.selectByVisibleText(make);
    }

    public void selectModelByText(String model){
        Select allCategory = new Select(driver.findElement(SelectMenu_Model));
        allCategory.selectByVisibleText(model);
    }

    public void selectConditionByText(String condition){
        Select allCategory = new Select(driver.findElement(SelectMenu_Condition));
        allCategory.selectByVisibleText(condition);
    }

    public void clickFindVehicleButton(){
        driver.findElement(button_FindVehicle).click();
    }
}
