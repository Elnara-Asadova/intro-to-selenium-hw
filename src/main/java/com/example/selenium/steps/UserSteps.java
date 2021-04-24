package com.example.selenium.steps;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;

public class UserSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private MainPage mainPage;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public com.example.selenium.steps.UserSteps login(String username, String password) {
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);

        loginPage.setUsername(username).setPassword(password).clickLogin();

        assertEquals(mainPage.getTitle(), "Secure Area", "Login Failed");

        return this;
    }

    public UserSteps logout() {
        mainPage.clickLogout();
        return this;
    }
}
