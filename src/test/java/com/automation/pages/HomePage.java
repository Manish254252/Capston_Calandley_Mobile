package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//android.widget.Button[@content-desc='Action']")
    WebElement addIcon;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Next\"]")
    WebElement nextBtn;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Done\"]")
    WebElement doneBtn;

    @FindBy(xpath = "//android.widget.Button[contains(@content-desc,'More')]")
    WebElement moreBtn;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Notepad']")
    WebElement notePadOption;


    public void clickAddButton() {
        addIcon.click();
    }

    public  void clickOnWelcomeBanner() {
        if (isPresent(nextBtn)) {
            for (int i = 0; i < 7; i++) {
                nextBtn.click();
            }
            doneBtn.click();
        }
    }

    public void clickMoreButton() {
        moreBtn.click();
    }

    public void clickOnNotePadOption() {
        notePadOption.click();
    }

//    public void clickMoreButton() {
//        moreBtn.click();
//    }
//
//    public void clickOnNotePadOption() {
//        notePadOption.click();
//    }
}
