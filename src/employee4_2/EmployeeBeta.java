package employee4_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;


public class EmployeeBeta {
	
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private String name;
	private Date hireDate;
	public ArrayList<Account> allAccount =new ArrayList <Account>();
	
	public EmployeeBeta(String name, int yearOfHire, 
int monthOfHire, int dayOfHire){
		this.name = name;
		GregorianCalendar cal = 
new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(CHECKING, startAmount);
		allAccount.add(checkingAcct);
		
	
	}
	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(SAVINGS, startAmount);
		allAccount.add(savingsAcct);
	}
	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(RETIREMENT, startAmount);
		allAccount.add(retirementAcct);
		
		
	}

	public void deposit(Account acctType, double amt){
		// implement
		if (acctType == savingsAcct) {
			savingsAcct.makeDeposit(amt);
			}
		else if( acctType == checkingAcct) {
			checkingAcct.makeDeposit(amt);
		}
		else if (acctType == retirementAcct) {
			retirementAcct.makeDeposit(amt);
		}else
		{
			System.out.println("Invalid account selected");
		}
		
	}
	public boolean withdraw(Account acctType, double amt){
		// implement
		if (acctType == savingsAcct) {
			savingsAcct.makeWithdrawal(amt);
		}else if(acctType == checkingAcct) {
			checkingAcct.makeWithdrawal(amt);
		}else if(acctType == retirementAcct) {
			retirementAcct.makeWithdrawal(amt);
		}
		return false;
	}
	public String getName() {
		return name;
	}
	
	public Date getHireDate() {
		return hireDate;
	}

	public String getFormattedAcctInfo() {
		// implement
		String formattedPrint = "";
		for (Account oneAccount : allAccount) {
			formattedPrint += "Account Type: "+ oneAccount.getAcctType() + "Balance: "+ oneAccount.getBalance() +"\n";
		}
		return formattedPrint;
	}

}



