@Regression
Feature: do submission Product on the site
  As a customer
  I want to be able to search products via Search panel and click on "CheckOut" button
  and then click on "CheckOut" button on the AddToCart page
  and then click on "CheckOut" button on the Cart page
  So that, I can see Returning Customer page page

  @Scenario4
  Scenario: go to the site, input Product name, click on the Search button,
  click on the CheckOut button on the Result page, click on CheckOut button on the Add To Card Page,
  click on CheckOut button on the Card Page
    Given I go to the site 'https://ecsc00a03ccd.epam.com:9002/yacceleratorstorefront/?site=electronics'
    When I fill in search field with 'camileo'
    And I click on the search button
    And I click on the CheckOut button on Result page
    And I click on the CheckOut button on the Add to Cart Page
    And I click on the CheckOut button on the Cart Page
    Then I go to Returning Customer Page