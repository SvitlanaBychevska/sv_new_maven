@Regression
Feature: do pre-submission Product on the site
  As a customer
  I want to be able to search products via Search panel and click on "CheckOut" button
  and then click on "CheckOut" button on the AddToCart page
  So that, I can see Cart page

  @Scenario1
  Scenario: go to the site, input Product name, click on the Search button,
  click on the Checkout button on the Result page and click on Checkout button on the Add To Card Page
   Given I go to the site 'https://ecsc00a03ccd.epam.com:9002/yacceleratorstorefront/?site=electronics'
   When I search for 'camileo'
   And I click on the search button
   And I click on the CheckOut button on Result page
   And I click on the CheckOut button on the Add to Cart Page
   Then I go to Cart Page