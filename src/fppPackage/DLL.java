package fppPackage;


public class DLL {
	Node head;
	
public static class Node {
	int data;
	Node next;
	Node previous; 
	
	
	Node(int data){
		this.data = data;
		next = null;
		previous = null;
		}
	}

public void printList() {
	Node n = head;
	while (n !=null) {
		System.out.print(n.data + " ");
		n = n.next;
	}
}

// adding a node in front of the head

public void push(int data) {
	
	Node newNode = new Node (data);
	
	newNode.previous = null;
	newNode.next = head; 
	
	if (head != null) {
		head.previous = newNode;
		
		head = newNode;
		
	}
}

public void insertAfter(Node prevNode, int data) {
	
	if (prevNode == null) {
		System.out.println("The  previous node selected does not exist");
		
	}
	Node newNode = new Node(10);
	
	newNode.next = prevNode.next;
	prevNode.previous = newNode;
	newNode.previous = prevNode;
	
	if (newNode.next != null) {
		newNode.next.previous = newNode;
	}
	
}
	public void append(int data) {
		
		Node newNode = new Node (10);
		
		if (head == null) {
			newNode.previous = null;
			head = newNode;
			return;
		}
		
		Node last = head; 
		
		while(last != null) {
			last = last.next;
		}
		
	 
	}


public static void main (String [] args) {
	
	DLL vist = new DLL();
	vist.head = new Node (4);
	Node second = new Node(5);
	Node third = new Node (6);
	
	vist.head.previous = null;
	vist.head.next = second;
	second.previous = vist.head.next;
	second.next = third;
	third.previous = second.next;
	
	vist.printList();
}
	
}
