Feature: Perform Create lead Flow

Background: Open Browser and login to the portal
Given Chrome Browser is opened 
And Load the Leaftaps Application URL as "http://leaftaps.com/opentaps/"
And Maximize and set the timeouts


Scenario Outline: TC001 with valid credentials to create a lead
Given Enter the username as <username>
And Enter the password as <password>
And Click submit button
And Click on crmsfa link 
Then Click on Leads tab
When Click on CreateLead button
Then Enter the Company Name
And Enter the First Name
And Enter the Last Name
When Create Lead button is clicked,View Lead is Displayed
And Close Browser once test case passed

 Examples:
    | username            | password    | 
    | 'DemoSalesManager'  | 'crmsfa'    | 





