package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NotePadPage extends BasePage {

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

    @FindBy(xpath = "//android.webkit.WebView//android.widget.TextView")
    WebElement editor1;

    @FindBy(xpath = "//android.webkit.WebView//android.widget.EditText")
    WebElement editor;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Back']")
    WebElement backButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Notepad More']")
    WebElement notePadMore;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Delete']")
    WebElement deleteNoteOption;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Delete']")
    WebElement confirmDelete;

    String NoteXPATH = "//android.view.View[@content-desc='%s']";


    public boolean isNotePadPageDisplayed() {
        return createNewNoteTab.isDisplayed();
    }

    public void clickOnCreateNewNoteBtn() {
//        new HomePage().clickOnWelcomeBanner();
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

//        wait.until(ExpectedConditions.visibilityOf(editor));
//        wait.until(ExpectedConditions.elementToBeClickable(editor));
        new Actions(driver).pause(20000).build().perform();
        driver.findElement(By.xpath("//android.widget.TextView")).click();
        editor.sendKeys(noteMsg);
//        editor.click();
//        if (isClickable(editor)) {
//            editor.click();
//            editor.sendKeys(noteMsg);
//        }

    }

    public void clickOnBackButton() {
        backButton.click();
    }

    public boolean isNotePresentInList(String noteName) {
        String xpath = String.format(noteNameXpath, noteName);
        WebElement noteNameEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        return noteNameEle.isDisplayed();
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

    public void clickOnNotePadMoreOption() {
        notePadMore.click();
    }

    public void clickOnDeleteButton() {
        deleteNoteOption.click();
    }

    public void clickOnConfirmDeleteBtn() {
        confirmDelete.click();
    }

    public boolean isNoteDeletedOfName(String noteName) {
        String xpath = String.format(NoteXPATH, noteName);
       WebElement noteElement = driver.findElement(By.xpath(xpath));
        return !noteElement.isDisplayed();
    }
}
