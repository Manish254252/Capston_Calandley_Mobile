package com.automation.pages;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//android.widget.Button[contains(@content-desc,'Search')]")
    WebElement searchIcon;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement textInput;
    String searchString = "//android.view.View[contains(@content-desc,'%s')]";

    public void clickOnSearchIcon() {
        searchIcon.click();
    }

    public void enterInput(String data)
    {
        textInput.sendKeys(data);
    }

    public void clickOnSearch()
    {
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action","done"));
    }
        public boolean isSearchTaskDisplayed()
    {
        return driver.findElement(By.xpath(String.format(searchString,"Bengaluru"))).isDisplayed();
    }
}
