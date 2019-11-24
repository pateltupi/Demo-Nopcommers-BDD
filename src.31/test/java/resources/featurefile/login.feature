
  Feature: login feature
    As a user I want to log into nope commerces website
    @smoke
    Scenario: User should navigate to login page successfully
      Given I am on home page
      When  Iclick on login link
      Then I should  navigate to login page successfully
      @smoke
      Scenario: User should login successfully
        Given I am on home page
        When  I click onb login link
        And  I enter email address"abcd@gmail.com" into email field
        And  I enter password "Prime123" into password field
        And  i click on login button
        Then  i should successfully login to account
        @regression
        Scenario Outline: User should not login successfully
          Given I am on home page
          When  I click onb login link
          And  I enter email address"<email>" into email field
          And  I enter password "<password>" into password field
          And  i click on login button
          Then  i shouldnot successfully login to account

          Examples:
          | email              | password  |
          | abc123@yahoo.com   | Prime123  |
          | abc153@yahoo.com   | Prime123  |