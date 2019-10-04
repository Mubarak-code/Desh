package day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Write an application that determines if an input word is a palindrome.  A palindrome is a string 
               that reads the same forward and backward, for example, noon  and  madam.  
               Ignore the case of the letter.   (Definitely do for the midterm.)

		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String dataInput = sc.nextLine();
		sc.close();
		System.out.println(callPalindrome(dataInput.toLowerCase()));

	}
	

	public static boolean callPalindrome (String inputData) {
		             

		for(int i = 0; i <= inputData.length()/2; i++) {
			
			int j = (inputData.length() - 1) - i ;
			
			if(inputData.charAt(i) != inputData.charAt(j) ) {
				
				return false;
			}
			
		}
		
		return true;
		 

	}

}
