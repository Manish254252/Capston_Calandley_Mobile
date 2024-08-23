package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage{

    @FindBy(xpath = "//android.widget.Button[@content-desc='Action']")
    WebElement addIcon;

    public void clickAddButton() {
        addIcon.click();
    }
}
