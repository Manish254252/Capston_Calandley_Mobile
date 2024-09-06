package com.automation.pages;

import org.openqa.selenium.By;
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

    int noOfFavoriteTask = 0;
    public void clickOnFavoriteTask(String favoriteTaskName) {
        noOfFavoriteTask = driver.findElements(By.xpath(favoriteTaskXPATH)).size();
        System.out.println(noOfFavoriteTask);
        String xpath = String.format(favoriteTaskXPATH, favoriteTaskName);
        driver.findElement(By.xpath(xpath)).click();
    }

    public boolean isFavoriteTaskRemoved() {
        int presentFavoriteTask = driver.findElements(By.xpath(favoriteTaskXPATH)).size();
        System.out.println(presentFavoriteTask);
        return presentFavoriteTask == noOfFavoriteTask - 1;
    }
}
