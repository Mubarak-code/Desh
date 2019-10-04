package Assignment5_3;

public class RetirementAccount extends Account {
	
//	private String acctType;
	
	
	public RetirementAccount(String acctType, double balance) {
		super(acctType, balance);
//		this.acctType = acctType;
		
	}
	
	/**
	 * •	when a withdrawal is made from a retirement account, a 2% penalty
	 *		is applied to the balance.  Assume this is done only once per month.
	 */
	
	
	
	public void makeWithdrawal(double amount) {
		//implement
		double checkBalance = getBalance();
			if (amount < checkBalance) {
				checkBalance -=  amount; 
				checkBalance = checkBalance - (checkBalance * 0.02);
				System.out.println("Available balance after withdarawal "+ checkBalance);
				
			}
			System.out.println("Insufficient funds");
			
			
		}
	
	
	
//	public String getAcctType() {
//		return acctType;
//	}

}
