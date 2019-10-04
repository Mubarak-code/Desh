package standardExam;


public class DoublyLinkedList {
	Node header;
	DoublyLinkedList(){
		header = new Node(null, null, null);
	}
	//adds to the end of the list
	public void addLast(String item){
		//implement
		Node newNode = new Node (null,header, item);
		
		if (header.next == null) {
			header.next = newNode;
		}
		else if(header.next != null){
			
			Node pointer = header;
			while (pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = newNode;
			newNode.previous = pointer;
			
		}
			
		}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();
		
	}
	private void toString(StringBuilder sb, Node n) {
		if(n==null) return;
		if(n.value != null) sb.append(" " + n.value);
		toString(sb, n.next);
	}
	
	class Node {
		String value;
		Node next;
		Node previous;
		
		Node(Node next, Node previous, String value){
			this.next = next;
			this.previous = previous;
			this.value = value; 
		}
		
		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args){
		DoublyLinkedList list = new DoublyLinkedList();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		list.addLast("Carol");
		
		
		System.out.println(list);
	}

}
