package com.automation.pages;

import org.openqa.selenium.By;
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

    @FindBy(xpath = "//android.widget.Switch[@content-desc='Next']")
    WebElement nextTaskBtn;

    String nextTaskXPATH = "//android.widget.Button[contains(@content-desc,'%s')]";

    public void clickAddButton() {
        addIcon.click();
    }

    public void clickOnWelcomeBanner() {
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

    public void enterInviteEmail() {
        String inviteEmail = generateRandomEmail();
        inviteEmailInput.sendKeys(inviteEmail);
    }
boolean isinvitesent =false;
    public void clickOnInviteBtn() {
        inviteBtn.click();
        isinvitesent = true;
    }

//    public boolean isInviteSent() {
//        inviteSentMsg = driver.findElement(By.xpath("/hierarchy//android.widget.Toast[contains(@text, 'Invites sent!')]"));
//        boolean isEle = isElementVisible(inviteSentMsg);
//        System.out.println(isEle);
//        return isEle;
////        return inviteSentMsg.isDisplayed();
//    }

    public void clickOnNextBtn() {
        nextTaskBtn.click();
    }

    public boolean isNextTaskDisplayed(String nextTask) {
        String xpath = String.format(nextTaskXPATH, nextTask);
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void clickOnNextTask(String nextTask) {
        String xpath = String.format(nextTaskXPATH, nextTask);
        System.out.println(xpath);
        driver.findElement(By.xpath(xpath)).click();
//       return isinvitesent;

    }

//    public void clickMoreButton() {
//        moreBtn.click();
//    }
//
//    public void clickOnNotePadOption() {
//        notePadOption.click();
//    }
}
