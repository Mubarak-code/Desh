package day2;

import java.util.Scanner;

public class Lab_4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of columns : ");
		Scanner sc = new Scanner(System.in);
		int baseNum = sc.nextInt();
	    sc.close();
		drawA(baseNum);
		

	}
	
	public  static void drawA(int lnth) {
		for(int i = 0;i<lnth;i++) {

			for(int j=0;j<i+1;j++) {
				if(j==0 || j==i || i==lnth-1) {
					System.out.print("*");
				}else
					System.out.print(" ");
					 	
					
				}
			System.out.println();		
			}
			
		}
	}
	
	
