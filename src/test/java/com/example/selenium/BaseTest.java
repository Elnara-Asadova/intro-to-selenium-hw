package com.example.selenium;

import com.example.selenium.steps.UserSteps;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;
    protected UserSteps userSteps;
    public String loginPageURL = "https://the-internet.herokuapp.com/login";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(loginPageURL);
        driver.manage().window().fullscreen();

        userSteps = new UserSteps(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
