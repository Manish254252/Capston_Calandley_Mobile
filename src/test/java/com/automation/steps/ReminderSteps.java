package com.automation.steps;

import com.automation.pages.ReminderPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReminderSteps {
    ReminderPage reminderPage = new ReminderPage();

    @When("user clicks on add reminder")

    public void user_clicks_on_add_reminder() {
        reminderPage.clickOnAddReminder();
    }

    @When("user enters reminder name as {string}")
    public void user_enters_reminder_name_as(String string) {
        System.out.println(string);
        reminderPage.enterAddReminderText(ConfigReader.getConfigValue(string));
    }

    @Then("verify reminder is visible")
    public void verify_reminder_is_visible() {
//        Assert.assertTrue(reminderPage.isAttachIconDisplayed());
    }


    @And("user clicks on create reminder button")
    public void userClicksOnCreateReminderButton() {
        reminderPage.clickOnCreateBtn();
    }
}
