

Feature: Registration feature
  As a user I want to register into NopCommerce website

   @registration
   Scenario: User should register successfully
     Given  I am on home page
     When   I click on register link
     And    I click on  genderlink
     And    I enter firstname to "Trupti" into firstname field
     And    I enter lastname to "Patel" into lastname field
     And    I click on date of birth
     And    I select date "8"from dropdownlist
     And    I click on month of birth
     And    I select month "February" from dropdownlist
     And    I click on year of birth
     And    I select year"1985" from dropdownlist
     And    I enter email "dnc@gmail.com" into email field
     And    I enter company "Brand pvt" into company field
     And    I click on newsletter
     And    I enter password " abcd1234" into passwordfield
     And    I enter password "abcd1234" into confirm password filed
     And    I click on register button

     Then   I should register successfully