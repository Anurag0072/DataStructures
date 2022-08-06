package com.bubbleSort;

public class Bubbble {
	static void BubbleImp(int [] arr) {
		int size = arr.length;
		for(int i =0;i<size;i++) {
			for(int j =1; j< (size-i);j++) {
				if(arr[j-1]> arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//System.out.println(arr);
		
	}
	public static void main(String[] args) {
		System.out.println("array before sorting");
		int arr[] = {100,2,4,10,56,2,9,5,55};
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("arrray after sorting");
		BubbleImp(arr);
		for(int i=0; i< arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
