package finalPractice;

import java.util.Arrays;

public class ArrayQueue {
	
	int rear = 0;
	int front = -1;
	int [] arr = new int [5];
	
	boolean isEmpty() {
		
		return front == -1;
	}
	
	public  void enqueue(int a) {
	if (rear == arr.length) {
		int [] arr2 = new int [arr.length * 2];
		System.arraycopy(arr, front, arr2, 0, arr.length);
		arr = arr2;
	}
		if (isEmpty()) {
			front++;
			arr[rear] = a;
			rear++;
		}else {
			arr[rear] = a;
			rear++;
		}
		
	}
	
	public int size() {
		if(front == -1) {
			return 0;
		}
		return rear - front;
	}
	
	public int dequeue()  {
		int val;
		if(isEmpty())  {
			return -1;
		}
		val = arr[front];
		arr[front]=0;
		front++;
		if(front == rear) {
			front = -1;
			rear = 0;
		}
		
	return val;
	
	}
	
	

	@Override
	public String toString() {
		return "ArrayQueue ="  + Arrays.toString(arr) ;
	}

}
