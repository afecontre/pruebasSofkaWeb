#language: en
@CLM
Feature: Loans / Create New Loan Setup
  As user of the Land Gorilla UAT page,
  I want to create New Loans

  Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page Loan
      Given the user has logged in with username "subuser" in "loan-manager/index"

    @LOAN-009
    Scenario: View Archived Loans
      When valid home page
      And view Archived
      And return to loan tab

    @LOAN-010
    Scenario: Download Template Post Transactions
      When valid home loan
      And the user download Template
      Then the user clicks on logout


