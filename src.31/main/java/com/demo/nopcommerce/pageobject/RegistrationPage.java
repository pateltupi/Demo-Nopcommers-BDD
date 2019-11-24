package com.demo.nopcommerce.pageobject;
/*
 * Created By Trupti Patel on 2019-05-19
 */

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Util {

    private static final Logger log = LogManager. getLogger(RegistrationPage.class.getName());
    //Creating locators
    @FindBy (id="gender-male")
    WebElement _genderLink;
    @FindBy(id="FirstName")
    WebElement _firstName;

    @FindBy(id="LastName")
          WebElement _lastName;
    @FindBy(name="DateOfBirthDay")
            WebElement _DOB;
    @FindBy(name="DateOfBirthMonth")
            WebElement _month;
    @FindBy(name="DateOfBirthYear")
            WebElement _year;
    @FindBy(id="Email")
            WebElement _Email;
    @FindBy (id="Company")
            WebElement _company;
    @FindBy (id="Newsletter")
            WebElement _newLetter;
    @FindBy (id="Password")
            WebElement _password;
    @FindBy (id="ConfirmPassword")
            WebElement _confirmPass;
    @FindBy(id="register-button")
            WebElement _regsterBtn;
    @FindBy (xpath="//strong[contains(text(),'Your Personal Details')]")
    WebElement  _Rtext;

    //For debugging comments add description with the help of log.info


    public void clickgender(){
        log.info("Selecting geneder");
        clickonElement(_genderLink);
    }
    /*
    send text to first name
         */
    public String randomEmail() {
        return ("sam" + generateRandomNumber() + "@gmail.com");
    }
    public void enterTextToFirstname(String name){
        log.info("Entering text to firstname");
        sendTextToElement(_firstName,name);
    }
    /*
       Send Text to Lastname
     */
    public void enterTextToLastname(String last){
        log.info("Enter text to Lastname");
        sendTextToElement(_lastName,last);
    }
    /*
       Select date of birth from dropdown list
     */
    public void selectDateFromDropDownList(String date){
        log.info("Selecting date of birth from dropdown list");
        clickonElement(_DOB);
        selectVisibleTextFromDropDownMenu(_DOB,date);
    }
    /*
      select month of birth from dropdowm list
     */
    public void selectMonthFromDropDownList(String m){
        log.info("Selecting month from drop down list");
        clickonElement(_month);
        selectVisibleTextFromDropDownMenu(_month,m);
    }
    /*
     select  year from dropdown list
     */
    public void selectYearFromDropDownList(String y){
        log.info("Selecting year from drop down list ");
        clickonElement(_year);
        selectVisibleTextFromDropDownMenu(_year,y);
    }
    /*
    Entering Text to emailfield
     */
    public void enterTextToEmail(String email){
        log.info("Enter text to email");
        sendTextToElement(_Email,email);
    }
    /*
    Entering text to Comapny
     */
    public void enterTextToCompany(String com){
        log.info("Enter text to company");
        sendTextToElement(_company,com);
    }
    /*
     Click on newsletter
     */
    public void clickToNewsletter(){
        log.info("click to news letter");
        clickonElement(_newLetter);
    }
    /*
    entering text to password field
     */
    public void entertTextToPassword(String pass){
        log.info("Enter text to password");
        sendTextToElement(_password,pass);
    }
    /*
    entering text to confirmpassword
     */
    public void enterTexttoConfirmPassword(String confirm){
        log.info("Enter text to confirm password");
        sendTextToElement(_confirmPass,confirm);
    }
    /*
    clicking on register button
     */
    public void clickOnRegisterButton(){
        log.info("click on registration Button");
        clickonElement(_regsterBtn);
    }
    public String DisplayedText(){
        log.info("Displayed text");
        return getTextFromElement(_Rtext);
    }
    public boolean verifyRegistrationText() {
        if (DisplayedText().equals("Your Personal Details")) {
            return true;
        } else {
            return false;
        }
    }

}
