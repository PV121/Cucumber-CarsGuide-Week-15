package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {
    private static final Logger log= org.apache.log4j.Logger.getLogger(Homepage.class.getName());
    public Homepage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buyAndSellTab;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCarsOption;

    public void mouseHoverToBuyAndSellTabAndClickOnSearchCarsOption() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElementAndClick2(buyAndSellTab,searchCarsOption);
        //mouseHoverToElement(buyAndSellTab);
    }




}
