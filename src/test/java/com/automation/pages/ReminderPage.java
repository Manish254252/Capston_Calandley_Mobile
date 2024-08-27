package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReminderPage extends BasePage {

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Create a Reminder\"]")
    WebElement addReminderBtn;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement addReminderText;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Create\"]")
    WebElement createBtn;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[1]")
    WebElement attachIcon;

    public void clickOnAddReminder() {
//        new HomePage().clickOnWelcomeBanner();
       while (!isPresentWithoutWait(addReminderBtn))
       {
          int height =  driver.manage().window().getSize().getHeight();
          int width =  driver.manage().window().getSize().getWidth();
           scrollOrSwipe(width/2,height/2,width/2,height/4);
       }
        addReminderBtn.click();
    }

    public void clickOnCreateBtn() {

        createBtn.click();
    }

    public void enterAddReminderText(String data) {
        addReminderText.click();
        addReminderText.sendKeys(data);
    }

    public boolean isAttachIconDisplayed() {
        return attachIcon.isDisplayed();
    }
}
