Feature: Home Functionality

  Background: 
    Given User is on DemoWebShop WebPage

  
  Scenario: Verify The Logo of Home Page
    When User verify the Logo Of The Page
    Then user Verify the Category List

  @qaz
  Scenario: Verify Register Button is Clickable
    When User Click on Register Button
    Then Verify the Register Page

  @qaz
  Scenario: Verify Login Button is Clickable
    When User Click on Login Button
    Then Verify The Login Page

  @qaz
  Scenario: Verify Shoping Cart Button Is Clickable
    When User Click on Shoping Cart Button
    Then Verify The Shoping Cart Button

  @qaz
  Scenario: Verify Search Fuctionality with Valid Keyword
    When User enters "Computer"
    Then User Should click Search Button
    Then Verify the display of The Search Results

  @qaz
  Scenario: Verify the Search Functionality with Empty Keyword
    Then User Should click button
    Then user accept the Prompt Message
