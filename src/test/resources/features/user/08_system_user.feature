#language: en
@lg
Feature: User > System User
  As user of the Land Gorilla UAT page,
  I want to be able to log in with my username and password
  To access the different products

    Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page
      Given the user has logged in with username "subuser" in "system-user"

    @SYU-001
    Scenario Outline: Successful Created User
      When valid home system user
      And the user clicks New User option
      And enters the User information "<email>"
      And validated the information entered
      And delete user created
      Then the user clicks on logout
      Examples:
        | email                          |
        | rmechan+06uat@landgorilla.com  |