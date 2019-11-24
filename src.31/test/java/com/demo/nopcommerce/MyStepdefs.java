package com.demo.nopcommerce;
/*
 * Created By Trupti Patel on 2019-05-18
 */

import com.demo.nopcommerce.pageobject.ComputerPage;
import com.demo.nopcommerce.pageobject.HomePage;
import com.demo.nopcommerce.pageobject.LogInPage;
import com.demo.nopcommerce.pageobject.RegistrationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class MyStepdefs {

    HomePage homePage = new HomePage();
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^Iclick on login link$")
    public void iclickOnLoginLink() {
        homePage.clickOnLogInLink();
        //new HomePage().clickOnLogInLink();
        Assert.assertTrue(new LogInPage().verifywelcomeText());

    }

    @Then("^I should  navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
    }

    @When("^I click onb login link$")
    public void iClickOnbLoginLink() {
        new HomePage().clickOnLogInLink();

    }


    @And("^I enter password \"([^\"]*)\" into password field$")
    public void iEnterPasswordIntoPasswordField(String password) {
        new LogInPage().enterTextToPasswordField(password);
    }

    @Then("^i should successfully login to account$")
    public void iShouldSuccessfullyLoginToAccount() {
        new LogInPage().clickOnLogInButton();

    }

    @And("^I enter email address\"([^\"]*)\" into email field$")
    public void iEnterEmailAddressIntoEmailField(String email) {
        new LogInPage().enterTextToEmailField(email);

        //throw new PendingException();
    }

    @And("^i click on login button$")
    public void iClickOnLoginButton() {
        new LogInPage().clickOnLogInButton();

    }
    @Then("^i shouldnot successfully login to account$")
    public void iShouldnotSuccessfullyLoginToAccount() {
    }

    @When("^I mouse hover on computer$")
    public void iMouseHoverOnComputer() {
        new HomePage().mouseHoverOnComputer();
        Assert.assertTrue(new HomePage().verifyHomeText());

    }
    @When("^I mouse hover on electornics$")
    public void iMouseHoverOnElectornics() {
        new HomePage().mouseHoverOnElectronics();

    }

    @When("^I mouse hover on books$")
    public void iMouseHoverOnBooks() {
        new HomePage().mouseHoverOnBooks();

    }
    @When("^I mouse hover on apparel$")
    public void iMouseHoverOnApparel() {
        new HomePage().mouseHoverOnApprealTopMenu();

    }


    @When("^I mouse hover on digital downloads$")
    public void iMouseHoverOnDigitalDownloads() {
        new HomePage().mouseHoverOnDigitaltopmenu();

    }

    @When("^I mouse hover on jewelry$")
    public void iMouseHoverOnJewelry() {
        new HomePage().equals("Your Personal Details");
    }

    @When("^I click on registerlink$")
    public void iClickOnRegisterlink() {

    }

    @Then("^I should nevigate to register page successfully$")
    public void iShouldNevigateToRegisterPageSuccessfully() {
    Assert.assertTrue(new RegistrationPage().verifyRegistrationText());
    }

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
        Assert.assertTrue(new RegistrationPage().verifyRegistrationText());
    }

    @And("^I click on male genderlink$")
    public void iClickOnMaleGenderlink() {

    }

    @And("^I enter firstname to \"([^\"]*)\" into firstname field$")
    public void iEnterFirstnameToIntoFirstnameField(String name) {
        new RegistrationPage().enterTextToFirstname(name);
    }

    @And("^I enter lastname to \"([^\"]*)\" into lastname field$")
    public void iEnterLastnameToIntoLastnameField(String lastname) {
        new RegistrationPage().enterTextToLastname(lastname);

    }
    @And("^I click on date of birth$")
    public void iClickOnDateOfBirth() {
    }


    @And("^I click on month of birth$")
    public void iClickOnMonthOfBirth() {

    }


    @And("^I click on year of birth$")
    public void iClickOnYearOfBirth() {

    }

    @And("^I select year from dropdownlist$")
    public void iSelectYearFromDropdownlist() {

    }


    @And("^I click on newsletter$")
    public void iClickOnNewsletter() {

    }


    @And("^I click on register button$")
    public void iClickOnRegisterButton() {

    }

    @Then("^I$")
    public void i() {
    }

    @Then("^I should register successfully$")
    public void iShouldRegisterSuccessfully() {
    }

    @And("^I enter email \"([^\"]*)\" into email field$")
    public void iEnterEmailIntoEmailField(String mail) {
        new RegistrationPage().enterTextToEmail(mail);
    }

    @And("^I enter company \"([^\"]*)\" into company field$")
    public void iEnterCompanyIntoCompanyField(String com) {
        new RegistrationPage().enterTextToCompany(com);
    }

    @And("^I enter password \"([^\"]*)\" into passwordfield$")
    public void iEnterPasswordIntoPasswordfield(String pass) {
        new RegistrationPage().entertTextToPassword(pass);
    }

    @And("^I enter password \"([^\"]*)\" into confirm password filed$")
    public void iEnterPasswordIntoConfirmPasswordFiled(String confirm) {
        new RegistrationPage().enterTexttoConfirmPassword(confirm);
    }

    @And("^I select month \"([^\"]*)\" from dropdownlist$")
    public void iSelectMonthFromDropdownlist(String month) {
        new RegistrationPage().selectMonthFromDropDownList(month);
    }

    @And("^I select date \"([^\"]*)\"from dropdownlist$")
    public void iSelectDateFromDropdownlist(String num) {
        new RegistrationPage().selectDateFromDropDownList(num);
    }

    @And("^I select year\"([^\"]*)\" from dropdownlist$")
    public void iSelectYearFromDropdownlist(String year) {
        new RegistrationPage().selectYearFromDropDownList(year);
    }


    @And("^I click on  genderlink$")
    public void iClickOnGenderlink() {
        new RegistrationPage().clickgender();
    }

    @And("^I mouse hover on giftcard$")
    public void iMouseHoverOnGiftcard() {
        new HomePage().mouseHoverOngiftCard();
    }

    @When("^I click on computer button$")
    public void iClickOnComputerButton() {

    }

    @Then("^I should navigate to computer page$")
    public void iShouldNavigateToComputerPage() {
        new ComputerPage().clickOnComputerButton();
        Assert.assertTrue(new ComputerPage().verifycomputerText());
    }
}
