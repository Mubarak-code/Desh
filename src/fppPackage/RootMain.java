package fppPackage;

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class RootMain {
	
	
	// ReadString
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
	// WriteString
	public static void writeString(LinkedList <Character> vist) {
		
		System.out.println(vist);
		System.out.println("Bang");
	}
	
	// Len(LinkedList)
	
	public static int Len(LinkedList<Character> vist) {
	
			int count = 0;
			
			Iterator <Character> i = vist.iterator();
			while ( i.hasNext()) {
				 count++;
				 i.next();	
		 
			}	
			return count;
	}
	
	// Equal(LinkedList, Linkedlist)
 public static boolean Equal (LinkedList <Character> wist, LinkedList <Character> vist){
	
	Iterator<Character> i = wist.iterator();
	Iterator<Character> j = vist.iterator();
	
	if (wist.size() != vist.size()) {
		return false;
		
	}
	while(i.hasNext() && j.hasNext()) {
		
		if (!wist.equals(vist)) {
			
			return false;
		}
		
		i.next();
		j.next();
		
	}
	
	return true;
	
	
 }
	
	
	public static void main(String[] args) {
		
		
		LinkedList <Character> rac = new LinkedList <Character> ();
		LinkedList <Character> tac  = new LinkedList <Character>();
		
		rac.add('d');
		rac.add('a');
		rac.add('t');
		rac.add('o');
		
		tac.add('d');
		tac.add('a');
		tac.add('y');
//		tac.add('o');
	
		
		// read String
		LinkedList<Character> den = readString();
		
		// write String
		writeString(den);
		
		//Len(LinkedList)
		System.out.println(Len(den));
		
		// Equal(LinkedList, LinkedList)
		System.out.println(Equal(rac, tac));
		
}

}
