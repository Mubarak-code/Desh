package Assignment5_4;

public class Circle extends ClosedCurve {
	
	double radius;
	
	public Circle(String name, double radius) {
		super(name);
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	
	double computeArea() {
		
		double area; 
		area = Math.PI * (radius * radius);
		
		return area;
	}
	
	
	
}
