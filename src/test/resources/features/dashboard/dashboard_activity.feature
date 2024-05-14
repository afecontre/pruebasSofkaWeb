#language: en
@lg_dashboard
Feature: Dashboard
  As user of the Land Gorilla UAT page,
  I want to be able to log in with my username and password
  To access the different products

    Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page
      Given the user has logged in with username "rmechan@landgorilla.com" and password "Hofeinhem3030**"

    @DSH-ACT
      Scenario Outline: Check Statistics of a selected range with visualization by date
        When it is valid to show the number of active orders
        And seleccionar el view "<view>"
        Then validar los graficos
        Examples:
          | view   |
          | Day    |
          | Week   |
          | Month  |
          | Quarter|
          | Year   |

      @DLA-001
      Scenario Outline: Display statistics of the Filter "Loan Program" - Loan Activity
        When it is valid to show the number of active orders
        And click filtro Loan Activity
        And filtrar por "Loan Program"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type    |
          | JS LP 1 |

      @DLA-002
      Scenario Outline: Display statistics of the Filter "Loan Type" - Loan Activity
        When it is valid to show the number of active orders
        And click filtro Loan Activity
        And filtrar por "Loan Type"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type          |
          | Conventional  |

      @DLA-003
      Scenario Outline: Display statistics of the Filter "Investor Name" - Loan Activity
        When it is valid to show the number of active orders
        And click filtro Loan Activity
        And filtrar por "Investor"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type                  |
          | 1651201244184_Cameron |

      @DLA-004
      Scenario Outline: Display statistics of the Filter "Transaction Table" - Loan Activity
        When it is valid to show the number of active orders
        And click filtro Loan Activity
        And filtrar por "Transaction Table"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type                   |
          | AutoTran 1573146458085 |

      @DLA-004
      Scenario Outline: Display statistics of the Filter "System User" - Loan Activity
        When it is valid to show the number of active orders
        And click filtro Loan Activity
        And filtrar por "System User"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type           |
          | Justin Alvarez |

