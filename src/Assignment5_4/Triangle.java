package Assignment5_4;

public class Triangle extends ClosedCurve implements Polygon{

	double sideA;
	double sideB;
	double sideC;
	int numOfSides = 3;
	double perimeter;
	
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
	
	public int getNumberOfSides() {
		
		return numOfSides;
	}

	public double computePerimeter() {
		perimeter = sideA + sideB + sideC;

		return perimeter;
	}

}
