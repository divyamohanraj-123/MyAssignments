Feature: Perform Merge lead Flow

Background: Open Browser and login to the portal
Given Chrome Browser is opened 
And Load the Leaftaps Application URL as "http://leaftaps.com/opentaps/"
And Maximize and set the timeouts


Scenario Outline: TC005 with valid credentials to merge a lead
Given Enter the username as <username>
And Enter the password as <password>
And Click submit button
And Click on crmsfa link 
Then Click on Leads tab
When Click Merge leads
Then From Lead Widget is clicked
And Select lead as "Hari"
Then To Lead Widget is clicked
And Enter lead as "babu"
When Merge button is clicked
Then Click and verify the merged lead
And Close Browser once test case passed

 Examples:
    | username            | password    | 
    | 'DemoSalesManager'  | 'crmsfa'    | 