#language: en
@CLM
Feature: Dashboard / Activity
  As user of the Land Gorilla UAT page,
  I want to be able to review the Dashboard Activity

    Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page

      Given the user has logged in with username "subuser" in "dashboard/home"

      @DSH-LOAN-ACTIVITY-001
      Scenario Outline: Display statistics of the Filter "Loan Program" - Loan Activity
        When click filtro Loan Activity
        And filtrar por "Loan Program"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type    |
          | JS LP 1 |

      @DSH-LOAN-ACTIVITY-002
      Scenario Outline: Display statistics of the Filter "Loan Type" - Loan Activity
        When click filtro Loan Activity
        And filtrar por "Loan Type"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type          |
          | Conventional  |

      @DSH-LOAN-ACTIVITY-003
      Scenario Outline: Display statistics of the Filter "Investor Name" - Loan Activity
        When click filtro Loan Activity
        And filtrar por "Investor"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type                  |
          | 1651201244184_Cameron |

      @DSH-LOAN-ACTIVITY-004
      Scenario Outline: Display statistics of the Filter "Transaction Table" - Loan Activity
        When click filtro Loan Activity
        And filtrar por "Transaction Table"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type                   |
          | AutoTran 1573146458085 |

      @DSH-LOAN-ACTIVITY-005
      Scenario Outline: Display statistics of the Filter "System User" - Loan Activity
        When click filtro Loan Activity
        And filtrar por "System User"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        And the user clicks on logout
        Examples:
          | type           |
          | Justin Alvarez |