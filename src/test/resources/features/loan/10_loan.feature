#language: en
@CLM
Feature: Loans / Create New Loan Setup
  As user of the Land Gorilla UAT page,
  I want to create New Loans

  Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page Loan
      Given the user has logged in with username "subuser" in "loan-manager/index"

    @LOAN-006
    Scenario: Select one or more loans, select Archive Loan
      When the user enter Search information "LFN-000235"
      And archive Loan

    @LOAN-007
    Scenario: Loan Selected Active by selecting one or more loans
      When view Archived
      And the user enter Search information "LFN-000235"
      And switch to active loan
      Then return to loan tab

    @LOAN-008
    Scenario: Select one or more loans, select Delete Loan
      When the user enter Search information delete "LFN-000364"
      And delete Loan
      Then the user clicks on logout
