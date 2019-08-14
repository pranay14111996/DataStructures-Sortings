package com.mypractice.sorting;

public class SelectionSort {

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
		doSelectionSort(arr,arr.length);
		
	}

	private static void doSelectionSort(int[] arr, int length) {
		for( int i =0 ; i < length;i++ ){
			int min_idx = i;
			for( int j = i ; j < length ; j++ ){
				if( arr[j] < arr[min_idx] ){
					min_idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
		printArray(arr, length);
	}
	private static void printArray(int arr[], int size) 
    { 
        int i; 
        for (i = 0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
}
