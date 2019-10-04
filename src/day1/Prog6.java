package day1;

import java.util.Arrays;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] finalList = new String[args.length];
		boolean returnObj;
		int counter = 0;
		int notEmpty = 0;
     
		for(int i=0;i<args.length;i++) {
			returnObj = false;
			boolean isContain = probeNewArray(finalList,args,returnObj,i); //loop through second array for duplicates
			if(!isContain) {
				finalList[i]=args[i];
			}else {
				counter++;
			}
		}

		String [] output = new String[(args.length - counter)];

		//print elements of the new array;
		for(String str:finalList) {
			if(str!=null) {
                notEmpty++;
				output[notEmpty-1] = str;
			}
		}
		System.out.println(Arrays.toString(output));
	}
	
	
	public static boolean probeNewArray(String[] finalList,String[] args,boolean contains, int i) {
		
		for(int j =0;j<finalList.length;j++) {
			if(args[i].equals(finalList[j])) {
			   contains  = true;
		
			}
			
		}
		return contains;
	}
	
	
}



