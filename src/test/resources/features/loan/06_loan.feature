#language: en
@lg
Feature: Loan
  As user of the Land Gorilla UAT page,
  I want to be able to log in with my username and password
  To access the different products

  Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page Loan
      Given the user has logged in with username "subuser" in "loan-manager/index"

    @LOA-001
    Scenario: Create a new Conventional type loan
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter data the new Loan Information "Conventional"

    @LOA-002
    Scenario:Create a new Commercial type loan
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter data the new Loan Information "Commercial"