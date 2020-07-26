package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver ldriver) {
        this.driver = ldriver;
    }

    @FindBy(name = "email")
    WebElement email;
    @FindBy(name = "password")
    WebElement pass;

    public void loginToCRM(String useremailApplication, String passwordApplication) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        email.sendKeys(useremailApplication);
        pass.sendKeys(passwordApplication);
    }

}

