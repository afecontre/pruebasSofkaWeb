#language: en
@lg_expired
Feature: Expired Password
As user of the Land Gorilla UAT page,
I want to be able to log in with my username and password
To access the different products

  Rule: I forgot my account password and I'm trying to recover my password

    Background: Enter the Home Page
      Given the user is on the application home page

    @EPA-001
    Scenario Outline: Expired Password
      When the user enter a name your user "<username>" and a password "<password>"
      And click on the Login button
      Then valid expired message
      Examples:
        | username                     | password      |
        | rmechan+uat@landgorilla.com  | Enzo78***(&/  |

    @EPA-002
    Scenario Outline: Expired Password
      When the user enter a name your user "<username>" and a password "<password>"
      And click on the Login button
      Then valid expired message
      And user clicks to change update password
      And the user is on the application reset password
      And the user enter a new password "<new_password>"
      And the user enters the password again "<new_password>"
      And click the Set The Password button
      Then valid reset message
      Examples:
        | username                 | password       |  new_password  |
        | rmechan@landgorilla.com  | Eamll78***(&/  |  Yape78***(&/  |

