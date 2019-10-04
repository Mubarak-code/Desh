package finalPractice;

import java.util.LinkedList;

public class PopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <Integer> l1 = new LinkedList<Integer>();
		LinkedList <Integer> l2 = new LinkedList<Integer>();
		LinkedList <Integer> l3 = new LinkedList<Integer>();
		
		l1.push(10);
		l1.push(20);
		l1.push(30);
		l1.push(40);
		l1.push(50);
		
		l3.push(100);
		l3.push(110);
		l3.push(120);
		
		System.out.println(l3);
		System.out.println(l1);
		
		while(!l1.isEmpty()) {
			l2.push(l1.pop());
		}
		
		while(!l2.isEmpty()) {
			l3.push(l2.pop());
		}
		
		
		System.out.println(l3);
	}

}
