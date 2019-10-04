package standardExam;


public class DoublyLL {
	
	Node header;
	
	public DoublyLL() {
		header = new Node(null, null, null);
	}
	
	
	// add first method 
	
	public void add(String x) {
		Node newNode = new Node (header.next, header,x );
		
		if (header.next != null) {
			
			header.next.previous = newNode;
		}
			header.next = newNode;
		}
	
	public void addLast(String x) {
		Node newNode = new Node (null, header, x);
		
		if (header.next == null) {
			
			header.next = newNode;
			return;
		}
		Node pointer = header;
		
		while(pointer.next != null) {
			pointer = pointer.next;
		}
		pointer.next = newNode;
		newNode.previous = pointer; 
		
	}
	
	public void deleteFirst() {
		
		if (header.next == null ) {
			System.out.println("LINKEDLIST IS EMPTY");
			return;
		}
		 
			header.next = header.next.next;
			
	}
	public void deleteLast() {
		if (header.next == null) {
			System.out.println("LINKEDLIST is EMPTY");
			return;
		}
		Node pointer = header;
		while (pointer.next != null) {
			pointer = pointer.next;
		}
		pointer.previous.next = null;
		 
	}

	public class Node {
		Node next;
		Node previous;
		String data;
		
		Node(Node next, Node previous, String data) {
			this.next = next;
			this.previous = previous;
			this.data = data;
		}
		
		public String toString() {
			return data == null ? "null" : data;
		}
		
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();
		
	}
	private void toString(StringBuilder sb, Node n) {
		if(n==null) return;
		if(n.data != null) sb.append(" " + n.data);
		toString(sb, n.next);
	}
	
	
	public static void main (String [] args) {
		DoublyLL dl = new DoublyLL();
		
//		dl.add("Adedayo");
//		dl.add("Shareen");
//		dl.add("Maisuya");
//		
//		dl.addLast("Tinola");
//		dl.addLast("Bernard");
		dl.addLast("Girl");
		dl.add("Shareen");
		dl.add("Maisuya");
		dl.deleteLast();
		dl.deleteLast();
		dl.deleteLast();
		dl.deleteLast();
//		dl.deleteLast();
		
//		dl.deleteFirst();
//		dl.add("yomi");
		System.out.println(dl);
		
	}
}
