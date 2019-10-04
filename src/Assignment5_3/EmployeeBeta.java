package Assignment5_3;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;


public class EmployeeBeta {
	
	private Account SavingAccount;
	private Account CheckingAccount;
	private Account RetirementAccount;
	
	
	
//	public final static String CHECKING = "checking";
//	public final static String SAVINGS = "savings";
//	public final static String RETIREMENT = "retirement";
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

	public void createNewChecking(String name, double startAmount) {
		// implement
		CheckingAccount = new CheckingAccount(name, startAmount);
		allAccount.add(CheckingAccount);
		
	
	}
	public void createNewSavings(String name, double startAmount) {
		// implement
		SavingAccount = new SavingAccount(name, startAmount);
		allAccount.add(SavingAccount);
	}
	public void createNewRetirement(String name, double startAmount) {
		// implement
		RetirementAccount = new RetirementAccount(name, startAmount);
		allAccount.add(RetirementAccount);
		
		
	}

	public void deposit(Account account, double amt){
		// implement
		if (account.equals(SavingAccount))  {
			SavingAccount.makeDeposit(amt);
			}
		else if( account.equals(CheckingAccount)) {
			CheckingAccount.makeDeposit(amt);
		}
		else if (account.equals(RetirementAccount)) {
			RetirementAccount.makeDeposit(amt);
		}else
		{
			System.out.println("Invalid account selected");
		}
		
	}
	public boolean withdraw(Account account, double amt){
		// implement
		if (account.equals(SavingAccount)) {
			SavingAccount.makeWithdrawal(amt);
		}else if( account.equals(CheckingAccount)) {
			CheckingAccount.makeWithdrawal(amt);
		}else if(account.equals(RetirementAccount)) {
			RetirementAccount.makeWithdrawal(amt);
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
		String formattedPrint = "";
		for (Account oneAccount : allAccount) {
//            if(oneAccount instanceof SavingAccount) {
//            	System.out.println(((SavingAccount)oneAccount).isDesh());
           
			formattedPrint += "Account Type: "+ oneAccount.getAcctType() + "Balance: "+ oneAccount.getBalance() +"\n";
		}
		return formattedPrint;
	}

}



