#language: en
@CLM
Feature: Loans / Create New Loan Setup
  As user of the Land Gorilla UAT page,
  I want to create New Loans

  Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page Loan
      Given the user has logged in with username "subuser" in "loan-manager/index"

    @LOAN-008
    Scenario: Select one or more loans, select Delete Loan
      When the user clicks Quick Search and enter Search information "LOAN-LG-9773"
      And delete Loan

    @LOAN-009
    Scenario: View Archived Loans
      When view Archived
      And return to loan tab

    @LOAN-010
    Scenario: Download Template Post Transactions
      When valid home loan
      And the user download Template

    @LOAN-011
    Scenario: Loan Selected Active by selecting one or more loans
      When view Archived
      And the user enter Search information "LFN-000235"
      And switch to active loan
      Then return to loan tab

    @LOAN-012
    Scenario: View Active Loans
      When view Archived
      And the user view Active Loan

    @LOAN-013
    Scenario: Select Add System User, do not select any loan
      When the user clicks Add System User
      And validate warning message

    @LOAN-014
    Scenario: select one or more loans, select Add System User
      When the user enter Search information "LOAN-LG-7941"
      And select the loan
      And the user clicks Add System User
      And enter information System User
      Then the user clicks on logout



