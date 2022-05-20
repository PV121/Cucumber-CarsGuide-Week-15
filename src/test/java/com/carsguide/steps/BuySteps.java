package com.carsguide.steps;

import com.carsguide.pages.Homepage;
import com.carsguide.pages.SelectCarspage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }


    @When("^I mouse hover on buy\\+sell tab$")
    public void iMouseHoverOnBuySellTab() throws InterruptedException {
        new Homepage().mouseHoverToBuyAndSellTabAndClickOnSearchCarsOption();
    }

    @And("^I click Search Cars link$")
    public void iClickSearchCarsLink() {
      //above method will do search cars link click.
    }

    @Then("^I navigate to new and used car search page$")
    public void iNavigateToNewAndUsedCarSearchPage() {

    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new SelectCarspage().selectMakeFromDropDown(make);
        System.out.println(make.toUpperCase());
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new SelectCarspage().selectModelFromDropDown(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new SelectCarspage().selectLocationFromDropDown(location);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new SelectCarspage().selectPriceFromDropDown(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new SelectCarspage().clickOnFindMyNextCarButton();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) {

        Assert.assertEquals("",make.toUpperCase(),new SelectCarspage().getTextFromMakes());

    }
}
