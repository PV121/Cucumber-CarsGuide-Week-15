package com.carsguide.steps;

import com.carsguide.pages.UsedCarPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class UsedCarSteps {
    @And("^I click used cars link$")
    public void iClickUsedCarsLink() {
        new UsedCarPage().ClickOnUsedCar();
    }

    @Then("^I navigate to used car sale page$")
    public void iNavigateToUsedCarSalePage() {
    }
}
