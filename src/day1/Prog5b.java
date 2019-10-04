package day1;

import java.util.Scanner;

public class Prog5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 /** 
	  * 2b) Output the number of  ‘x’s  in the string from the user.
    For example if the user types in  “Exit  abc  exit”, 
    then the output would be  “2  ‘x’ characters”

	  */
		
		Scanner sc = new Scanner(System.in);
		
		int counter =0; 
		 
		System.out.println("please enter a word :");
		
		String userInput = sc.nextLine();
		System.out.println("enter a letter you want to check :");
		
		
		char letterInput = sc.nextLine().charAt(0);
		sc.close();
		
		for(int i = 0; i < userInput.length(); i++) {
			if(userInput.charAt(i)==(char)letterInput) {
				counter++;
			}
		}
		
		System.out.println("Number of " +letterInput +" repeated in the word is : "+counter);
	}

}
