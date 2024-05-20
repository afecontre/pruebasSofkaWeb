#language: en
@lg_
Feature: Forgotten Password
As a user of the Land Gorilla UAT page,
I want to be able to log in with my username and password
To access the different products

  Rule: I forgot my account password and I'm trying to recover my password

    Background: Enter the Home Page
      Given the user is on the application home page "Login"

    @FPA-001
    Scenario Outline: Forgotten Password
      When the user clicks on the Forget Password option
      And enters their email "<email>"
      And clicks the Identify button
      Then sees a valid recovery message

      Examples:
        | email                    |
        | rmechan@landgorilla.com  |

    @FPA-002
    Scenario Outline: Email Field required
      When the user clicks on the Forget Password option
      And enters their email "<email>"
      And clicks the Identify button
      Then valid that the login is invalid due to empty user
      Examples:
        | email       |
        |             |

    @FPA-003
    Scenario Outline: Email Field valid
      When the user clicks on the Forget Password option
      And enters their email "<email>"
      And clicks the Identify button
      Then valid email address
      Examples:
        | email         |
        | 123holamundo  |



