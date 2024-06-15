#language: en
@lg
Feature: Draws
  As user of the Land Gorilla UAT page,
  I want to be able to log in with my username and password
  To access the different products

  Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page Loan
      Given the user has logged in with username "subuser" in "loan-manager/index"

    @DRA-001
    Scenario: Create draw with basic Conventional type loan
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter data the new Loan Information "Conventional"
      And create "1" new Draw
      And delete the loan created

    @DRA-002
    Scenario: Create draw, add item to a Commercial type loan
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter data the new Loan Information "Commercial"
      And create "1" new Draw
      And delete the loan created

    @DRA-003
    Scenario: Create draw, add item, Approved Items Partial - Deposits Confirmed
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter data the new Loan Information "Conventional"
      And create "1" new Draw
      And add line item and deposits confirmed
      And delete the loan created

    @DRA-004
    Scenario: Create draw, add item, Approved Items Partial - Approve Confirmed
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter data the new Loan Information "Conventional"
      And create "1" new Draw
      And add line item and approve confirmed
      And delete the loan created

    @DRA-005
    Scenario: Create draw, add item, Approved Items Partial - Contingency Approve Confirmed
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter data the new Loan Information "Conventional"
      And create "1" new Draw
      And add line item and Contigency approve confirmed
      And delete the loan created

    @DRA-006
    Scenario: Create draw, add item, Approved Items Partial - Interest Approve Confirmed
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter data the new Loan Information "Conventional"
      And create "1" new Draw
      And add line item and Interest approve confirmed
      And delete the loan created

    @DRA-007
    Scenario: Create draw, add item, Approved Items Total
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter data the new Loan Information "Conventional"
      And create "1" new Draw
      And add line item and full approval
      And delete the loan created
      And the user clicks on logout