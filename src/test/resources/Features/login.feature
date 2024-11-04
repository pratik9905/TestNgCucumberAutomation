#Author:Pratik Sharma
#Date:22:01:2024
#Website:https://demowebshop.tricentis.com/
Feature: feature to test login functionality

  Background: 
    Given user launch Url
    When Click the login link
   @testt
  Scenario: Successful login with valid credentials
    When user enters "pratikkumar734@gmail.com" and "Pk577292@"
    And clicks on login button
    Then click the logout button

  Scenario Outline: Verify login with Invalid credentials
    When user enters "<username>" and "<password>"
    Then clicks on login button

    Examples: 
      | username                | password   |
      | pratij@gmail            | Pra@321    |
      | pratik234@capgemini.com | pass456    |
      | pratik32@gmail.com      | secretword |
      |                         |            |
