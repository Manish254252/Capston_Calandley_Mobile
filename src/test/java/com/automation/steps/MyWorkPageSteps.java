package com.automation.steps;

import com.automation.pages.MyWorkPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyWorkPageSteps {

    MyWorkPage myWorkPage = new MyWorkPage();

    @Then("verify my work page is displayed")
    public void verifyMyWorkPageIsDisplayed() {
        Assert.assertTrue(myWorkPage.isMyWorkPageDisplayed());
    }

    @When("user clicks on overdue task button")
    public void userClicksOnOverdueTaskButton() {
        myWorkPage.clickOnOverdueTaskBtn();
    }

    @Then("verify overdue tasks are displayed")
    public void verifyOverdueTasksAreDisplayed() {
        Assert.assertTrue(myWorkPage.isOverdueTaskDisplayed());
    }

    @Then("verify overdue tasks of name {string} is displayed")
    public void verifyOverdueTasksOfNameIsDisplayed(String overdueTask) {

    }

    @When("user clicks on done button")
    public void userClicksOnDoneButton() {
        myWorkPage.clickOnDoneBtn();
    }

    @And("clicks on back button of myWork page")
    public void clicksOnBackButtonOfMyWorkPage() {
        myWorkPage.clickOnWorkPageBackBtn();
    }
}
