Feature: Perform Duplicate lead Flow

Background: Open Browser and login to the portal
Given Chrome Browser is opened 
And Load the Leaftaps Application URL as "http://leaftaps.com/opentaps/"
And Maximize and set the timeouts


Scenario Outline: TC004 with valid credentials to duplicate a lead
Given Enter the username as <username> 
And Enter the password as <password>
And Click submit button
And Click on crmsfa link 
Then Click on Leads tab
When Click Find leads
Then Click on phone
Then Enter phone number
And Click Find Leads Button
And Click on first resulting lead
When Duplicate button is clicked
Then Create a duplicate record
And Close Browser once test case passed


Examples:
    | username            | password    | 
    | 'DemoSalesManager'  | 'crmsfa'    | 