 Feature: Validate the login functionality of an application
   @TS01 @SmokeTest
   Scenario: To validate the error message
     Given User launch the browser and navigate to the URL
     When User enter the username "User1" and password "123"
     And User clicks the login button
     Then Validate the error message

      @TS02 @RegressionTest
     Scenario: User validate the login functionality of an application
       Given User launch the browser and navigate to the URL
       When User enter the username "User2" and password "abc"
       And User clicks the login button
       Then Validate whether the user navigates to homepage

        @TS03
   Scenario Outline: Multiple user validation
     Given User launch the browser and navigate to the URL
     When User enter the username "<User Name>" and password "<Password>"
     And User clicks the login button
     Then Validate whether the user navigates to homepage
     Examples:
       | User Name | Password |
       | US1       | 123      |
       | Shri      | abc      |
       | demo      | xyz      |