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
      Examples:
        | type   |
        | Active |

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
      Examples:
        | type            |
        | richard morales |

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
      Examples:
        | type                   |
        | AutoTran 1573146458085 |

    @DSH-CHANGE-ORDERS-001
    Scenario Outline: Display statistics of the "Loan Type" Filter - Change Orders
      When click filtro Change Orders
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

    @DSH-CHANGE-ORDERS-002
    Scenario Outline: Display statistics of the "System User" Filter - Change Orders
      When click filtro Change Orders
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

    @DSH-CHANGE-ORDERS-003
    Scenario Outline: Display statistics of the "Loan Program" Filter - Change Orders
      When click filtro Change Orders
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

    @DSH-CHANGE-ORDERS-004
    Scenario Outline: Display statistics of the "Investor" Filter - Change Orders
      When click filtro Change Orders
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

    @DSH-CHANGE-ORDERS-005
    Scenario Outline: Display statistics of the "Transaction Table" Filter - Change Orders
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
      Examples:
        | type                   |
        | AutoTran 1573146458085 |

