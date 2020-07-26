package com.learnautomation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCaseWithoutFramework {
    @Test
    public void test1() throws InterruptedException {


        System.setProperty(("webdriver.chrome.driver"), "C:\\Users\\rezia\\IdeaProjects\\Framework\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.freecrm.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //driver.findElement(By.linkText("Log In")).click();
        driver.findElement(By.name("email")).sendKeys("Selenium_50");
        driver.findElement(By.name("password")).sendKeys("Abcd@123456");
        //driver.findElement(By.xpath("//input[@Value='Login']")).click();
        String actualText=driver.findElement(By.linkText("Forgot your password?")).getText();
       // System.out.println(actualText);
        Assert.assertEquals(actualText, "Forgot your password?");
        System.out.println("Test Passed");
    driver.quit();
    }
}
