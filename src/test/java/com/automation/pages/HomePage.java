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

    @FindBy(xpath = "//android.widget.Button[contains(@content-desc,'Invite')]")
    WebElement inviteOption;

    @FindBy(xpath = "//android.view.View[@content-desc='Invite members']")
    WebElement invitePopupHeading;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Invite']")
    WebElement inviteBtn;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement inviteEmailInput;

    @FindBy(xpath = "//android.widget.Toast[contains(@text,'Invites sent')]")
    WebElement inviteSentMsg;

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

    public void clickInviteOption() {
        inviteOption.click();
    }

    public boolean isInvitePopupDisplayed() {
        return invitePopupHeading.isDisplayed() && inviteBtn.isDisplayed();
    }

    public void enterInviteEmail(String inviteEmail) {
        inviteEmailInput.sendKeys(inviteEmail);
    }

    public void clickOnInviteBtn() {
        inviteBtn.click();
    }

    public boolean isInviteSent() {
        return inviteSentMsg.isDisplayed();
    }

//    public void clickMoreButton() {
//        moreBtn.click();
//    }
//
//    public void clickOnNotePadOption() {
//        notePadOption.click();
//    }
}
