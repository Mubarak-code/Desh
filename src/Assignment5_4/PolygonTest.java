package Assignment5_4;

import java.util.ArrayList;

public class PolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Polygon> polyArray = new ArrayList <Polygon>();

		polyArray.add(new Square("Sqaure", 3));
		polyArray.add(new Triangle("Triangle", 4, 5, 6));
		polyArray.add(new Rectangle("Rectangle", 3, 4));
		
		
		for (Polygon pol: polyArray) {
			System.out.println("For this "+ ((ClosedCurve)pol).getName()+ "\n  Number of sides = "+ pol.getNumberOfSides()+"\n  Perimeter = "+pol.computePerimeter());
		}
		
		
		
	}

}
