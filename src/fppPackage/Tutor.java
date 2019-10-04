package fppPackage;

public class Tutor {
	
	int [] a = new int [10];
	int front ;
	int rear ; 
	
	Tutor(){
		 front = -1;
		 rear = -1;
	}
	boolean isEmpty() {
		return (front== -1 && rear == -1);
	}
	
	boolean isFull() {
		return rear == (a.length-1); 
	}
	
	void enqueue(int x) {
		if (isFull()) {
			System.out.println("Array is Full");
			return;
		}
		if (isEmpty()) {
			front = rear = 0;
		}
		else {
			rear = rear + 1;
		}
		a[rear] = x;
	}
	
	
	void dequeue() {
		if (isEmpty()) {
			return;
		}
		else if (front == rear) {
			front = -1 ;
		}
		else
			front = front +1 ;
	}
	


}
