package fppPackage;

public class ArrayQueueTest {

	public static void main(String[] args) {
	
		ArrayQueue q = new ArrayQueue();
		q.enqueue(10);
		q.enqueue(30);
		q.enqueue(130);
		q.enqueue(3);
//		q.enqueue(58);
//		q.enqueue(40);
//		q.enqueue(90);
		
		
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		
		
	int pek = q.peek();
//	System.out.println(q);
//	System.out.println(q.size());
	System.out.println(pek);
	}

}
