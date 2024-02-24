package com.jobs.qa.testcases;

import com.jobs.qa.pages.SearchJobPage;
import com.jobs.qa.base.TestBase;
import com.jobs.qa.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchJobPageTest extends TestBase {

    LoginPage loginPage;
    SearchJobPage searchJobPage;

    public SearchJobPageTest()
    {
        super();
    }

    @BeforeMethod
    public void SetUp()
    {
        initialization();
        //loginPage = new LoginPage();
        searchJobPage = new SearchJobPage();
        loginPage = new LoginPage();
        loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        try {
            Thread.sleep(5000); //Thread sleep is used to wait in homepage after login
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void gotosearchBar() {
        //loginPage = new LoginPage();
        //searchJobPage = new SearchJobPage();
        //loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        searchJobPage.gotoSearch();
        try {
            Thread.sleep(10000); //Thread sleep is used to wait in homepage after login
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }
}
