package finalPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class TestPractice {
	
	public static double average(LinkedList <Integer> l1) {
		
		Iterator <Integer >it = l1.iterator();
		int counter = 0;
		int sum = 0;
		double avg = 0;
		
		while(it.hasNext()) {
			sum = sum + it.next();
			counter++;
		}
		avg = sum/counter;
		
		return  avg ;
	}
	
	public static boolean tenTimes(LinkedList<Integer> l1, LinkedList <Integer> l2) {
		if (l1.size() != l2.size()) {
			return false;
		}
		if (l1 == null || l2 == null) {
			return false;
		}
			Iterator <Integer> itl1 = l1.iterator();
			Iterator <Integer> itl2 = l2.iterator();
			while (itl1.hasNext()) {
				if (itl1.next()* 10 != itl2.next()) {
					return false;
				}
			}
			return true;
	}
	
	
	public static LinkedList <Integer> myUnion (LinkedList <Integer> l1, LinkedList <Integer> l2){
		Iterator<Integer> itl2 = l2.iterator();
		while(itl2.hasNext()) {
			int k = itl2.next();
			if (!l1.contains(k)) {
				l1.add(k);
			}
		}
		return l1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <Integer> l1 = new LinkedList <Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		
		l2.add(10);
		l2.add(20);
		l2.add(60);
		l2.add(70);
		l2.add(50);
		l2.add(100);
		
//		double average = average(l1);
//		
//		System.out.print(average);
		
		
//		boolean check = tenTimes(l1, l2);
		
		LinkedList <Integer> union = myUnion(l1, l2);
		
		System.out.println(union);
		
	}

}
