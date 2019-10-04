  package fppPackage;

import java.util.Scanner;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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