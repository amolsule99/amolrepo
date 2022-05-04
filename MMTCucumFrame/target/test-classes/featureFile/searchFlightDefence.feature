
Feature: Verify main search page
  
 Scenario: Verify Main Search Page for Defence
           Given Soldier Is On Flight Search Page
           When Soldier select nonstop filter
           And Click on search button
           Then Non stop flights for Soldier get available

Scenario: Verify Book Flight
          Given Soldier is on Non Stop Flight Page
          When Soldier click on Go First Book flight
          Then Booking page will be open
 