package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Given("user opens app")
    public void user_opens_app() {
        
    }

    @When("user clicks on add button")
    public void user_clicks_on_add_button() {
        homePage.clickAddButton();
    }

    @Then("user adds event")
    public void user_adds_event() {
        
    }

    @When("user clicks on more button")
    public void userClicksOnMoreButton() {
        homePage.clickMoreButton();
    }

    @And("user clicks on notepad option")
    public void userClicksOnNotepadOption() {
        homePage.clickOnNotePadOption();
    }

}
