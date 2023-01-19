package com.virgingame.cucumber.steps;

import com.virgingame.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {
    }

    @When("^I click on accept cookies link$")
    public void iClickOnAcceptCookiesLink() {
        new HomePage().clickOnCookieLink();

    }

    @When("^I Verify the WelcomeText on HomePage$")
    public void iVerifyTheWelcomeTextOnHomePage() {
        String expectedMessage = "Welcome to Virgin Games";
        String actualMessage = new HomePage().getWelcomeText();
        Assert.assertEquals("Welcome Text Not Matched",expectedMessage,actualMessage);
    }


    @And("^I click on Online Slots Button$")
    public void iClickOnOnlineSloteButton() {
        new HomePage().clickOnlineSloteLink();
    }
}
