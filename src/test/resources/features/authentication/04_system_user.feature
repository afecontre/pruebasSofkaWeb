#language: en
@CLM
Feature: Login / System User
  As user of the Land Gorilla UAT page,
  I want to create a new user

    Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page
      Given the user has logged in with username "subuser" in "system-user"

    @USER-001
    Scenario Outline: Successful Created User
      When valid home system user
      And the user clicks New User option
      And enters the User information "<email>"
      And validated the information entered
      And the user should receive a Account
      And the user enter new account "<email>"
      And the user enter passwords "<password>" and completes information
      And validated the information entered
      And delete user created
      Then the user clicks on logout
      Examples:
        | email                          | password     |
        | rmechan+32uat@landgorilla.com  | Panama002**  |