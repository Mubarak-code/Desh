package finalPractice;


public  class LinkList {
	
	Node header;
	
	LinkList(){
		header = new Node(null, null, null);
	}
	
	
	public void addFirst(String data) throws IllegalStateException {
		Node newNode = new Node (header.next, header, data);
		
		if (header.next != null) {
			header.next.previous = newNode;
			throw new IllegalStateException("Error 606");
		}
		header.next = newNode;
	}
	
	
	public void addLast(String data) {
		Node newNode = new Node(null, header, data);
		if (header.next == null) {
			header.next = newNode;
//			return;
		} else {
		Node pointer = header;
		
		while (pointer.next != null) {
			pointer = pointer.next;
		}
		pointer.next = newNode;
		newNode.previous = pointer;
		}
	}
	
	public void deleteFirst() {
		if (header.next == null) {
			System.out.println("LinkedList is empty");
		}else {
			header.next = header.next.next;
		}
	}
	 
	public void deleteLast() {
		if (header.next == null) {
			System.out.println("LinkedList is empty");
		}else {
			Node pointer = header;
			while (pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.previous.next = null;
		}
	}
	
//	public void insert (String data, int index) {
//		Node newNode = new Node(header.next, header, data);
//		
//		int count = 0;
//		Node pointer = header; 
//		
//		while (count < index) {
//			pointer = pointer.next;
//			count++;
//		}
//		pointer.next = newNode;
//		newNode.previous = pointer;
//	}
	
	
	public class Node {
		Node next;
		Node previous;
		String data;
		
		Node(Node next, Node previous, String data){
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
	

}
