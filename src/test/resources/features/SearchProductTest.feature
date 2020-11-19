@Regression
  Feature: search Product on the site
    As a customer
    I want to be able to search products via Search panel
    So that, I can go to the site and input Product name and click on the Search button

  @xxxx
  Scenario: go to the site, input Product name, click on the Search button
    Given I am anonymous customer
    And I log in to the site
    And I search for "camileo"
    And I click on the search button
    Then I got search result page