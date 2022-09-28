#Author: Nihel DAKHLAOUI
#Description: Test of Console vue Functionnality
Feature: feature to test Console vue functionnality

  @ConsoleSecondWorkspace
  Scenario: check the functioning of the console view through the second workspaces
    Given user is on  Console page
    When user click on the workspace dropdown
    And user choice the second workspace
    Then the scenario consoles of the second workspace appear

  @ConsoleThirdWorkspace
  Scenario: check the functioning of the console view through the Third workspaces
    Given user is on  Console page
    When user click on the workspace dropdown
    And user choice the third workspace
    Then the scenario consoles of the third workspace appear
