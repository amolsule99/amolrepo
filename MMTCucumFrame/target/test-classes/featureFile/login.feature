

Feature: To check functionality of EaseMyTrip
 

 
  Scenario: Checking search functionality
    Given User is on main page
    When User click on from button
    And User select from "Delhi"
    And User click on to button
    And User select to "Delhi"
    And User click on search button
    Then Website shows Alert
   
  
