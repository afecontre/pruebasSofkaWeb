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
      And create "3" new Draw
      And delete the loan created

    @DRA-002
    Scenario: Create draw, add item to a Commercial type loan
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter data the new Loan Information "Commercial"
      And create "1" new Draw
      And add line item
      And delete the loan created
      And the user clicks on logout