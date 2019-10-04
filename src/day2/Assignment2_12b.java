package day2;

public class Assignment2_12b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * On page 99, there is table 3-8.  We will only use the top three rows.
     	Create a two dimensional table with  3  rows and  6  columns.
     	Put the data from the top 3 rows of table 3-8 into your table.

		a)	Print out the average of each row.
		b)	Print out the average of each column.

		 */
		
//		double [][] arr1 = new double [3][6];
		double [][] arr1 = {
				             {10000,10000,10000,10000,10000,10000},
				             {11000,11100,11200,11300,11400,11500},
				             {12100,12321,12544,12769,12996,13225},
	                        };
		
	
		for (int i = 0; i< arr1.length; i++) {
			double sum = 0;
			double average = 0;
			for (int j= 0; j < arr1[1].length; j++ ) {
				sum += arr1[i][j];
				
			}
			System.out.println("the sum of row "+i +" is "+ sum);
			average = sum/arr1[0].length;
			System.out.println("the average of row " +i + " is "+ average);
					
}
		
		for (int j = 0; j < arr1[0].length; j++ ) {
			double sum = 0;
			double average = 0;
			for (int i = 0; i < arr1.length; i++) {
				sum += arr1[i][j];
			}
			System.out.println("the sum of column "+j +" is "+ sum);
			average = sum/arr1.length;
			System.out.println("the average of column " +j + " is "+ average);
		}
		
		//double average = sum/arr1.length;	
		//System.out.println(sum);
		
	}
}