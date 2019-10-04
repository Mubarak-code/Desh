package Assignment5_1;

public class Professor extends DeptEmployee{
	
	private int numOfPublication;
	
	public Professor(int numPub, String name, int yearofHire, int monthOfHire, int dayofHire ) {
	super(name, yearofHire, monthOfHire, dayofHire);
		// TODO Auto-generated constructor stub
	numOfPublication = numPub;
	}
	
	public int getNumOfPublication() {
		return numOfPublication;
	}

}
