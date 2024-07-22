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
      And the user clicks Quick Search and enter Search information "LOAN_035"
      Then validate the loan

    @LOAN-005
    Scenario: In the Action button, select Change Status
      When valid home loan
      And the user clicks Quick Search and enter Search information "LOAN_035"
      And change status "Setup"
      Then the user clicks on logout

