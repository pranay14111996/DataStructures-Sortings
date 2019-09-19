package com.mypractice.sorting;

import com.mypractice.utils.Utils;

public class InsertionSort {
	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.print("Enter array length :: ");
		int l = s.nextInt();
		int[] arr = new int[l];
		System.out.print("\n Enter array elements :: ");
		for (int i = 0; i < l; i++) {
			arr[i] = s.nextInt();
		}*/
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; 
		doInsertionSort(arr,arr.length);
		
	}
	private static void doInsertionSort(int[] arr, int length) {
		for( int i = 1 ; i < length ;i++){
			int key = arr[i];
			int j = i -1;
			while( j>=0 && arr[j] > key ){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		Utils.printArray(arr,length);
		
	}
}
