package com.learnautomation.testcases;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestCRM extends BaseClass {

    @Test
    public void loginApp() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginToCRM("rezia.parvin@gmail.com", "saihaansafeer007");
    }
}
