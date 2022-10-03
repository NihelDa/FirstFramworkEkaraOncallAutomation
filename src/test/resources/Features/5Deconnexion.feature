#Author: Nihel DAKHLAOUI
#Description: Test of Deconnection Functionnality
@DeconnexionFeature
Feature: feature to test Deconnection vue functionnality

  @Deconnection_View
  Scenario: Deconnect from application throw Deconnect Menu
    Given Application is connected
    When user click on the logout button
    Then Application is Deconnected
