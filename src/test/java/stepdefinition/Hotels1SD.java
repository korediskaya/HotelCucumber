package stepdefinition;

import cucumber.api.java.en.*;
import org.testng.Assert;
import runnerTest.webPages.Hotels1;
import utils.BasePage;
import utils.ConfigReader;

public class Hotels1SD {

    private Hotels1 hotels= new Hotels1();

    @Given("^I am on default location search locations screen$")
    public void verifyHomePageUrlAntTitle(){
        Assert.assertEquals(BasePage.get().getCurrentUrl(), ConfigReader.getProperty("url"));
        Assert.assertEquals(BasePage.get().getTitle(),ConfigReader.getProperty("title"));
    }

    @When("^I enter (.+) and select (CityName|CheckIn|CheckOut|Rooms) field on the homepage page$")
    public void selectValues(String value,String selection){

        switch (selection){
            case "CityName":
                hotels.sendCityName(value);
                break;
            case "CheckIn":
                hotels.checkIn(value);
                break;
            case "CheckOut":
                hotels.checkOut(value);
                break;
            case "Rooms":
                hotels.setRooms(value);
        }
    }

    @And("^I select system displays all hotels within 10 or less mile radius of downtown$")
    public void findHotels(){
        hotels.clickOnSearch();
        hotels.clickOnCityCenter();
        hotels.printMileageList();
    }

    @Then ("^I select all Hilton hotels from previous list$")
    public void hiltonHotels(){
        hotels.findHiltonHotels();
    }

}
