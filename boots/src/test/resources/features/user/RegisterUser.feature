Feature: Register User for boots website

  Scenario: Register using DataTable
  Given user is on home page and clicks Register link
     When she provides the email address as follows and click Register button
      | email                | 
      | soniakhetarpal@yahoo.com | 
    Then I sign out 

    