package finalPractice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String, Integer > phoneBook = new HashMap<String, Integer>();
		
		phoneBook.put("Ben", 234);
		phoneBook.put("Mubarak", 001);
		phoneBook.put("Abdul", 100);
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		for (Map.Entry<String, Integer> e : phoneBook.entrySet()) {
			l1.add(e.getKey());
			
//			System.out.println(e.getKey() + " "+  e.getValue());
		}
				
	System.out.println(l1);	
	}

}
