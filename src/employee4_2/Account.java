package employee4_2;

import day3.Employee;

public class Account {
	
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private String acctType;
	Employee emp;
	
	public double getBalance() {
		return this.balance;
	}

	public String getAcctType() {
		return this.acctType;
	}
	
	
	Account(String acctType, double balance){
	this.acctType =acctType;
	this.balance = balance;
	}

	Account( String acctType){
	this(acctType,DEFAULT_BALANCE);
	}
	public String toString() {
	return "Account Type = "+acctType+ ","+ " name of account: "+ emp.getName() +", Balance = "+balance ;
	}
	public void makeDeposit(double deposit) {
	//implement
		balance += deposit; 
		System.out.println("Available balance after deposit "+ balance);
	}
	
	//updates the balance field
	//updates the balance field and returns true, unless
	//withdrawal amount is too large; in that case,
	//it does not modify the balance field, and returns false

	
	public boolean makeWithdrawal(double amount) {
	//implement
		if (amount < balance) {
			balance -=  amount; 
			System.out.println("Available balance after withdarawal "+ balance);
			return true;
		}
		System.out.println("Insufficient funds");
		return false;
		
	}
	
	/**
	 * Write a method to the Account class called ‘computeInterest’.
      The method returns the yearly interest amount for that account.
      If the account is a checking account then the interest  =  balance * 0.02
      If the account is a savings account then the interest  =  balance * 0.04
      If the account is a retirement account then the interest  =  balance * 0.05

      The signature and return type of the method is      double computeInterest();

	 */
	
	public double computeInterest() {
		double yearlyInterest = 0;
		if (acctType.equals(CHECKING)) {
			yearlyInterest = balance * 0.02;
			System.out.println("Balance plus yearly interest = "+yearlyInterest);
			return yearlyInterest;
			
		}else if (acctType.equals(SAVINGS)) {
			yearlyInterest = balance * 0.04; 
			System.out.println("Balance plus yearly interest = "+yearlyInterest);
			return yearlyInterest;
		}
		else if (acctType.equals(RETIREMENT)) {
			yearlyInterest = balance * 0.05;
			System.out.println("Balance plus yearly interest = "+yearlyInterest);
			return yearlyInterest;
			
		}
		return yearlyInterest;
		
		
	}


}
