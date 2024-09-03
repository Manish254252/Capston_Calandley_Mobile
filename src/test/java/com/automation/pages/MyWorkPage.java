package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyWorkPage extends BasePage{

    @FindBy(xpath = "//android.widget.Switch[@content-desc='Next']")
    WebElement nextTaskBtn;

    @FindBy(xpath = "//android.widget.Switch[@content-desc='Overdue']")
    WebElement overdueTaskBtn;

    String taskNameXPATH = "//android.widget.Button[contains(@content-desc,'Task: %s')]";

    @FindBy(xpath = "//android.widget.Button[contains(@content-desc,'Task: ')]")
    List<WebElement> overdueTasksList;

    @FindBy(xpath = "//android.widget.Switch[@content-desc='Done']")
    WebElement doneTaskBtn;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Back to Home']")
    WebElement backToHomeBtn;

    public boolean isMyWorkPageDisplayed() {
        return nextTaskBtn.isDisplayed() && overdueTaskBtn.isDisplayed();
    }

    public void clickOnOverdueTaskBtn() {
        overdueTaskBtn.click();
    }

    public boolean isOverdueTaskDisplayed() {
        return overdueTasksList.get(0).isDisplayed();
    }

    public void clickOnDoneBtn() {
        doneTaskBtn.click();
    }

    public void clickOnWorkPageBackBtn() {
        backToHomeBtn.click();
    }
}
