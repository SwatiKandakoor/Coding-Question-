package com.xworkz.programs.codingQuestion;

public class Array {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5,7 };
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = 2 * a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

		}

	}
}
