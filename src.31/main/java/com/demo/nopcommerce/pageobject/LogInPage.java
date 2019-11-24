package com.demo.nopcommerce.pageobject;/*
 * Created By Trupti Patel on 1/5/2019.
 */

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogInPage extends Util {
    private static final Logger log = LogManager.getLogger(LogInPage.class.getName());
    //CRETING LOCATION WITH FINDBY WITH WEBELEMENT
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement _welcomeText;

    @FindBy(id = "Email")
    WebElement _emailField;

    @FindBy(name = "Password")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@value='Log in']")
    WebElement _loginBtn;


    /*
    send text to email field
     */

    public void enterTextToEmailField(String email) {
        log.info("Enter text to email filed ");
        sendTextToElement(_emailField, email);
    }

    /*
    Send text to password
     */
    public void enterTextToPasswordField(String password) {
        log.info("Enter text to password fiels");
        sendTextToElement(_passwordField, password);
    }

    /*
    Click on loginButton
     */
    public void clickOnLogInButton() {
        log.info("Click on log in button");
        clickonElement(_loginBtn);
    }

    public String getWelcomeText() {
        log.info("Get text for assert");
        return getTextFromElement(_welcomeText);
    }

    public boolean verifywelcomeText() {
        if (getWelcomeText().equals("Welcome, Please Sign In!")) {
            return true;
        } else {
            return false;
        }


    }
}
