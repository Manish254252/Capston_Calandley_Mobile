package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotePadPage extends BasePage{

    @FindBy(xpath = "//android.view.View[@content-desc='Notepad']")
    WebElement notePadPageTitle;

    @FindBy(xpath = "//android.view.View[@content-desc='Create new note']")
    WebElement createNewNoteTab;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement newNoteInput;

    @FindBy(xpath = "//android.view.View[@content-desc='Create']")
    WebElement createBtn;

    String noteNameXpath = "//android.view.View[@content-desc='%s']";

    @FindBy(xpath = "//android.widget.Button[@content-desc='Editor']/android.view.View")
    WebElement editBtn;

    @FindBy(xpath = "//android.webkit.WebView[@text='EmbeddedEditor']")
    WebElement editorWindow;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement editor;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Back']")
    WebElement backButton;

    public boolean isNotePadPageDisplayed() {
        return createNewNoteTab.isDisplayed();
    }

    public void clickOnCreateNewNoteBtn() {
        createNewNoteTab.click();
    }

    public void enterNoteName(String noteName) {
        newNoteInput.sendKeys(noteName);
        createBtn.click();
    }

    public void clickOnCreateNoteBtn() {

    }

//    public boolean isNoteCreated(String noteName) {
//        String xpath = String.format(noteNameXpath, noteName);
//        WebElement noteTitle = driver.findElement(By.xpath(xpath));
//        return noteTitle.getText().equals(noteName);
//    }

    public void clickOnEditNoteBtn() {
        editBtn.click();
    }

    public void enterNoteMsg(String noteMsg) {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        editor.click();
        if(isClickable(editor)){
//            editor.click();
            editor.sendKeys(noteMsg);
        }

    }

    public void clickOnBackButton() {
        backButton.click();
    }

    public boolean isNotePresentInList(String noteName) {
        String xpath = String.format(noteNameXpath, noteName);
        WebElement noteNameEle = driver.findElement(By.xpath(xpath));
        if(noteNameEle.isDisplayed()){
            return true;
        }
        return false;
    }

    public void clickOnNoteNameFromList(String noteName) {
        String xpath = String.format(noteNameXpath, noteName);
        WebElement noteNameEle = driver.findElement(By.xpath(xpath));
        noteNameEle.click();
    }

    public boolean isNotePresentWithNameAndMsg(String noteName, String noteMsg) {
        String xpath = String.format(noteNameXpath, noteName);
        WebElement noteNameEle = driver.findElement(By.xpath(xpath));

        String noteMsgXpath = String.format(noteNameXpath, noteMsg);
        WebElement noteMsgEle = driver.findElement(By.xpath(noteMsgXpath));

        return noteNameEle.getText().equals(noteName) && noteMsgEle.getText().equals(noteMsg);

    }
}
