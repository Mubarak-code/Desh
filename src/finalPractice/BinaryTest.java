package finalPractice;

public class BinaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Binary b1 = new Binary();
		b1.addBinary(401);
		b1.addBinary(601);
		b1.addBinary(405);
		b1.addBinary(451);
		b1.addBinary(317);
	
//		b1.printTree();
//		int count = b1.countNodes(b1.root);
//		
//		boolean odd = b1.allOdd();
//		System.out.println(odd);
//		System.out.println(count);
		
		boolean check = b1.allOver();
		
		System.out.println(check);
	}

}
