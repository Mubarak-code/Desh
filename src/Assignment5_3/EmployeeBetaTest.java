package Assignment5_3;


import java.util.ArrayList;
import java.util.Scanner;



public class EmployeeBetaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EmployeeBeta [] empy = new EmployeeBeta[3];
//		empy[0] = new EmployeeBeta("Jim Daley", 1993, 10, 18);
//		empy[1] = new EmployeeBeta("Bob Reuben", 1992, 03, 19);
//		empy[2] = new EmployeeBeta("Susan Randolph", 1999, 03, 13);
//		
//		empy[0].createNewChecking("Checking",20000);
//		empy[0].createNewSavings("Saving",10000);
//		empy[0].createNewRetirement("Retirement",5000);
//		
//		empy[1].createNewChecking("Checking",40000);
//		empy[1].createNewSavings("Checking",20000);
//		empy[1].createNewRetirement("Retirement", 10000);
//		
//		empy[2].createNewChecking("Checking",60000);
//		empy[2].createNewSavings("Saving",50000);
//		empy[2].createNewRetirement("Retirement",30000);
	
		
		ArrayList <EmployeeBeta> empy = new ArrayList<EmployeeBeta>();
		empy.add(new EmployeeBeta("Jim Daley", 1993, 10, 18));
		empy.add(new EmployeeBeta("Bob Reuben", 1992, 03, 19));
		empy.add(new EmployeeBeta("Susan Randolph", 1999, 03, 13));
		
		for (EmployeeBeta employ : empy) {
			employ.createNewChecking("Checking",
					employ.getName().equals("Jim Daley")?20000: employ.getName().equals("Bob Reuben")? 40000: 60000);
			
			employ.createNewRetirement("Retirement",
					employ.getName().equals("Jim Daley")?5000 : employ.getName().equals("Bob Reuben")? 10000 : 30000);
				
			if (!employ.getName().equals("Bob Reuben")) {
				employ.createNewSavings ("Saving",
						employ.getName().equals("Jim Daley")?10000: 50000);
			
			}
					
				
			System.out.println(employ.getName());
		}
		
		

				
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
		
  static String getFormattedAccountInfo( ArrayList <EmployeeBeta> empy) {
		String finalString = "";
		for (EmployeeBeta em : empy) {
		finalString += "ACCOUNT INFO FOR "+em.getName() + ":" + "\n\n" + em.getFormattedAcctInfo() +"\n";
		}
		return finalString; 
		

	}

}
