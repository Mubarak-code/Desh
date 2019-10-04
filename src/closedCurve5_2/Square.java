package closedCurve5_2;

public class Square extends ClosedCurve{
	double length;
	
	Square(String name,int length){
		super(name);
		this.length = length;
	}

	double computeArea() {
		// TODO Auto-generated method stub
		double area;
		
		area = length * length;
		
		return area;
	}
	
	
}
