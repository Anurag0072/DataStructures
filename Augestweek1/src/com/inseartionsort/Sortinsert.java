package com.inseartionsort;

public class Sortinsert {
	public static void insertionSort(int arr[]) {
		for(int j=0; j<arr.length; j++) {
			int value = arr[j];
			int i = j-1;
			while(i>-1 && arr[i]> value) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = value;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {64, -25, 12,-22, 11};
		insertionSort(arr);
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
