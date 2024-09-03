package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FavoritePage extends BasePage{

    @FindBy(xpath = "//android.view.View[@content-desc='Favorites']")
    WebElement favoritePageTitle;

    String favoriteTaskXPATH = "//android.widget.Button[contains(@content-desc,'Task: %s')]";

    @FindBy(xpath = "//android.widget.Button[contains(@content-desc,'Task: ')]")
    WebElement favoriteTaskList;

    public boolean isFavoritePageDisplayed() {
        return favoriteTaskList.isDisplayed();
    }
}
