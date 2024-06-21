#language: en
@CLM
Feature: Loans / Create New Loan Setup
  As user of the Land Gorilla UAT page,
  I want to create New Loans

  Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page Loan
      Given the user has logged in with username "subuser" in "loan-manager/index"

    @LOAN-001
    Scenario: Create a new Conventional Type Loan
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter data the new Loan Information "Conventional"
      And delete the loan created

    @LOAN-002
    Scenario: Create a new Commercial Type Loan
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter data the new Loan Information "Commercial"
      And delete the loan created
      And the user clicks on logout