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

    @LOAN-003
    Scenario: Quick Search Pipeline Loans with Existing Values
      When valid home loan
      And the user clicks Quick Search and enter Search information "XXXX_104"
      Then validate the loan exists

    @LOAN-004
    Scenario: Quick Search Pipeline Loans with Existing Values
      When valid home loan
      And the user clicks Quick Search and enter Search information "LOAN_104"
      Then validate the loan

    @LOAN-06
    Scenario: In the Action button, select Change Status
      When valid home loan
      And the user clicks Quick Search and enter Search information "LOAN_104"
      And change status "Setup"

    @LOAN-007
    Scenario: Select one or more loans, select Archive Loan
      And the user enter Search information "LFN-000235"
      Then archive Loan

    @LOAN-008
    Scenario: Select one or more loans, select Delete Loan
      And the user clicks Quick Search and enter Search information "LFN-000310"
      And delete Loan

    @LOAN-009
    Scenario: View Archived Loans
      And view Archived

    @LOAN-010
    Scenario: Download Template Post Transactions
      When valid home loan
      And the user download Template

