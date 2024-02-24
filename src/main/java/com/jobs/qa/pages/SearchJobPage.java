package com.jobs.qa.pages;

import com.jobs.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SearchJobPage extends TestBase {

    @FindBy(xpath = "//a[@id='search-navbarDropdownMenuLink']")
    WebElement searchdropdown;

   @FindBy(xpath = "//a[normalize-space()='Search Job']")
   WebElement searchjobclick;

   @FindBy(xpath = "//input[@id='searchInput']")
   WebElement enterjobname;

    @FindBy(xpath = "//i[@class='icon-search4 text-white']")
    WebElement search;

    public SearchJobPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void gotoSearch()
    {
        searchdropdown.click();
        searchjobclick.click();
        enterjobname.sendKeys("Engineer");
        search.click();
    }
}
