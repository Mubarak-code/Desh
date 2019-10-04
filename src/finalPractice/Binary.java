package finalPractice;

public class Binary {
	
	BinaryNode root;
	
	Binary(){
		root = null;
	}
	
	
	public class BinaryNode{
		BinaryNode left;
		BinaryNode right;
		int value;
		
		BinaryNode(BinaryNode left, BinaryNode right, int value ){
			this.left = left;
			this.right = right;
			this.value = value;
		}
	}
	
	public void addBinary (Integer x) {
		
		BinaryNode newNode = new BinaryNode(null, null, x);
		
		if (root == null) {
			root = newNode;
			return;
		}else {
			BinaryNode temp = root; 
			boolean found = false;
			
			while (!found) {
				if (x.compareTo(temp.value) < 0) {
					if(temp.left == null) {
						temp.left = newNode;
						found = true;
					}else {
						temp = temp.left;
					}
				}else if (x.compareTo(temp.value) > 0) {
					if(temp.right == null) {
						temp.right = newNode;
						found = true;
					}else {
						temp = temp.right;
					}
				}
			}
		}
	}

	public void printTree() {
		if (root == null) {
			System.out.println("Root is empty");
		}
		else {
			printTree(root);
		}
	}
	
	public void printTree(BinaryNode t) {
		if(t != null) {
			printTree(t.left);
			System.out.println(t.value);
			printTree(t.right);
		}
		
		
	}

	public int countLeaves(BinaryNode t){
		if(t == null) {
			return 0;
		}else if(t.left == null && t.right == null) {
			return 1;
		}else {
			return countLeaves(t.left) + countLeaves(t.right);
		}
		
	}
	
	public int countNodes (BinaryNode t) {
		if (t == null) {
			return 0;
		}
		return 1 + countNodes(t.left) + countNodes(t.right);
	}
	
	
	public boolean allEven() {
		if (root == null) {
			return false;
		}
	 return  allEven(root);
	}
	
	public boolean allEven(BinaryNode root) {
		if (root == null) {
			return true;
		}
		else if(root.value %2 ==1 )  {
			return false;	
		}
		return allEven(root.left) && allEven(root.right);
		
	}
	
	public boolean allOdd() {
		if (root == null) {
			return false;
	}
		return allOdd(root); 
	
	}
	
	public boolean allOdd(BinaryNode root) {
		if (root == null) {
			return true;
		}else if ( root.value % 2 == 0) {
			return false;
		}else {
			return allOdd(root.left) && allOdd(root.right);
		}
	}
	
	public boolean allOver() {
		if (root == null) {
			return false;
		}
		return allOver(root);
	}
	
	public boolean allOver(BinaryNode root) {
		if (root == null) {
			return true;
		}else if (root.value <= 300) {
			return false;
		}else {
			return allOver(root.left) && allOver(root.right);
		}
	}
	
	

}	

