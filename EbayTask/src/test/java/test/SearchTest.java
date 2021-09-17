package test;

import driver.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.*;
import pages.*;

public class SearchTest{

    @Before
    public void setUpTest()
    {
        DriverClass.InitialiseDriver();
    }

    @Test
      public void searchProduct(){

        WebPages.LoadURL(DriverClass.driver, WebPages.HomePage);

        SearchPageObjects PageObj = new SearchPageObjects(DriverClass.driver);

        //  Shop by cars and trucks category
        PageObj.clickShopByCategoryMenu();
        PageObj.clickLinkText();

        //  Find a vehicle - specifiy search criteria @ search filter
        PageObj.selectMakeByText("Mercedes-Benz");
        PageObj.selectModelByText("C63 AMG S");
        PageObj.SetTextIntextbox_ZipCode("BT1 3NQ");
        PageObj.selectConditionByText("Used");
        PageObj.clickFindVehicleButton();
    }

    @After
    public void tearDownTest()
    {
        DriverClass.QuitDriver();
    }
}
