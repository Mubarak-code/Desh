package fppPackage;

import java.util.ArrayList;

//import java.util.LinkedList;
public class Tutorial  {

	public static void main (String[] args)  {

		int [] arr  = new int [7];
		int count = 3;
//		int [] ann = new int [2*arr.length];
//		
//		arr = ann;
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		arr[5] = 5;
		
//		System.arraycopy(arr, 0, ann, 0, arr.length);
//		
//		
//		for (int s : ann) {
//			System.out.print(s+ " ");
//		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if (i == count) {
				arr[i] = 0;
			}
			System.out.print(arr[i]);
		}
		System.out.println();
		
		
		
		String [] names = new String [5];
		
		names[0] = "Sadiq";
		names[1] = "Mubarak";
		names[2] = "Hauwa";
		names[3] = "Moji";
		names[4] = "Gbenga";
		
//		 for (int i = 0; i < names.length; i++) {
//			 
//			 if (i == count) {
//				 names[i] = null;
//			 }
//			 System.out.println(names[i]);
//		 }
		
		for (String k : names) {
			if (k == "Moji") {
				k = null;
			}
			System.out.println(k);
		}
		 
		 ArrayList <String> name = new ArrayList<String>();
		 name.add("Dayo");
		 name.add("Maryam");
		 name.add("Gboyega");
	
		for (String n : name) {
			System.out.println(n);
		}
	}
}
		