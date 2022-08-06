package com.binerySearch;

public class BinarySearch {
	
	static void Search(int arr[], int left, int right, int num) {
		// base case
		if(left>right) {
			System.out.println("Number "+ num +" cant be found in array");
			return;
		}
		int mid = left + (right-left) /2;
		if(arr[mid] == num) {
			System.out.println(num +" is found at index "+ mid);
			
		}else if (arr[mid] > num) {
			Search(arr, left, mid-1, num);
		
		}else {
			Search(arr,mid+1, right, num);
			
		}
		//System.out.println("Number not found");
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		Search(arr, 0,arr.length-1, 11);
	}

}
