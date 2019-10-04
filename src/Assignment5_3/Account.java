package Assignment5_3;


public class Account {
	
//	public final static String CHECKING = "checking";
//	public final static String SAVINGS = "savings";
//	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private String acctType;
	private final static String NO_ACCOUNT =  "NO ACCOUNT TYPE";
//	private String acctType;
	EmployeeBeta emp;
	
	public double getBalance() {
		return this.balance;
	}

	public String getAcctType() {
		return this.acctType;
	}
	
	
	Account(String acctType, double balance){
	this.balance = balance;
	this.acctType = acctType;
	}

	Account(){
	this(NO_ACCOUNT,DEFAULT_BALANCE);
	}
	public String toString() {
	return " name of account: "+ emp.getName() +", Balance = "+balance ;
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

	
	public void makeWithdrawal(double amount) {
	//implement
		if (amount < balance) {
			balance -=  amount; 
			System.out.println("Available balance after withdarawal "+ balance);
			
		}
		System.out.println("Insufficient funds");
		
		
	}
	
	/**
	 * Write a method to the Account class called ‘computeInterest’.
      The method returns the yearly interest amount for that account.
      If the account is a checking account then the interest  =  balance * 0.02
      If the account is a savings account then the interest  =  balance * 0.04
      If the account is a retirement account then the interest  =  balance * 0.05

      The signature and return type of the method is      double computeInterest();

	 */
	
//	public double computeInterest() {
//		double yearlyInterest = 0;
//		if (acctType.equals(CHECKING)) {
//			yearlyInterest = balance * 0.02;
//			System.out.println("Balance plus yearly interest = "+yearlyInterest);
//			return yearlyInterest;
//			
//		}else if (acctType.equals(SAVINGS)) {
//			yearlyInterest = balance * 0.04; 
//			System.out.println("Balance plus yearly interest = "+yearlyInterest);
//			return yearlyInterest;
//		}
//		else if (acctType.equals(RETIREMENT)) {
//			yearlyInterest = balance * 0.05;
//			System.out.println("Balance plus yearly interest = "+yearlyInterest);
//			return yearlyInterest;
//			
//		}
//		return yearlyInterest;
//		
//		
//	}


}
