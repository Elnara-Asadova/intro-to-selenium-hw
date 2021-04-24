package com.example.selenium;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        String userName = "tomsmith";
        String password = "SuperSecretPassword!";

        userSteps.login(userName,password);
        userSteps.logout();
    }
}
