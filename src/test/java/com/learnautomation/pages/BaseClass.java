package com.learnautomation.pages;

import com.learnautomation.utility.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public WebDriver driver;

    @BeforeClass
    public void setup()
    {
        driver= BrowserFactory.startApplication(driver,"Chrome","https://ui.freecrm.com/");
    }

    @AfterClass
    public void tearDown()
    {
        BrowserFactory.quitBrowser(driver);
    }
}
