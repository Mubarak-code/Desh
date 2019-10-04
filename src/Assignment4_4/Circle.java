package Assignment4_4;

public class Circle {
	private double area;
	private double radius;
	
	public double getArea() {
		return area;
	}

	public double getRadius() {
		return radius;
	}

	public Circle(double radius) {
		this.radius = radius;
		
	}
	
	
	public double computeArea() {
		
		area = Math.PI * radius * radius;
		
		return area;
	}
}
