package closedCurve5_2;

public class Triangle extends ClosedCurve{
	
	double sideA;
	double sideB;
	double sideC;
	
	public Triangle(String name, double sideA, double sideB, double sideC) {
		// TODO Auto-generated constructor stub
		super(name);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		
	}
	

	double computeArea() {
	
		double area;
		area = Math.sqrt(sideA * sideB * sideC);
		
		return area;
	}

}
