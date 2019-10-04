package fppPackage;

public class Square extends Shapes {
	double length;
	

	
	Square(String color, double length){
		super(color);
		this.length = length;
	}
	
	@Override
	double computeArea() {
		area = length * length;
		return area;
	}
}
