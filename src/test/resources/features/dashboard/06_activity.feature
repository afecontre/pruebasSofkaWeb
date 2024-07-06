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
        Examples:
          | view   |
          | Year   |

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
        Examples:
          | type           |
          | Justin Alvarez |

      @DSH-LOAN-ACTIVITY-006
      Scenario: Display statistics of the Filter "Last activity in "filter"
        When click filtro Loan Activity
        And filtrar por "Last Activity"
        And filtrar por tiempo "2"
        Then valida la informacion organizada

      @DSH-LOAN-MATURITY-001
      Scenario Outline: Display statistics of the Filter "Loan Program" - Loan Maturity
        When click filtro Loan Maturity
        And filtrar por "Loan Program"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type    |
          | JS LP 1 |

      @DSH-LOAN-MATURITY-002
      Scenario Outline: Display statistics of the Filter "Loan Type" - Loan Maturity
        When click filtro Loan Maturity
        And filtrar por "Loan Type"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type          |
          | Conventional  |

      @DSH-LOAN-MATURITY-003
      Scenario Outline: Display statistics of the Filter "Investor Name" - Loan Maturity
        When click filtro Loan Maturity
        And filtrar por "Investor"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type                  |
          | 1651201244184_Cameron |

      @DSH-LOAN-MATURITY-004
      Scenario Outline: Display statistics of the Filter "Transaction Table" - Loan Maturity
        When click filtro Loan Maturity
        And filtrar por "Transaction Table"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type                   |
          | AutoTran 1573146458085 |

      @DSH-LOAN-MATURITY-005
      Scenario Outline: Display statistics of the Filter "System User" - Loan Maturity
        When click filtro Loan Maturity
        And filtrar por "System User"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type           |
          | Justin Alvarez |


      @DSH-PENDING-DRAWS-001
      Scenario Outline: Display statistics of the Filter "Loan Program" - Pending Draws
        When click filtro Pending Draws
        And filtrar por "Loan Program"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type    |
          | JS LP 1 |

      @DSH-PENDING-DRAWS-002
      Scenario Outline: Display statistics of the Filter "Loan Type" - Pending Draws
        When click filtro Pending Draws
        And filtrar por "Loan Type"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type          |
          | Conventional  |

      @DSH-PENDING-DRAWS-003
      Scenario Outline: Display statistics of the Filter "Investor Name" - Pending Draws
        When click filtro Pending Draws
        And filtrar por "Investor"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type                  |
          | 1651201244184_Cameron |

      @DSH-PENDING-DRAWS-004
      Scenario Outline: Display statistics of the Filter "Transaction Table" - Pending Draws
        When click filtro Pending Draws
        And filtrar por "Transaction Table"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type                   |
          | AutoTran 1573146458085 |

      @DSH-PENDING-DRAWS-005
      Scenario Outline: Display statistics of the Filter "System User" - Pending Draws
        When click filtro Pending Draws
        And filtrar por "System User"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type           |
          | Justin Alvarez |

      @DSH-PENDING-CHANGE_ORDERS-001
      Scenario Outline: Display statistics of the Filter "Loan Program" - Pending Change Orders
        When click filtro Pending Change Orders
        And filtrar por "Loan Program"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type    |
          | JS LP 1 |

      @DSH-PENDING-CHANGE_ORDERS-002
      Scenario Outline: Display statistics of the Filter "Loan Type" - Pending Change Orders
        When click filtro Pending Change Orders
        And filtrar por "Loan Type"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type          |
          | Conventional  |

      @DSH-PENDING-CHANGE_ORDERS-003
      Scenario Outline: Display statistics of the Filter "Investor Name" - Pending Change Orders
        When click filtro Pending Change Orders
        And filtrar por "Investor"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type                  |
          | 1651201244184_Cameron |

      @DSH-PENDING-CHANGE_ORDERS-004
      Scenario Outline: Display statistics of the Filter "Transaction Table" - Pending Change Orders
        When click filtro Pending Change Orders
        And filtrar por "Transaction Table"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        Examples:
          | type                   |
          | AutoTran 1573146458085 |

      @DSH-PENDING-CHANGE_ORDERS-005
      Scenario Outline: Display statistics of the Filter "System User" - Pending Change Orders
        When click filtro Pending Change Orders
        And filtrar por "System User"
        And seleccionar el tipo "<type>"
        Then valida la informacion organizada
        And the user clicks on logout
        Examples:
          | type           |
          | Justin Alvarez |


