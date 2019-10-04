package Assignment5_4;

public class Rectangle extends ClosedCurve implements Polygon{
	
	double width;
	double length;
	int numOfSides = 4;
	double perimeter;
	
	public Rectangle(String name, double width, double length) {
		super(name);
		this.length = length;
		this.width = width;
		// TODO Auto-generated constructor stub
		}
	
	double computeArea() {
		double area;
		area = width * length;
		
		return area;
	}
	
     public int getNumberOfSides() {
    	
    	return numOfSides;
		
	}
    
    public double computePerimeter() {
    	perimeter = width + width + length + length;
    	
    	return perimeter;
    }

}
