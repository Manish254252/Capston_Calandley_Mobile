package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage extends BasePage{

    @FindBy(xpath = "//android.view.View[contains(@content-desc,'Details')]")
    WebElement detailsTab;

    @FindBy(xpath = "//android.view.View[contains(@content-desc,'Activity')]")
    WebElement activityTab;

    @FindBy(xpath = "//android.view.View[contains(@content-desc,'Status & Type')]")
    WebElement taskStatusType;

    @FindBy(xpath = "//android.widget.Switch[@content-desc='COMPLETE']")
    WebElement completeTaskOption;

    @FindBy(xpath = "//android.widget.Switch[@content-desc='TO DO']")
    WebElement todoTaskOption;

    public boolean isTaskPageDisplayed() {
        return detailsTab.isDisplayed() && activityTab.isDisplayed();
    }

    public void clickTaskStatusType() {
        taskStatusType.click();
    }

    public boolean isStatusTypesDisplayed() {
        return completeTaskOption.isDisplayed() && todoTaskOption.isDisplayed();
    }

    public void clickCompleteTaskOption() {
        completeTaskOption.click();
    }

    public boolean isTaskMarkedComplete() {
        WebElement taskStatus = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Complete')]"));
        return taskStatus.isDisplayed();
    }
}
