package com.mypractice.sorting;

import java.util.Scanner;

import com.mypractice.utils.Utils;

public class BubbleSort {

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
		doBubbleSort(arr,arr.length);
		
	}

	private static void doBubbleSort(int[] arr, int l) {
		boolean swapped = false;
		
		for(int i = 0 ; i < l-1;i++){
			for( int j = 0;j<l-i-1;j++ ){
				if(arr[j] > arr[j+1] ){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					swapped = true;
				}
			}
			if(!swapped){
				break;
			}
		}
		System.out.print("\n After Sorting elements are :: ");
		Utils.printArray(arr,l);
		
	}
}
