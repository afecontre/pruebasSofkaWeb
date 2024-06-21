#language: en
@CLM
Feature: Dashboard / Loans
  As user of the Land Gorilla UAT page,
  I want to be able to review the dashboard

  Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page
      Given the user has logged in with username "subuser" in "dashboard/home"

    @DSH-LOAN-001
    Scenario Outline: Display statistics of the "Loan Program" Filter - Loan
      When click filtro Loan
      And filtrar por "Loan Program"
      And seleccionar el tipo "<type>"
      Then validar los graficos
      And click en el filtro por "Today"
      Then validar los graficos
      And click en el filtro por "Week"
      Then validar los graficos
      And click en el filtro por "Month"
      Then validar los graficos
      Examples:
        | type    |
        | JS LP 1 |

    @DSH-LOAN-002
    Scenario Outline: Display statistics of the "System User" Filter - Loan
      When click filtro Loan
      And filtrar por "System User"
      And seleccionar el tipo "<type>"
      Then validar los graficos
      And click en el filtro por "Today"
      Then validar los graficos
      And click en el filtro por "Week"
      Then validar los graficos
      And click en el filtro por "Month"
      Then validar los graficos
      Examples:
        | type           |
        | Justin Alvarez |

    @DSH-LOAN-003
    Scenario Outline: Display statistics of the "Investor" Filter - Loan
      When click filtro Loan
      And filtrar por "Investor"
      And seleccionar el tipo "<type>"
      Then validar los graficos
      And click en el filtro por "Today"
      Then validar los graficos
      And click en el filtro por "Week"
      Then validar los graficos
      And click en el filtro por "Month"
      Then validar los graficos
      Examples:
        | type                  |
        | 1651201244184_Cameron |

    @DSH-LOAN-004
    Scenario Outline: Display statistics of the "Transaction Table" Filter - Loan
      When click filtro Loan
      And filtrar por "Transaction Table"
      And seleccionar el tipo "<type>"
      Then validar los graficos
      And click en el filtro por "Today"
      Then validar los graficos
      And click en el filtro por "Week"
      Then validar los graficos
      And click en el filtro por "Month"
      Then validar los graficos
      And the user clicks on logout
      Examples:
        | type            |
        | richard morales |
