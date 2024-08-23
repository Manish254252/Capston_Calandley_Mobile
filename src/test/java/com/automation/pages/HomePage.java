package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage{

    @FindBy(xpath = "//android.widget.Button[@content-desc='Action']")
    WebElement addIcon;

    @FindBy(xpath = "//android.widget.Button[contains(@content-desc,'More')]")
    WebElement moreBtn;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Notepad']")
    WebElement notePadOption;



    public void clickAddButton() {
        addIcon.click();
    }

    public void clickMoreButton() {
        moreBtn.click();
    }

    public void clickOnNotePadOption() {
        notePadOption.click();
    }
}
