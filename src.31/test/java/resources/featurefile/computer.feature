@computer
Feature: home feature
  As a user I want to explore nopCommerce website@regerssion
  Scenario: User should navigate to computer page
    Given I am on home page
    When  I click on computer button
#    And   I click on "<options >" from dropdown list

    Then  I should navigate to computer page

    Scenario: Use should access computer page
      Given  I am on home page
      When   I click on computer button
#      //And    I click on "< >"
#  Scenario: User should click on deskstop button
#      Given  I am on computer page
#      When   I click on Desktop button