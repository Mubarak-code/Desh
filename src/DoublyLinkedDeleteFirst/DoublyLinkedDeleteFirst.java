package DoublyLinkedDeleteFirst;



public class DoublyLinkedDeleteFirst {
	
	Node header;

	public DoublyLinkedDeleteFirst() {
		header = new Node();
	}
	
	//removes the node at position 1 and returns
	//the string contained in that node
	public String deleteFirst() throws IllegalStateException {
		//implement
		Node current = header.next;
		String val = current.next.value;
		 if (isEmpty() || current.next == null) {
			 throw new IllegalStateException("Error 606"); 
		 }
		  if (current.next.next == null) {
			  current.next = null;
		  }else {
			  current.next.next.previous = current;
			  current.next= current.next.next;
			  
		  }
		 
		return val;
	}
	
	public boolean isEmpty() {
		
		return header.next == null;
		
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node next = header;
		while (next.next != null) {
			next = next.next;
		}
		Node n = new Node();
		n.value = item;
		next.next = n;
		n.previous = next;

	}
	
	

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		
		String deleted;
		try {
			deleted = list.deleteFirst();
			System.out.println("This item was deleted: " + deleted);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} 
		
		System.out.println(list);

		
		System.out.println(list.isEmpty());
//		list.deleteFirst();
	}
}
