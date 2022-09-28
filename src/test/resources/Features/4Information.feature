#Author: Nihel DAKHLAOUI
#Description: Test of Information Functionnality
Feature: feature to test Information view functionnality

  @Information_Vue
  Scenario: check the functioning of the Information view throw Information Menu
    Given Application launched
    When user click on the Information button
    And Click on autorise cookies
    And Open menu
    And Close menu
    Then check menu is closed
