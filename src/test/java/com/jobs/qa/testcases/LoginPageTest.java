package com.jobs.qa.testcases;

import com.jobs.qa.base.TestBase;
import com.jobs.qa.pages.LoginPage;
import org.apache.log4j.Priority;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;

    public LoginPageTest()
    {
        super();
    }

    @BeforeMethod
    public void SetUp()
    {
        initialization();
        loginPage = new LoginPage();
    }

    @Test
    public void loginTest() {
        loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        //loginPage.homeScreen();
        try {
            Thread.sleep(5000); //Thread sleep is used to wait in homepage after login
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
