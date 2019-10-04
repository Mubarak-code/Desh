package day2;

import java.util.Scanner;

public class BufferAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 *  2)  Prompt the user for a string.  Save it in a StringBuffer object.
			a)	Append  “bye”  to the above.  Print it out.
			b)	Make all lowercase letters uppercase, and uppercase letters lowercase.  Print the new string.
      		(For lowercase you can use something like 
                     if  ((char1 >= ‘a’)  &&  (char1 <= ‘z’)) …
                      Also check out the Character class!)
        */
		
StringBuffer ab = new StringBuffer("Diva");
		
		ab.setCharAt(0, 'J');
		ab.setCharAt(1, 'a');
		
		ab.insert(0, "Mubby ");
		
		
		
		System.out.println(ab);
		
		System.out.println("Enter a word");
		
		Scanner sc = new Scanner(System.in);
		
		String type = sc.nextLine();
		
		sc.close();
		
		StringBuffer app = new StringBuffer(type);
		
		app.append(" bye");
		System.out.println(app);
		
	
		
		for (int i = 0; i < app.length(); i++) {
			
			if (Character.isLowerCase(app.charAt(i))) {
				
				app.setCharAt(i, Character.toUpperCase(app.charAt(i)));
				
			}else {
				
				app.setCharAt(i, Character.toLowerCase(app.charAt(i)));
				
			}
			
//		Another method		
//			if  ((app.charAt(i) >= 'a')  &&  (app.charAt(i) <= 'z')) {
//				
//				app.setCharAt(i, Character.toUpperCase(app.charAt(i)));
//				
//				
//			}
//			else
//				
//				app.setCharAt(i, Character.toLowerCase(app.charAt(i)));
//				
//			
//		}
		
		
	}
		System.out.println(app);

	}

}
