package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarPage.class.getName());

    public UsedCarPage(){
        PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(linkText = "Used")
    WebElement used;

    public void ClickOnUsedCar(){
        log.info("Click On: " + used.getText());
        clickOnElement(used);
    }
}
