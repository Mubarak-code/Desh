package fppPackage;

public class LinkedList { 
	
	Node head;
	
	public static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null; 
		}
	}
	// print function for linkedlist
	public void printList() {
		Node n = head;
		
		while (n != null) {
			System.out.print(n.data+ " ");
			n = n.next;
			
		}
	}
	
	
	// adding a node at the beginning and replacing it with the header
	public void push(int new_data) {
		Node newNode = new Node(new_data);
		
		newNode.next = head; 
		
		head = newNode;
	}
	
	// adding a node after a given node
	
	public void insertNode(Node prev_node, int new_data) {
		if (prev_node == null ) {
			System.out.println("Selected Node does not exist");
			return;
		}
			Node newNode = new Node(new_data);
			
			newNode.next = prev_node.next;
			
			prev_node.next = newNode;
		
		
	}
	
	// Making a new node, the last node 
	
	public void append(int new_data) {
		
		Node newNode = new Node(new_data);
		
		if (head == null) {
			head = new Node (new_data);
			return;
			
		}
		
		newNode.next = null; 
		
		Node last = head;
		while (last.next != null) {
			last = last.next;
			last.next = newNode;
			
			return;
		}
		
	}
	
	public static void main (String [] args) {
		
	
	LinkedList llist = new LinkedList();
	
	llist.head = new Node(1);
	Node second = new Node (2);
	Node third = new Node (3);
	llist.push(4);
	
	llist.head.next = second;
	second.next = third;
	
	llist.append(12);
	
	llist.insertNode(third, 5);
	
	
	
	llist.printList();

	}
}
