#language: en
@lg_
Feature: Reset Password
As user of the Land Gorilla UAT page,
I want to be able to log in with my username and password
To access the different products

  Rule: I forgot my account password and I'm trying to recover my password

    Background: Enter the Home Page
      Given the user is on the application home page "Login"

    @RPA-001
    Scenario Outline: Reset Password
      When the user clicks on the Forget Password option
      And enters their email "<email>"
      And clicks the Identify button
      Then sees a valid recovery message
      Then the user should receive a password reset link
      And the user is on the application reset password
      And the user enter a new password "<new_password>"
      And the user enters the password again "<new_password>"
      And click the Set The Password button
      Then valid reset message
      Examples:
        | email                  |  new_password |
        | rmechan@landgorilla.com|  Leganes002** |


    @RPA-002
    Scenario Outline: Enter the same digit without Combination of letters and numbers
      When the user clicks on the Forget Password option
      And enters their email "<email>"
      And clicks the Identify button
      Then sees a valid recovery message
      Then the user should receive a password reset link
      And the user is on the application reset password
      And the user enter a new password "<new_password>"
      And the user enters the password again "<new_password>"
      Then valid that the button is disabled
      Examples:
        | email                  |  new_password  |
        | rmechan@landgorilla.com|  ****####      |

    @RPA-003
    Scenario Outline: Enter digits without One capital letter
      When the user clicks on the Forget Password option
      And enters their email "<email>"
      And clicks the Identify button
      Then sees a valid recovery message
      Then the user should receive a password reset link
      And the user is on the application reset password
      And the user enter a new password "<new_password>"
      And the user enters the password again "<new_password>"
      Then valid that the button is disabled
      Examples:
        | email                  |  new_password  |
        | rmechan@landgorilla.com|  karate200#**  |

    @RPA-004
    Scenario Outline: Enter digits without One lowercase letter
      When the user clicks on the Forget Password option
      And enters their email "<email>"
      And clicks the Identify button
      Then sees a valid recovery message
      Then the user should receive a password reset link
      And the user is on the application reset password
      And the user enter a new password "<new_password>"
      And the user enters the password again "<new_password>"
      Then valid that the button is disabled
      Examples:
        | email                  |  new_password  |
        | rmechan@landgorilla.com|  KARATE200#**  |

    @RPA-005
    Scenario Outline: Enter digits without One special character !@#$%&*()
      When the user clicks on the Forget Password option
      And enters their email "<email>"
      And clicks the Identify button
      Then sees a valid recovery message
      Then the user should receive a password reset link
      And the user is on the application reset password
      And the user enter a new password "<new_password>"
      And the user enters the password again "<new_password>"
      Then valid that the button is disabled
      Examples:
        | email                  |  new_password  |
        | rmechan@landgorilla.com|  KARATe200010  |

    @RPA-006
    Scenario Outline: Enters the same previous password in the New and Confirm fields
      When the user clicks on the Forget Password option
      And enters their email "<email>"
      And clicks the Identify button
      Then sees a valid recovery message
      Then the user should receive a password reset link
      And the user is on the application reset password
      And the user enter a new password "<new_password>"
      And the user enters the password again "<new_password>"
      Then valid that the button is disabled
      Examples:
        | email                  |  new_password |
        | rmechan@landgorilla.com| Bilbao9091**  |

    @RPA-007
    Scenario Outline: Enter digits contain your user ID
      When the user clicks on the Forget Password option
      And enters their email "<email>"
      And clicks the Identify button
      Then sees a valid recovery message
      Then the user should receive a password reset link
      And the user is on the application reset password
      And the user enter a new password "<new_password>"
      And the user enters the password again "<new_password>"
      Then valid that the button is disabled
      Examples:
        | email                  |  new_password  |
        | rmechan@landgorilla.com|  Rmechan###21  |

    @RPA-008
    Scenario Outline: Enter digits more than 2 consecutive characters of your full name
      When the user clicks on the Forget Password option
      And enters their email "<email>"
      And clicks the Identify button
      Then sees a valid recovery message
      Then the user should receive a password reset link
      And the user is on the application reset password
      And the user enter a new password "<new_password>"
      And the user enters the password again "<new_password>"
      Then valid that the button is disabled
      Examples:
        | email                  |  new_password  |
        | rmechan@landgorilla.com|  Roberto###21  |

    @RPA-009
    Scenario Outline: Enters different passwords in the New and Confirm fields
      When the user clicks on the Forget Password option
      And enters their email "<email>"
      And clicks the Identify button
      Then sees a valid recovery message
      Then the user should receive a password reset link
      And the user is on the application reset password
      And the user enter a new password "<new_password_1>"
      And the user enters the password again "<new_password_2>"
      Then valid that the button is disabled
      Examples:
        | email                  |  new_password_1  | new_password_2  |
        | rmechan@landgorilla.com|  Karate*###21    | Karati*###21    |

