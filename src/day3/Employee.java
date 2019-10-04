package day3;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	
	//instance fields
		private String name;
		private double salary;
		private Date hireDay;
		
	Employee(String aName, double aSalary, int aYear,
	         int aMonth, int aDay) 
	{name = aName;
	salary = aSalary;
	GregorianCalendar cal = new GregorianCalendar(aYear,aMonth-1,aDay);
	hireDay = cal.getTime();
	}

	// instance methods
	public String getName() {
	return name;
	}
	public double getSalary() {
	return salary;
	}
	//needs to be improved!!
	public Date getHireDay() {
	return hireDay;
	}

	public void raiseSalary(double byPercent) {
	double raise = salary * byPercent /100;
	salary += raise;
	
	System.out.println("Salary with raise "+ salary);
	}

	
	/**
	 * If the salary is greater than $80,000 then the tax is 28% of the salary.
 If the salary is greater than $50,000 and  <=  $80,000  then the tax is 24% of the salary.
 If the salary is greater than $26,000  and  <=  $50,000  then the tax is 20% of the salary.
 If the salary is  <=  $26,000  then there is no tax.

	 */
	
	// method for yearly federal tax
	
	double yearlyFederalTax () {
		double tax;
		
		if(salary > 80000) {
			tax = salary * 0.28;
		}
		else if (salary > 50000 && salary <= 80000) {
			tax = salary * 0.24;
		}
		else if (salary > 26000 && salary <= 50000) {
			tax = salary * 0.20;
		}else 
			tax = 0;
		
		System.out.println("Yearly federal tax will be " + tax);
		
		return tax; 
		
	}
	
	}


