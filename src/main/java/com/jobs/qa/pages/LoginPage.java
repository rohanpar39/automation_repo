package com.jobs.qa.pages;

import com.jobs.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage extends TestBase {

    //define page factory of login page -- Object repository
    @FindBy(xpath ="//button[@class='btn btn-outline-success action-link-login font-thin font-dosis']")
    WebElement loginbutton; //varialbe defined

    @FindBy (xpath ="//input[@name='email']")
    WebElement email;

    @FindBy (xpath ="//input[@name='password']")
    WebElement password;

    @FindBy (xpath ="//button[contains(text(),'Sign in ')]")
    WebElement signinbutton;

    //Creating the constructor of the class to initialize the objects for above elements
    public LoginPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void login(String us, String pwd) {
        loginbutton.click();
        email.sendKeys(us);
        password.sendKeys(pwd);
        signinbutton.click();
        //return new HomePage();
    }

}
