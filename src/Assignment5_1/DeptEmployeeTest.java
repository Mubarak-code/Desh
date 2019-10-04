package Assignment5_1;

import java.util.ArrayList;

public class DeptEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		DeptEmployee [] department = new DeptEmployee[5];
//		
//		department [0] = new Professor(10, "Ben", 2000, 01, 10);
//		department [1] = new Professor(10, "Desh", 2002, 02, 12);
//		department [2] = new Professor(10, "Abdul", 2004, 02, 14);
//		department [3] = new Secretary(200, "Yomi", 2006, 03, 16);
//		department [4] = new Secretary(200, "Tinola", 2008, 04, 20);
//		
//		int sum = 0;
//		
//		for (DeptEmployee emps : department) {
//			sum += emps.computeSalary();
//		}
//		
//		System.out.println("Sum of salary "+ sum);
		
		ArrayList <DeptEmployee> department = new ArrayList <DeptEmployee>();
		department.add(new Professor(10, "Ben", 2000, 01, 10));
		department.add(new Professor(10, "Desh", 2002, 02, 12));
		department.add(new Professor(10, "Abdul", 2004, 02, 14));
		department.add(new Secretary(200, "Yomi", 2006, 03, 16));
		department.add(new Secretary(200, "Tinola", 2008, 04, 20));
		
		int sum = 0;
		
		for (DeptEmployee emps : department) {
			sum += emps.computeSalary();
			String printName = emps.getName();
			System.out.println("Names of Employee: "+ printName);
		}
		System.out.println("\n"+"Sum of Salary " + sum);
		
		
		
	}

};