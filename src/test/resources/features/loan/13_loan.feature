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

    @LOAN-021
    Scenario: Change Status the loans with fields required empty in the Loan Information tab
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And click to change status
      Then validate the required fields message

    @LOAN-022
    Scenario: Term in Days field with Zero Value
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter information loan "0"
      And click to change status
      Then validate days message with zero value

    @LOAN-023
    Scenario: Term in Days field with Negative Value
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter information loan "-2"
      And click to change status
      Then validate days message with negative value

    @LOAN-024
    Scenario: Change Status the loans with fields required empty in the Property Information Tab
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter information loan empty property information "365"
      And click to change status
      Then validate message empty property information

    @LOAN-025
    Scenario: Fill fields with Borrower Information with error in email format
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      Then validates the email address in Borrower Information

    @LOAN-026
    Scenario: Fill fields with information from the Co-borrower1, Co-Borrower Type 1 = “Person”
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter data the new Loan Information "Sub-Loan"
      And delete the loan created
      And the user clicks on logout

