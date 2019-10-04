package BST;

public class MainBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyBST b1 = new MyBST();
		
		b1.insert(15);
		b1.insert(25);
		b1.insert(5);
		b1.insert(30);

//		b1.printTree();
//		b1.printPreOrder();
		b1.printPostOrder();

	}

}
