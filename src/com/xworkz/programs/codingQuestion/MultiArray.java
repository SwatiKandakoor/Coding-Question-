package com.xworkz.programs.codingQuestion;

public class MultiArray {
	public static void main(String[] args) {
		int arr[][] = { { 2, 4, 5, 6 }, { 5, 9, 23, 10 } };
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
