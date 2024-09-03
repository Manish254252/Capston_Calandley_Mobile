package com.automation.steps;

import com.automation.pages.FavoritePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FavoritePageSteps {

    FavoritePage favoritePage = new FavoritePage();

    @Then("verify favorite page is displayed")
    public void verifyFavoritePageIsDisplayed() {
        Assert.assertTrue(favoritePage.isFavoritePageDisplayed());
    }

}
