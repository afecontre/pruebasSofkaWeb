package co.com.certification.testing.models;

public enum  InformationSystem {

    USUARIO("Roberto Carlos","Mechan","1500","100","100","1000","700");

    private final String firstName;
    private final String lastName;
    private final String amountLoan;
    private final String borrowerContribution;
    private final String borrowerEquity;
    private final String contingency;
    private final String interestReserve;

    InformationSystem(String firstName,String lastName,String amountLoan,String borrowerContribution,String borrowerEquity,String contingency,String interestReserve)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.amountLoan=amountLoan;
        this.borrowerContribution=borrowerContribution;
        this.borrowerEquity=borrowerEquity;
        this.contingency=contingency;
        this.interestReserve=interestReserve;
    }

    public String getFirstName(){
        return  firstName;
    }
    public String getLastName(){
        return  lastName;
    }
    public String getAmountLoan(){
        return  amountLoan;
    }
    public String getBorrowerContribution(){
        return  borrowerContribution;
    }
    public String getBorrowerEquity(){
        return  borrowerEquity;
    }
    public String getContingency(){
        return  contingency;
    }
    public String getInterestReserve(){
        return  interestReserve;
    }
}
