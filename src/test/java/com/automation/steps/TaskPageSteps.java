package com.automation.steps;

import com.automation.pages.TaskPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TaskPageSteps {

    TaskPage taskPage = new TaskPage();

    @Then("verify user is on task description page")
    public void verifyUserIsOnTaskDescriptionPage() {
        Assert.assertTrue(taskPage.isTaskPageDisplayed());
    }

    @When("user clicks on task status type")
    public void userClicksOnTaskStatusType() {
        taskPage.clickTaskStatusType();
    }

    @Then("verify status types is displayed")
    public void verifyStatusTypesIsDisplayed() {
        Assert.assertTrue(taskPage.isStatusTypesDisplayed());
    }

    @When("user clicks on complete task option")
    public void userClicksOnCompleteTaskOption() {
        taskPage.clickCompleteTaskOption();
    }

    @Then("verify task is marked as complete")
    public void verifyTaskIsMarkedAsComplete() {
        Assert.assertTrue(taskPage.isTaskMarkedComplete());
    }
}
