package Assignment4_4;

public class Triangle {
	
	private double area;
	private double base;
	private double height;
	
	
	public Triangle (double base, double height){
		this.base = base;
		this.height = height;
		
	}
	
	public double computeArea() {
		
	area = (base * height)/2;
		
		return area;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double getArea() {
		return area;
	}
	

}
