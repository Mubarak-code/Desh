package fppPackage;

public class Rectangle extends Shapes{

	double width;
	double length;
	
	
	Rectangle(String color,double length, double width){
		super(color);
		this.length = length;
		this.width = width; 

		}
	
	
	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		
		area = width * length;
		
		return area;
	}
}
