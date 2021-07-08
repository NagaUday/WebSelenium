Feature: Demo

  Scenario: This is the simple scenario
    Given I launch the application
    When I dismiss the PopUP window
    Then I should be able to see the footer on homepage
    And I should be able to see "SUPPORT" footer
    And I should be able to see "EASY BANKING BUSINESS" footer
    And I should be able to see "BNP PARIBAS FORTIS" footer
    And I should be able to see "LOST YOUR CARD?" footer

  Scenario: Validate the footer bullet points under SUPPORT
    Given I launch the application
    When I dismiss the PopUP window
    Then I should be able to see the footer on homepage
    Then I should be able to see "Helpdesk + 32 (0)2 565 05 00" under SUPPORT
    And I should be able to see "Contact us" under SUPPORT
    And I should be able to see "Your opinion counts" under SUPPORT
    And I should be able to see "FAQ" under SUPPORT