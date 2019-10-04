package BST;

public class MyBST {
	BinaryNode root;
	
	public MyBST() {
	root = null;
	}
	
	public void insert(Integer x) {
		BinaryNode newNode = new BinaryNode(x, null, null);
		if (root == null) {
			root = newNode;
			return;
		}
		else {
			BinaryNode temp = root;
			boolean inserted = false;
			
			while(!inserted) {
				if (x.compareTo(temp.value) < 0) {
					if (temp.left == null) {
						temp.left = newNode;
						inserted = true;
					}else {
						temp = temp.left;
					}
					
				}else if (x.compareTo(temp.value) > 0) {
					if (temp.right == null) {
						temp.right = newNode;
						inserted = true;
					}else {
						temp = temp.right;
					}
					
				}
			}
				
			}
			
		}
	
	public void printTree() {
		if (root == null) {
			System.out.println("Tree is empty");
		}else {
			printTree(root);
		}
		
	}
		private void printTree (BinaryNode t) {
			if (t != null) {
				printTree(t.left);
				System.out.println(t.value);
				printTree(t.right);
			}
			
		}
		
		public void printPreOrder() {
			if (root == null) {
				System.out.println("Tree is empty");
			}else {
				printPreOrder(root);
			}
			
		}
		
		private void printPreOrder(BinaryNode s) {
			if (s!= null) {
				System.out.println(s.value);
				printPreOrder(s.left);
				printPreOrder(s.right);
			}
		}
		
		public void printPostOrder() {
			if (root == null) {
				System.out.println("Tree is empty");
			}else
				printPostOrder(root);
		}
		private void printPostOrder (BinaryNode d) {
			if(d!=null) {
				printPostOrder(d.left);
				printPostOrder(d.right);
				System.out.println(d.value);
			}
		}
}
