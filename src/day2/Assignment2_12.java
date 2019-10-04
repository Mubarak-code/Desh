package day2;

public class Assignment2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1)  Create a Java method
static int min(int[] arrayOfInts)
that outputs the minimum of an array of ints. Create a main method that tests your
method on the following input array
[2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22]
Test your method and make sure it works!
2)  Do the same as above but instead of the minimum find the average of the numbers in the array.  Test it.

		 */
		
int []  arr1 = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		
		System.out.println(computeMin(arr1));
		System.out.println(computeAverage(arr1));
		System.out.println(returnLowercase("adedayo"));

	}
	
	
	public static int computeMin(int [] arr1) {
		int min = arr1[0];
		for(int compare: arr1) {
			if(min > compare) {
				min = compare;
			}
		}
		return min;
	}
	
	public static int computeAverage(int [] arr1) {
		int sum = 0 ;
		for(int compare: arr1) {
			sum = sum + compare;
		
	}
		return sum/arr1.length;

}
	
	public static StringBuffer returnLowercase(String inp) {
		
		/** Write a program that reads a sentence and prints out the sentence with all uppercase letters changed to lowercase 
		 * and all lowercase letters changed to uppercase.
		Hint :  Look at the API documentation for the  Character  class to see which methods 
	    you can use.
		*/

		
		StringBuffer inpBuff = new StringBuffer(inp);
		
		
		for (int i = 0; i < inp.length(); i++) {
			if (Character.isLowerCase(inpBuff.charAt(i))) {
			inpBuff.setCharAt(i, Character.toUpperCase(inpBuff.charAt(i)));
			}else
			{
				inpBuff.setCharAt(i, Character.toUpperCase(inpBuff.charAt(i)));
			}
		}
	return inpBuff;
	}
}
