package finalPractice;

public class ArrayQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayQueue a1 = new ArrayQueue();
		
		a1.enqueue(2);
		a1.enqueue(20);
		a1.enqueue(45);
//		a1.enqueue(2);
//		a1.enqueue(20);
//		a1.enqueue(45);
		
		a1.dequeue();
//		a1.dequeue();
		
//		System.out.println(a1.dequeue());
//		
		System.out.println(a1);
		System.out.println(a1.size());

	}

}
