package Assignment4_4;

public class Rectangle {
	private double width;
	private double height;
	private double area;
	
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getArea() {
		return area;
	}


	public Rectangle (double width, double height){
		this.width = width;
		this.height = height;
		
	}
	
	public double computeArea() {
		
		area = width * height;
		
		return area;
	}

}
