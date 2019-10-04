package closedCurve5_2;

import java.util.ArrayList;

public class ClosedCurveTest {
	
	public static void main (String[] args ) {
		
//		ClosedCurve t1 = new Triangle("Triangle",4, 5, 6);
//		ClosedCurve s1 = new Square("Square",3);
//		ClosedCurve r1 = new Rectangle("Rectangle ",3, 7);
//		ClosedCurve c1 = new Circle("Circle",3);
		
//		ClosedCurve [] closeArray = new ClosedCurve [4];
//		
//		closeArray[0] = t1;
//		closeArray[1] = s1;
//		closeArray[2] = r1;
//		closeArray[3] = c1;
//		
			ArrayList <ClosedCurve> closeArray = new ArrayList<ClosedCurve>();
			
			closeArray.add(new Triangle("Triangle",4, 5, 6) );
			closeArray.add(new Square("Square",3) );
			closeArray.add(new Rectangle("Rectangle ",3, 7));
			closeArray.add(new Circle("Circle",3));
			
		
		for (ClosedCurve check : closeArray ) {
			System.out.println("The area of "+ check.getName() + " is "+ check.computeArea());
		}
		// question 2
		for (ClosedCurve check : closeArray ) {
			System.out.printf("\nThe area of "+ check.getName() + " is "+ "%.2f",check.computeArea());
		}

	}

}
