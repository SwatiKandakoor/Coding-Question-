package com.xworkz.programs.codingQuestion;

public class LargestNo {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 5, 100, 32, 45, 67, 102 };
		int large = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}

		}
		System.out.println(large);

	}

}
