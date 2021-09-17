package StepDefinitions;

import driver.*;
import helpers.*;
import StepDefinitions.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.*;

public class HomePageTestSteps{

    @Given("A user initialises the chrome driver")
    public void A_User_Initialises_The_Chrome_Driver() {
        DriverClass.InitialiseDriver();
    }

    @When("The user navigates to the home page")
    public void The_User_Navigates_To_The_HomePage() {
        WebPages.LoadURL(DriverClass.driver, WebPages.HomePage);
    }

    @Then("The title of the page should equal:")
    public void Aseert_Title_Of_HomePage() {
        AssertMethods.assertTitleEquals(DriverClass.driver,"Electronics, Cars, Fashion, Collectibles & More | eBay");
    }
    
    @Then("The search text box should be present on the home page")
    public void Aseert_Element_Present() {
        AssertMethods.assertElementExists(DriverClass.driver, By.id("gh-ac"));
        DriverClass.QuitDriver();
    }




}
