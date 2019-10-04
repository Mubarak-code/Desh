package fppPackage;

public class ArrayQueue  {
	
	int []a = new int [3];
	int front;
	int rear;

	public ArrayQueue() {
		front = -1;
		rear = 0;
	}
	boolean isEmpty() {
		
		return front == -1;
			
	}
	
	boolean isFull() {
	 return rear ==  a.length - 1;
	 
	}
	
	public int size() {
		return (rear - front) + 1 ;
	}
	
	public int peek()  {
		int an  = -1;
		try {
			return peekv();
		} catch (QueueException e) {
			// TODO Auto-generated catch block
//			e.getMessage();
			System.out.println("array is empty");
		}
		return an;
		
	}
	public int peekv() throws QueueException {
		if (isEmpty()) {
		throw new QueueException();	
		}
		return a[front];
		
	}
	
	void enqueue(int x) {
		if (isEmpty()) {
			front = 0; rear = -1;
			
		}
		else if (isFull()) {
			int [] ab = new int [2 * a.length];
			System.arraycopy(a, 0, ab, 0, a.length);
			a = ab;
			System.out.println("the array is full and copied to a new array");
//			return;		
		}else if (front == 0) {
			rear = 0;
		}else {

	
		rear = rear + 1;
		a[rear] = x;
		
		}
	
	}
	
	void dequeue() {
		try {
			dequeueh();
		} catch (QueueException e) {
	
			System.out.println(e.getMessage());
		}
		}
	
	void dequeueh() throws QueueException  {
		if(isEmpty())  {
			throw new QueueException("queue out of bound");
//			System.out.println("The array is empty");
		} else if  (front == rear) {
			
			front = rear = -1;
		}
		else {
			front = front + 1;
			}
		}
	
	
	public String toString() {
		String sb = "";
		if (!isEmpty()) {
			for (int i = front; i < rear + 1  ; i++) {
				
				sb = sb + Integer.toString(a[i]) + " ";
			}
		}
		return sb;
		
	}
	
}
