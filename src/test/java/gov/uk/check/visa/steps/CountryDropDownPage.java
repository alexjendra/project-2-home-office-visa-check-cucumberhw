package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CountryDropDownPage {
    @Then("I can see following country into dropdown {string}")
    public void iCanSeeFollowingCountryIntoDropdown(String country) {

    }

    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @Then("I can see following country into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown() {
        String country = null;
        String actualCountry = new SelectNationalityPage().selectCountryByName(country);
        Assert.assertEquals(actualCountry,country,"Country name not displayed");
    }
}
