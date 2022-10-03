#Author: Nihel DAKHLAOUI
#Description: Test of authentification Functionnality
Feature: feature to test authentification functionnality

  @InvalidAuthentification
  Scenario Outline: check login is refused with Invalid credentiels
    Given user is on login page
    When user enter <login> and <password>
    And user clicks on eye to show password
    And user clicks on remember me
    And user clicks on valide button
    Then Error message displayed

    Examples: 
      | login                           | password        |
      | etudiant.nihel.dakhlaoui@uvt.tn | Ekaraoncall321! |

  @ValidAuthentification
  Scenario Outline: check login is successiful with valid credentiels
    Given user is on login page
    When user enter <login> and <password>
    And user clicks on eye to show password
    And user clicks on remember me
    And user clicks on valide button
    Then user is redirected to the home page Console

    Examples: 
      | login                           | password        |
      | etudiant.nihel.dakhlaoui@uvt.tn | Ekaraoncall123! |
