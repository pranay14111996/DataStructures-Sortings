package com.mypractice.sorting;

import com.mypractice.utils.Utils;

public class QuickSort {

	public static void main(String[] args) {

		/*
		 * Scanner s = new Scanner(System.in);
		 * System.out.print("Enter array length :: "); int l = s.nextInt(); int[] arr =
		 * new int[l]; System.out.print("\n Enter array elements :: "); for (int i = 0;
		 * i < l; i++) { arr[i] = s.nextInt(); }
		 */
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		Utils.printArray(arr, arr.length);
		doQuickSort(arr, 0, arr.length - 1);
		System.out.print("\n After Sorting elements are :: ");
		Utils.printArray(arr, arr.length);

	}

	private static void doQuickSort(int[] arr, int low, int high) {
		if (low < high) {
			int p = doPartition(arr, 0, high);
			doQuickSort(arr, low, p - 1);
			doQuickSort(arr, p + 1, high);
		}

	}

	private static int doPartition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int j = low - 1;
		for (int i = low; i < high; i++) {
			if (arr[i] < pivot) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[j + 1];
		arr[j + 1] = arr[high];
		arr[high] = temp;
		return j + 1;
	}

}
