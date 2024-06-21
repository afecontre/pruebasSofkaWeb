#language: en
@CLM
Feature: Dashboard / Draws
  As user of the Land Gorilla UAT page,
  I want to be able to review the dashboard

  Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page
      Given the user has logged in with username "subuser" in "dashboard/home"

    @DSH-DRAW-001
    Scenario Outline: Display statistics of the "Loan Type" Filter - Draws
      When click filtro Draws
      And filtrar por "Loan Type"
      And seleccionar el tipo "<type>"
      Then validar los graficos
      And click en el filtro por "Today"
      Then validar los graficos
      And click en el filtro por "Week"
      Then validar los graficos
      And click en el filtro por "Month"
      Then validar los graficos
      Examples:
        | type          |
        | Conventional  |

    @DSH-DRAW-002
    Scenario Outline: Display statistics of the "System User" Filter - Draws
      When click filtro Draws
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

    @DSH-DRAW-003
    Scenario Outline: Display statistics of the "Loan Program" Filter - Draws
      When click filtro Draws
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

    @DSH-DRAW-004
    Scenario Outline: Display statistics of the "Investor" Filter - Draws
      When click filtro Draws
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

    @DSH-DRAW-005
    Scenario Outline: Display statistics of the "Transaction Table" Filter - Draws
      When click filtro Draws
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
        | type                   |
        | AutoTran 1573146458085 |


