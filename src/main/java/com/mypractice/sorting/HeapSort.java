package com.mypractice.sorting;

import com.mypractice.utils.Utils;

public class HeapSort {
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
		doHeapSort(arr,arr.length);
		System.out.print("\n After Sorting elements are :: ");
		Utils.printArray(arr,arr.length);
	}

	private static void doHeapSort(int[] arr, int n) {
		// perform heapify from last parent node to root node. we do not start from leaves cause leaves are themselves heapified.
		for( int i = n/2 -1 ;i>=0 ;i-- ) {
			heapify( arr,n,i );
		}
		// after heapify step above we have maxheap. So we have largest at the 0th index.
		// replace 0th index with last element of the array and perform heapify by reducing the size of array by one 
		for( int i = n-1 ; i>=0;i-- ) {
			int temp = arr[ 0 ];
			arr[ 0 ] = arr[i];
			arr[i] = temp;
			heapify( arr,i,0 );
		}
	}
	/**
	 * This method is used to perform heapify on that <b>ith element.</b>
	 */
	private static void heapify(int[] arr, int n, int i) {
		int k = i;
		int l = 2*i + 1;
		int r = 2*i + 2;
		
		if( l < n && arr[l] >= arr[k] ) {
			k = l;
		}
		if( r < n && arr[r] >= arr[k] ) {
			k = r;
		}
		if( k != i ) {
			int temp = arr[k];
			arr[k] = arr[i];
			arr[i] = temp;
			heapify(arr,n,k);
		}
	}
	
}
