package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    
    LoginPage loginPage = new LoginPage();
    
    @Given("user enters email")
    public void user_enters_email() {
       loginPage.clickOnGettingStarted();
       loginPage.enterEmail("mongo.mk.solanki@gmail.com");
       loginPage.clickOnNextBtn();
    }

    @When("user enters password")
    public void user_enters_password() {
        loginPage.clickOnSignInOptions();
        loginPage.clickOnSignInWithPassword();
        loginPage.enterPassword("Manish@1234");
       
    }

    @Then("user clicks on login btn")
    public void user_clicks_on_login_btn() {
       loginPage.clickOnLoginBtn();
       loginPage.clickOnPermission();
       loginPage.clickOnAllowNotification();
    }

    @Then("verify use logged in")
    public void verify_use_logged_in() {
        Assert.assertTrue(loginPage.isAddIconDisplayed());
    }


}
