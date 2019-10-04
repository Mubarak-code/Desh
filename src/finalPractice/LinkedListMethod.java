package finalPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMethod {
	
	public static LinkedList<Character> readString() {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word");
		
		String userInput = sc.nextLine();
		sc.close();
		
		LinkedList<Character> l1 = new LinkedList<Character>();
		
		for (int i = 0; i < userInput.length(); i++) {
			
			 l1.add(userInput.charAt(i));
		}
		return l1;
	
	}
	
	public static void writeString(LinkedList <Character> l1) {
		
		Iterator<Character> it = l1.iterator();
		
		while (it.hasNext()) {
			System.out.print(it.next()+ " "  );
		}
		System.out.println();
	}
	
	public static Integer len (LinkedList <Character> l1) {
		Iterator<Character> it = l1.iterator();
		int count = 0;
		
		while (it.hasNext()) {
			it.next();
			count++;
		}
			
		return count;
	}

	public static boolean equal(LinkedList<Character> l1, LinkedList <Character> l2) {
		if (l1.size() != l2.size()) {
			return false;
		}
		Iterator<Character> itl1 = l1.iterator();
		Iterator<Character> itl2 = l2.iterator();
		
		while(itl1.hasNext()) {
			if (itl1.next() != itl2.next()) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList< Character> l2;
		LinkedList<Character>l3 = new LinkedList<Character>();
		
		l3.add('d');
		l3.add('a');
		l3.add('t');
		l3.add('e');
		
		l2 = readString();

//		l2.clear();
		
		writeString(l2);
		
		int number = len(l2);
		
		System.out.println(number);
		
//		l3 = l2;
		
		boolean check = equal(l2, l3);
		
		System.out.println(check);
		
			}
			

	
	}
		


