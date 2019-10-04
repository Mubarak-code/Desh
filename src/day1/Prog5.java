package day1;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 2)  a)  Write a program (called Prog5) that asks the user to input a String. The output is the
               characters of this String in reverse order. (For example, if the input string is "Hello", the
               output string would be "olleH".) (Do not use arrays and do not create a new String
               object.)  (Definitely do for the midterm.)
               
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a String");
		
		String enterString = sc.nextLine();
		
		sc.close();
		
		for (int i = enterString.length()-1; i >= 0; i--) {
			System.out.print(enterString.charAt(i));
			 
		}
			
	}
	
}
