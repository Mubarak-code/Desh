package Assignment4_3;

import java.util.Arrays;

public class SecretClass {
	private static int inputCount = -1; 
	private static int tempCount = 0; 
	private static int arraySize = 2; 
	String[] arr =  new String [arraySize];
	private int listSize;

	SecretClass(){}
	
	public void setSize(int a) {
		arraySize = a ;
	}
	
	public String expandArray() {
		String[] newArray = new String[2*arr.length];
		System.arraycopy(arr,0,newArray,0,arr.length);
		arr=newArray;
		return (Arrays.toString(newArray));
	}

	public String add(String s) {
		inputCount++;
		tempCount++;
		if(tempCount>=arr.length) {
			expandArray();
				arr[inputCount] = s;
		}else {
			
			arr[inputCount] = s;
		}
		
		return toString();
	}
	
	public int size() {
		return listSize;
	}
	
	public String remove(String s) {
		boolean isMatch = false;
		int foundIndex = 0;
		for(int i =0 ; i< arr.length; i++) {
			if(arr[i]==s) {
				isMatch=true;
				foundIndex = i;
			}
		}
		if(isMatch) {
			inputCount--;
			tempCount--;
			arr[foundIndex] = null;
		}else {
			return "item not found in the array";
		}
		return toString();
	}
	
	public String find(String s) {
		boolean isMatch = false;
		for(int i =0 ; i< arr.length; i++) {
			if(arr[i]==s) {
				isMatch=!isMatch;
			}
		}
		if(isMatch) {
			return s +" found";
		}
		return "Item not found";
	}

	public String toString() {
		String [] temp = new String[tempCount]; 
		int c = 0;
		for(String item : arr) {
			if(item!=null) {
				temp[c++] = item;
			}
		}
		listSize = temp.length;
		return(Arrays.toString(temp));
	}


}
