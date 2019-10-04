package fppPackage;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String enterString = sc.nextLine();
		
		for (int i = enterString.length()-1; i >= 0; i--) {
			System.out.print(enterString.charAt(i));
			 
			sc.close();
		}
		
	}

}
