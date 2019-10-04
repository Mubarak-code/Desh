package Assignment5_1;

import java.util.Date;
import java.util.GregorianCalendar;

public class DeptEmployee {
	
	
	
	private String name;
	private Date hireDay;
	
	public DeptEmployee(String name,int yearofHire,
			int monthOfHire,int dayofHire)  {		
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearofHire, monthOfHire -1, dayofHire);
		hireDay = cal.getTime();
		}
		
	
	
	public double computeSalary() {
		double Salary = 0;
		
		return Salary;
	}
	
	public String getName() {
		return name;
	}
	
	public Date getHireDay() {
		
	
		return hireDay;
	}
	

}
	




