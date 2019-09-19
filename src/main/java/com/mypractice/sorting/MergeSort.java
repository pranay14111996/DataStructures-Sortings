package com.mypractice.sorting;

import com.mypractice.utils.Utils;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = { 38, 27, 43, 3, 9, 82, 10};
		doMergeSort(arr, 0, arr.length - 1);
		System.out.print("\n After Sorting elements are :: ");
		Utils.printArray(arr,arr.length);
	}

	private static void printArray(int arr[], int size) 
    { 
        int i; 
        for (i = 0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	
	private static void doMergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (r + l) / 2;
			doMergeSort(arr, l, m);
			doMergeSort(arr, m + 1, r);
			mergeSets(arr, l, m, r);
		}
	}

	private static void mergeSets(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int f[] = new int[n1];
		int s[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			f[i] = arr[l + i];
		}
		for (int i = 0; i < n2; i++) {
			s[i] = arr[m + i + 1];
		}
		int i = 0;
		int j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (f[i] <= s[j]) {
				arr[k++] = f[i++];
			} else {
				arr[k++] = s[j++];
			}
		}
		while( i < n1 ) {
			arr[k++] = f[i++];
		}
		while( j < n2 ) {
			arr[k++] = s[j++];
		}
	}
}
