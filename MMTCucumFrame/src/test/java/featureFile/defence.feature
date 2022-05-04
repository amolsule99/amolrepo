
Feature: Verify search for Defence
 

  
  Scenario: Verify search for Defence
    Given Soldier is on search page
    When Soldier click on from button
    And  Soldier search from "Delhi"
    And  Soldier click on to button
    And  Soldier search to "Mumbai"
    And  Soldier select option Defence forces
    And  Soldier click on search button
    Then Soldier should navigate to Soldier page
    
    
    
    
  