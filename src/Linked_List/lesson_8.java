package Linked_List;

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class lesson_8 {

	// ReadString Method
public static LinkedList<Character> readString() {
			
			System.out.println("Enter a word");
			
			Scanner sc = new Scanner(System.in);
			
			String userInput = sc.nextLine();
			
				sc.close();
			
			
				Character sav;
			
				LinkedList <Character> chalist = new LinkedList <Character>();
			
			
			for (int i = 0; i < userInput.length(); i++) {
				
				sav = userInput.charAt(i);
				
				chalist.add(sav);
			}
			
			return chalist;
			
		}
	// WriteString Method
public static void writeString(LinkedList <Character> vist) {
	
  //		for ( Character s: vist){
//			System.out.println(s);
//			}	
//	
	
		for (int i = 0; i<vist.size(); i++){
			System.out.println(vist.get(i));
		}
}
	
//	Iterator < Character> i = vist.iterator();
//	
//	while(i.hasNext()) {
//		System.out.println((i.next()));
//	}
		
	// Length Method (LinkedList)
		
public static int Len(LinkedList<Character> vist) {
		
				int count = 0;
				
				Iterator <Character> i = vist.iterator();
				while ( i.hasNext()) {
					 count++;
					 i.next();	
			 
				}	
				return count;
		}
		
	// Equal Method(LinkedList, Linkedlist)
public static boolean Equal (LinkedList <Character> wist, LinkedList <Character> vist){
		
		Iterator<Character> i = wist.iterator();
		Iterator<Character> j = vist.iterator();
		
		if (wist.size() != vist.size()) {
			return false;
			
		}
		while(i.hasNext() && j.hasNext()) {
			
			if (i.next() != j.next()) {
				
				return false;
			}
			
		}
		
		return true;	
		
	 }
		
		
public static void main(String[] args) {
			
			
			LinkedList <Character> rac = new LinkedList <Character> ();
			LinkedList <Character> tac  = new LinkedList <Character>();
			
			rac.add('d');
			rac.add('a');
			rac.add('y');
			rac.add('o');
			
			tac.add('d');
			tac.add('a');
			tac.add('t');
			tac.add('o');
		
			
			// read String Test
			LinkedList<Character> den = readString();
			
			// write String Test
			writeString(den);
			
			//Len(LinkedList) Test
			System.out.println(Len(den));
			
			// Equal(LinkedList, LinkedList) Test
			System.out.println(Equal(rac, tac));
			
//			if (rac.equals(tac)) {
//				System.out.println("confirm");
//			}else
//				System.out.println("failed");
			
	}
}
