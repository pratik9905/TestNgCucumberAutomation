#Author:Pratik Sharma
#Date:22:01:2024
#Website:https://demowebshop.tricentis.com/
Feature: feature to test registration functionality

  Background: 
    Given user is on Homepage
    When user click the registration button link

  Scenario: Check registration is successful with valid credentials
    Then user user enters the following details

  Scenario: Check registration is successful with Invalid credentials
    Then user user enters the following invalid details

  Scenario: Check registration is successful with existing email id
    Then user user enters the existing emailId and following  details

  Scenario: Check registration is successful with existing email id
    Then user user enters the differnet confirme password and following  details
