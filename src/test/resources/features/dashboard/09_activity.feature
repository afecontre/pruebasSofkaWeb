#language: en
@CLM
Feature: Dashboard / Activity
  As user of the Land Gorilla UAT page,
  I want to be able to review the Dashboard Activity

    Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page

      Given the user has logged in with username "subuser" in "dashboard/home"

     @DSH-ACTIVITY-001
      Scenario Outline: Check Statistics of a selected range with visualization by date
        When valid home page
        And seleccionar el view "<view>"
        Then validar los graficos
        Examples:
          | view   |
          | Day    |

      @DSH-ACTIVITY-002
      Scenario Outline: Check Statistics of a selected range with visualization by date
        When valid home page
        And seleccionar el view "<view>"
        Then validar los graficos
        Examples:
          | view   |
          | Week    |

      @DSH-ACTIVITY-003
      Scenario Outline: Check Statistics of a selected range with visualization by date
        When valid home page
        And seleccionar el view "<view>"
        Then validar los graficos
        Examples:
          | view   |
          | Month  |

      @DSH-ACTIVITY-004
      Scenario Outline: Check Statistics of a selected range with visualization by date
        When valid home page
        And seleccionar el view "<view>"
        Then validar los graficos
        Examples:
          | view   |
          | Quarter|

      @DSH-ACTIVITY-005
      Scenario Outline: Check Statistics of a selected range with visualization by date
        When valid home page
        And seleccionar el view "<view>"
        Then validar los graficos
        And the user clicks on logout
        Examples:
          | view   |
          | Year   |


