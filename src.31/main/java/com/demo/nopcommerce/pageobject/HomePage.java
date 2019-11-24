package com.demo.nopcommerce.pageobject;/*
 * Created By Trupti Patel on 1/5/2019.
 */

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.By.xpath;

public class HomePage extends Util {
    //Adding logger for to make debuuging easier
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //By logInLink= By.linkText("Log in");
    @FindBy(linkText = "Log in")
    WebElement _login;

    // By registerLink = By.linkText("Register");
    @FindBy(linkText = "Register")
    WebElement _register;
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement __homeText;

    //By Electronics =By.xpath("//ul[@class='top-menu']//a[contains(text(),'Electronics')]");
    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Electronics')]")
    WebElement _electronics;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Computers')]")
    WebElement _computer;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Books')]")
    WebElement _books;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Apparel')]")
    WebElement _apparel;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Digital downloads')]")
    WebElement _digitalDownloads;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Jewelry')]")
    WebElement _jewellry;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Gift Cards')]")
    WebElement _giftcard;

    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement _welcometext;
// All method been add with log info with description

    public void clickOnLogInLink() {
        log.info("Click on Loginlink");
        clickonElement(_login);
    }

    public void clickOnRegisterLink() {
        log.info("Click on registartion Link");
        clickonElement(_register);
    }

    public void mouseHoverOnComputer() {
        log.info("Mouse Hover on computer");
        mouseHoverToElement(_computer);

    }

    public void mouseHoverOnElectronics() {
        log.info("Mouse hover on electronics");
        mouseHoverToElement(_electronics);
    }

    public void mouseHoverOnBooks() {
        log.info("mouse hover on Books");
        mouseHoverToElement(_books);
    }

    public void mouseHoverOnApprealTopMenu() {
        log.info("Mouse hover on Apparel");
        mouseHoverToElement(_apparel);
    }
    public void mouseHoverOnDigitaltopmenu(){
        log.info("Mouse hover on digitak downloads");
        mouseHoverToElement(_digitalDownloads);
    }

    public void mouseHoverOnJewellary(){
        log.info("Mouse hover on jewellary");
        mouseHoverToElement( _jewellry);

    }
    public void mouseHoverOngiftCard() {
        log.info("Mouse hover on jewellary");
        mouseHoverToElement(_giftcard);
    }

    public String getHomeText() {
        log.info("Get home text to assert");
        return getTextFromElement(__homeText);
    }
    public boolean verifyHomeText() {
        if (getHomeText().equals("Welcome to our store")) {
            return true;
        } else {
            return false;
        }
    }

    public void scrollDownHomePage(int h) {
        log.info("scroll down page");
        scrollUpDown(h);
    }
}
