@Regression
Feature: check Prices on the Cart Page
  As a customer
  I want to be able to search products via Search panel and click on "CheckOut" button
  and then click on "CheckOut" button on the AddToCart page
  So that, I can see Cart page and reckeck Price there

  @Scenario1
  Scenario: go to the site, input Product name, click on the Search button,
  click on the Checkout button on the Result page, click on Checkout button on the Add To Card Page
  and check Price on the Cart Page
    Given I go to the site 'https://ecsc00a03ccd.epam.com:9002/yacceleratorstorefront/?site=electronics'
    When I search for 'camileo'
    And I click on the search button
    And I click on the CheckOut button on Result page
    And I click on the CheckOut button on the Add to Cart Page
    Then I have the following final Prices and they are correct
    |subtotal |total   |tax                            |
    |$146.88  |$146.88 |Your order includes $6.99 tax. |
