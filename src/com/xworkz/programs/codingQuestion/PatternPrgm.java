package com.xworkz.programs.codingQuestion;

public class PatternPrgm {
	public static void main(String[] args) {
		// side by side
		for (int i = 0; i <= 5; i++) {
			System.out.print("*" + " ");
		}
		// line by line
		for (int i = 0; i <= 5; i++) {
			System.out.println("*");
		}
		System.out.println("------");
		// square pattern
		for (int i = 0; i <= 3; i++) {

			for (int j = 0; j <= 3; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();

		}
		System.out.println("-------------------");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (j == 2) {
					System.out.print("S");
				} else {
					System.out.print(i);
				}
			}
			System.out.println();

		}

		System.out.println("---------------------");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 2) {
					System.out.print("Swati" + " ");
				} else {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

		System.out.println("-------------------------------");

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("Swati" + " ");

			}
			System.out.println();
		}

		System.out.println("---------------------------------");
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("#" + " ");

			}
			System.out.println();
		}
		
		System.out.println("---------------------------------");
		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.print(j);

			}
			System.out.println();
		}
	}

}
