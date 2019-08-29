package com.practice.random;

public class MirrorImage {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
		System.out.println("ORGINAL ARRAY");
		printArray(arr);
		mirrorImage(arr);
		System.out.println("\nMODIFIED ARRAY");
		printArray(arr);
	}

	private static void mirrorImage(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		for( int i = 0 ; i <= rows/2 ;i++) {
			int[] temp = arr[i];
			arr[i] = arr[rows-i-1];
			arr[rows-i-1] = temp;
		}
		
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0; j <= cols/2;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][cols-j-1];
				arr[i][cols-j-1] = temp;
			}
		}
	}

	private static void printArray(int[][] arr) {
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
