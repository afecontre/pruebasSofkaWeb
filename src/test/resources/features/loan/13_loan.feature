#language: en
@CLM
Feature: Loans / Create New Loan Setup
  As user of the Land Gorilla UAT page,
  I want to create New Loans

  Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page Loan
      Given the user has logged in with username "subuser" in "loan-manager/index"

    @LOAN-017
    Scenario: Download Template Update Risk Labels
      When valid home loan
      And the user download Template Update Risk Labels

    @LOAN-018
    Scenario: Select Open Loan, do not select any loan
      When valid home loan
      And the user clicks Open Loan
      Then validate warning message selected

    @LOAN-019
    Scenario: Select more than one loan, select Open Loan
      When valid home loan
      And the user selects loans
      And the user clicks Open Loan
      Then validate warning message selected loans

    @LOAN-020
    Scenario: Select a loan, select Open Loan
      When valid home loan
      And the user enter Search information "CVS-4409"
      And select the loan
      And the user clicks Open Loan
      Then the user clicks on logout

