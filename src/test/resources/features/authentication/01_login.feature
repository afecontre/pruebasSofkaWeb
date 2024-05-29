#language: en
@lg
Feature: Login
  As user of the Land Gorilla UAT page,
  I want to be able to log in with my username and password
  To access the different products

    Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page
      Given the user is on the application home page "Login"

    @LGN-001
    Scenario: Successful login
      When the user enter a name your user "subuser"
      And click on the Login button
      Then valid home page
      And the user clicks on logout

    @LGN-002
    Scenario Outline: Login with invalid email
      When the user enter a name your user "<username>" and a password "<password>"
      And click on the Login button
      Then valid that the login is invalid
      Examples:
        | username                   | password      |
        | rmechan+lg01uat@gmail.com  | Betty78***(&/ |

    @LGN-003
    Scenario Outline: Login with invalid password
      When the user enter a name your user "<username>" and a password "<password>"
      And click on the Login button
      Then valid that the login is invalid
      Examples:
        | username                 | password        |
        | rmechan@landgorilla.com  | Arturo78***(&/  |

    @LGN-004
    Scenario Outline: Inicio de sesión con usuario y password no válidos
      When the user enter a name your user "<username>" and a password "<password>"
      And click on the Login button
      Then valid that the login is invalid
      Examples:
        | username                   | password        |
        | claudia+lg01uat@gmail.com  | Roberto78***(&/ |

    @LGN-005
    Scenario Outline: Login with user in empty field
      When the user enter a name your user "<username>" and a password "<password>"
      And click on the Login button
      Then valid that the login is invalid due to empty user
      Examples:
        | username   | password        |
        |            | Roberto78***(&/ |

    @LGN-006
    Scenario Outline: Login with password in empty field
      When the user enter a name your user "<username>" and a password "<password>"
      And click on the Login button
      Then valid that the login is invalid due to empty password
      Examples:
        | username                    | password   |
        |  claudia+lg01uat@gmail.com  |            |