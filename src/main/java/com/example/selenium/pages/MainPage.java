package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.How.CSS;

public class MainPage extends com.example.selenium.pages.BasePage {

    @FindBy(how = CSS, using = "h2")
   private WebElement title;


    @FindBy(how = CSS, using = ".icon-2x")
    private WebElement logoutButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return title.getText();
    }

    public MainPage clickLogout() {
        logoutButton.click();
        return this;
    }
}
