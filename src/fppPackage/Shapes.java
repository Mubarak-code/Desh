package fppPackage;

 abstract public class Shapes {
	String color;
	double area;
	
	
	Shapes(String color){
		this.color = color;
	}
	
	abstract double computeArea();
	

}
