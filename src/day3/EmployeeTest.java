package day3;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Dayo", 60000.00, 1993, 10, 18);
		Employee e2 = new Employee("Ben", 100000.00, 1992, 07, 31);
		Employee e3 = new Employee ("Tinola", 18000.00, 1994, 05, 27);
		
		e1.raiseSalary(20);
		
		e1.yearlyFederalTax();
		
		
		
		Account a1 = new Account(e1, "checking", 10000.0);
		Account a2 = new Account(e2, "savings" , 300.0);
		Account a3 = new Account (e3, "retirement", 300.0);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		a1.makeDeposit(500);
		a1.makeWithdrawal(12000);
		
		a1.computeInterest();
		a3.computeInterest();
		
	} 

}
