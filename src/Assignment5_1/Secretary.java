package Assignment5_1;

public class Secretary extends DeptEmployee{
	 private double overtimeHours;
	 
	 public Secretary(double overtimeHours,String name, int yearofHire, int monthOfHire, int dayofHire) {
		 super(name, yearofHire, monthOfHire, dayofHire);
		 this.overtimeHours = overtimeHours;
		 
		// TODO Auto-generated constructor stub
	}
	 
	 public double getOvertimeHours() {
		 return overtimeHours;
	 }
	
	 @Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		 double sum = 12 * overtimeHours;
		 
		return super.computeSalary() + sum;
	}

}
