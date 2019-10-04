package fppPackage;

public class ArrayStack {
	int [] b =  new int [4];
	int front;
	
	
	public ArrayStack() {
		front = -1;
		 	
	}
	
	public boolean isEmpty() {
		
		return front == -1 ;
	}
	
	public boolean isFull() {
		return front == b.length - 1 ; 
	}
	
	public void enque(int d) {
		if (isEmpty()) {
			front =  0;
			b [front] = d;
		}
		
		else if (isFull()) {
			System.out.println("Array is full");
			return;
		}
		else {
			front += 1;
			b[front] = d;
			
		}
		
	}
	
	public void deque() {
		try {
			dequeh();
		}
		catch(QueueException w){
			w.getMessage();
			
		}
	}
	
	public void dequeh() throws QueueException{
		if (isEmpty()) {
			System.out.println("Array is empty");
			return;
		}else {
			front = front - 1;
		}
	}
	
	public String toString() {
		String sa = "";
//		if (!isEmpty()) {
		for (int i = 0; i < front +1; i++) {
			sa = sa + Integer.toString(b[i]) + " ";
		}
//	}
		return sa;
	}
	
}
