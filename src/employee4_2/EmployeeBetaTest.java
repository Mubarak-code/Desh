package employee4_2;

import java.util.Scanner;

public class EmployeeBetaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeBeta [] empy = new EmployeeBeta[3];
		empy[0] = new EmployeeBeta("Jim Daley", 1993, 10, 18);
		empy[1] = new EmployeeBeta("Bob Reuben", 1992, 03, 19);
		empy[2] = new EmployeeBeta("Susan Randolph", 1999, 03, 13);
		
		empy[0].createNewChecking(20000);
		empy[0].createNewSavings(10000);
		empy[0].createNewRetirement(5000);
		
		empy[1].createNewChecking(40000);
		empy[1].createNewSavings(20000);
		empy[1].createNewRetirement(10000);
		
		empy[2].createNewChecking(60000);
		empy[2].createNewSavings(50000);
		empy[2].createNewRetirement(30000);
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("See a report of all account balances? (Y/N) ");
		String userInput = sc.nextLine();
		sc.close();
		
		if(userInput.equalsIgnoreCase("y") ) {
			String prt = getFormattedAccountInfo(empy);
			System.out.println(prt);
		}else
			System.out.println("Your option returns no output. Try again!");
		
	}
		
static String getFormattedAccountInfo(EmployeeBeta[]empy) {
		String finalString = "";
		for (EmployeeBeta em : empy) {
		finalString += "ACCOUNT INFO FOR "+em.getName() + ":" + "\n\n" + em.getFormattedAcctInfo() +"\n";
		}
		return finalString; 
}

	}
