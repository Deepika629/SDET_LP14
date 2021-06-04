Feature: Search functionality

Background: Navigating to search page
  
   
   @Regression
  Scenario Outline: Search functionality IBM
   Given User is on Google Homepage
    When User enter the "<searchstring>" in search box
    And Click on search button
    Then Results should be displayed
    
    Examples:
    | searchstring 	|
    | IBM 					|
   
    
    @Sanity
  Scenario: Search functionality IBM
   Given User is on Google Homepage
    When User enter the IBM in search box
    And Click on search button
    Then Results should be displayed
    
    
    @Smoke 
  Scenario: Search functionality IBM
   Given User is on Google Homepage
    When User enter the IBM in search box
    And Click on search button
    Then Results should be displayed
    