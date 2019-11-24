@navigation
Feature: home feature
  As a user I want to explore nopCommerce website@regerssion
  Scenario: User should navigate to  home page to explore computer
    Given I am on home page
    When  I mouse hover on computer
    And   I mouse hover on electornics
    And   I mouse hover on apparel
    And   I mouse hover on books
    And   I mouse hover on digital downloads
    And   I mouse hover on jewelry
    And   I mouse hover on giftcard

#    Then I should able to see computer dropdown list successfully

    Scenario: User should navigate to home page to explore electronics
     Given I am on home page
     When  I mouse hover on electornics
      Then  I should able to see electronics dropdown list successfully

   Scenario: User should navigate to home page to explore apparel
     Given I am on home page
     When  I mouse hover on apparel
     Then  I should able to see appearl dropdown list successfully

     Scenario: User should navigate to home page to explore DigitalDownloads
       Given I am on home page
       When  I mouse hover on digital downloads

     Scenario: User should navigate to home page to explore books
       Given  I am on home page
       When   I mouse hover on books

       Scenario: User should navigate to home page to explore jewelry
         Given I am on home page
         When  I mouse hover on jewelry

