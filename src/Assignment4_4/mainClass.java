package Assignment4_4;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t1 = new Triangle(3, 4);
		Rectangle r1 = new Rectangle(5, 6);
		Circle c1 = new Circle(7);

		System.out.println("The Area of Triangle is "+ t1.computeArea());
		System.out.println("The Area of Rectangle is "+ r1.computeArea());
		System.out.println("The Area of Circle is "+ c1.computeArea());
		
//		System.out.println(c1.getArea());
	}

}
