package day1;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/**
	 * Create a class Prog2. Inside its main method, create float variables to store each of the
               following numbers:    1.27, 3.881, 9.6
              Output to the console the following two values:
              a. the sum of the floats as an integer, obtained by casting the sum to type int
              b. the sum of the floats as an integer, obtained by rounding the sum to the nearest
                  integer, using the Math.round function

	 */
			float one =  1.27f;
			float two =  3.881f;
			float three =  9.6f; 
			float total = one + two + three; 
			
			
			int totalInt = (int) total;  
			int totalRoundUp = Math.round(total);
				
			 System.out.println (totalInt);
			System.out.println(totalRoundUp);
			 
			 
			 
			 
			
	}

}
