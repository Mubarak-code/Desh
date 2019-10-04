package closedCurve5_2;

public class Rectangle extends ClosedCurve{
	
	double width;
	double length;
	
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

}
