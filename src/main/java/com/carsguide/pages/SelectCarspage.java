package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectCarspage extends Utility {

    private static final Logger log= org.apache.log4j.Logger.getLogger(SelectCarspage.class.getName());
    public SelectCarspage() {
        PageFactory.initElements(driver,this);
    }
//    @CacheLookup
//    @FindBy(xpath = "//div[@class='makes-logo']/ul")
//   List <WebElement> carsMakeAndLogo;
@CacheLookup
@FindBy(xpath = "//select[@id='makes']")
WebElement makes;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement models;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement locations;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement prices;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarButton;
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='removeMakeFilter()']")
    WebElement makeactalText;


//    public void selectMake(String make) {
//        List <WebElement> carMake= carsMakeAndLogo;
//        for (WebElement car:carMake) {
//            if (car.getText().equalsIgnoreCase(make)){
//                clickOnElement(car);
//            }
//        }
//    }

    public void selectMakeFromDropDown(String make){
        selectByVisibleTextFromDropDown(makes,make);
    }

    public void selectModelFromDropDown(String model){
        selectByValueFromDropDown(models,model);
    }
    public void selectLocationFromDropDown(String location){
        selectByValueFromDropDown(locations,location);
    }
    public void selectPriceFromDropDown(String price){
        selectByVisibleTextFromDropDown(prices,price);
    }
    public void clickOnFindMyNextCarButton(){
        clickOnElement(findMyNextCarButton);
    }
    public String getTextFromMakes(){
        return getTextFromElement(makeactalText);
    }
}


