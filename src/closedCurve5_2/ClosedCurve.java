package closedCurve5_2;

abstract public class ClosedCurve {
	
	private String name;
	
	public ClosedCurve(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	
	
	abstract double computeArea();

	
	public String getName() {
		return name; 
	}

}
