package com.virgingame.pages;

import com.virgingame.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/label[1]")
    WebElement CookieLink;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome to Virgin Games']")
    WebElement welcomeText;


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Online Slots')]")
    WebElement onlineSloteLink;



    public void clickOnCookieLink() {
        clickOnElement(CookieLink);
        log.info("Clicking on accept link :" + CookieLink.toString());
    }


    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Getting text from : " + welcomeText.toString());
        return message;
    }

        public void clickOnlineSloteLink(){
        clickOnElement(onlineSloteLink);

        }

    }

