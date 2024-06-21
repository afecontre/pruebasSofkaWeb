#language: en
@CLM
Feature: Dashboard / Orders
  As user of the Land Gorilla UAT page,
  I want to be able to review the dashboard

  Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page
      Given the user has logged in with username "subuser" in "dashboard/home"

    @DSH-ORDERS-001
    Scenario Outline: Display statistics of the "Loan Type" Filter
      When valid home page
      And click filtro Orders
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

    @DSH-ORDERS-002
    Scenario Outline: Display statistics of the "System User" Filter
      When click filtro Orders
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
        | type      |
        | Jhon Doe  |

    @DSH-ORDERS-003
    Scenario Outline: Display statistics of the "Product Ordered" Filter
      When click filtro Orders
      And filtrar por "Product Ordered"
      And seleccionar el tipo "<type>"
      Then validar los graficos
      And click en el filtro por "Today"
      Then validar los graficos
      And click en el filtro por "Week"
      Then validar los graficos
      And click en el filtro por "Month"
      Then validar los graficos
      Examples:
        | type                                          |
        | Commercial Appraisal - Test Push Notification |

    @DSH-ORDERS-004
    Scenario Outline: Display statistics of the "Order Status" Filter
      When click filtro Orders
      And filtrar por "Order Status"
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
        | type   |
        | Active |