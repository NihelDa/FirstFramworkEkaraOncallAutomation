#Author: Nihel DAKHLAOUI
#Description: Test of Incident vue Functionnality
@IncidentFeature
Feature: feature to test Incident view functionnality

  @Incidnt_View
  Scenario: Display the incident vue throw Incident Menu
    Given Application was launched
    When user click on the Incident button
    Then the Incident view display

  @Incidnt_Second_Workspace
  Scenario: check the functioning of the Incident view through the second workspaces
    Given user is on  Incident page
    When user click on workspace dropdown
    And user choice the second workspace
    Then the scenario Incidents of the second workspace appear

  @Show_closed_incident
  Scenario: Show the closed incident
    Given Incident view was launched
    When user click on the button to show closed incident
    Then closed incidents are displayed

  @details_incident
  Scenario: Details of incident
    Given Closed Incident are displayed
    When user click on the incident to display the details
    And Open date of incident is displayed
    And close date of incident is displayed
    And duration of incident is displayed
    And events triggers is displayed
    And user click on show details of test button
    Then redirection to navigator view of Ekara

  @hide_closed_incident
  Scenario: Hide the closed incident
    Given Closed incident was displayed
    When user click on the button to hide closed incident
    Then closed incident is hided
