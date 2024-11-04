#Author:Pratik Sharma
#Date:22:01:2024
#Website:https://demowebshop.tricentis.com/
Feature: feature to test books add to cart

  Scenario: Successfully add to cart for books
    Given User launch the url
    When User login with valid credentials
    And User click on books link
    And User click on add to cart for computing and internet books
    And Click on shopping cart on the top
    And User Enable the check box I agree then click on check out
    And User click on continue until all the steps complete
    And Click on order link Validate same order number should be available
    And Verify the generated pfd details and click on PDF button
    Then Click on logout
