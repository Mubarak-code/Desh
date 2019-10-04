package fppPackage;


import java.util.ArrayList;

public class ShapesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes r1 = new Rectangle("Red", 4, 6);
		Shapes s1 = new Square("White", 5);
		
		ArrayList<Shapes> allShapes = new ArrayList<Shapes>();
		allShapes.add(r1);
		allShapes.add(s1);

		System.out.println(getArea(allShapes));
	}
	
	public static double getArea(ArrayList <Shapes> allShapes) {
		double sum = 0;
		
		for (Shapes ab : allShapes) {
			sum += ab.computeArea();
		}
		return sum;
	}
	

}
