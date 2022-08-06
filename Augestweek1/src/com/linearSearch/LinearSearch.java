package com.linearSearch;

public class LinearSearch {
    
	public static int Search(int arr[], int num) {
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int []arr= {10,20,80,30,60,50,110,100,130,170};
		System.out.println(Search(arr,175));
		
	}

}
