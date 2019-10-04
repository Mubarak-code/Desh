package Assignment5_4;

public class Square extends ClosedCurve implements Polygon{

	double length;
	int numOfSides = 4;
	double perimeter;
	
	Square(String name,int length){
		super(name);
		this.length = length;
	}

	double computeArea() {
		// TODO Auto-generated method stub
		double area;
		
		area = length * length;
		
		return area;
	}
	
	public int getNumberOfSides() {
		
		return numOfSides;
	}


	public double computePerimeter() {
		perimeter = length + length + length + length;
		return perimeter;
	
	}
}
