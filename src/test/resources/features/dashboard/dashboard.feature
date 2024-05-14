#language: en
@lg_dashboard
Feature: Dashboard
  As user of the Land Gorilla UAT page,
  I want to be able to log in with my username and password
  To access the different products

  Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page
      Given the user has logged in with username "rmechan@landgorilla.com" and password "Bochum4040**"

    @DSH-001
    Scenario: Order Statistics with Active Status
      When valid for complete sections
      Then it is valid to show the number of active orders

    @DSH-002
    Scenario Outline: Display statistics of the "Loan Type" Filter
      When it is valid to show the number of active orders
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
#
    @DSH-003
    Scenario Outline: Display statistics of the "System User" Filter
      When it is valid to show the number of active orders
      And click filtro Orders
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

    @DSH-004
    Scenario Outline: Display statistics of the "Product Ordered" Filter
      When it is valid to show the number of active orders
      And click filtro Orders
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

    @DSH-005
    Scenario Outline: Display statistics of the "Order Status" Filter
      When it is valid to show the number of active orders
      And click filtro Orders
      And filtrar por "Order Status"
      And seleccionar el tipo "<type>"
      Then validar los graficos
      And click en el filtro por "Today"
      Then validar los graficos
      And click en el filtro por "Week"
      Then validar los graficos
      And click en el filtro por "Month"
      Then validar los graficos
      Examples:
        | type   |
        | Active |

    @DSH-006
    Scenario Outline: Display statistics of the "Loan Program" Filter - Loan
      When it is valid to show the number of active orders
      And click filtro Loan
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

    @DSH-007
    Scenario Outline: Display statistics of the "System User" Filter - Loan
      When it is valid to show the number of active orders
      And click filtro Loan
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

    @DSH-008
    Scenario Outline: Display statistics of the "Investor" Filter - Loan
      When it is valid to show the number of active orders
      And click filtro Loan
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

    @DSH-009
    Scenario Outline: Display statistics of the "Transaction Table" Filter - Loan
      When it is valid to show the number of active orders
      And click filtro Loan
      And filtrar por "Transaction Table"
      And seleccionar el tipo "<type>"
      Then validar los graficos
      And click en el filtro por "Today"
      Then validar los graficos
      And click en el filtro por "Week"
      Then validar los graficos
      And click en el filtro por "Month"
      Then validar los graficos
      Examples:
        | type            |
        | richard morales |

    @DSH-010
    Scenario Outline: Display statistics of the "Loan Type" Filter - Draws
      When it is valid to show the number of active orders
      And click filtro Draws
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

    @DSH-011
    Scenario Outline: Display statistics of the "System User" Filter - Draws
      When it is valid to show the number of active orders
      And click filtro Draws
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

    @DSH-012
    Scenario Outline: Display statistics of the "Loan Program" Filter - Draws
      When it is valid to show the number of active orders
      And click filtro Draws
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

    @DSH-013
    Scenario Outline: Display statistics of the "Investor" Filter - Draws
      When it is valid to show the number of active orders
      And click filtro Draws
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

    @DSH-014
    Scenario Outline: Display statistics of the "Transaction Table" Filter - Draws
      When it is valid to show the number of active orders
      And click filtro Draws
      And filtrar por "Transaction Table"
      And seleccionar el tipo "<type>"
      Then validar los graficos
      And click en el filtro por "Today"
      Then validar los graficos
      And click en el filtro por "Week"
      Then validar los graficos
      And click en el filtro por "Month"
      Then validar los graficos
      Examples:
        | type                   |
        | AutoTran 1573146458085 |

    @DSH-015
    Scenario Outline: Display statistics of the "Loan Type" Filter - Change Orders
      When it is valid to show the number of active orders
      And click filtro Change Orders
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

    @DSH-016
    Scenario Outline: Display statistics of the "System User" Filter - Change Orders
      When it is valid to show the number of active orders
      And click filtro Change Orders
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

    @DSH-017
    Scenario Outline: Display statistics of the "Loan Program" Filter - Change Orders
      When it is valid to show the number of active orders
      And click filtro Change Orders
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

    @DSH-018
    Scenario Outline: Display statistics of the "Investor" Filter - Change Orders
      When it is valid to show the number of active orders
      And click filtro Change Orders
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

    @DSH-019
    Scenario Outline: Display statistics of the "Transaction Table" Filter - Change Orders
      When it is valid to show the number of active orders
      And click filtro Draws
      And filtrar por "Transaction Table"
      And seleccionar el tipo "<type>"
      Then validar los graficos
      And click en el filtro por "Today"
      Then validar los graficos
      And click en el filtro por "Week"
      Then validar los graficos
      And click en el filtro por "Month"
      Then validar los graficos
      Examples:
        | type                   |
        | AutoTran 1573146458085 |
