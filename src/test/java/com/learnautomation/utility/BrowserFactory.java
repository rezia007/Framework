package com.learnautomation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {
    public static WebDriver startApplication(WebDriver driver,String browserName,String appURL) {
        if (browserName.equals("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\rezia\\IdeaProjects\\Framework\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
    else if(browserName.equals("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "DriverNot/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        else if(browserName.equals("IE"))
        {
            System.setProperty("webdriver.ie.driver", "DriverNot/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else
        {
            System.out.println("We do not support this Browser");
        }
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(appURL);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        return driver;

    }
    public static void quitBrowser(WebDriver driver)
    {
        driver.quit();
    }
}
