@Regression
  Feature: search Product on the site
    As a customer
    I want to be able to search products via Search panel
    So that, I can go to the site and input Product name and click on the Search button

  @Scenario1
  Scenario: go to the site, input Product name, click on the Search button
    Given I go to the site 'https://ecsc00a03ccd.epam.com:9002/yacceleratorstorefront/?site=electronics'
    When I search for 'camileo'
    And I click on the search button
    Then I got search result page