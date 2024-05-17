#language: en
@lg
Feature: Loan
  As user of the Land Gorilla UAT page,
  I want to be able to log in with my username and password
  To access the different products

  Rule: The username and password must be valid and associated with an existing account on the system

    Background: Enter the Home Page
      Given the user has logged in with username "rmechan@landgorilla.com" and password "Chiclayo0877**" in "Loan"

    @LOA-001
    Scenario: Quick Search Pipeline Loans with Existing Values
      When valid home loan
      And the user clicks New Loan option
      And valid New Loan page
      And enter information the new Loan